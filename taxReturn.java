// import java.util.*;
// import javax.swing.*;

// class Main {
//   public static void main(String[] args) {
    
//     string input1 = JOptionPane.showInputDialog("Enter your income: ");

//     string input2 = JOptionPane.showInputDialog("Please enter true if married: ");

//int income = Integer.parseInt(input1);
//boolean

//     System.out.println("Testing inputs and JOption Pane Class: " + input1 + input2);

//   }
// }

//JOption test^

//The part above that is commented goes into a folder under the taxReturn class

public class main{

double income;
boolean status;

private static final double RATE1 = 0.15;
private static final double RATE2 = 0.25;
private static final double RATE3 = 0.31;

private static final double SINGLE_BRACKET1 = 21000;
private static final double SINGLE_BRACKET2 = 51500;
private static final double SINGLE_BRACKET3 = 71500;

private static final double MARRIED_BRACKET1 = 31500;
private static final double MARRIED_BRACKET2 = 71500;
private static final double MARRIED_BRACKET3 = 91500;


/* creates taxreturn object
@param anIncome taxpayer's income
@param status either single or married
*/

public taxReturn(double anIncome, boolean aStatus){

income = anIncome;
status = aStatus;

}

public double getTax(){
  double tax = o;

  if(status){
if(income <= MARRIED_BRACKET1){
tax = income*RATE1;
};
else if(income <= MARRIED_BRACKET2){
tax = income*RATE2;
};
else if(income <= MARRIED_BRACKET3){
tax = income*RATE3;
};
else if(income <= MARRIED_BRACKET3){
tax = income*RATE3;
};
  }
  else{

  }
  return tax;
}

}

import java.util.*;
import javax.swing.*;

class Main
{


  public static void main(String[] args)
  {
    String input1 = JOptionPane.showInputDialog("Please enter your income: ");
    String input2 = JOptionPane.showInputDialog("Please enter single or married: ");
    String input3 = JOptionPane.showInputDialog("Please enter your Social Security Number: ");

    int income = Integer.parseInt(input1);
    int ssn = Integer.parseInt(input3);

    if(income < 0 || income > 100000000)
    {
      System.out.println("It looks like you have a bad input");
      System.exit(0);
    }

    TaxReturn client1 = new TaxReturn(income, input2, ssn);

    System.out.println(client1.getSSN() + " : \nYou owe: " + client1.getTax());

    TaxReturn client2 = new TaxReturn(100, "single", 300);

    System.out.println(client2.getSSN() + " : \nYou owe: " + client2.getTax());

    boolean sameClient = (client1.equals(client2));
    System.out.println("Same client as last year? " + sameClient);


  }


} 

// this is the main tax return class

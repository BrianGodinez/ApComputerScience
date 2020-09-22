
import  java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a sentence: ");
      String sentence = scan.nextLine();


      int fwl = sentence.indexOf(" ");
      System.out.println("First Word's length: " + fwl);

      int swl = sentence.indexOf(" ", fwl + 1);
      System.out.println("Second word length: " + (swl - fwl - 1));



  }
}

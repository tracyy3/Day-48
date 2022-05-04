import java.util.Scanner;
 
public class Calculations {
 
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
   
  System.out.print("Enter a number: ");
  int num1 = scan.nextInt();
   
  System.out.print("Enter another number: ");
  int num2 = scan.nextInt();
   
  System.out.println(num1 + " + " + num2 + " = " + 
  (num1 + num2));
   
  System.out.println(num1 + " - " + num2 + " = " + 
  (num1 - num2));
   
  System.out.println(num1 + " x " + num2 + " = " + 
  (num1 * num2));
   
  System.out.println(num1 + " / " + num2 + " = " + 
  (double)((float) num1 / num2));
 
  System.out.println(num1 + " % " + num2 + " = " + 
  (num1 % num2));

  scan.close();
 }
}
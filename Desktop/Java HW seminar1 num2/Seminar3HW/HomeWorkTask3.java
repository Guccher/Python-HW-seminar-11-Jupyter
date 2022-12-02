// Реализовать простой калькулятор

import java.util.Scanner;
public class HomeWorkTask3 {
    public static void main(String[] args) {
        double num1;
      double num2;
      double ans;
      char op;
      Scanner iScanner = new Scanner(System.in);
      System.out.print("Enter first number: ");
      num1 = iScanner.nextDouble();
      System.out.print("Enter second number: ");
      num2 = iScanner.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      op = iScanner.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:  System.out.printf("Error! Enter correct operator");
            return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}
 


package function;

import java.util.Scanner;

public class printSum {
   public static int  calSum(int numer1,int number2) {
    //    System.out.println(result);
       int result = numer1 + number2;
       return result;
   } 
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first number : ");
       int number1 = sc.nextInt();
       System.out.println("Enter the second number : ");
       int number2 = sc.nextInt();

       int result = calSum(number1, number2);

       System.out.println("The sum of "+ number1 +" and " + number2 + " is " + result);

    //    calSum(result);

   }
    
}

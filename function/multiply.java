package function;

import java.util.Scanner;

public class multiply {
   public static int ptintMul(int number1 , int number2){
       int result = number1 * number2 ;
       return result;



   } 
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first number : ");
       int number1 = sc.nextInt();
       System.out.println("Enter the second number : ");
       int number2 = sc.nextInt();

       int result = number1 * number2;

       System.out.println("The multiplication of "+ number1 + " and " + number2 + " is " + result);


   }
    
}

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        char operator;
        double number1, number2, result;
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Choose an operator: +,-,*,/ or %");
            operator = sc.next().charAt(0);
            System.out.println("Enter the first number");
            number1 = sc.nextDouble();
            System.out.println("Enter the second number");
            number2 = sc.nextDouble();
        }
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(result);
                
                break;
                
            case '-':
                result = number1 - number2;
                System.out.println(result);
                
                break;

            case '*':
                result = number1 * number2;
                System.out.println(result);
                
                break;

            case '/':
                result = number1 / number2;
                System.out.println(result);
                
                break;

            case '%':
                result = number1 % number2;
                System.out.println(result);
                
                break;
        
            default:
            System.out.println("Invalid Operator");

                break;
             }
         }
        
    }
    

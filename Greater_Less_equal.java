import java.util.*;

public class Greater_Less_equal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();

            if(number1 == number2){
                System.out.println(number1 + " and " + number2 + " are equal");
            }else if (number1 > number2){
                System.out.println("number " + number1 + " is greater thn number " + number2);
            }else {
                System.out.println("number " + number1 + " is smaller thn number " + number2);
            }
        }
    }

    
}

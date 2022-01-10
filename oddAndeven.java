import java.util.*;

public class oddAndeven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();

            if(number%2 == 0){
                System.out.println("number " + number + " is even");
            }else{
                System.out.println("number " + number + " is odd");
            }
        }
    }
}

import java.util.Scanner;

public class naturalNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0;

            for(var i = 1; i<=n; i++){
                
                sum = sum + i; 
            }
            System.out.println(sum);
        }
    }
    
}

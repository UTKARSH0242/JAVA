import java.util.Scanner;

// import javax.swing.text.html.StyleSheet;

public class factorial {
    public static void printFact(int n){
        if (n<0) {
            System.err.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >=1; i--) {
            factorial = factorial*i;

            
        }
        System.err.println(factorial);
        return;
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.err.println("Enter the number : ");
       int n = sc.nextInt();

       printFact(n);
   } 
    
}

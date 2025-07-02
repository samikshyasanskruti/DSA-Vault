import java.util.*;
public class A1Q5 {
    
    public static int sum_Of_Digits(int n){

        int sum = 0;
        int totalsum = 0;

        while(n != 0){

            sum += n%10;
            n /= 10;
        }

        while (sum > 0) {
            
            totalsum += sum%10;
            sum /= 10;
        }
        return totalsum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int totalsum = sum_Of_Digits(n);
        System.out.println("Sum of digits of " +n+ " until the number is a single digit is "+ totalsum);

    }

}

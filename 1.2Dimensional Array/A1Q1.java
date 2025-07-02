import java.util.*;
public class A1Q1{

    public static int divideby2(int n){
        
        int count = 0;

        while(n>2){
            n /= 2;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = divideby2(n);
        System.out.println(count);
        
    }
}
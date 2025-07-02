import java.util.*;
public class A1Q3 {
    
    public static int sumOfDigits(int n){

        int sum = 0;

        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public static int productOfDigits(int n){

        int product = 1;

        while(n>0){
            product *= n%10;
            n /= 10;
        }
        return product;
    }
    
    public static boolean spy(int n){

        boolean spy;

        if(sumOfDigits(n) == productOfDigits(n)){
            spy = true;

        }else{
            spy = false;
        }

        if(spy){
            System.out.println(n+" is a spy number.");

        }else{
            System.out.println(n+" is not a spy number.");
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean spy = spy(n);
    }
}


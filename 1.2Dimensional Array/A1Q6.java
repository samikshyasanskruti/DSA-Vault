import java.util.*;
public class A1Q6 {
    
    public static boolean isOdd(int n){

        boolean isOdd;
        int x = n;

        while(x >= 3){
            x -= 2;
        }
        if(x == 1){
            isOdd = true;
        }else{
            isOdd = false;
        }

        if(isOdd){
            System.out.println(n+" is odd:true");
        }else{
            System.out.println(n+" is odd:false");
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        boolean isOdd = isOdd(n);
    }
}

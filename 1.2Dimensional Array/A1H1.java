import java.util.*;
public class A1H1 {
    
    public static boolean formula1(int a, int b, int c){
        boolean formula1;

        if(a+b == c){
            formula1 = true;
        }else{
            formula1 = false;
        }

        if(formula1){
            System.out.println("This can be used as: a + b = c");
        }
        return true;
    }

    public static boolean formula2(int a, int b, int c){
        boolean formula2;

        if(b-c == a){
            formula2 = true;
        }else{
            formula2 = false;
        }

        if(formula2){
            System.out.println("This can be used as: “a = b − c");
        }
        return true;
    }

    public static boolean formula3(int a, int b, int c){
        boolean formula3;

        if(a*b ==c){
            formula3 = true;
        }else{
            formula3 = false;
        }

        if(formula3){
            System.out.println("This can be used as: a X b = c");
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        boolean formula1 = formula1(a, b, c);
        boolean formula2 = formula2(a, b, c);
        boolean formula3 = formula3(a, b, c);
    }
}

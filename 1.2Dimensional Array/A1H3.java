import java.util.*;
public class A1H3 {
    
    public static int[] dotProduct(int[] a, int[] b){

        int[] c = new int[a.length];

        for(int i = 0; i < a.length; i++){
            c[i] = a[i] * b[i];
        }
        
        System.out.print("new array = ");
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i]+" ");
        }
        return c;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt(); 

        int a[] = new int[n];
        int b[] = new int[n];

        System.out.println("Enter elements of a: ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter elements of c: ");
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        int[] c = dotProduct(a, b);
    }
}

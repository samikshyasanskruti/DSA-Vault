import java.util.*;
public class A1H4 {
    
    public static double[][] addMatrix(double[][] a, double[][] b){

        double[][] sum = new double[a.length][a[0].length];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int i = 0; i < a.length ; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        double[][] a = new double[rows][cols];
        double[][] b = new double[rows][cols];

        System.out.println("Enter elements for a: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                a[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Enter elements for b: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                b[i][j] = sc.nextDouble();
            }
        }
        double[][] c = addMatrix(a, b);
    }
}

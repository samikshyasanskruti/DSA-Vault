import java.util.*;
public class A1Q9 {
    
    public static double sumMajorDiagonal(double[][] m){

        double sum = 0;

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                if(i == j){
                    sum += m[i][j];
                }
            }

        }
        System.out.println("Sum of the elements in the major diagonal is: "+sum);
        return sum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of the rows and columns of the square matrix: ");
        int n = sc.nextInt();

        System.out.println("Enter elements: ");

        double m[][] = new double[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                    m[i][j] = sc.nextDouble();
            }
        }

        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }

        double sum = sumMajorDiagonal(m);

    }
}

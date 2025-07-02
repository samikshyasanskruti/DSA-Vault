import java.util.*;
public class A1Q10 {

    public static double sumColumn(double[][] m, int columnIndex){

        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();

        double[][] m = new double[rows][columns];
       

        System.out.println("Enter the elements of the array: ");

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                m[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        for (int columnIndex = 0; columnIndex < columns; columnIndex++) {
            System.out.println("Sum of the elements at column " + columnIndex + " is " + sumColumn(m, columnIndex));
        }
    }
    
}

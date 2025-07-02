import java.util.*;
public class A1Q8{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] array = new int[rows][columns];
        int sum = 0;

        System.out.println("Enter the elements of the array: ");

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("The sum of elements of the 2D-Array is: " + sum);
    }
}

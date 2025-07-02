import java.util.*;
public class A1H2{

    public static String[] reverseString( String[] lines){

        System.out.println("Reverse String: ");
        for(int i = lines.length-1; i >= 0; i--){
            System.out.print(lines[i]+" ");
        }
        return lines;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        String[] lines = new String[n];

        System.out.println("Enter Strings: ");

        for(int i = 0; i < n; i++){
            lines[i] = sc.next();
        }
        String[] reveStrings = reverseString(lines);
    }
}

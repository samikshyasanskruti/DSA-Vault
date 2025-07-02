import java.util.*;
public class A1Q7 {
    
    public static int maximumnum(int[] arr){

        int maximumnum = arr[0];
        int occurence = 0;
        int position = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maximumnum){
                maximumnum = arr[i];
            }
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == maximumnum){
                position = i+1;
                break;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == maximumnum){
                occurence++;
            }
        }

        System.out.println("Maximum element of Array is "+maximumnum+" and occurs "+ occurence+" times.");
        System.out.println("First occurrence of maximum element is at position: "+position);
        return maximumnum;
    }
    public static int minimumnum(int[] arr){

        int minimumnum = arr[0];
        int position = 0;
        int occurence = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minimumnum){
                minimumnum = arr[i];
            }
        }

        for(int i = arr.length-1; i>0; i--){
            if(arr[i] == minimumnum){
                position = i+1;
                break;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == minimumnum){
                occurence++;
            }
        }

        System.out.println("Minimum element of Array is "+minimumnum+" and occurs "+ occurence+" times.");
        System.out.println("Last occurrence of minimum element is at position: "+position);
        return minimumnum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter numbers: ");

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int maximumnum = maximumnum(arr);
        int minimumnum = minimumnum(arr);

        sc.close();
    }
}

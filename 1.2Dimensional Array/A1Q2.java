import java.util.*;
public class A1Q2 {
    
    public static double bmi(double weight, double height){

        double bmi = weight/Math.pow(height,2);

        if(bmi <= 18.5){
            System.out.println("Underweight");

        }else if(bmi > 18.5 && bmi <= 24.9){
            System.out.println("Normal weight");

        }else if(bmi >= 25 && bmi <= 29.9){
            System.out.println("Overweight");

        }else if(bmi >= 30){
            System.out.println("Obese");

        }
        return bmi;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight: ");
        double weight = sc.nextDouble();

        System.out.println("Enter your height: ");
        double height = sc.nextDouble();

        double bmi = bmi(weight, height);

    }
}

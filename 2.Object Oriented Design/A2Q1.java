import java.util.*;
class Person{
	String name;
	int age;
	
	void setData(String n, int a) {
		age = a;
		name = n;
	}
	void displayData() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
public class A2Q1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sc.next();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		Person ob = new Person();
		ob.setData("Rohan",20);
		
		Person ob2 = new Person();
		ob2.setData(name, age);
		
		ob2.displayData();
		ob.displayData();
		
		if(ob.age > ob2.age) {
			System.out.println(ob2.age +" is younger.");
		}else if(ob2.age > ob.age) {
			System.out.println(ob.age +" is younger.");
		}else {
			System.out.println("Both are of same age.");
		}
	}
}
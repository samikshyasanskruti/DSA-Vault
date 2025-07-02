class Box<T>{
	T volume;
	Box(T volume){
		this.volume = volume;
	}
	void display(){
		System.out.println("Volume of the box: "+volume);
	}
}
public class A3Q4 {

	public static void main(String[] args) {
		
		Box<String> ob1 = new Box<String>("Ten");
		ob1.display();
		
		Box<String> ob2 = ob1;
		ob2.volume = "Five";
		
		ob1.display();
		
		
		Box<Integer> p1 = new Box<Integer>(20);
		Box<Integer> p2 = p1;
		p2.volume = 11;
		p1.display();
		
		Box<Object> s1 = new Box<Object>("seven");
		Box<Object> s2 = s1;
		s2.volume = 7;
		s1.display();
		
		
		
//		Box<Integer> ob2 = new Box<Integer>(10);
//		ob2.display();

	}
}
	
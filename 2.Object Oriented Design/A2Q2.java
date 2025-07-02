class Complex{
	int real;
	int imaginary;
	
	void setData(int r, int i){
		real  = r;
		imaginary = i;
	}
	void display() {
		System.out.println(real + "+ i"+imaginary);
	}
}
public class A2Q2 {
	
	public static Complex add(Complex a, Complex b) {
		
		Complex sum = new Complex();
		
		sum.setData(a.real + b.real,a.imaginary + b.imaginary);
		sum.display();
		
		return sum;
	}

	public static void main(String[] args) {
		
		Complex a = new Complex();
		a.setData(5,6);
		
		Complex b = new Complex();
		b.setData(7,8);
		
		a.display();
		b.display();
		
		Complex sum = add(a,b);
	
	}
}

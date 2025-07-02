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
	
    public static Complex add(Complex a, Complex b) {
		
		Complex sum = new Complex();
		
		sum.real = a.real+b.real;
		sum.imaginary = a.imaginary+b.imaginary;
		
		return sum;
	}
}

public class A1Q2b{
	public static void main(String[] args) {
		
		Complex a = new Complex();
		a.setData(5,6);
		
		Complex b = new Complex();
		b.setData(7,8);
		
		a.display();
		b.display();
		
		Complex sum = Complex.add(a, b);
		sum.display();
	}
}
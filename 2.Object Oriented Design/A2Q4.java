class Deposit{
	
    long p;
    int time;
    double rate;
    double totalamount;
    
    Deposit(){this.p=0;this.time=0;this.rate=0;}
    Deposit(long p1, int time1, double rate1)
    {this.p=p1;this.time=time1;this.rate=rate1;}
    Deposit(long p1, int time1)
    {this.p=p1;this.time=time1;}
    Deposit(long p1, double rate1)
    {this.p=p1;this.rate=rate1;}
    void display(){System.out.println("Total Amount is::"+totalamount);}
    void calcAmt(){totalamount=p+(p*rate*time)/100;}
}
public class A2Q4{
   public static void main(String[] args){
	   
       Deposit d1=new Deposit();
       d1.calcAmt();
       d1.display();
       Deposit d2=new Deposit(100,2,5.5);
       d2.calcAmt();
       d2.display();
       Deposit d3=new Deposit(500,5);
       d3.calcAmt();
       d3.display();
       Deposit d4=new Deposit(900,5.5);
       d4.calcAmt();
       d4.display();
       
   }
}	
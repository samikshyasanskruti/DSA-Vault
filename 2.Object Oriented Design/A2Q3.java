class Product {
	
    int prodId;
    double price;
    int quantity;

    static double totalPrice = 0;

    Product(int prodId, double price, int quantity) {
    	
        this.prodId = prodId;
        this.price = price;
        this.quantity = quantity;
        totalPrice += price * quantity; 
   }
   
    void display() {
    	
        System.out.println("Product ID: " + prodId);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("-----------------------------");
  } 
}
public class A2Q3{
   public static void main(String[] args) {
	   
       Product product1 = new Product(101, 5.99, 2);
       Product product2 = new Product(102, 10.50, 1);
       Product product3 = new Product(103, 2.49, 3);
       Product product4 = new Product(104, 8.75, 1);
       Product product5 = new Product(105, 3.99, 4);

       System.out.println("Details of Products Purchased:");

       product1.display();
       product2.display();
       product3.display();
       product4.display();
       product5.display();

       System.out.println("Total Amount to Pay: $" + Product.totalPrice);
    }
}
	
package entities;

public class Product {

	

     String name; // atributos
	private double price;
	private int quantity;
	
	//Construtor geralmente � escrito depois dos atributos e antes dos m�todos
	public Product() {
		
		
	}
	
	
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		
	}
	
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValueInStock(){
	    return price * quantity;	
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
		
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}



	



	public String toString() {
		return name
				+", $ "
				+String.format("%.2f", price)
				+", "
				+quantity
				+" units, Total: $"
				+ String.format("%.2f",totalValueInStock());
	}
	
	
	
}

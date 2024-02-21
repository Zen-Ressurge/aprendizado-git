package entities;

public class Product {

	public String name; // atributos
	public double price;
	public int quantity;
	
	//Construtor geralmente � escrito depois dos atributos e antes dos m�todos
	
	public Product(String name, double price, int quantity) {
		this.name = name; // a palavra this indica o atributo
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

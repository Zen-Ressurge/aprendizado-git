package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;


public class Program {

	public static void main(String[] args) {
           
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Product product = new Product();
		
		//System.out.println(product.name);
		//System.out.println(product.price);
		//System.out.println(product.quantity);
		
		System.out.println("Enter product data: ");
	    System.out.print("Name : ");
	    String name = sc.nextLine();
	    
	   // product.name = sc.nextLine();
	    System.out.print("Price :");
	    double price = sc.nextDouble();
	    
	   // product.price = sc.nextDouble();
	    System.out.print("Quantity in stock : ");
	    //product.quantity = sc.nextInt();
	    int quantity = sc.nextInt();
	    
	    Product product = new Product(name ,price,quantity);
	    
	    product.setName("Computer");
	    
	    product.setPrice(666.66);
	    System.out.println("Updated price "+ product.getPrice());
	    
	    
	    
	   // System.out.println(product.name + " , " + product.price + " , " + product.quantity);
	    System.out.println("Product data :" + product.toString());
	    
	    System.out.println();
	    System.out.print("Enter the number of product to be added in stock: ");
	    quantity = sc.nextInt();
	    product.addProducts(quantity);
	    
	    System.out.println();
	    System.out.println("Updated data :" + product.getName());
	    
	    //-----------------------------------------------------------------------------//
	    System.out.println();
	    System.out.print("Enter the number of product to be removed from stock: ");
	    quantity = sc.nextInt();
	    product.removeProducts(quantity);
	    
	    System.out.println();
	    System.out.println("Updated data :" + product.toString());
	    
	    sc.close();
		
		

	}

}

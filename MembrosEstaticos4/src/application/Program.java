package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;


public class Program {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
      //  Calculator calc = new Calculator();
        
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);
        
        System.out.printf("Circumference : %.2f \n",c);
        System.out.printf("Volume : %.2f \n ", v);
        System.out.printf(" Pi : %.3f \n",Calculator.PI);
        
        
        sc.close();
	}
         
}

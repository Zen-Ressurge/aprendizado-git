package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//double xA, xB, xC, yA, yB, yC;
        Triangle x, y;
        x = new Triangle();// Aqui instanciamos
        y = new Triangle();// new cria uma alocação dinamica na memoria heap
		
		System.out.println("Enter the measures of triangle X");
		x.a=sc.nextDouble();
		x.b=sc.nextDouble();
		x.c= sc.nextDouble();

		System.out.println("Enter the measures od triangle Y");
		y.a= sc.nextDouble();
		y.b = sc.nextDouble();
		y.c =sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangle X area  %.4f \n", areaX);
		System.out.printf("Triangle Y area: %.4f \n", areaY);

		if (areaX > areaY) {
            System.out.println("Larger Area X");
		}
		else {
			System.out.println("Larger Area Y");
		}
		sc.close();
	}

}

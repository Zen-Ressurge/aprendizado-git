package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {
	public static void main(String[] args) {
    Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	double[] vect = new double[n];
	double sum = 0;
	double avg =0;//average media
	
	for(int i =0; i < n ; i++) {
		vect[i] = sc.nextDouble();
		sum = sum +vect[i];
		avg = sum/ n;
		
	}
	
	for(int i = 0 ; i<n ; i++) {
		System.out.println("altura = " + vect[i]);
		
	}
	System.out.println("media =" + avg);
    
    
    
    sc.close();
	}
}

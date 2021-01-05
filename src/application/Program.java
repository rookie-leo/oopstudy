package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.setA(kb.nextDouble());
		x.setB(kb.nextDouble()); 
		x.setC(kb.nextDouble());
		
		System.out.println("Enter the measures of triangle Y: ");
		y.setA(kb.nextDouble());
		y.setB(kb.nextDouble()); 
		y.setC(kb.nextDouble());
		
		double areaX = x.area();
		
			
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Tirangle Y area: %.4f\n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area X");
		}else {
			System.out.println("Larger area Y");
		}
		
		kb.close();
	}
}

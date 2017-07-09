package Modelo;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("Média entre dois números, Maven, GIT, export JAR.");
		float a;
		float b;
		float m;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Número 1: ");
		a = scanner.nextInt();
		
		System.out.println("Número 2: ");
		b = scanner.nextInt();
		
		m = ((a+b)/2);
		
		System.out.println("Média: "+ m);
		scanner.close();
	}

}

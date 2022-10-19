package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String letra;
		int DNI;
		int aux;
		
		Scanner sc = new Scanner(System.in);
		
		DNI = sc.nextInt();
		aux = DNI % 23;
		
		switch (aux) {
		case 0 -> {
			letra = "T";
		}
		case 1 -> {
			letra = "T";
		}
		case 2 -> {
			letra = "T";
		}
		case 3 -> {
			letra = "T";
		}
		case 4 -> {
			letra = "T";
		}
		case 5 -> {
			letra = "T";
		}
		case 6 -> {
			letra = "T";
		}
		case 7 -> {
			letra = "T";
		}
		case 8 -> {
			letra = "T";
		}
		case 9 -> {
			letra = "T";
		}
		case 10 -> {
			letra = "T";
		}
		case 11 -> {
			letra = "T";
		}
		case 12 -> {
			letra = "T";
		}
		case 13 -> {
			letra = "J";
		}
		default -> {
			letra = "no";
		}
		

		}
		System.out.println(letra);

	}

}

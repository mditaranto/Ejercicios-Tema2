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
			letra = "R";
		}
		case 2 -> {
			letra = "W";
		}
		case 3 -> {
			letra = "A";
		}
		case 4 -> {
			letra = "G";
		}
		case 5 -> {
			letra = "M";
		}
		case 6 -> {
			letra = "Y";
		}
		case 7 -> {
			letra = "F";
		}
		case 8 -> {
			letra = "P";
		}
		case 9 -> {
			letra = "D";
		}
		case 10 -> {
			letra = "X";
		}
		case 11 -> {
			letra = "B";
		}
		case 12 -> {
			letra = "N";
		}
		case 13 -> {
			letra = "J";
		}
		case 14 -> {
			letra = "Z";
		}
		case 15 -> {
			letra = "S";
		}
		case 16 -> {
			letra = "Q";
		}
		case 17 -> {
			letra = "V";
		}
		case 18 -> {
			letra = "H";
		}
		case 19 -> {
			letra = "L";
		}
		case 20 -> {
			letra = "C";
		}
		case 21 -> {
			letra = "K";
		}
		case 22 -> {
			letra = "E";
		}
		default -> {
			letra = "Error de calculo";
		}
		

		}
		System.out.println("La letra de su DNI es: " + letra);

	}

}

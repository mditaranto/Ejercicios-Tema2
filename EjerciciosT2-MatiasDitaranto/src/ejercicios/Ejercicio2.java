package ejercicios;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos las variables para guardar la letra del DNI
		String letra;
		 //Creamos la variable donde guardaremos los datos introduccidos
		int DNI;
		 //Creamos la variable donde guardamos el valor de la operacion necesaria
		int aux;
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		 //Se le pide al usuario que introduzca un DNI
		System.out.println("Introduzca su DNI (SIN) letra");
		DNI = sc.nextInt(); //El valor es guardado en la variable
		
		//Se hace la operacion para saber la letra del DNI 
		aux = DNI % 23;
		
		//Con un switch y dependiendo del valor de la AUX determinamos la letra
		//Como cada numero equivale a 1 letra, valoramos este mismo.
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
		//Ofrece la letra del DNI al usuario
		System.out.println("La letra de su DNI es: " + letra);
	}
}

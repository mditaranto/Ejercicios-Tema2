package ejercicios;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio3 {
	
	/*
	 * Para la verificacion de este programa se han realizado diversas pruebas:
	 * Para la comprobacion que no haya problemas con el numero 0 se introduce
	 * en el valor de los animales. El programa debe indicar que no hay animales.
	 * Para la primera solucion se introduce mas comida comprada que consumida
	 * Para la otra alternativa, mas comida consumida que comprada.
	 * Debe dar el resultado deseado en cualquier caso.
	 */

	public static void main(String[] args) {
		// Creamos la variable donde guardaremos los datos introduccidos
		double kcomida;
		int numanim;
		double kcome;

		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

		//BLOQUE DE SCANNER
		//Se le pide al usuario que introduzca los kilos de comida
		System.out.print("Introduzca cuantos kilos de comida han sido comprados ");
		kcomida = sc.nextDouble(); //El valor es guardado en la variable
		//Se le pide al usuario que introduzca los kilos de comida
		System.out.print("Introduzca el numero de animales en la granja ");
		numanim = sc.nextInt(); //El valor es guardado en la variable
		//Se le pide al usuario que introduzca los kilos de comida
		System.out.print("Introduzca cuantos kilos se consume diariamente ");
		kcome = sc.nextDouble(); //El valor es guardado en la variable
 
		//Mediante un condicional se ofrecen los resultados
		if (numanim >= 1) { //Primero se confirma que existan animales
			if (kcomida >= kcome) { /*En caso de que haya mas comida que lo 
				que se consume se considera que comen*/
				System.out.println("Los animales comen correctamente.");
			} else { //En caso contrario, se averigua que racion le corresponde a cada animal
				System.out.println("Cada animal podra comer " + (kcomida / numanim) + "kilos");
			}
		} else { //Se informa al usuario que no tiene animales :)
			System.out.println("Si no hay animales no hay nada que alimentar");
		}
		 sc.close(); //Cerramos el objeto Scanner
	}

}

package ejercicios;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio8 {
	
	/*
	 *  Para la verificacion de este programa se han realizado diversas pruebas:
	 *  Se introducen mas de 800 km
	 *  Se introducen menos de 800 km y mas de 7 dias
	 *  Se introducen mas de 800 km y de 7 dias (Aplica descuento)
	 */

	public static void main(String[] args) {
		// Creamos las variables donde guardaremos los datos introduccidos por el usuario
		int km;
		int dias;
		//Creamos la constante del precio 
		double precio;
		
		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner
		
		// BLOQUE DE SCANNER
		// Se le pide al usuario que introduzca la distancia
		System.out.print("Por favor introduzca la distancia de su viaje (km): ");
		km = sc.nextInt(); // El valor es guardado en la variable
		// Se le pide al usuario que introduzca los dias
		System.out.print("Por favot introduzca en cuantos dias desea la vuelta: ");
		dias = sc.nextInt(); // El valor es guardado en la variable
		
		precio = km*2.5; //Damos valor a la constante
		
		//Si se cumplen las condiciones del descuento se aplica
		if (km >=800 && dias>7) {
			precio -= (precio*0.3);
		} //En caso contrario el precio se mantiene

		//Se ofrece al usuario el valor de su billete
		System.out.println("El precio del billete del tren es: " + precio + " euros");
		sc.close(); // Se cierra el objeto Scanner
	}
}

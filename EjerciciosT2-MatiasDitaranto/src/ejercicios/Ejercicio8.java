package ejercicios;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio8 {

	public static void main(String[] args) {
		// Creamos las variables donde guardaremos los datos introduccidos por el usuario
		int km;
		int dias;
		//Creamos la constante del precio 
		final double precio;
		
		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner
		
		precio = 2.5; //Damos valor a la constante
		
		// BLOQUE DE SCANNER
		// Se le pide al usuario que introduzca la distancia
		System.out.println("Por favor introduzca la distancia de su viaje (km)");
		km = sc.nextInt(); // El valor es guardado en la variable
		// Se le pide al usuario que introduzca los dias
		System.out.println("Por favot introduzca en cuantos dias desea la vuelta");
		dias = sc.nextInt(); // El valor es guardado en la variable
		
		//Si se cumplen las condiciones del descuento se aplica
		if (km >=800 && dias>7) {
			km *= (precio*0.3);
		} else { //En caso contrario el precio se mantiene
			km *= precio;
		}
		//Se ofrece al usuario el valor de su billete
		System.out.println("El precio del billete del tren es: " + km + " euros");
		sc.close(); // Se cierra el objeto Scanner
	}
}

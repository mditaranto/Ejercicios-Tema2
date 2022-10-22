package ejercicios;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * Creamos la variable donde guardaremos los numero aleatorios En este caso
		 * double ya que es necesario para generar un numero aleatorio, pero como
		 * despreciamos los decimales en este caso, siempre voy a usar el cast
		 */
		double num1;
		double num2;
		//// Creamos la variable donde guardaremos la suma realizada por el usuario
		int suma;

		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

		System.out.println("A continuacion se le ofecera 2 numeros que debe de sumar");
		// Creamos un numero aleatorio y lo guardamos en la variable
		num1 = Math.random() * 99;
		// Posteriormente se lo mostramos al usuario por pantalla
		System.out.println((int) num1);
		// Creamos un numero aleatorio y lo guardamos en la variable
		num2 = Math.random() * 99;
		// Posteriormente se lo mostramos al usuario por pantalla
		System.out.println((int) num2);

		// Se pide al usuario que ofrezca el resultado de la suma
		System.out.print("Resultado de la suma:");
		suma = sc.nextInt(); // El valor es guardado en la variable

		// En caso que la suma sea correcta se indica
		if (suma == (int) num1 + (int) num2) {
			System.out.println("Ha realizado correctamente la suma");
		} else { // En caso contrario se ofrece el resultado correcto
			System.out.println("Vaya, te has equivocado. la suma es: " + ((int) num1 + (int) num2));
		}

		sc.close(); // Se cierra el objeto Scanner
	}

}

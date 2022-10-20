package ejercicios;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos la variable donde guardaremos los numero aleatorios
		double num1;
		double num2;
		//// Creamos la variable donde guardaremos la suma realizada por el usuario
		int suma;
		
		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner
		
		//Creamos un numero aleatorio y lo guardamos en la variable
		num1 = Math.random() * 99 ;
		//Posteriormente se lo mostramos al usuario por pantalla
		System.out.println((int)num1);
		//Creamos un numero aleatorio y lo guardamos en la variable
		num2 = Math.random() * 99 ;
		//Posteriormente se lo mostramos al usuario por pantalla
		System.out.println((int)num2);
		
		suma = sc.nextInt();
		
		if (suma == (int)num1 + (int)num2) {
			System.out.println("Ha realizado correctamente la suma");
		} else {
			System.out.println("Vaya, te has equivocado. la suma es: " + ((int)num1 + (int)num2));
		}
			

	}

}

package ejercicios;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos la variable donde guardaremos los datos introduccidos
		double num;
		
		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner
		
		//Se le pide al usuario que introduzca un numero
		System.out.println("Introduzca un numero, positivo o negativo");
		num = sc.nextInt(); //El valor es guardado en la variable
		
		/*Con un ternario, si el numero es positivo se queda con su valor,
		en caso contrario se multiplica por -1 obteniendo un valor en positivo*/
		num = num>0 ? num : num*-1;
		
		//Se ofrece al usuario su numero en valor absoluto
		System.out.println("El numero introducido en valor absoluto es: " + num);

		sc.close(); //Cerramos el objeto Scanner
	}

}

package ejercicios;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio7 {

	/*
	 * Para la verificacion de este programa se han realizado diversas pruebas: Se
	 * horas = 23, minutos = 59, seg = 59 --> Pasados un segundo son las: 0:0:0
	 * horas = 22, minutos = 44, seg = 23 --> Pasados un segundo son las: 22:44:24
	 * horas = 25, minutos = 560, seg = 71 --> La hora introducida es incorrecta.
	 */

	public static void main(String[] args) {
		// Creamos las variables donde guardaremos los datos introduccidos por el
		// usuario
		int horas;
		int minutos;
		int seg;

		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

		// BLOQUE DE SCANNER
		// Se le pide al usuario que introduzca la hora
		System.out.print("Por favor introduzca la hora actual: ");
		horas = sc.nextInt(); // El valor es guardado en la variable
		// Se le pide al usuario que introduzca los minutos
		System.out.print("Por favor introduzca los minutos actuales: ");
		minutos = sc.nextInt(); // El valor es guardado en la variable
		// Se le pide al usuario que introduzca los segundos
		System.out.print("Por favor introduzca los segundos actuales: ");
		seg = sc.nextInt(); // El valor es guardado en la variable

		seg += 1; // se suma 1 segundo

		/*
		 * mediante una condicional nos aseguramos que haya introducido correctamente la
		 * hora
		 */

		if (horas <= 24 && minutos <= 60 && seg <= 60) {
			// Si los segundos pasan 60, se establece en 0 y se suma 1 minuto
			if (seg == 60) {
				seg = 0;
				minutos += 1;
			}
			// Si los minutos pasan 60, se establece en 0 y se suma 1 hora
			if (minutos == 60) {
				minutos = 0;
				horas += 1;
			}
			// Si las horas pasan 24, se establece en 0
			if (horas >= 24) {
				horas = 0;
			}

			// Se le ofrece al usuario los resultados en horas, minutos y segundos
			System.out.println("Pasados un segundo son las: " + horas + ":" + minutos + ":" + seg);

		} else {
			System.out.println("La hora introducida es incorrecta.");
		}

		sc.close(); // Se cierra el objeto Scanner

	}

}

package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int horas;
		int minutos;
		int seg;
		Scanner sc = new Scanner(System.in);

		horas = sc.nextInt();
		minutos = sc.nextInt();
		seg = sc.nextInt();
		seg += 1;

		if (horas <= 24 && minutos <= 60 && seg <= 60) {

			if (seg == 60) {
				seg = 0;
				minutos += 1;
			}

			if (minutos == 60) {
				minutos = 0;
				horas += 1;
			}
			if (horas == 24) {
				horas = 0;
			}
			// Se le ofrece al usuario los resultados en horas, minutos y segundos
			System.out.println("son las: " + horas + ":" + minutos + ":" + seg);

		} else {
			System.out.println("La hora introducida es incorrecta.");
		}

		sc.close(); // Se cierra el objeto Scanner

	}

}

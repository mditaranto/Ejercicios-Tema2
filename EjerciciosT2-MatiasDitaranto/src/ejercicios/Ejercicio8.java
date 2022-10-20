package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int km;
		int dias;
		final double precio;
		
		Scanner sc = new Scanner(System.in);
		
		precio = 2.5;
		km = sc.nextInt();
		dias = sc.nextInt();
		
		if (km >=800 && dias>7) {
			km *= (2.5*0.3);
		} else {
			km *= 2.5;
		}
		
		System.out.println("El precio del billete del tren es: " + km + "euros");
	}
}

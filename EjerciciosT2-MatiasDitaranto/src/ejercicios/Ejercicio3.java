package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		double kcomida;
		int numanim;
		double kcome;
		
		Scanner sc = new Scanner(System.in);
		
		kcomida = sc.nextDouble();
		numanim = sc.nextInt();
		kcome = sc.nextDouble();
		if (numanim >= 1) {
		if (kcomida>kcome) {
			System.out.println("comen");
		} else {
			System.out.println("Cada animal podra comer " + (kcomida/numanim) + "kilos");
		}
		} else {
			System.out.println("Si no hay animales no hay nada que alimentar");
		}
	}

}

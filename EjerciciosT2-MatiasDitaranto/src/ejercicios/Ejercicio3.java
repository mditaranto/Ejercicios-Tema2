package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int kcomida;
		int numanim;
		int kcome;
		
		Scanner sc = new Scanner(System.in);
		
		kcomida = sc.nextInt();
		numanim = sc.nextInt();
		kcome = sc.nextInt();
		
		if (kcomida/(kcome * numanim) >= 1) {
			System.out.println("comen");
		} else {
			System.out.println("no comen");
		}

	}

}

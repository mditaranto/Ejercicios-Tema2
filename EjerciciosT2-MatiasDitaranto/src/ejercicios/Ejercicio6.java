package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		int numusuario;
		
		Scanner sc = new Scanner(System.in);
		
		num1 = Math.random() * 99 + 1;
		System.out.println((int)num1);
		num2 = Math.random() * 99 + 1;
		System.out.println((int)num2);
		
		numusuario = sc.nextInt();
		
		if (numusuario == (int)num1 + (int)num2) {
			System.out.println("Ha realizado correctamente la suma");
		} else {
			System.out.println("Vaya, te has equivocado. la suma es: " + ((int)num1 + (int)num2));
		}
			

	}

}

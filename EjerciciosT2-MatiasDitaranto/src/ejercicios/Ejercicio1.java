package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		 int num;
		 int mile;
		 int cent;
		 int deci;
		 int unid;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Inserte un numero entre 0 u 9999");
		 num = sc.nextInt();
		 
		 mile = num/1000;
		 cent= (num%1000)/100;
		 deci = (num%100)/10;
		 unid = num%10;
		
		 if (num > 0 || num <= 9999) {
			if (num < 100 && deci == unid) {
				System.out.println("El numero es capicua.");
			} else if (num < 1000 && cent == unid) {
				System.out.println("El numero es capicua.");
			} else if (mile == unid && cent == deci) {
				System.out.println("El numero es capicua.");
			} else {
				System.out.println("El numero no es capicua.");
			}
		 }

		 sc.close();
	}

}

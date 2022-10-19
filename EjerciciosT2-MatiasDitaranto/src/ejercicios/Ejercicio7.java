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
		
		seg += horas * 3600;
		seg += minutos * 60;

		horas = (seg/3600); //Dividimos los segundos por 3600 (1 hora = 3600 segundos)
		minutos = (seg%3600)/60; //A los segundos restantes los dividimos entre 60 (1 min = 60 segundos)
		seg = (seg%60)%60; //Los segundos restantes de los miniutos son los que sobran
		
		//Se le ofrece al usuario los resultados en horas, minutos y segundos
		System.out.printf("son las: " + horas%2f + ":" + minutos%2f + ":" + seg%2f);
		sc.close(); //Se cierra el objeto Scanner

	}

}

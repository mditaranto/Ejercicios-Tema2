package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int num;
		String numletra;

		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();

		if (num < 100 && num >= 1);{

			switch (num % 10) {
			case 1 -> {
				numletra = "uno";
			}
			case 2 -> {
				numletra = "dos";
			}
			case 3 -> {
				numletra = "tres";
			}
			case 4 -> {
				numletra = "cuatro";
			}
			case 5 -> {
				numletra = "cinco";
			}
			case 6 -> {
				numletra = "seis";
			}
			case 7 -> {
				numletra = "siete";
			}
			case 8 -> {
				numletra = "ocho";
			}
			case 9 -> {
				numletra = "nueve";
			}
			default -> {
				numletra = "negativo";
			}
			}

			if (num > 10) {

				switch (num / 10) {
				case 1 -> {
					numletra = "diez";
				}
				case 2 -> {
					numletra = "veinte";
				}
				case 3 -> {
					numletra = "treinta";
				}
				case 4 -> {
					numletra = "cuarenta";
				}
				case 5 -> {
					numletra = "cincuenta";
				}
				case 6 -> {
					numletra = "sesenta";
				}
				case 7 -> {
					numletra = "setenta";
				}
				case 8 -> {
					numletra = "ochenta";
				}
				case 9 -> {
					numletra = "noventa";
				}
				default -> {
					numletra = "Es mayor a 99";
				}
				}

				if (num % 10 != 0) {
					switch (num / 10) {
					case 1 -> {
						numletra = "dieci";
					}
					case 2 -> {
						numletra = "veinti";
					}
					}
					if (num>30) {
						numletra += " y ";
					}
					switch (num % 10) {
					case 1 -> {
						numletra += "uno";
					}
					case 2 -> {
						numletra += "dos";
					}
					case 3 -> {
						numletra += "tres";
					}
					case 4 -> {
						numletra += "cuatro";
					}
					case 5 -> {
						numletra += "cinco";
					}
					case 6 -> {
						numletra += "seis";
					}
					case 7 -> {
						numletra += "siete";
					}
					case 8 -> {
						numletra += "ocho";
					}
					case 9 -> {
						numletra += "nueve";
					}
					}
					
				if (num < 16) {
					switch (num) {
					case 11 -> {
						numletra = "once";
					}
					case 12 -> {
						numletra = "doce";
					}
					case 13 -> {
						numletra = "trece";
					}
					case 14 -> {
						numletra = "catorce";
					}
					case 15 -> {
						numletra = "quince";
					}
					}

	
				}
			}
		}
		}
		System.out.println("El numero es " + numletra);
	}
}

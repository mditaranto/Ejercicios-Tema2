package ejercicios;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio1 {

	public static void main(String[] args) {
		 //Creamos la variable donde guardaremos los datos introduccidos
		 int num; 
		 //Creamos las variables para separar los numeros 
		 int mile;
		 int cent;
		 int deci;
		 int unid;
		 
		 Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		 
		 //Se le pide al usuario que introduzca un numero
		 System.out.print("Inserte un numero entre 0 y 9999");
		 num = sc.nextInt(); //El numero es guardado en la variable
		 
		 /* Aqui realizamos las operaciones donde se separa los numeros
		 en variables independientes */
		 mile = num/1000;      
		 cent= (num%1000)/100;  
		 deci = (num%100)/10;
		 unid = num%10;
		
		 //Mediante una condicional averiguamos si el numero es capicua
		 if (num < 0 || num > 9999) {
				 //Si el usuario ha introducido un numero fuera de los valores se le hace conocer
				 System.out.println("El numero introducido esta fuera de los parametros.");//en caso que este entre los valores pedidos se sigue
		 	} else if (num < 100 && deci == unid) { /*en caso que sea de 2 cifras y sean iguales, es capicua */
				System.out.println("El numero es capicua.");
			} else if (num < 1000 && cent == unid) { /*en caso que sea de 3 cifras y su primera
												cifra y ultima sean iguales, es capicua */
				System.out.println("El numero es capicua.");
			} else if (mile == unid && cent == deci) {  /*en caso que sea de 4 cifras y su primera
													cifra y ultima, y su segunda y tercera sean iguales, es capicua */
				System.out.println("El numero es capicua.");
			} else {
				System.out.println("El numero no es capicua."); //Si todo lo anterior no se cumple, no lo es
			}
		 sc.close(); //Cerramos el objeto Scanner
		 }
		
	}


package Ejercicio4;

import java.util.Scanner;

public class Main {
	//Para comprobar que el código es correcto hemos introducido el número 25 y el 5 y el sistema devuelve:
		/*La suma de los números es: 30
		La resta de los números es: 20
		La multiplicacion de los números es: 125
		La division de los números es: 5   */

	public static void main(String[] args) {
		int num1; //Declaramos las variables num1 y num2 para realizar operaciones, están serán introducidas por el usuario
		int num2;
		
		//Introducimos e importamos el scanner para poder leer teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que introduzca dos números
		System.out.println("Por favor introduzca dos números");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		//Creamos un objeto para llamar a las funciones
		Operaciones lectura = new Operaciones();
		
		//Le mostramos al usuario el resultado de las operaciones
		System.out.println("La suma de los números es: "+lectura.suma(num1,num2));
		
		System.out.println("La resta de los números es: "+lectura.resta(num1,num2));
		
		System.out.println("La multiplicacion de los números es: "+lectura.multiplicacion(num1, num2));
		
		System.out.println("La division de los números es: "+lectura.division(num1,num2));
		
		
	}

}


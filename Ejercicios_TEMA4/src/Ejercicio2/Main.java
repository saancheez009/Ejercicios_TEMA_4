package Ejercicio2;

import java.util.Scanner;

public class Main {
	
	//Para comprobar si el código es correcto hemos introducido el número 5 y nos ha devuelto:
	/*    La superficie de la esfera es: 314.1592653589793
		  El volumen de la esfera es: 523.5987755982989 */
	
	//Por tanto el código es correcto

	public static void main(String[] args) {
		
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		
		
		//Le pedimos al usuario que por favor introduzca un radio
		System.out.println("Por favor introduzca el radio de la esfera");
		Esfera.radio = sc.nextInt(); //Leemos el radio de la esfera
		
		
		//Le mostramos al usuario la superficie y el volumen de la esfera, para eso llamamos a las funciones, al ser estáticas no se necesita un objeto.
		System.out.println("La superficie de la esfera es: "+Esfera.superficie());
		
		System.out.println("El volumen de la esfera es: "+Esfera.volumen());
		
	}

}

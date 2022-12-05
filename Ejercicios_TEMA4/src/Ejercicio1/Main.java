package Ejercicio1;

import java.util.Scanner;

public class Main {

	//Para comprobar que el código es correcto introducimos el número 7 y nos devuelve que el número es capicúa y primo, luego probamos con otro número
		// el número 25 y nos devuelve que no es primo y tampoco capicúa por tanto está correcto
	
	public static void main(String[] args) {
		int numero; //Declaramos la variable número que será introducido por el usuario 
		
		Scanner sc =new Scanner(System.in); //Introducimos e importamos el scanner para leer el teclado
		
		System.out.println("Por favor introduzca un número para saber si es primo y capicúa "); //Le pedimos al usuario que por favor introduzca un número para decirle si es primo o capicúa
        numero=sc.nextInt(); //Leemos el número
        
        sc.close();
        
        Numeros lectura = new Numeros(); //Creamos un objeto para poder llamar a la función no estática
        System.out.println(lectura.esPrimo(numero) ? "El número es primo: true" : "El número no es primo: false"); //Llamamos a la función e imprimimos el resultado de si es primo o no, usamos un operador ternario para ello
        
        System.out.println(lectura.esCapicua(numero) ? "El número es capicúa: true" : "El número no es capicúa: false"); //Llamamos a la función e imprimimos si el número es capicúa o no
	}

}


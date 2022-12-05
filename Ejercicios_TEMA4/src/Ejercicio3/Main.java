package Ejercicio3;

import java.util.Scanner;

public class Main {
	
	//Para comprobar si el código es correcto introducimos el número 5 como cantidad de números
	// 50 como valor máximo
	// 40 como  valor mínimo
	//El sistema nos devuelve:
	/*Los números aleatorios generados entre 0 y 1 son: 
		0.4588192072971551
		0.8314608139870858
		0.23614503383094543
		0.31247262761825423
		0.6398095543788876
		Los números aleatorios generados entre 0 y 50 son:
		35
		27
		2
		8
		1
		Los números aleatorios generados desde el número 40 hasta el número 50 son: 
		40
		46
		45
		46
		44
		*/

	public static void main(String[] args) {
		

		int cantidadNumeros; //Declaramos la variable cantidadNumeros que será la cantidad de números aleatorios a generar
		int maximoNumero; //Declaramos la variable maximoNúmero que será el número máximo que tomará el número aleatorio
		int minimo;  //Delcramos la variable minimo que será el número mínimo que tomará de valor el número aleatorio
		
		//Importamos e introducimos el scanner para poder ñeer el teclado
		Scanner sc =new Scanner(System.in);
		
		
		//Le pedimos al usuario que por favor introduzca la cantidad de números aleatorios a generar
		System.out.println("Por favor introduzca la cantidad de números aleatorios a generar ");
	    cantidadNumeros=sc.nextInt();
		
	    
	    //Le pedimos al usuario el valor máximo que tomarán los números aleatorios
	    System.out.println("Por favor introduzca el valor máximo que tomarán los números aleatorios ");
	    maximoNumero=sc.nextInt();
	    
	    
	    //Le pedimos al usuario el valor mínimo que tomarán los números aleatorios
	    System.out.println("Por favor introduzca el valor mínimo que tomarán los números aleatorios ");
	    minimo=sc.nextInt();
	    
	    // Llamando a las funciones , le mostramos al usuario los números aleatorios generados entre 0 y 1, los números aleatorios hasta el número introducido
	    //Y los números aleatorios desde el número mínimo al máximo
	    
	    sc.close(); //Cerramos el scanner
	    
	    System.out.println("Los números aleatorios generados entre 0 y 1 son: ");
	    NumerosAleatorios.numerosAleatorios(cantidadNumeros);
		
	    System.out.println("Los números aleatorios generados entre 0 y "+maximoNumero+" son:");
	    NumerosAleatorios.numerosAleatorios(cantidadNumeros, maximoNumero);
	    
	    System.out.println("Los números aleatorios generados desde el número "+minimo+" hasta el número "+maximoNumero+" son: ");
	    NumerosAleatorios.numerosAleatorios(cantidadNumeros, maximoNumero, minimo);

	}

}

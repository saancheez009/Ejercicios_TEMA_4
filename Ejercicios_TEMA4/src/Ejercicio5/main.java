package Ejercicio5;


import java.util.Scanner;

public class main {
	
	//Para comprobar que el código es correcto hemos introducido el número 4 y para la exponencia n=2 y su base a=5
	//Nos ha devuelto:
	/*   La suma de los números consecutivos hasta el número introducido es : 10
		El resultado de a^n, es: 25.0
		El resultado del número correspondiente de la serie de Fibonacci es: 5*/

	public static void main(String[] args) {
	//Introducimos las variables numero, a y n
	int numero; //Este número será introducido por el usuario 
	int a; //Este número es la base 
	int n; //Este número es el exponente
	
	//Introducimos e importamos el scanner para poder leer el código 
	
	Scanner sc = new Scanner(System.in);
	
	
	//Le pedimos al usuario que introduzca un número y la base a y el exponente n
	System.out.println("Por favor introduzca un número ");
	numero=sc.nextInt();

	System.out.println("Por favor introduzca un número base (a) y su exponente (n)");
	a=sc.nextInt();
	n=sc.nextInt();
	
	sc.close();
	
	//Le mostramos al usuario los resultados de las operaciones realizadas en las funciones, para ello llamamos a las funciones correspondientes
	System.out.println("La suma de los números consecutivos hasta el número introducido es : "+FuncionesRecursivas.sumatorio(numero));
	
	System.out.println("El resultado de a^n, es: "+FuncionesRecursivas.potencia(a,n));
	
	System.out.println("El resultado del número correspondiente de la serie de Fibonacci es: "+ FuncionesRecursivas.serieFibonacci(numero));
	}

}


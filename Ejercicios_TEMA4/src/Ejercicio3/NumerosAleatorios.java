package Ejercicio3;

public class NumerosAleatorios {

	//Introducimos una función para mostrar la cantidad de números aleatorios que el usuario desee. Desde un mínimo a un máximo
	static void numerosAleatorios (int cantidadNumeros, int maximoNumero, int minimo) {
		
		//Utilizamos un for para establecer un máximo y un mínimo
		for (int i=1;i<=cantidadNumeros;i++) {
			int num = (int) (Math.random()*((maximoNumero)-minimo)+minimo);
			System.out.println(num); //Mostramos los números
			
		}
		
		
	}
	
	
	//Introducimos otra función para mostrar numeros aleatorios hasta el máximo introducido
	static void numerosAleatorios (int cantidadNumeros, int maximoNumero) {
		//Para ello utilizamos un for para declarar la cantidad de números aleatotios a generar y el número máximo que este debe tomar 
		for (int i=1;i<=cantidadNumeros;i++) {
			int num = (int) (Math.random()*maximoNumero); //Generamos los números aleatorios hasta el máximo
			System.out.println(num); //Mostramos los números
		}
			
			
		}
		
	
	
	//Introducimos una función para establecer una cantidad de números aleatorios a generar
	static void numerosAleatorios (int cantidadNumeros) {
		
		//introducimos un for para establecer esta cantidad
	for (int i=1;i<=cantidadNumeros;i++) {
		double num = Math.random(); //Generamos los números aleatorios
		System.out.println(num); //Mostramos los números aleatorios
	}
		
		
	}
}

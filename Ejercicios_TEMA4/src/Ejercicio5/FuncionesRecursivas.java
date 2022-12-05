package Ejercicio5;


public class FuncionesRecursivas {
	
	static int factorial=1; //Creamos una variable estática global que es factorial

	
	//Introducimos una función para calcular la serie fibonacci del número
	static int serieFibonacci(int numero) {
		//Introducimos resultado, que será lo que devolveremos en el return para que se muestre al usuario
		int resultado;
		
		if(numero<=1) { //Si el número es 1 le sigue el 1
			resultado=1;
			
		} else {
			resultado= serieFibonacci(numero-1) + serieFibonacci (numero-2); //Si no se cumple lo anterior , se calcula el fibonacci 
			//Si se introduce un 2 el número siguiente es 5
		}
	
	return resultado; //Devolvemos el resultado
	
	}
	
	
	//Introducimos una función llamada sumatorio en la que sumaremos los números consecutivamente hasta el número que el usuario desee
	static int sumatorio(int numero) {
		
		//Meadiante un for y un factorial realizamos la suma consecutiva de estos números.
		for (int i=1;i<=numero;i++) {
			  factorial = factorial + i;
		}
		/*factorial=numero*factorial*(numero-1);   este es un borrador*/
		
		return factorial-1; //Devolvemos el factorial menos 1
	}

	
	//Introducimos una función llamada potencia en ella calculamos el resultado de las potencias
	static double potencia (double a , int n) {
		//delcramos la variable resultado 
		double resultado = 0;
		
		if(n==0) { //Si n, la potencia es igual a 0 , el resultado es 1
			resultado=1;
		}else { //Si no se cumple lo anterior calculamos el resultado de la potencia
			resultado=Math.pow(a, n);
		
	}
		return resultado; //Devolvemos el resultado

	
	
	}
	
}
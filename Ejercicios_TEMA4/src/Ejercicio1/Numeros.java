package Ejercicio1;

public class Numeros {

	 boolean esPrimo(int numero) { //Declaramos la función no estática en la realizaremos las operaciones para saber si el número es primo o no
		 boolean result=true; //Introducimos un boolean, que será el resultado, puede ser true si el número es primo o false si no lo es
			
		 if(numero>0) {
				for(int i=2; i<=numero/2; i++) { //En el for le damos la instrucción de que solo se sume i hasta el número introducido por el usuario
					//Sie el resto de la división de n entre i es igual a 0, el número no es primo, por tanto result es igual a false
					if ( numero%i==0) {
						result=false; //Si lo mencionado anteriormente el número no es primo por tanto se devuelve false
					}
				}
				

	}
			return result; //Devolvemos el resultado
	 }
	
	 
	 boolean esCapicua(int numero) { //Declaramos la función no estática esCapicua en la que realizaremos operaciones para saber si es capicúa o no  
		 int invert; //Declaramos la variable invert que será el número invertido
		 int resto; //Declaramos la variable resto que es el resto de la división del número invertido entre 10
		 int descomposicion = 0; //Esta variable es la descomposición del número
		 boolean result=false; //Declaramos el resultado que será true o false si es capicúa o no
		 invert = numero;
	        while (invert!=0){
	            resto = invert % 10; //Calculamos el resto de la división ddel número invertido entre 10 para descomponer los números
	            descomposicion = descomposicion * 10 + resto; //Con esto se comprueba si el número al revés es igual al número introducido por el usuario
	            invert = invert / 10; //Quitamos la última cifra al número invertido 
	        }
	    
	        //Si el número introducido, es igual a la descomposición/inversión del número el sistema nos devolverá true, es decir que si es capicúa
	        if(numero == descomposicion ){
	        	result=true;
	           
	        }else{ //En caso de no cumplir las condiciones el sistema nos devolverá que el número no será capicúa
	      
	        }
	        return result; //Devolvemos el resultado
	 }
}


  

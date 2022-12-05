package Ejercicio4;

public class Operaciones {

	//Declaramos las variables suma, resta, multiplicación y división fuera de las funciones 
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
int suma (int num1,int num2) { //Introducimos la función suma 
	suma= num1+num2; //Realizamos la suma de los dos números
	
	return suma; //Devolvemos el resultado de la suma
}

int resta (int num1, int num2) { //Introducimos la función resta
	resta=num1-num2; //Restamos los dos números
	
	return resta; //Devolvemos el resultado de la resta 
}

int multiplicacion (int num1, int num2) { //Introducimos la función multiplicación
	multiplicacion=num1*num2; //Multiplicamos los dos números introducidos
	
	return multiplicacion; //Devolvemos el resultado de la multiplicación
	
}

int division (int num1, int num2) { //Introducimos la función división 
	division=num1/num2; //Dvidimos los números introducidos
	
	return division;  //Devolvemos el resultado de la división
}

}


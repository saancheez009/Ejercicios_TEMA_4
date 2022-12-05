package Ejercicio2;

public class Esfera {

static int radio; //Declaramos radio como variable global estática 
	
	static double superficie () { //Introducimos una función para el cálculo de la superficie
		
		//Declaramos la variable supericie
		double superficie;
		
		//Igualamos superficie a su fórmula
		superficie = 4*Math.PI*Math.pow(radio, 2);
		
		//Devolvemos la superficie
		return superficie;
	}
	
	
	static double volumen () { //Introducimos otra función para el cálculo del volumen
		
	//Declaramos la variable volumen
	double volumen;
	
	//Igualamos volumen a su fórmula 
	volumen=(4*Math.PI/3)*Math.pow(radio, 3);
	
	//Devolvemos el volumen
	return volumen;
	}

}

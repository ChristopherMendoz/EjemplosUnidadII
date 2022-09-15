package ciclos;

import java.util.ArrayList;

public class DemoForEach2 {

	public static void main(String[] args) {
		// Declaracion de una coleccion generica de String
		//Es un ArreyList de cadenas
		ArrayList<String> baldeString = new ArrayList<>();
		String nombre = "Danilo";
		baldeString.add("Hola");
		baldeString.add("Hello");
		baldeString.add("Hi");
		baldeString.add(nombre);
		
		//for(String cadena : baldeString) {
			//System.out.println("La cadena es " + cadena);
		//}
		//Vamos a cambiar String por Object 
		//El cual es un tipo mas general de cadena
		for(Object cadena : baldeString) {
		System.out.println("La cadena es " + cadena);
	}

	}

}

package ciclos;

import java.util.ArrayList;

public class DemoForEach {

	public static void main(String[] args) {
		//Declaracion e inicializacion de un ArrayList
		ArrayList balde = new ArrayList();
		//Agregamos al ArrayList unas cadenas
		//El metodo .add() esta disponible dentro de ArrayList
		balde.add("Hola");
		balde.add("Hello");
		balde.add("Hi");
		
		for (Object obj : balde) {
			System.out.println("El objeto es " + obj);
			
		}
		//Para demostar que la variable obj es una variable local
		//dentro de forEach
		for(Object obj : balde) {
			System.out.println("El objeto es " + obj);
		}
	}

}

package Arreglos_Cadenas;

public class DemoStringBuffer {

	public static void main(String[] args) {
		//Creacion de una cadena con StringBuffer
		StringBuffer str = new StringBuffer("Hola mundo!");
		//Uso del metodo .append() para concatenar
 		str.append(" Bienvenido a programacion!");
		System.out.println(str);  //Hola mundo! Bienvenido a programacion
		//Uso del metodo .insert() para insertar contenido nuevo
		str.insert(0, '!');
		System.out.println(str);   //¡Hola mundo! Bienvenido a programacion!
		//Creacion de una cadena Con StringBuffer
		StringBuffer cad = new StringBuffer("Hola mundo!");
		
		//Uso del metodo .replace() para reemplazar contenido 
		cad.replace(0, 2, "h0L");
		System.out.println(cad);  //hoLla mundo!
		//Uso del metodo .delete() para eliminar contenido
		cad.delete(0,1);
		System.out.println(cad); //OLla mundo!
		
		//Creacion de una cadena Con StringBuffer
		StringBuffer cadena = new StringBuffer("Universidad");
		//Uso del metodo .reverse() para invertir contenido
		System.out.println(cadena.reverse()); // dadisrevinU
		//Uso del metodo .capacity() para medir la capacidad del StringBuffer
		//La cantidad de almacenimiento disponible para los caracteres recien insertados
		System.out.println(cadena.capacity()); //27 -> 16 (Declaracion) + 11 (Universidad)

	}

}

package POOMetodos;

public class DemoMetodos {

	public static void main(String[] args) {
		// Vamos a usar la clase String 
		//Ubicacion en memoria llamada nombre 
		//de tipo de dato String
		String nombre;
		//Construccion de un objeto String 
		//Notar que el nombre del constructor es
		//el mismo nombre de la clase(String)
		nombre = new  String("Christopher Mendoza");
		System.out.println(nombre);
		//Ahora vamos a llamar un metodo general (charAt())
		//Este metodo retorna un caracter en una posicion dada
		char caracter = nombre.charAt(7);
		System.out.println("caracter en la posicion 7 es " + caracter);
		//Ahora vamo a llamar un metodo estatico (random())
		//de la clase Math
		double aleatorio;
		aleatorio = Math.random() * 101;
		System.out.println("aleatorio = " + aleatorio);

	}

}

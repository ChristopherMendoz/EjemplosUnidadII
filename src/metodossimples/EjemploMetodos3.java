package metodossimples;

public class EjemploMetodos3 {
        //Metodo no estatico que  no devuelve o retorna valor
	    //Tiene una lista de argumentos o parametros de entrada
	public void ImprimirArgumentosSimples(String s,int y) {
		System.out.println("La cadena es " + s);
		System.out.println("El entero es " + y);
	}
	public static void main(String[] args) {
		// Para los metodos no estaticos se debe crear un objeto
		//para poder llamarlos o invocarlos
		EjemploMetodos3 ej = new EjemploMetodos3();
		//Al momento de Llamar al metodo se le debe agregar
		//Los valores de los argumentos
		ej.ImprimirArgumentosSimples("Christopher", 36);

	}

}

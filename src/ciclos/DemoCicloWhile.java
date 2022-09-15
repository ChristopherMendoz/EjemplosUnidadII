package ciclos;

public class DemoCicloWhile {

	public static void main(String[] args) {
		System.out.println("Primer ciclo while, controlado por un contador");
        int contador = 0;
        while(contador < 3) {
        	System.out.println("El valor del contador = " + contador);
        	contador++;
        }
        System.out.println("Fin del primer ciclo while, controlado por un contador");
	}

}

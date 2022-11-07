package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploExcepcion {
   static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		int dividendo, divisor,cociente;
		try {
			System.out.println("Ingrese el dividendo: ");
			dividendo = console.nextInt();
			System.out.println();
			System.out.println("Ingrese el divisor: ");
			divisor = console.nextInt();
			System.out.println();
			cociente = dividendo / divisor;
			System.out.println("Cociente = " + cociente);
		} catch (ArithmeticException e){
			System.out.println(e.toString());
		}catch (InputMismatchException e) {
			System.out.println(e.toString());
		}

	}

}

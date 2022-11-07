package arrelgos.unidimensionales;

import java.util.Scanner;

public class InicializacionIteracion2 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
        int[] arrI = new int[10];
        System.out.println("Ingrese los elementos del arreglo: ");
        for (int i = 0; i < arrI.length; i++) {
			arrI[i] = lector.nextInt();
		}
        lector.close();
        System.out.println("Los elementos del arreglo son: ");
        for (int i = 0; i < arrI.length; i++) {
        	if (i % 5 == 0) 
				System.out.println("");
				System.out.print(arrI[i] + "\t");
			}
			
        	
		}

	

}

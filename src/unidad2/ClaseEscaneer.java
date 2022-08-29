package unidad2;

import java.util.Scanner;

public class ClaseEscaneer {
	
	static Scanner Lector = new Scanner (System.in);
	
	public static void main(String[] args) {
		int primerNum;
    	int segundoNum;
    	char letra;
    	double z;
    	
    	primerNum = 4;
    	segundoNum = 2 * primerNum + 6; 
    	z = (primerNum + 1) / 2.0;
    	letra = 'D';
    	segundoNum = Lector.nextInt();
    	z = Lector.nextDouble();
    	primerNum = segundoNum + 1;
    	primerNum = primerNum + (int)(letra);
    	
    	System.out.println("primerNum");
    	System.out.println("seundoNum");
    	System.out.println("letra");
        System.out.println("Z");    	
		
	}

}

package arreglos;

public class DeclaracionDeArreglos {

	public static void main(String[] args) {
		int a[] = new int[5];
		int []b = new int[10];
		int c[] = {2,4,6,8,10};
		int []d = new int[] {2,4,6,8,10};
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("Elemento " + (i + 1) + " => a[" + i +"] = " + a[i] + "\t" );
		}
		System.out.println("\n");
		for (int i = 0; i < b.length; i++) {
			System.out.println("Elemento " + (i + 1) + " => b[" + i +"] = " + b[i] + "\t" );
		}
		System.out.println();

	}

}

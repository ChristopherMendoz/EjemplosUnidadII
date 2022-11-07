package arreglos;

public class DeclaracionDeArreglos2 {

	public static void main(String[] args) {
		int a[] = new int[5];
		int []b = new int[10];
		int c[] = {2,4,6,8,10};
		int []d = new int[] {2,4,6,8,10};
		
		a[0] = 11;
		a[1] = 22;
		a[2] = 33;
		a[3] = 44;
		a[4] = 55;
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("Elemento " + (i + 1) + " => a[" + i +"] = " + a[i] + "\t" );

		}
		System.out.println("\n");
		
		b[0] =5 ;b[1] =10 ;b[3] =15 ;b[4] =20 ;b[5] =25 ;b[6] =30 ;b[7] =35; b[8] =40; b[9] =45;
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("Elemento " + (i + 1) + " => b[" + i +"] = " + b[i] + "\t" );

		}
		System.out.println();
		
		for (int i = 0; i < c.length; i++) {
			System.out.print("Elemento " + (i + 1) + " => c[" + i +"] = " + c[i] + "\t" );

		}
		System.out.println("\n");
		for (int i = 0; i < d.length; i++) {
			System.out.print("Elemento " + (i + 1) + " => d[" + i +"] = " + d[i] + "\t" );

		}
	}

}

package arreglos;

public class CopiaDeArreglos {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
	    int[] arr2 = new int[10];
		System.out.println("======Elementos de arr[]======");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			
		}
		System.out.println();
		System.out.println("======Elementos de arr2[]======");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		System.out.println("======Elementos nuevos de arr2[]======");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");
			
		}
		System.out.println();
		arr = arr2;
		System.out.println("======Elementos de arr[] despues de asignarle la direccion de arr2[]======");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			
		}
	}
} 

 
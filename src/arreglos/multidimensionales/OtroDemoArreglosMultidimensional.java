package arreglos.multidimensionales;

public class OtroDemoArreglosMultidimensional {
	  //Metodo que muestra contenido de un arreglo
		//Como parametro de entrada necesita un arreglo multidimensional
		public static void mostrarArreglo2D(int[][] iaa) {
			System.out.println("El arreglo contiene: ");
			//Itera sobre el arreglo superior(mas grande)
			for (int i = 0; i < iaa.length; i++) {  //Va a tomar arreglos individuales de  int
				//Imprime el numero de elementos del arreglo de int que va a mostrar luego
				System.out.print(iaa[i].length + " elementos: ");
				//Itera sobre el subarreglo para mostar los int individuales
				for (int j = 0; j < iaa[i].length; j++) {
					System.out.print(" " + iaa[i][j]); //Elementos int individuales
					
				}
				System.out.println();  //Muestra un salto de linea
				
			}
		}
		public static void main(String[] args) {
			//Llamada al metodo mostrarArreglo2D()
			//Con un arreglo recien creado como parametro de entrada
			mostrarArreglo2D(new int[][]{
			
					{1,2,3},
					{2,3,4}
					
			});
	
		}

	}



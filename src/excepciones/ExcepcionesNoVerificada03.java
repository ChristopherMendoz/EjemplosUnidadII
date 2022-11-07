package excepciones;

public class ExcepcionesNoVerificada03 {
	
	public static void main(String[] args) {
		
	System.out.println("======INICIO DEL PROGRAMA======");
    int a = 12, b = 0, respuesta = 0;
    try {
    	respuesta = a/b;
    	System.out.println("a = " + a + " b = " + b + " respuesta = " + respuesta);
		
	} catch (ArithmeticException e) {
		System.out.println("Ocurrio un ERROR aritmetico!");
		//e.printStackTrace();
		
	}
    System.out.println("Sentencia despues del bloque try....catch!");
    
    double [] valores = new double[3];
    valores[0] = 44.77;
    valores[1] = 99;
    valores[2] = 12.6;
    //valores[3] = 100.963;
    
      for(double d : valores) {
    	  System.out.println("d = "  + d);
      }

}
}


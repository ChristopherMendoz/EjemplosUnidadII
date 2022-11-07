package excepciones;

import java.io.*;

public class ExcepcionesVerificadas {

	public static void main(String[] args) {
      File archivo;
      FileReader lectorArchivos;
      BufferedReader lectorBuffer;
      
      String nombreEmpresa = null;
      
      archivo = new File("nombres.txt");
      lectorArchivos = new FileReader(archivo);
      lectorBuffer = new BufferedReader(lectorArchivos);
      
      nombreEmpresa = lectorBuffer.readLine();
      while(nombreEmpresa != null) {
    	  System.out.println("Nombre de la empresa: " + nombreEmpresa);
    	  nombreEmpresa = lectorBuffer.readLine();
      }
	}

}

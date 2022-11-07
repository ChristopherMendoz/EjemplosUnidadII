package metodossobrecargados;

public class DemoMetodosSobrecargados {
	
	public void hacerAlgo() {
		System.out.println("Metodo sobrecargado sin argumentos!");
		
	}
	public void hacerAlgo(String s) {
		System.out.println("Metodo sobrecargado con argumento = " + s);
	}
	public int hacerAlgo(int i) {
		System.out.println("Metodo sobrecargado con argumento int = " + i);
		return i * 2;
	}

	public static void main(String[] args) {
		//como todos los metodos son sobrecargados se debe crear un objeto (instancia)
		DemoMetodosSobrecargados obj = new DemoMetodosSobrecargados();
		
		obj.hacerAlgo();
		obj.hacerAlgo("Hola");
		int x = obj.hacerAlgo(10);

	}

}

package POOMetodos;

public class IntroAMetodos2 {
	public int imprimir(int a,int b) {
		int i = 0;
		for (i = a; i < b; i++) {
			System.out.println("i = " + i);
			
		}
		return i;
	}

	
	public static void main(String[] args) {
		IntroAMetodos2 valor = new IntroAMetodos2();
		
		int num = valor.imprimir(2, 5);
		System.out.println("num = " + num);

	}

}

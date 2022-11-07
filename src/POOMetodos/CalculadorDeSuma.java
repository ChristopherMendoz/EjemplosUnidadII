package POOMetodos;

public class CalculadorDeSuma {
	public int sumar(int sumandoX,int sumandoY) {
		int resultado = sumandoX + sumandoY;
		return resultado;
}
	public static void main(String[] args) {
		CalculadorDeSuma calc = new CalculadorDeSuma();
		int suma = calc.sumar(10, 30);
		System.out.println("Resultado de la suma = " + suma);

	}

}

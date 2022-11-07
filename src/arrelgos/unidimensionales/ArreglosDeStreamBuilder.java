package arrelgos.unidimensionales;

public class ArreglosDeStreamBuilder {

	public static void main(String[] args) {
	    StringBuilder[] sbA = new StringBuilder[10];
	    for (int i = 0; i < sbA.length; i++) {
			sbA[i] = new StringBuilder("Hola " + i);
		}
	    for (int i = 0; i < sbA.length; i++) {
			System.out.println(sbA[i]);
		}

	}

}

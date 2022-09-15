package modificadores;

public class DemoModificadoress {
	public void probar() {
		System.out.println("Dentro del metodo no estatico probar()");
	}
    public static void probarEstatico() {
    	System.out.println("Dentro del metodo estatico probarEstatico()");
    }
	
	public static void main(String[] args) {
		DemoModificadoress objeto = new DemoModificadoress();
		System.out.println("Dentro del metodo main()");
		objeto.probar();
		probarEstatico();
	}
		
}

package palabrastatic;

public class Cosa {

	//Miembros de la clase
	private int x;  // NO static
	private static int y; 
	//main es un metodo static
	
	public static void main(String[] args) {
	y = 99;	//Valor de y asociado a la clase Cosa
        System.out.println("y = " + y);
       //Creacion de instancias de Cosa
        Cosa c1 = new Cosa();
        Cosa c2 = new Cosa();
        System.out.println("======Instancias de Cosa======");
        System.out.println("c1.y = " + c1.y);
        System.out.println("c2.y = " + c2.y);
        //Asignacion de valores x
        c1.x = 100;
        c2.x = 200;
        System.out.println("======Instancias de Cosa======");
        System.out.println("c1.x = " + c1.x);
        System.out.println("c2.x = " + c2.x);
        System.out.println("======Metodo static mostrarY()======");
        mostrarY();  // Invocacion o llamada al metodo
        System.out.println("======Metodo no static mostrarX()======");
        c1.mostrarX(); //Invocacion o llamado al metodo
        c2.mostrarX();
	}
	//Metodo no static
	void mostrarX() {
		System.out.println("x = " + x);
		System.out.println("This.x = " + this.x);
		
		System.out.println("y = " + y);
		System.out.println("Cosa.y = " + Cosa.y);
		System.out.println("This.y = " + this.y);
		
	}
	//Metodo static 
	static void mostrarY() {
		System.out.println("y = " + y);
		System.out.println("Cosa.y = " + Cosa.y);
		//System.out.println("This.y = " + this.y);
		//System.out.println("x = " + x);
		//System.out.println("This.x = " + this.x);
	}

}

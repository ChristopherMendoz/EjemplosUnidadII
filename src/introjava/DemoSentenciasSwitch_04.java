package introjava;

public class DemoSentenciasSwitch_04 {

	public static void main(String[] args) {
		int dia = 2 ; // si ponemos 99 nos imprimira en pantalla el ultimo system.out
		System.out.println("Dia numero: " + dia);
		
		switch(dia) {
		case 0:
			System.out.println("Una nueva Semana Inicia!");
			break;
		case 1:
				System.out.println("Aburrido!");
				//break;
		case 2:
			System.out.println("Ok, volvamos a intentarlo!");
			//break;
		case 3:
			System.out.println("Yupi, ya estamos a mitad de camino!");
			//break;
		case 4:
			System.out.println("Aun falta!");
			break;
		case 5:
			System.out.println("Si, ya viene el fin de semana!");
			break;
			default:
				System.out.println("Los fines de semana son lo mejor , pero duran poco!");
		}

	}

}

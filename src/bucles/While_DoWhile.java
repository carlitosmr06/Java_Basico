package bucles;

public class While_DoWhile {

	public static void main(String[] args) {
		
		int contador = 0;

		while (contador < 5) {
		    System.out.println("El contador es: " + contador);
		    contador++;
		}
		
		System.out.println();
		
		int contador2 = 0;

		do {
		    System.out.println("El contador es: " + contador2);
		    contador2++;
		} while (contador2 < 5);
		
	}
	
}

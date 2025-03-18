package bucles;

public class For {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
		    System.out.println("Iteración " + i);
		}
		
		System.out.println();
		
		int[] numeros = {1, 2, 3, 4, 5};
		for (int i = 0; i < numeros.length; i++) {
		    System.out.println(numeros[i]);
		}
		
		System.out.println();
		
		int[] numeros2 = {1, 2, 3, 4, 5};
		for (int numero : numeros2) {
		    System.out.println(numero);
		}
		
	}
	
}

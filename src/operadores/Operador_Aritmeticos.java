package operadores;

public class Operador_Aritmeticos {

	public static void main(String[] args) {
		
		int a = 8, b = 3, c = -5;
		
		System.out.printf("a) a + b + c = %d%n", a + b + c);
		System.out.printf("b) 2 * b + 3 * (a - c) = %d%n", 2 * b + 3 * (a - c));
		System.out.printf("c) a / b = %d%n", a / b);
		System.out.printf("d) a %% b = %d%n", a % b);
		System.out.printf("e) a / c = %d%n", a / c);
		System.out.printf("f) a %% c = %d%n", a % c);
		System.out.printf("g) a * b / c = %d%n", a * b / c);
		System.out.printf("h) a * (b / c) = %d%n", a * (b / c));
		System.out.printf("i) (a * c) %% b = %d%n", (a * c) % b);
		System.out.printf("j) a * (c %% b) = %d%n", a * (c % b));
		System.out.printf("k) (3 * a - 2 * b) %% (2 * a - c) = %d%n",
					(3 * a - 2 * b) % (2 * a - c));
		System.out.printf("l) 2 * ( a / 5 + (4 - b * 3)) %% (a + c - 2) = %d%n", 
					2 * ( a / 5 + (4 - b * 3)) % (a + c - 2));
		System.out.printf("m) (a - 3 * b) %% (c + 2 * a) / (a - c) = %d%n", 
					(a - 3 * b) % (c + 2 * a) / (a - c));
		System.out.printf("n) a - b - c * 2 = %d%n", a - b - c * 2);	
		
	}
	
	
	
}

import java.util.Scanner;

public class Ej363 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (ejercicio()) {
		}
	}	
	
	public static boolean ejercicio() {
		double consume = scan.nextInt();
		if (consume == 0)
			return false;
		
		int comilonas = scan.nextInt();
		
		int[] caloriasComilonas = new int[comilonas];
		double total = 0;
		for (int i = 0; i < caloriasComilonas.length; i++) {
			caloriasComilonas[i] = scan.nextInt();
			total += caloriasComilonas[i];
		}

		double resto = Math.ceil(total / consume);
		System.out.println((int) resto);
		
		return true;
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.println("Digite o primeiro valor");
		x = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		y = sc.nextInt();
		
		while(x != y) {
			if (x > y) {
				System.out.printf(x + " | " + y + " = Descrescente\n");
			} else{
				System.out.printf(x + " | "+ y + " = Crescente\n");
			}
			System.out.println("Digite o primeiro valor");
			x = sc.nextInt();
			System.out.println("Digite o segundo valor:");
			y = sc.nextInt();
		}
		System.out.println("Valores iguais. Fim do programa.");
		sc.close();
	}

}

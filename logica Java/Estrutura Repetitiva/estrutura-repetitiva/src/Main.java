import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int x = sc.nextInt();
		
		while(x < 10) {
			System.out.println("Digite um número maior ou igual ao estipulado:");
			x = sc.nextInt();
		}
		System.out.println("Tudo certo.");
		sc.close();
	}

}

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Desafio do site Beecrowd
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a, b, prod;
			System.out.println("Digite o primeiro valor:"); a = sc.nextInt();
			System.out.println("Digite o segundo valor:"); b = sc.nextInt();
			prod  = a * b;
			System.out.printf("O produto dos número é %d", prod);
		sc.close();
	}

}

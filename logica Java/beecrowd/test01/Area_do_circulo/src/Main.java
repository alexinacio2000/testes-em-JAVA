import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Desafio do site beecrowd 1002 - Área do Círculo
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double area, raio, n,x ;
		n = 3.14159;
		x = 2;
		System.out.println("Digite o valor do raio:");raio = sc.nextDouble();
		area = n * Math.pow(raio, x);
		System.out.println("A " + area);
		sc.close();
		
	}

}

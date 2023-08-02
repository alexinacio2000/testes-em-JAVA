import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite números, quando o zero for digitado, eu farei a soma de todos os numeros digitados:");
		System.out.println("Número: ");int x = sc.nextInt();
		int y = 0;
		
		while(x != 0) {
			y += x;
			System.out.println("Digite:");
			x = sc.nextInt();
			
		}
		System.out.println("A soma total é: " + y);
		
		
		sc.close();
	}

}

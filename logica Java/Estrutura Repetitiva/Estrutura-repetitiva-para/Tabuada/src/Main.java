import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número que você deseja ver a tabuada:"); int x =sc.nextInt();
		int soma = 0;
		for(int i =0; i<11;i++) {
			soma = i * x;
			System.out.println("Tabuada:" + x + " x " + i + " " +soma);
		}
		sc.close();

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, c;
		int Media, elementos;
		Scanner sc= new Scanner(System.in);
		elementos =3;
		System.out.println("Digite 3 números inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		Media = a + b + c / elementos;
		System.out.printf("Os números digitados foram %s, %s e %s é a média de todos os números digitados é %s", a, b,c, Media);
		sc.close();
	}

}

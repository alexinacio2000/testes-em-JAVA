import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double a, b, c, area, preco;
		System.out.println("Bem vindo vamos avaliar o tamanho e valor do seu terreno");
		System.out.println("Largura:"); a = sc.nextDouble();;
		System.out.println("Comprimento:"); b = sc.nextDouble();
		System.out.println("Valor do Terreno:"); c = sc.nextDouble();
		area =  a* b;
		preco = area * c;
		System.out.printf("A area ficou %.2f%nO preço do terreno ficou R$: %.2f", area,preco);
		
		
		
		
		sc.close();
	}
}

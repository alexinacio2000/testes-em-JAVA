import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma idade");int x = sc.nextInt();
		int contador =0;
		int rep = 0;
		if (x < 0) {
			System.out.println("Impossível calcular");
		
		} else if(x >0){ {
			while (x > 0) {
				rep +=1;
				contador +=x;
				System.out.println("Digite outra idade: ");
				x = sc.nextInt();
			}
			double media = contador /rep;
			System.out.println("A média é " + media);
		}
		}
				sc.close();
	}

}

package funcoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite três valores: ");
		
		System.out.println("Digite o valor: "); int y = sc.nextInt();
		System.out.println("Digite o valor: ");  int z = sc.nextInt();
		System.out.println("Digite o valor: ");  int w = sc.nextInt();
		
		int higher = max(y,z,w);
		
		showResults(higher);
		
		
		sc.close();
	}
	public static int max(int a, int b, int c) {
		int aux;
		if(a > b && a > c){
			aux = a;
		}
		else if(b > c && b > a) {
			aux = b;
		}
		else {
			aux = c;
		}
		return aux;
	}
	
	public static void showResults(int value) {
		System.out.println("Maior = " + value);
	}
}

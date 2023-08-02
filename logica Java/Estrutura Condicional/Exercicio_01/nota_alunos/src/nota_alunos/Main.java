package nota_alunos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, media;
		String pergunta;
		System.out.println("Bem vindo, ao sistema de notas");
		System.out.println("Gostaria de fazer o cálculo da sua média ?");
		pergunta = sc.next();
		
		
		if (pergunta.equals("Sim")) {
			System.out.println("Bem vindo ao cálculo de notas \nInforme suas notas:");
			System.out.println("Nota 1:");
			nota1 = sc.nextDouble();
			System.out.println("Nota 2:");
			nota2 = sc.nextDouble();
			media = nota1 + nota2 / 2;
			
			if(media <70) {
				System.out.printf("Sua nota é: "+ media + "\n");
				System.out.println("Você está reprovado");
			} else {
				System.out.printf("Sua nota é: "+ media + "\n");
				System.out.println("Você está aprovado");
			}
			
		}
		sc.close();
	}
	
}

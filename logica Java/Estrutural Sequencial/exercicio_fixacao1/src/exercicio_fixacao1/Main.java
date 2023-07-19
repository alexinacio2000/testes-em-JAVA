package exercicio_fixacao1;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5090;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n%s, com o preço de R$%.2f%n%s com o preço de R$%.2f%n"
				+ "Record: %d anos atrás, code: %d e gênero: %s%nMedida com oita casas decimais: %.8f%n"
				+ "Arredondado para 3 casas decimais %.3f%n", product1, price1,product2,price2, age, code, gender, measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Numero com pontuação Estadunidense %f", measure);
	
	}

}

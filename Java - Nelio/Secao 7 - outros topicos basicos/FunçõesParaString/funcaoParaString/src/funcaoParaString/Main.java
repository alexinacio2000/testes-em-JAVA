package funcaoParaString;

public class Main {

	public static void main(String[] args) {
		String nome = "ABCD abcd AbCD";
		String correta = nome.toLowerCase();
		System.out.println(correta);

		String s = "Potato Aplle Lemon";
		String [] vect = s.split(" ");
		String w1 = vect[0];
		String w2 = vect[1];
		String w3 = vect[2];
		
		System.out.println(w3);
	}

}

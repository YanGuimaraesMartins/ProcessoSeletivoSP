package exercicios;

public class Exercicio1 {
	public static void main(String[] args) {
		int INDICE = 13;
		int SOMA = 0;

		for (int k = 0; k < INDICE;) {
			k = k + 1;
			SOMA += k;
		}
		System.out.println(SOMA);
	}
}

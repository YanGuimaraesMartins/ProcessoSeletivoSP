package exercicios;

public class Exercicio2 {
	public static void main(String[] args) {
		int num = 2;

		System.out.println(fibo(num));
	}

	public static String fibo(int num) {
		int ant = 0;
		int result = 1;
		String s;

		while (num > result) {
			int aux = result;
			result += ant;
			ant = aux;
		}

		if (num == result || num == 0) {
			s = "Sim, o numero " + num + " pertence a sequencia de fibonacci";
			return s;
		}

		s = "Nao, o numero " + num + " nao pertence a sequencia de fibonacci";
		return s;
	}
}

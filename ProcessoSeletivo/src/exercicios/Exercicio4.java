package exercicios;

public class Exercicio4 {
	public static void main(String[] args) {
		float fatTotal, sp, mg, rj, es, outros;
		sp = 67836.43f;
		rj = 36678.66f;
		mg = 29229.88f;
		es = 27165.48f;
		outros = 19849.53f;

		fatTotal = sp + mg + rj + es + outros;

		System.out.printf("Precentuais:\n-------------------------------------\n");
		System.out.printf("SP tem participacao em %.2f%%\n", ((float) (sp * 100) / fatTotal));
		System.out.printf("RJ tem participacao em %.2f%%\n", ((float) (rj * 100) / fatTotal));
		System.out.printf("MG tem participacao em %.2f%%\n", ((float) (mg * 100) / fatTotal));
		System.out.printf("ES tem participacao em %.2f%%\n", ((float) (es * 100) / fatTotal));
		System.out.printf("Outros tem participacao em %.2f%%\n", ((float) (outros * 100) / fatTotal));

	}
}

package exercicios;

public class Exercicio5 {
	public static void main(String[] args) {
		String Entrada = "Abobora";
		String Saida = "";
		
		for (int i = Entrada.length()-1; i>=0;i--) {
			Saida = Saida + Entrada.charAt(i);
		}
		System.out.println(Saida);
	}
}

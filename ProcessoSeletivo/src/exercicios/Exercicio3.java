package exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Exercicio3 {
	public static void main(String[] args) {
		 String caminhoArquivo = "C:\\dev\\TargetTeste\\ProcessoSeletivo\\src\\exercicios\\lib\\dados.json";
	        StringBuilder conteudo = new StringBuilder();

	        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
	            String linha;
	            while ((linha = br.readLine()) != null) {
	                conteudo.append(linha).append("\n"); 
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

		String content = conteudo.toString();

		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();

		Gson gson = builder.create();
		Faturamento[] faturamento = gson.fromJson(content, Faturamento[].class);

		int fds = 0, maioresquemedia = 0;
		double mediaDiaria = 0, maior = 0, menor = Double.MAX_VALUE;

		for (int i = 0; i < faturamento.length; i++) {
			if (faturamento[i].valor == 0.0) {
				fds++;
			} else {
				if (faturamento[i].valor >= maior) {
					maior = faturamento[i].valor;
				}
				if (faturamento[i].valor <= menor) {
					menor = faturamento[i].valor;
				}
				mediaDiaria += faturamento[i].valor;
			}
		}
		mediaDiaria = mediaDiaria / (faturamento.length - fds);

		for (int i = 0; i < faturamento.length; i++) {
			if (faturamento[i].valor >= mediaDiaria)
				maioresquemedia++;
		}
System.out.println("O menor valor de faturamento ocorrido em um dia do mês é: "+ menor);
System.out.println("O maior valor de faturamento ocorrido em um dia do mês é: "+maior);
System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal é: "+maioresquemedia);
	}
}

class Faturamento {

	int dia;
	double valor;

}
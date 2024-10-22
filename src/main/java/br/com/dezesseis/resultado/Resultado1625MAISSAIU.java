package br.com.dezesseis.resultado;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

import com.opencsv.CSVReader;

import br.com.enumerador.NumeroEnum;
import br.com.excecao.LotoException;

public class Resultado1625MAISSAIU {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\dezesseis\\rnp08\\Resultado1625SEMRNS_CONC_3057.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);

		int cont = 0;
		URL combinacao1625 = Resultado1625MAISSAIU.class.getClassLoader().getResource("dezesseis\\rnp08\\listaFinalVinteCinco_conc3057.csv");
		if (Objects.nonNull(combinacao1625)) {

			Path caminho = Paths.get(combinacao1625.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaCombinacao;
			while (Objects.nonNull((linhaCombinacao = csvReader.readNext()))) {

				int[] linhaCombinacao1625 = new int[linhaCombinacao.length];
				for (int i = 0; i < linhaCombinacao.length; i++) {
					linhaCombinacao1625[i] = Integer.parseInt(String.valueOf(linhaCombinacao[i]));
				}

				String lista = null;
				int retorno = resultado1625SAIU(linhaCombinacao1625);
				int frequencia = frequenciaResultado1625SAIU(linhaCombinacao1625);
				if (retorno > NumeroEnum.ZERO.getValor()) {
					lista = linhaCombinacao1625[0] + "," + linhaCombinacao1625[1] + "," + linhaCombinacao1625[2] + ","
							+ linhaCombinacao1625[3] + "," + linhaCombinacao1625[4] + "," + linhaCombinacao1625[5] + ","
							+ linhaCombinacao1625[6] + "," + linhaCombinacao1625[7] + "," + linhaCombinacao1625[8] + ","
							+ linhaCombinacao1625[9] + "," + linhaCombinacao1625[10] + "," + linhaCombinacao1625[11]
							+ "," + linhaCombinacao1625[12] + "," + linhaCombinacao1625[13] + ","
							+ linhaCombinacao1625[14] + "," + linhaCombinacao1625[15] + "," + retorno + ","
							+ frequencia;
					gravarArqSaiu.printf("%s%n", lista);
				}

				System.out.println(cont++);
			}

			arqSaiu.close();
			gravarArqSaiu.close();
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
	}

	public void resultado1625MAISSAIU(List<String> listaCombinacoes, String nomeLista)
			throws URISyntaxException, IOException, LotoException {

		FileWriter arqSaiu = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\dezesseis\\"+nomeLista+".csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);

		for (String lista16 : listaCombinacoes) {
			String[] linhaCombinacao = lista16.split(",");

			int[] linhaCombinacao1625 = new int[linhaCombinacao.length];
			for (int i = 0; i < linhaCombinacao.length; i++) {
				linhaCombinacao1625[i] = Integer.parseInt(String.valueOf(linhaCombinacao[i]));
			}

			String lista = null;
			int retorno = resultado1625SAIU(linhaCombinacao1625);
			int frequencia = frequenciaResultado1625SAIU(linhaCombinacao1625);
			if (retorno > NumeroEnum.ZERO.getValor()) {
				lista = linhaCombinacao1625[0] + "," + linhaCombinacao1625[1] + "," + linhaCombinacao1625[2] + ","
						+ linhaCombinacao1625[3] + "," + linhaCombinacao1625[4] + "," + linhaCombinacao1625[5] + ","
						+ linhaCombinacao1625[6] + "," + linhaCombinacao1625[7] + "," + linhaCombinacao1625[8] + ","
						+ linhaCombinacao1625[9] + "," + linhaCombinacao1625[10] + "," + linhaCombinacao1625[11] + ","
						+ linhaCombinacao1625[12] + "," + linhaCombinacao1625[13] + "," + linhaCombinacao1625[14] + ","
						+ linhaCombinacao1625[15] + "," + retorno + "," + frequencia;
				gravarArqSaiu.printf("%s%n", lista);
			}

		}

		arqSaiu.close();
		gravarArqSaiu.close();
		
		System.out.println("Fim resultado1625MAISSAIU.");

	}

	@SuppressWarnings({ "deprecation" })
	public static int resultado1625SAIU(int[] linhaCombinacao1625)
			throws URISyntaxException, NumberFormatException, IOException {

		int contJogo = 0;
		int qtdJogoSaiu = 0;
		URL resultado1625SAIU = Resultado1625MAISSAIU.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado1625SAIU)) {

			Path caminho = Paths.get(resultado1625SAIU.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1625SAIU;
			while (Objects.nonNull((linhaResultado1625SAIU = csvReader.readNext()))) {

				contJogo = 0;
				int[] linhaResultado = new int[linhaResultado1625SAIU.length];
				for (int i = 0; i < linhaResultado1625SAIU.length; i++) {
					linhaResultado[i] = Integer.parseInt(String.valueOf(linhaResultado1625SAIU[i]));
				}

				for (int i = 0; i < linhaCombinacao1625.length; i++) {
					for (int j = 0; j < linhaResultado.length; j++) {
						if (linhaCombinacao1625[i] == linhaResultado[j]) {
							contJogo++;
						}
					}
				}

				if (contJogo == NumeroEnum.QUATORZE.getValor()) {
					qtdJogoSaiu++;
				}
			}
		} else {
			System.out.println("### [resultado1625SAIU - resultado.csv] Arquivo nao encontrado... ###");
		}

		return qtdJogoSaiu;
	}

	@SuppressWarnings({ "deprecation" })
	public static int frequenciaResultado1625SAIU(int[] linhaCombinacao1625)
			throws URISyntaxException, NumberFormatException, IOException {

		int contJogo = 0;
		int qtdJogoNaoSaiu = 0;
		URL resultado1625SAIU = Resultado1625MAISSAIU.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado1625SAIU)) {

			Path caminho = Paths.get(resultado1625SAIU.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1625SAIU;
			while (Objects.nonNull((linhaResultado1625SAIU = csvReader.readNext()))) {

				contJogo = 0;
				int[] linhaResultado = new int[linhaResultado1625SAIU.length];
				for (int i = 0; i < linhaResultado1625SAIU.length; i++) {
					linhaResultado[i] = Integer.parseInt(String.valueOf(linhaResultado1625SAIU[i]));
				}

				for (int i = 0; i < linhaCombinacao1625.length; i++) {
					for (int j = 0; j < linhaResultado.length; j++) {
						if (linhaCombinacao1625[i] == linhaResultado[j]) {
							contJogo++;
						}
					}
				}

				if (contJogo == NumeroEnum.QUATORZE.getValor()) {
					qtdJogoNaoSaiu = 0;
				} else {
					qtdJogoNaoSaiu++;
				}
			}
		} else {
			System.out.println("### [frequenciaResultado1625SAIU - resultado.csv] Arquivo nao encontrado... ###");
		}

		return qtdJogoNaoSaiu;
	}

	public void resultado1625SAIUHOJE(List<String> listaCombinacoes)
			throws URISyntaxException, IOException, LotoException {

		for (String lista16 : listaCombinacoes) {
			String[] linhaCombinacao = lista16.split(",");

			int[] linhaCombinacao1625 = new int[linhaCombinacao.length];
			for (int i = 0; i < linhaCombinacao.length; i++) {
				linhaCombinacao1625[i] = Integer.parseInt(String.valueOf(linhaCombinacao[i]));
			}

			String lista = null;
			int retorno = resultado1625SAIUHOJE(linhaCombinacao1625);
//			int frequencia = frequenciaResultado1625SAIU(linhaCombinacao1625);
			if (retorno > NumeroEnum.ZERO.getValor()) {
				lista = linhaCombinacao1625[0] + "," + linhaCombinacao1625[1] + "," + linhaCombinacao1625[2] + ","
						+ linhaCombinacao1625[3] + "," + linhaCombinacao1625[4] + "," + linhaCombinacao1625[5] + ","
						+ linhaCombinacao1625[6] + "," + linhaCombinacao1625[7] + "," + linhaCombinacao1625[8] + ","
						+ linhaCombinacao1625[9] + "," + linhaCombinacao1625[10] + "," + linhaCombinacao1625[11] + ","
						+ linhaCombinacao1625[12] + "," + linhaCombinacao1625[13] + "," + linhaCombinacao1625[14] + ","
						+ linhaCombinacao1625[15] + "," + retorno;// + "," + frequencia;
				System.out.println(lista);
			}

		}
		
		System.out.println("Fim resultado1625SAIUHOJE.");

	}
	
	@SuppressWarnings({ "deprecation" })
	public static int resultado1625SAIUHOJE(int[] linhaCombinacao1625)
			throws URISyntaxException, NumberFormatException, IOException {

		int contJogo = 0;
		int qtdJogoSaiu = 0;
		URL resultado1625SAIU = Resultado1625MAISSAIU.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1625SAIU)) {

			Path caminho = Paths.get(resultado1625SAIU.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1625SAIU;
			while (Objects.nonNull((linhaResultado1625SAIU = csvReader.readNext()))) {

				contJogo = 0;
				int[] linhaResultado = new int[linhaResultado1625SAIU.length];
				for (int i = 0; i < linhaResultado1625SAIU.length; i++) {
					linhaResultado[i] = Integer.parseInt(String.valueOf(linhaResultado1625SAIU[i]));
				}

				for (int i = 0; i < linhaCombinacao1625.length; i++) {
					for (int j = 0; j < linhaResultado.length; j++) {
						if (linhaCombinacao1625[i] == linhaResultado[j]) {
							contJogo++;
						}
					}
				}

				if (contJogo == NumeroEnum.QUINZE.getValor()) {
					qtdJogoSaiu++;
				}
			}
		} else {
			System.out.println("### [resultado1625SAIUHOJE - hoje.csv] Arquivo nao encontrado... ###");
		}

		return qtdJogoSaiu;
	}

}

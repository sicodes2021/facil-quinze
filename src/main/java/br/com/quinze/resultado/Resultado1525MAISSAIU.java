package br.com.quinze.resultado;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

import com.opencsv.CSVReader;

import br.com.enumerador.NumeroEnum;
import br.com.excecao.LotoException;

public class Resultado1525MAISSAIU {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		
		FileWriter arqSaiu = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\resultado\\15_25\\Resultado1425MAISSAIU_conc3500.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);

		int cont = 0;
		URL combinacao1525 = Resultado1525MAISSAIU.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_CINCO.csv");
		if (Objects.nonNull(combinacao1525)) {
			
			Path caminho = Paths.get(combinacao1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaCombinacao;
			while (Objects.nonNull((linhaCombinacao = csvReader.readNext()))) {

				int[] linhaCombinacao1525 = new int[linhaCombinacao.length];
				for (int i = 0; i < linhaCombinacao.length; i++) {
					linhaCombinacao1525[i] = Integer.parseInt(String.valueOf(linhaCombinacao[i]));
				}

				String lista = null;
				int retorno = Resultado1525SAIU(linhaCombinacao1525);
				if (retorno > NumeroEnum.ZERO.getValor()) {
					lista = linhaCombinacao1525[0] + "," + linhaCombinacao1525[1] + "," + linhaCombinacao1525[2] + "," + linhaCombinacao1525[3] + ","
							+ linhaCombinacao1525[4] + "," + linhaCombinacao1525[5] + "," + linhaCombinacao1525[6] + "," + linhaCombinacao1525[7] + ","
							+ linhaCombinacao1525[8] + "," + linhaCombinacao1525[9] + "," + linhaCombinacao1525[10] + "," + linhaCombinacao1525[11] + ","
							+ linhaCombinacao1525[12] + "," + linhaCombinacao1525[13] + "," + linhaCombinacao1525[14] + "," + retorno;
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

	@SuppressWarnings({ "deprecation" })
	public static int Resultado1525SAIU(int[] linhaCombinacao1525) throws URISyntaxException, NumberFormatException, IOException {

		int contJogo = 0;
		int qtdJogoSaiu = 0;
		URL resultado1525SAIU = Resultado1525MAISSAIU.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado1525SAIU)) {
			
			Path caminho = Paths.get(resultado1525SAIU.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525SAIU;
			while (Objects.nonNull((linhaResultado1525SAIU = csvReader.readNext()))) {

				contJogo = 0;
				int[] linhaResultado = new int[linhaResultado1525SAIU.length];
				for (int i = 0; i < linhaResultado1525SAIU.length; i++) {
					linhaResultado[i] = Integer.parseInt(String.valueOf(linhaResultado1525SAIU[i]));
				}

				for (int i = 0; i < linhaCombinacao1525.length; i++) {
					for (int j = 0; j < linhaResultado.length; j++) {
						if (linhaCombinacao1525[i] == linhaResultado[j]) {
							contJogo++;
						}
					}
				}
				
				if (contJogo == NumeroEnum.TREZE.getValor()) {
					qtdJogoSaiu++;
				}
			}
		} else {
			System.out.println("### [Resultado1525SAIU.csv] Arquivo nao encontrado... ###");
		}
		
		return qtdJogoSaiu;
	}


}

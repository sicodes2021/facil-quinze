package br.com.quinze.resultado.rnp08;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

import com.opencsv.CSVReader;

import br.com.quinze.enumerador.NumeroEnum;
import br.com.quinze.excecao.LotoException;

public class IAcerteiRNP08 {
	
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		IAcerteiRNP08 jaSaiu = new IAcerteiRNP08();
		jaSaiu.RNP08();
	}
	
	@SuppressWarnings("deprecation")
	public void RNP08() throws URISyntaxException, IOException, LotoException {
		int contLinha = 0;
		
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = IAcerteiRNP08.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
					
				contLinha++;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				System.out.println("Jogo: " + contLinha);
//				URL combinacoes = IAcerteiRNP08.class.getClassLoader().getResource("\\jogos\\rnp08\\25\\quatro\\RandomRNP08_QUATRO_10_Fechamento.csv");
//				URL combinacoes = IAcerteiRNP08.class.getClassLoader().getResource("\\jogos\\rnp08\\25\\quatro\\RandomRNP08_QUATRO_10_NaoFechamento.csv");
//				URL combinacoes = IAcerteiRNP08.class.getClassLoader().getResource("\\jogos\\rnp08\\25\\cinco\\RandomRNP08_CINCO_10_Fechamento.csv");
//				URL combinacoes = IAcerteiRNP08.class.getClassLoader().getResource("\\jogos\\rnp08\\25\\cinco\\RandomRNP08_CINCO_10_NaoFechamento.csv");
//				URL combinacoes = IAcerteiRNP08.class.getClassLoader().getResource("\\jogos\\rnp08\\25\\sete\\RandomRNP08_CINCO_10_Fechamento.csv");
				URL combinacoes = IAcerteiRNP08.class.getClassLoader().getResource("\\jogos\\rnp08\\25\\sete\\RandomRNP08_CINCO_10_NaoFechamento.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contJogo = 0;
						int[] linhaCombinacoesInteiro = new int[linhaCombinacoes.length];
						for (int i = 0; i < linhaCombinacoes.length; i++) {
							linhaCombinacoesInteiro[i] = Integer.parseInt(String.valueOf(linhaCombinacoes[i]));
						}
						
						for (int i = 0; i < linha1525.length; i++) {
							for (int j = 0; j < linhaCombinacoesInteiro.length; j++) {
								if (linha1525[i] == linhaCombinacoesInteiro[j]) {
									contJogo++;
								}
							}
						}

						if (contJogo == NumeroEnum.ONZE.getValor()) {
							contonze++;
						}

						if (contJogo == NumeroEnum.DOZE.getValor()) {
							contdoze++;
						}

						if (contJogo == NumeroEnum.TREZE.getValor()) {
							conttreze++;
						}

						if (contJogo == NumeroEnum.QUATORZE.getValor()) {
							contquatorze++;
						}

						if (contJogo == NumeroEnum.QUINZE.getValor()) {
							contquinze++;
						}
					}
				} else {
					System.out.println("### Arquivo nao encontrado... ###");
				}
				
				if (contonze > NumeroEnum.ZERO.getValor()) {
					System.out.println("ONZE: " + contonze);
				}
					
				if (contdoze > NumeroEnum.ZERO.getValor()) {
					System.out.println("DOZE: " + contdoze);
					
				}
				
				if (conttreze > NumeroEnum.ZERO.getValor()) {
					System.out.println("TREZE: " + conttreze);
					
				}
				
				if (contquatorze > NumeroEnum.ZERO.getValor()) {
					System.out.println("QUATROZE: " + contquatorze);
					
				}
				
				if (contquinze > NumeroEnum.ZERO.getValor()) {
					System.out.println("MILIONÁRIO PORRAAAAAAAA!!!!!");
					System.out.println("QUINZE: " + contquinze);
					
				}
				
				if(contonze == NumeroEnum.ZERO.getValor() 
						&& contdoze == NumeroEnum.ZERO.getValor() 
						&& conttreze == NumeroEnum.ZERO.getValor() 
						&& contquatorze == NumeroEnum.ZERO.getValor() 
						&& contquinze == NumeroEnum.ZERO.getValor()) {
					System.out.println("Nenhum Resultado Encontrado!!!");
				}
			}
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP05] - Arquivo nao encontrado... ###");
		}
	}

}

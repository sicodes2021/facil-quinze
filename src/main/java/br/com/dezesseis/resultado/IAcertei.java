package br.com.dezesseis.resultado;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

import com.opencsv.CSVReader;

import br.com.enumerador.NumeroEnum;
import br.com.excecao.LotoException;

public class IAcertei {

	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		IAcertei jaSaiu = new IAcertei();
//		jaSaiu.jogo();
		
		int[] meuJogo = { 2, 4, 5, 6, 7, 9, 12, 13, 14, 15, 18, 19, 20, 21, 22, 23 };
		
		jaSaiu.montarJogoTestar(meuJogo);
	}

	@SuppressWarnings("deprecation")
	public void jogo() throws URISyntaxException, IOException, LotoException {
		int contLinha = 0;
		int contLinhaComb = 0;

		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;

		URL resultado1525 = IAcertei.class.getClassLoader().getResource("hoje.csv");
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
				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\dezesseis\\rnp05\\RetirarSaiu14RNP05_3210.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contJogo = 0;
						contLinhaComb++;
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
							System.out.println("Jogo Vencedor Quatorze: " + contLinhaComb);
						}

						if (contJogo == NumeroEnum.QUINZE.getValor()) {
							contquinze++;
							System.out.println("Jogo Vencedor Quinze: " + contLinhaComb);
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

				if (contonze == NumeroEnum.ZERO.getValor() && contdoze == NumeroEnum.ZERO.getValor()
						&& conttreze == NumeroEnum.ZERO.getValor() && contquatorze == NumeroEnum.ZERO.getValor()
						&& contquinze == NumeroEnum.ZERO.getValor()) {
					System.out.println("Nenhum Resultado Encontrado!!!");
				}
			}
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP05] - Arquivo nao encontrado... ###");
		}
	}

	@SuppressWarnings("deprecation")
	public void resultadoHoje(List<String> lista) throws URISyntaxException, IOException, LotoException {
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;

		URL resultado1525 = IAcertei.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (String lista15 : lista) {
					String[] linhaCombinacoes = lista15.split(",");

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
						//System.out.println("Jogo Vencedor Quatorze: " + contLinhaComb);
					}

					if (contJogo == NumeroEnum.QUINZE.getValor()) {
						contquinze++;
						//System.out.println("Jogo Vencedor Quinze: " + contLinhaComb);
					}
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

				if (contonze == NumeroEnum.ZERO.getValor() && contdoze == NumeroEnum.ZERO.getValor()
						&& conttreze == NumeroEnum.ZERO.getValor() && contquatorze == NumeroEnum.ZERO.getValor()
						&& contquinze == NumeroEnum.ZERO.getValor()) {
					System.out.println("Nenhum Resultado Encontrado!!!");
				}
			}
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP05] - Arquivo nao encontrado... ###");
		}
	}
	
	@SuppressWarnings("deprecation")
	public void montarJogoTestar(int[] meuJogo) throws URISyntaxException, IOException, LotoException {
		
		int contLinha = 0;
		
		int contcinco = 0;
		int contseis = 0;
		int contsete = 0;
		int contoito = 0;
		int contnove = 0;
		int contdez = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;

		URL resultado1525 = IAcertei.class.getClassLoader().getResource("resultado.csv");
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

				contJogo = 0;
				int[] linhaCombinacoesInteiro = new int[meuJogo.length];
				for (int i = 0; i < meuJogo.length; i++) {
					linhaCombinacoesInteiro[i] = Integer.parseInt(String.valueOf(meuJogo[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					for (int j = 0; j < linhaCombinacoesInteiro.length; j++) {
						if (linha1525[i] == linhaCombinacoesInteiro[j]) {
							contJogo++;
						}
					}
				}
				
				if (contJogo == NumeroEnum.CINCO.getValor()) {
					contcinco++;
					System.out.println("Concurso: " + contLinha + "   Total Acertos: " + NumeroEnum.CINCO.getValor());
				}
				
				if (contJogo == NumeroEnum.SEIS.getValor()) {
					contseis++;
					System.out.println("Concurso: " + contLinha + "   Total Acertos: " + NumeroEnum.SEIS.getValor());
				}
				
				if (contJogo == NumeroEnum.SETE.getValor()) {
					contsete++;
					System.out.println("Concurso: " + contLinha + "   Total Acertos: " + NumeroEnum.SETE.getValor());
				}
				
				if (contJogo == NumeroEnum.OITO.getValor()) {
					contoito++;
					System.out.println("Concurso: " + contLinha + "   Total Acertos: " + NumeroEnum.OITO.getValor());
				}
				
				if (contJogo == NumeroEnum.NOVE.getValor()) {
					contnove++;
					System.out.println("Concurso: " + contLinha + "   Total Acertos: " + NumeroEnum.NOVE.getValor());
				}
				
				if (contJogo == NumeroEnum.DEZ.getValor()) {
					contdez++;
					System.out.println("Concurso: " + contLinha + "   Total Acertos: " + NumeroEnum.DEZ.getValor());
				}

				if (contJogo == NumeroEnum.ONZE.getValor()) {
					contonze++;
					System.out.println("Concurso: " + contLinha + "   Total Acertos: " + NumeroEnum.ONZE.getValor() + " - Ganhou");
				}

				if (contJogo == NumeroEnum.DOZE.getValor()) {
					contdoze++;
					System.out.println("Concurso: " + contLinha + "   Total Acertos: " + NumeroEnum.DOZE.getValor() + " - Ganhou");
				}

				if (contJogo == NumeroEnum.TREZE.getValor()) {
					conttreze++;
					System.out.println("Concurso: " + contLinha + "   Total Acertos: " + NumeroEnum.TREZE.getValor() + " - Ganhou");
				}

				if (contJogo == NumeroEnum.QUATORZE.getValor()) {
					contquatorze++;
					System.out.println("Concurso: " + contLinha + "   Total Acertos: " + NumeroEnum.QUATORZE.getValor() + " - Ganhou");
				}

				if (contJogo == NumeroEnum.QUINZE.getValor()) {
					contquinze++;
					System.out.println("Concurso: " + contLinha + "   Total Acertos: " + NumeroEnum.QUINZE.getValor() + " - Milionário");
				}
			}
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP05] - Arquivo nao encontrado... ###");
		}
		
		
		System.out.println("11 Acertos: " + contonze);
		System.out.println("12 Acertos: " + contdoze);
		System.out.println("13 Acertos: " + conttreze);
		System.out.println("14 Acertos: " + contquatorze);
		System.out.println("15 Acertos: " + contquinze);

		
	}

}

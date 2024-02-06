package br.com.quinze.resultado;

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

public class IAcerteiTotal {
	
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		IAcerteiTotal acertei = new IAcerteiTotal();
//		System.out.println("==========15_25==========");
//		acertei.Combinacoes1525();
//		System.out.println("==========RNP02==========");
//		acertei.RNP02();
//		System.out.println("==========RNP03==========");
//		acertei.RNP03();
//		System.out.println("==========RNP04==========");
//		acertei.RNP04();
//		System.out.println("==========RNP05==========");
//		acertei.RNP05();
//		System.out.println("==========RNP06==========");
//		acertei.RNP06();
//		System.out.println("==========RNP07==========");
//		acertei.RNP07();
//		System.out.println("==========RNP08==========");
//		acertei.RNP08();
//		System.out.println("==========RNP09==========");
//		acertei.RNP09();
//		System.out.println("==========RNP10==========");
//		acertei.RNP10();
//		System.out.println("==========RNP11==========");
//		acertei.RNP11();
//		System.out.println("==========RNP12==========");
//		acertei.RNP12();
		
		System.out.println("==========16_25==========");
		acertei.Combinacoes1625();
//		System.out.println("==========17_25==========");
//		acertei.Combinacoes1725();
//		System.out.println("==========18_25==========");
//		acertei.Combinacoes1825();
//		System.out.println("==========19_25==========");
//		acertei.Combinacoes1925();
//		System.out.println("==========20_25==========");
//		acertei.Combinacoes2025();
		
	}
	
	@SuppressWarnings("deprecation")
	public void Combinacoes1525() throws URISyntaxException, IOException, LotoException {
		
		int contador = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = IAcerteiTotal.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
				
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				URL combinacoes = IAcerteiTotal.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\15_25.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contador++;
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
					System.out.println("Total: " + contador);
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
	
	@SuppressWarnings("deprecation")
	public void Combinacoes1625() throws URISyntaxException, IOException, LotoException {
		
		int contador = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = IAcerteiTotal.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
				
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				URL combinacoes = IAcerteiTotal.class.getClassLoader().getResource("\\combinacoes\\16_25-2042975\\16_25-RNP08_SEMRNS.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contador++;
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
					System.out.println("Total: " + contador);
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
	
	@SuppressWarnings("deprecation")
	public void Combinacoes1725() throws URISyntaxException, IOException, LotoException {
		
		int contador = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = IAcerteiTotal.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
				
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				URL combinacoes = IAcerteiTotal.class.getClassLoader().getResource("\\combinacoes\\17_25-1081575\\17_25.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contador++;
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
					System.out.println("Total: " + contador);
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
	
	@SuppressWarnings("deprecation")
	public void Combinacoes1825() throws URISyntaxException, IOException, LotoException {
		
		int contador = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = IAcerteiTotal.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
				
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				URL combinacoes = IAcerteiTotal.class.getClassLoader().getResource("\\combinacoes\\18_25-480700\\18_25.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contador++;
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
					System.out.println("Total: " + contador);
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
	
	@SuppressWarnings("deprecation")
	public void Combinacoes1925() throws URISyntaxException, IOException, LotoException {
		
		int contador = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = IAcerteiTotal.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
				
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				URL combinacoes = IAcerteiTotal.class.getClassLoader().getResource("\\combinacoes\\19_25-177100\\19_25.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contador++;
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
					System.out.println("Total: " + contador);
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
	
	@SuppressWarnings("deprecation")
	public void Combinacoes2025() throws URISyntaxException, IOException, LotoException {
		
		int contador = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = IAcerteiTotal.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
				
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				URL combinacoes = IAcerteiTotal.class.getClassLoader().getResource("\\combinacoes\\20_25-53130\\20_25.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contador++;
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
					System.out.println("Total: " + contador);
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
	
	
	@SuppressWarnings("deprecation")
	public void RNP02() throws URISyntaxException, IOException, LotoException {
		
		int contador = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = IAcerteiTotal.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
				
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP02\\15_25-RNP02.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP02\\15_25-RNP02_CINCO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP02\\15_25-RNP02_SEIS.csv");
				URL combinacoes = IAcerteiTotal.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP02\\15_25-RNP02_SETE.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contador++;
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
					System.out.println("Total: " + contador);
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
	
	@SuppressWarnings("deprecation")
	public void RNP03() throws URISyntaxException, IOException, LotoException {
		
		int contador = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = IAcerteiTotal.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
				
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				URL combinacoes = IAcerteiTotal.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03_QUATRO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03_CINCO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03_SEIS.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03_SETE.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03_OITO.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contador++;
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
					System.out.println("Total: " + contador);
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
	
	@SuppressWarnings("deprecation")
	public void RNP04() throws URISyntaxException, IOException, LotoException {
		
		int contador = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = IAcerteiTotal.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
				
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				URL combinacoes = IAcerteiTotal.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04_TRES.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04_QUATRO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04_CINCO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04_SEIS.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04_SETE.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04_OITO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04_NOVE.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contador++;
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
					System.out.println("Total: " + contador);
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
	
	@SuppressWarnings("deprecation")
	public void RNP05() throws URISyntaxException, IOException, LotoException {
		
		int contador = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = IAcerteiTotal.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
				
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				URL combinacoes = IAcerteiTotal.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05_DOIS.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05_TRES.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05_QUATRO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05_CINCO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05_SEIS.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05_SETE.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contador++;
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
					System.out.println("Total: " + contador);
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
	
	@SuppressWarnings("deprecation")
	public void RNP06() throws URISyntaxException, IOException, LotoException {
		
		int contador = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = IAcerteiTotal.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
				
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				URL combinacoes = IAcerteiTotal.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_UM.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_DOIS.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_TRES.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_QUATRO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_CINCO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_SEIS.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_SETE.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_OITO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_NOVE.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contador++;
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
					System.out.println("Total: " + contador);
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
	
	@SuppressWarnings("deprecation")
	public void RNP07() throws URISyntaxException, IOException, LotoException {
		
		int contador = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = IAcerteiTotal.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
				
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				URL combinacoes = IAcerteiTotal.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_ZERO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_UM.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_DOIS.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_TRES.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_QUATRO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_CINCO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_SEIS.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_SETE.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_OITO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_NOVE.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contador++;
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
					System.out.println("Total: " + contador);
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
	
	@SuppressWarnings("deprecation")
	public void RNP08() throws URISyntaxException, IOException, LotoException {
		
		int contador = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = IAcerteiTotal.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
				
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				URL combinacoes = IAcerteiTotal.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_ZERO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_UM.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_DOIS.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_TRES.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_QUATRO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_CINCO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_SEIS.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_SETE.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_OITO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_NOVE.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contador++;
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
					System.out.println("Total: " + contador);
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
	
	@SuppressWarnings("deprecation")
	public void RNP09() throws URISyntaxException, IOException, LotoException {
		
		int contador = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = IAcerteiTotal.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
				
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				URL combinacoes = IAcerteiTotal.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_UM.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_DOIS.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_TRES.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_QUATRO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_CINCO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_SEIS.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_SETE.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_OITO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_NOVE.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contador++;
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
					System.out.println("Total: " + contador);
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
	
	@SuppressWarnings("deprecation")
	public void RNP10() throws URISyntaxException, IOException, LotoException {
		
		int contador = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = IAcerteiTotal.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
				
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				URL combinacoes = IAcerteiTotal.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10_DOIS.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10_TRES.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10_QUATRO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10_CINCO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10_SEIS.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10_SETE.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10_OITO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10_NOVE.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contador++;
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
					System.out.println("Total: " + contador);
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
	
	@SuppressWarnings("deprecation")
	public void RNP11() throws URISyntaxException, IOException, LotoException {
		
		int contador = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = IAcerteiTotal.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
				
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				URL combinacoes = IAcerteiTotal.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11_TRES.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11_QUATRO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11_CINCO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11_SEIS.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11_SETE.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11_OITO.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contador++;
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
					System.out.println("Total: " + contador);
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
	
	@SuppressWarnings("deprecation")
	public void RNP12() throws URISyntaxException, IOException, LotoException {
		
		int contador = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = IAcerteiTotal.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
				
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				URL combinacoes = IAcerteiTotal.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP12\\15_25-RNP12.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP12\\15_25-RNP12_QUATRO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP12\\15_25-RNP12_CINCO.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP12\\15_25-RNP12_SEIS.csv");
//				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\combinacoes\\15_25-3268760\\RNP12\\15_25-RNP12_SETE.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contador++;
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
					System.out.println("Total: " + contador);
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

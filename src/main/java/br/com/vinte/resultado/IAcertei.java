package br.com.vinte.resultado;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.opencsv.CSVReader;

import br.com.enumerador.NumeroEnum;
import br.com.excecao.LotoException;

public class IAcertei {
	
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		IAcertei jaSaiu = new IAcertei();
		jaSaiu.hoje();
	}
	
	@SuppressWarnings("deprecation")
	public void hoje() throws URISyntaxException, IOException, LotoException {
		
//		FileWriter arquivo1525 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\vinte\\20_25_SEMRNS_3129.csv");
//		PrintWriter gravarArquivo1525 = new PrintWriter(arquivo1525);
		
		int contLinha = 0;
		
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		List<String> lista1525 = new ArrayList<String>();
		
		URL resultado1525 = IAcertei.class.getClassLoader().getResource("\\hoje\\3129.csv");
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
				URL combinacoes = IAcertei.class.getClassLoader().getResource("\\vinte\\20_25_SEMRNS_3122.csv");
				if (Objects.nonNull(combinacoes)) {
					Path caminho2 = Paths.get(combinacoes.toURI());
					CSVReader csvReader2 = new CSVReader(new FileReader(caminho2.toFile()), ',');

					String[] linhaCombinacoes;
					while (Objects.nonNull((linhaCombinacoes = csvReader2.readNext()))) {
						contJogo = 0;
						String lista = null;
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
							
							lista = linhaCombinacoes[0] + "," + linhaCombinacoes[1] + "," + linhaCombinacoes[2] + "," + linhaCombinacoes[3] + "," + linhaCombinacoes[4] + "," + 
									linhaCombinacoes[5] + "," + linhaCombinacoes[6] + "," + linhaCombinacoes[7] + "," + linhaCombinacoes[8] + "," + linhaCombinacoes[9] + "," + 
									linhaCombinacoes[10] + "," + linhaCombinacoes[11] + "," + linhaCombinacoes[12] + "," + linhaCombinacoes[13] + "," + linhaCombinacoes[14] + "," + 
									linhaCombinacoes[15] + "," + linhaCombinacoes[16] + "," + linhaCombinacoes[17] + "," + linhaCombinacoes[18] + "," + linhaCombinacoes[19];
//							gravarArquivo1525.printf("%s%n", lista);
							lista1525.add(lista);
							
						}
					}
					
//					arquivo1525.close();
//					gravarArquivo1525.close();
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
//					System.out.println("MILIONÁRIO PORRAAAAAAAA!!!!!");
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

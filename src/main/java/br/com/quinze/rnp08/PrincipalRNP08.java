package br.com.quinze.rnp08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import com.opencsv.CSVReader;

import br.com.quinze.combinacoes.Combinacoes1626;
import br.com.quinze.enumerador.NumeroEnum;
import br.com.quinze.excecao.LotoException;

public class PrincipalRNP08 {

	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		PrincipalRNP08 principalRNP08 = new PrincipalRNP08();
		Combinacoes1626 combinacoes1626 = new Combinacoes1626();
		
		List<String> listaCombinacoes1625RNP08SEMRNS = combinacoes1626.gerar1625RNP08SEMRNS();
		List<String> listaFinalVinteCinco = principalRNP08.resultadoNumerosFinalVinteCinco(listaCombinacoes1625RNP08SEMRNS);
		System.out.println("listaFinalVinteCinco: " + listaFinalVinteCinco.size());
		List<String> listaFechamentoRNP08 = principalRNP08.fechamento(listaFinalVinteCinco);
		System.out.println("Fechamento: " + listaFechamentoRNP08.size());
		
		
		principalRNP08.iAcertei(listaFechamentoRNP08);
		

	}
	
	public List<String> resultadoNumerosFinalVinteCinco(List<String> listaRNP08)
			throws URISyntaxException, IOException, LotoException {
		
		List<String> listaRNP08VinteCinco = new ArrayList<String>();
		for (String lista15 : listaRNP08) {
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}


			lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
					+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
					+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
					+ linha1525[13] + "," + linha1525[14] + "," + linha1525[15];
			if (linha1525[0] == 2 && linha1525[15] == 24) {
				listaRNP08VinteCinco.add(lista);
			}
		}

		return listaRNP08VinteCinco;
		
	}
	
	public List<String> fechamento(List<String> lista) throws URISyntaxException, IOException, LotoException {

		List<String[]> listaNumeros = new ArrayList<String[]>();
		List<String[]> listaNAONumeros = new ArrayList<String[]>();
		int contCombinacoes = 0;
		for (String lista15 : lista) {
			String[] linha15 = lista15.split(",");

			String lista15Random = this.getRandomElement(lista);
			String[] linha15Random = lista15Random.split(",");

			if (contCombinacoes == NumeroEnum.ZERO.getValor()) {
				listaNumeros.add(linha15Random);
			}

			if (comparaNumerosfechamento(listaNumeros, linha15)) {
				listaNumeros.add(linha15);
			} else {
				listaNAONumeros.add(linha15);
			}

			contCombinacoes++;
		}

		String listaNova = null;
		List<String> listaqualquer = new ArrayList<String>();
		for (String[] linha1525 : listaNumeros) {
			listaNova = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
					+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
					+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
					+ linha1525[13] + "," + linha1525[14] + "," + linha1525[15];
			listaqualquer.add(listaNova);
		}
		
		String listaNovaNaoFechamento = null;
		List<String> listaqualquerNaoFechamento = new ArrayList<String>();
		for (String[] linha1525 : listaNAONumeros) {
			listaNovaNaoFechamento = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
					+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
					+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
					+ linha1525[13] + "," + linha1525[14] + "," + linha1525[15];
			listaqualquerNaoFechamento.add(listaNovaNaoFechamento);
		}

		System.out.println("Numero de Combinacoes: " + contCombinacoes);
		System.out.println("Numero  de Fechamentos: " + listaNumeros.size());
		System.out.println("Numero  de NAO Fechamentos: " + listaNAONumeros.size());

//		this.gravarRandomNaoFechamento(listaqualquerNaoFechamento);
		return listaqualquer;
	}

	public String getRandomElement(List<String> lista) {
		Random rand = new Random();
		return lista.get(rand.nextInt(lista.size()));
	}

	public static boolean comparaNumerosfechamento(List<String[]> listaNumeros, String[] linhaCombinacoes) {

		boolean retorno = false;
		int contJogo = 0;
		int[] linhaCombinacoesInteiro = new int[linhaCombinacoes.length];
		for (int i = 0; i < linhaCombinacoes.length; i++) {
			linhaCombinacoesInteiro[i] = Integer.parseInt(String.valueOf(linhaCombinacoes[i]));
		}

		for (String[] linha : listaNumeros) {
			contJogo = 0;
			int[] linhaInteiro = new int[linha.length];
			for (int i = 0; i < linha.length; i++) {
				linhaInteiro[i] = Integer.parseInt(String.valueOf(linha[i]));
			}

			for (int i = 0; i < linhaInteiro.length; i++) {
				for (int j = 0; j < linhaCombinacoesInteiro.length; j++) {
					if (linhaInteiro[i] == linhaCombinacoesInteiro[j]) {
						contJogo++;
					}
				}
			}

			if (contJogo < NumeroEnum.QUINZE.getValor()) {
				retorno = true;
			} else {
				retorno = false;
				break;
			}
		}

		return retorno;
	}
	
	public void gravarRandomFechamento(List<String> lista) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\rnp08\\RandomRNP08_conc3022.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		
		List<String[]> listaNumeros = new ArrayList<String[]>();
		for (int i = 0; i < 1; i++) {
			String lista15Random = this.getRandomElement(lista);
			String[] linha15Random = lista15Random.split(",");
			listaNumeros.add(linha15Random);
		}
		
		String listaNova = null;
		for (String[] linha1525 : listaNumeros) {
			listaNova = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
					+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
					+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
					+ linha1525[13] + "," + linha1525[14] + "," + linha1525[15];
			gravarArqSaiu.printf("%s%n", listaNova);
		}
		arqSaiu.close();
		gravarArqSaiu.close();
	}
	
	public void gravarRandomNaoFechamento(List<String> lista) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\rnp08\\RandomRNP08_conc3022.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		
		List<String[]> listaNumeros = new ArrayList<String[]>();
		for (int i = 0; i < 1; i++) {
			String lista15Random = this.getRandomElement(lista);
			String[] linha15Random = lista15Random.split(",");
			listaNumeros.add(linha15Random);
		}
		
		String listaNova = null;
		for (String[] linha1525 : listaNumeros) {
			listaNova = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
					+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
					+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
					+ linha1525[13] + "," + linha1525[14] + "," + linha1525[15];
			gravarArqSaiu.printf("%s%n", listaNova);
		}
		arqSaiu.close();
		gravarArqSaiu.close();
	}
	
	@SuppressWarnings("deprecation")
	public void iAcertei(List<String> listaCombinacoesRNP05) throws URISyntaxException, IOException, LotoException {
		
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		int contJogo = 0;
		
		URL resultado1525 = PrincipalRNP08.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
				
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}
				
				for (String lista15 : listaCombinacoesRNP05) {
					
					String[] linha15 = lista15.split(",");
					int[] linha1625 = new int[linha15.length];
					for (int i = 0; i < linha15.length; i++) {
						linha1625[i] = Integer.parseInt(String.valueOf(linha15[i]));
					}
					
					for (int i = 0; i < linha1525.length; i++) {
						for (int j = 0; j < linha1625.length; j++) {
							if (linha1525[i] == linha1625[j]) {
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

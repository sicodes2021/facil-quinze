package br.com.quinze.rnp07;

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

import br.com.combinacoes.Combinacoes;
import br.com.enumerador.NumeroEnum;
import br.com.excecao.LotoException;
import br.com.regras.pares.RNP07;
import br.com.regras.sequencia.RNS0105;
import br.com.regras.sequencia.RNS0610;
import br.com.regras.sequencia.RNS1115;
import br.com.regras.sequencia.RNS1620;
import br.com.regras.sequencia.RNS2125;

public class PrincipalRNP07_SEIS {

	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		PrincipalRNP07_SEIS principal = new PrincipalRNP07_SEIS();

		/*********************************************************************
		 * RNP07
		 */
		System.out.println("**************RPN07_SEIS****************************");
//		List<String> listaCombinacoesRNP07_RPN07 = principal.gerar1525RNP07();
		List<String> listaCombinacoesRNP07_SEM_RNS = principal.gerar1525RNP07_SEM_RNS();
//		List<String> listaCombinacoesRNP07_RNS0105 = principal.gerar1525RNP07_RNS0105();
//		List<String> listaCombinacoesRNP07_RNS0610 = principal.gerar1525RNP07_RNS0610();
//		List<String> listaCombinacoesRNP07_RNS1115 = principal.gerar1525RNP07_RNS1115();
//		List<String> listaCombinacoesRNP07_RNS1620 = principal.gerar1525RNP07_RNS1620();
//		List<String> listaCombinacoesRNP07_RNS2125 = principal.gerar1525RNP07_RNS2125();

		
//		List<String> listaSeisRPN07 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP07_RPN07);
//		System.out.println("listaSeisRPN07: " + listaSeisRPN07.size());
		List<String> listaSeisRPN07_SEM_RNS = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP07_SEM_RNS);
		System.out.println("listaSeisRPN07_SEM_RNS: " + listaSeisRPN07_SEM_RNS.size());
//		List<String> listaSeisRPN07_RNS0105 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP07_RNS0105);
//		System.out.println("listaSeisRPN07_RNS0105: " + listaSeisRPN07_RNS0105.size());
//		List<String> listaSeisRPN07_RNS0610 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP07_RNS0610);
//		System.out.println("listaSeisRPN07_RNS0610: " + listaSeisRPN07_RNS0610.size());
//		List<String> listaSeisRPN07_RNS1115 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP07_RNS1115);
//		System.out.println("listaSeisRPN07_RNS1115: " + listaSeisRPN07_RNS1115.size());
//		List<String> listaSeisRPN07_RNS1620 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP07_RNS1620);
//		System.out.println("listaSeisRPN07_RNS1620: " + listaSeisRPN07_RNS1620.size());
//		List<String> listaSeisRPN07_RNS2125 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP07_RNS2125);
//		System.out.println("listaSeisRPN07_RNS2125: " + listaSeisRPN07_RNS2125.size());


		/**
		 * Retirar o que ja foi premiado!!!
		 */
		List<String> listaSaiu15RNP07 = principal.retirarSaiu15RNP07(listaSeisRPN07_SEM_RNS);
		// principal.gravarRetirarSaiu15RNP07(listaSaiu15RNP07);
		System.out.println("Lista Retirar Saiu 15: " + listaSaiu15RNP07.size());

		List<String> listaSaiu14RNP07 = principal.retirarSaiu14RNP07(listaSaiu15RNP07);
//		principal.gravarRetirarSaiu14RNP07(listaSaiu14RNP07);
		System.out.println("Lista Retirar Saiu 14: " + listaSaiu14RNP07.size());
		
		
		

		/**
		 * Fechamento para ganhar!!!
		 */
		List<String> listaFechamentoRNP07 = principal.fechamento(listaSaiu14RNP07);
		// principal.gravarFechamento(listaFechamentoRNP07);
		
		
		List<String> listaFinalVinteCinco = principal.resultadoNumerosFinalVinteCinco(listaFechamentoRNP07);
		System.out.println("listaFinalVinteCinco: " + listaFinalVinteCinco.size());
		principal.gravarRandom(listaFinalVinteCinco);
		
//		principal.gravarRandomFechamento(listaFinalVinteCinco);
		System.out.println("Fechamento: " + listaFechamentoRNP07.size());

	}

	public List<String> resultadoNumerosMenorQueDezSEIS(List<String> listaCombinacoesRNP05)
			throws URISyntaxException, IOException, LotoException {

		List<String> listaResultado = new ArrayList<String>();

		for (String lista15 : listaCombinacoesRNP05) {
			int contlinha = 0;
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			for (int i = 0; i < linha1525.length; i++) {
				if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
					contlinha++;
				}
			}

			if (contlinha == NumeroEnum.SEIS.getValor()) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
						+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
						+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
						+ linha1525[13] + "," + linha1525[14];
				listaResultado.add(lista);
			}
		}

		return listaResultado;
	}

	public List<String> retirarSaiu15RNP07(List<String> listaCombinacoesRNP05)
			throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP05 = new ArrayList<String>();
		for (String lista15 : listaCombinacoesRNP05) {
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			if (!resultadoRNP0715(linha1525)) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
						+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
						+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
						+ linha1525[13] + "," + linha1525[14];
				listaRNP05.add(lista);
			}
		}

		return listaRNP05;
	}

	@SuppressWarnings("deprecation")
	public boolean resultadoRNP0715(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = PrincipalRNP07_SEIS.class.getClassLoader().getResource("\\resultado\\ResultadoRNP07NumerosMenorQueDez_SEIS.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				contador = 0;
				int[] resultado1525 = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					resultado1525[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					for (int j = 0; j < resultado1525.length; j++) {
						if (linha1525[i] == resultado1525[j]) {
							contador++;
						}
					}
				}

				if (contador == NumeroEnum.QUINZE.getValor()) {
					retorno = true;
					break;
				}
			}
		} else {
			System.out.println("### [ResultadoRNP07.csv] Arquivo nao encontrado... ###");
		}

		return retorno;
	}

	public List<String> retirarSaiu14RNP07(List<String> listaCombinacoesRNP05)
			throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP05 = new ArrayList<String>();
		for (String lista15 : listaCombinacoesRNP05) {
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			if (!resultadoRNP0714(linha1525)) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
						+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
						+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
						+ linha1525[13] + "," + linha1525[14];
				listaRNP05.add(lista);
			}
		}

		return listaRNP05;
	}

	@SuppressWarnings("deprecation")
	public boolean resultadoRNP0714(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = PrincipalRNP07_SEIS.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				contador = 0;
				int[] resultado1525 = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					resultado1525[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					for (int j = 0; j < resultado1525.length; j++) {
						if (linha1525[i] == resultado1525[j]) {
							contador++;
						}
					}
				}

				if (contador == NumeroEnum.QUATORZE.getValor()) {
					retorno = true;
					break;
				}
			}
		} else {
			System.out.println("### [ResultadoRNP07.csv] Arquivo nao encontrado... ###");
		}

		return retorno;
	}
	
	public List<String> resultadoNumerosFinalVinteUm(List<String> listaRNP08)
			throws URISyntaxException, IOException, LotoException {
		
		List<String> listaRNP08VinteUm = new ArrayList<String>();
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
					+ linha1525[13] + "," + linha1525[14];
			if (linha1525[14] == 21) {
				listaRNP08VinteUm.add(lista);
			}
		}

		return listaRNP08VinteUm;
		
	}
	
	public List<String> resultadoNumerosFinalVinteDois(List<String> listaRNP08)
			throws URISyntaxException, IOException, LotoException {
		
		List<String> listaRNP08VinteDois = new ArrayList<String>();
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
					+ linha1525[13] + "," + linha1525[14];
			if (linha1525[14] == 22) {
				listaRNP08VinteDois.add(lista);
			}
		}

		return listaRNP08VinteDois;
		
	}
	
	public List<String> resultadoNumerosFinalVinteTres(List<String> listaRNP08)
			throws URISyntaxException, IOException, LotoException {
		
		List<String> listaRNP08VinteTres = new ArrayList<String>();
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
					+ linha1525[13] + "," + linha1525[14];
			if (linha1525[14] == 23) {
				listaRNP08VinteTres.add(lista);
			}
		}

		return listaRNP08VinteTres;
		
	}
	
	public List<String> resultadoNumerosFinalVinteQuatro(List<String> listaRNP08)
			throws URISyntaxException, IOException, LotoException {
		
		List<String> listaRNP08VinteQuatro = new ArrayList<String>();
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
					+ linha1525[13] + "," + linha1525[14];
			if (linha1525[14] == 24) {
				listaRNP08VinteQuatro.add(lista);
			}
		}

		return listaRNP08VinteQuatro;
		
	}
	
	public List<String> resultadoNumerosFinalVinteCinco(List<String> listaRNP08)
			throws URISyntaxException, IOException, LotoException {
		
		List<String> listaRNP07VinteCinco = new ArrayList<String>();
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
					+ linha1525[13] + "," + linha1525[14];
			if (linha1525[14] == 25) {
				listaRNP07VinteCinco.add(lista);
			}
		}

		return listaRNP07VinteCinco;
		
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
					+ linha1525[13] + "," + linha1525[14];
			listaqualquer.add(listaNova);
		}

		String listaNovaNaoFechamento = null;
		List<String> listaqualquerNaoFechamento = new ArrayList<String>();
		for (String[] linha1525 : listaNAONumeros) {
			listaNovaNaoFechamento = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + ","
					+ linha1525[4] + "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8]
					+ "," + linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
					+ linha1525[13] + "," + linha1525[14];
			listaqualquerNaoFechamento.add(listaNovaNaoFechamento);
		}

		System.out.println("Numero de Combinacoes: " + contCombinacoes);
		System.out.println("Numero  de Fechamentos: " + listaNumeros.size());
		System.out.println("Numero  de NAO Fechamentos: " + listaNAONumeros.size());

		this.gravarRandomNaoFechamento(listaqualquerNaoFechamento);
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

			if (contJogo < NumeroEnum.QUATORZE.getValor()) {
				retorno = true;
			} else {
				retorno = false;
				break;
			}
		}

		return retorno;
	}

	public void gravarRetirarSaiu15RNP07(List<String> lista) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\rnp07\\PrincipalRNP07_SEIS\\RetirarSaiu15RNP07.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		for (String lista15 : lista) {
			String[] linha15 = lista15.split(",");
			int[] jogo = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				jogo[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			gravarArqSaiu.printf("%s%n", lista15);
		}
		arqSaiu.close();
		gravarArqSaiu.close();
	}

	public void gravarRetirarSaiu14RNP07(List<String> lista) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\rnp07\\PrincipalRNP07_SEIS\\RetirarSaiu14RNP07.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		for (String lista15 : lista) {
			String[] linha15 = lista15.split(",");
			int[] jogo = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				jogo[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			gravarArqSaiu.printf("%s%n", lista15);
		}
		arqSaiu.close();
		gravarArqSaiu.close();
	}

	public void gravarFechamento(List<String> lista) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\rnp07\\PrincipalRNP07_SEIS\\FechamentoRNP07_SEIS.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		for (String lista15 : lista) {
			String[] linha15 = lista15.split(",");
			int[] jogo = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				jogo[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			gravarArqSaiu.printf("%s%n", lista15);
		}
		arqSaiu.close();
		gravarArqSaiu.close();
	}

	public void gravarRandomFechamento(List<String> lista) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\rnp07\\PrincipalRNP07_SEIS\\RandomRNP07_SEIS_10_Fechamento.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);

		List<String[]> listaNumeros = new ArrayList<String[]>();
		for (int i = 0; i < 10; i++) {
			String lista15Random = this.getRandomElement(lista);
			String[] linha15Random = lista15Random.split(",");
			listaNumeros.add(linha15Random);
		}

		String listaNova = null;
		for (String[] linha1525 : listaNumeros) {
			listaNova = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
					+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
					+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
					+ linha1525[13] + "," + linha1525[14];
			gravarArqSaiu.printf("%s%n", listaNova);
		}
		arqSaiu.close();
		gravarArqSaiu.close();
	}

	public void gravarRandomNaoFechamento(List<String> lista) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\rnp07\\PrincipalRNP07_SEIS\\RandomRNP07_SEIS_10_NaoFechamento.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);

		List<String[]> listaNumeros = new ArrayList<String[]>();
		for (int i = 0; i < 10; i++) {
			String lista15Random = this.getRandomElement(lista);
			String[] linha15Random = lista15Random.split(",");
			listaNumeros.add(linha15Random);
		}

		String listaNova = null;
		for (String[] linha1525 : listaNumeros) {
			listaNova = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
					+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
					+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
					+ linha1525[13] + "," + linha1525[14];
			gravarArqSaiu.printf("%s%n", listaNova);
		}
		arqSaiu.close();
		gravarArqSaiu.close();
	}
	
	public void gravarRandom(List<String> lista) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\quinze\\FechamentoRNP05_CINCO_3121.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		
		List<String[]> listaNumeros = new ArrayList<String[]>();
		String lista15Random = null;
		for (int i = 0; i < 1; i++) {
			for (int r = 0; r < 3070; r++) {
				lista15Random = this.getRandomElement(lista);
			}
			String[] linha15Random = lista15Random.split(",");
			listaNumeros.add(linha15Random);
		}
		
		String listaNova = null;
		for (String[] linha1525 : listaNumeros) {
			listaNova = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
					+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
					+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
					+ linha1525[13] + "," + linha1525[14];
			System.out.println(listaNova);
			gravarArqSaiu.printf("%s%n", listaNova);
		}
		arqSaiu.close();
		gravarArqSaiu.close();
		
	}

	// ==============================================================================================//
	// ==============================COMBINACOES=====================================================//
	// ==============================================================================================//
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp07
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP07() throws URISyntaxException, IOException, LotoException {
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP07 rnp07 = new RNP07();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp07.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + saida[5]
						+ "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + saida[10] + ","
						+ saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				lista1525.add(lista);
			}
		}
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP07: " + cont);
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp07_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP07_SEM_RNS() throws URISyntaxException, IOException, LotoException {
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP07 rnp07 = new RNP07();
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp07.aplicar(saida)) {
				if (!rns0105.aplicar(saida)) {
					if (!rns0610.aplicar(saida)) {
						if (!rns1115.aplicar(saida)) {
							if (!rns1620.aplicar(saida)) {
								if (!rns2125.aplicar(saida)) {
									cont++;
									lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
											+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
											+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
											+ saida[13] + "," + saida[14];
									lista1525.add(lista);
								}
							}
						}
					}
				}
			}
		}
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP07_SEM_RNS: " + cont);
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp07_rns0105
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP07_RNS0105() throws URISyntaxException, IOException, LotoException {
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP07 rnp07 = new RNP07();
		RNS0105 rns0105 = new RNS0105();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp07.aplicar(saida)) {
				if (rns0105.aplicar(saida)) {
					cont++;
					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + ","
							+ saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + ","
							+ saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
					lista1525.add(lista);
				}
			}
		}
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP07_RNS0105: " + cont);
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp07_rns0610
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP07_RNS0610() throws URISyntaxException, IOException, LotoException {
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP07 rnp07 = new RNP07();
		RNS0610 rns0610 = new RNS0610();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp07.aplicar(saida)) {
				if (rns0610.aplicar(saida)) {
					cont++;
					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + ","
							+ saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + ","
							+ saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
					lista1525.add(lista);
				}
			}
		}
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP07_RNS0610: " + cont);
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp07_rns1115
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP07_RNS1115() throws URISyntaxException, IOException, LotoException {
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP07 rnp07 = new RNP07();
		RNS1115 rns1115 = new RNS1115();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp07.aplicar(saida)) {
				if (rns1115.aplicar(saida)) {
					cont++;
					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + ","
							+ saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + ","
							+ saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
					lista1525.add(lista);
				}
			}
		}
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP07_RNS1115: " + cont);
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp07_rns1620
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP07_RNS1620() throws URISyntaxException, IOException, LotoException {
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP07 rnp07 = new RNP07();
		RNS1620 rns1620 = new RNS1620();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp07.aplicar(saida)) {
				if (rns1620.aplicar(saida)) {
					cont++;
					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + ","
							+ saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + ","
							+ saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
					lista1525.add(lista);
				}
			}
		}
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP07_RNS1620: " + cont);
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp07_rns2125
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP07_RNS2125() throws URISyntaxException, IOException, LotoException {
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP07 rnp07 = new RNP07();
		RNS2125 rns2125 = new RNS2125();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp07.aplicar(saida)) {
				if (rns2125.aplicar(saida)) {
					cont++;
					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + ","
							+ saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + ","
							+ saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
					lista1525.add(lista);
				}
			}
		}
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP07_RNS2125: " + cont);
		return lista1525;
	}

}

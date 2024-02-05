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

import br.com.quinze.combinacoes.Combinacoes;
import br.com.quinze.enumerador.NumeroEnum;
import br.com.quinze.excecao.LotoException;
import br.com.quinze.regras.pares.RNP08;
import br.com.quinze.regras.sequencia.RNS0105;
import br.com.quinze.regras.sequencia.RNS0610;
import br.com.quinze.regras.sequencia.RNS1115;
import br.com.quinze.regras.sequencia.RNS1620;
import br.com.quinze.regras.sequencia.RNS2125;



public class PrincipalRNP08_SEIS {

	

	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		PrincipalRNP08_SEIS principal = new PrincipalRNP08_SEIS();

		/**********************************************************************
		 * RPN08
		 */
		System.out.println("**************RPN08_SEIS****************************");
//		List<String> listaCombinacoesRNP08 = principal.gerar1525RNP08();
		List<String> listaCombinacoesRNP08_SEM_RNS = principal.gerar1525RNP08_SEM_RNS();
//		List<String> listaCombinacoesRNP08_RNS0105 = principal.gerar1525RNP08_RNS0105();
//		List<String> listaCombinacoesRNP08_RNS0610 = principal.gerar1525RNP08_RNS0610();
//		List<String> listaCombinacoesRNP08_RNS1115 = principal.gerar1525RNP08_RNS1115();
//		List<String> listaCombinacoesRNP08_RNS1620 = principal.gerar1525RNP08_RNS1620();
//		List<String> listaCombinacoesRNP08_RNS2125 = principal.gerar1525RNP08_RNS2125();

//		List<String> listaSeisRPN08 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08);
//		System.out.println("listaSeisRNP08: " + listaSeisRPN08.size());
		List<String> listaSeisRPN08_SEM_RNS = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_SEM_RNS);
		System.out.println("listaSeisRPN08_SEM_RNS: " + listaSeisRPN08_SEM_RNS.size());
//		List<String> listaSeisRPN08_RNS0105 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS0105);
//		System.out.println("listaSeisRPN08_RNS0105: " + listaSeisRPN08_RNS0105.size());
//		List<String> listaSeisRPN08_RNS0610 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS0610);
//		System.out.println("listaSeisRPN08_RNS0610: " + listaSeisRPN08_RNS0610.size());
//		List<String> listaSeisRPN08_RNS1115 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS1115);
//		System.out.println("listaSeisRPN08_RNS1115: " + listaSeisRPN08_RNS1115.size());
//		List<String> listaSeisRPN08_RNS1620 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS1620);
//		System.out.println("listaSeisRPN08_RNS1620: " + listaSeisRPN08_RNS1620.size());
//		List<String> listaSeisRPN08_RNS2125 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS2125);
//		System.out.println("listaSeisRPN08_RNS2125: " + listaSeisRPN08_RNS2125.size());

		
		/**
		 * Retirar o que ja foi premiado!!!
		 */
		List<String> listaSaiu15RNP08 = principal.retirarSaiu15RNP08(listaSeisRPN08_SEM_RNS);
//		principal.gravarRetirarSaiu15RNP08(listaSaiu15RNP08);
		System.out.println("Lista Retirar Saiu 15: " + listaSaiu15RNP08.size());

		List<String> listaSaiu14RNP08 = principal.retirarSaiu14RNP08(listaSaiu15RNP08);
		principal.gravarRetirarSaiu14RNP08(listaSaiu14RNP08);
		System.out.println("Lista Retirar Saiu 14: " + listaSaiu14RNP08.size());
		
		
		List<String> listaFinalVinteUm = principal.resultadoNumerosFinalVinteUm(listaSaiu14RNP08);
		System.out.println("listaFinalVinteUm: " + listaFinalVinteUm.size());
		List<String> listaFinalVinteDois = principal.resultadoNumerosFinalVinteDois(listaSaiu14RNP08);
		System.out.println("listaFinalVinteDois: " + listaFinalVinteDois.size());
		List<String> listaFinalVinteTres = principal.resultadoNumerosFinalVinteTres(listaSaiu14RNP08);
		System.out.println("listaFinalVinteTres: " + listaFinalVinteTres.size());
		List<String> listaFinalVinteQuatro = principal.resultadoNumerosFinalVinteQuatro(listaSaiu14RNP08);
		System.out.println("listaFinalVinteQuatro: " + listaFinalVinteQuatro.size());
		List<String> listaFinalVinteCinco = principal.resultadoNumerosFinalVinteCinco(listaSaiu14RNP08);
		System.out.println("listaFinalVinteCinco: " + listaFinalVinteCinco.size());
		
		
		
		/**
		 * Fechamento para ganhar!!!
		 */
//		List<String> listaFechamentoRNP08 = principal.fechamento(listaSaiu14RNP08);
//		principal.gravarFechamento(listaFechamentoRNP08);
//		principal.gravarRandomFechamento(listaFechamentoRNP08);
//		System.out.println("Fechamento: " + listaFechamentoRNP08.size());

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

	public List<String> retirarSaiu15RNP08(List<String> listaCombinacoesRNP05)
			throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP05 = new ArrayList<String>();
		for (String lista15 : listaCombinacoesRNP05) {
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			if (!resultadoRNP0815(linha1525)) {
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
	public boolean resultadoRNP0815(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = PrincipalRNP08_SEIS.class.getClassLoader().getResource("\\resultado\\ResultadoRNP08.csv");
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
			System.out.println("### [ResultadoRNP08.csv] Arquivo nao encontrado... ###");
		}

		return retorno;
	}

	public List<String> retirarSaiu14RNP08(List<String> listaCombinacoesRNP05)
			throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP05 = new ArrayList<String>();
		for (String lista15 : listaCombinacoesRNP05) {
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			if (!resultadoRNP0814(linha1525)) {
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
	public boolean resultadoRNP0814(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = PrincipalRNP08_SEIS.class.getClassLoader().getResource("resultado.csv");
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
			System.out.println("### [ResultadoRNP08.csv] Arquivo nao encontrado... ###");
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
					+ linha1525[13] + "," + linha1525[14];
			if (linha1525[14] == 25) {
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
					+ linha1525[13] + "," + linha1525[14];
			listaqualquer.add(listaNova);
		}
		
		String listaNovaNaoFechamento = null;
		List<String> listaqualquerNaoFechamento = new ArrayList<String>();
		for (String[] linha1525 : listaNAONumeros) {
			listaNovaNaoFechamento = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
					+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
					+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
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

	public void gravarRetirarSaiu15RNP08(List<String> lista) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\rnp08\\PrincipalRNP08_SEIS\\RetirarSaiu15RNP08.csv");
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

	public void gravarRetirarSaiu14RNP08(List<String> lista) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\rnp08\\PrincipalRNP08_SEIS\\RetirarSaiu14RNP08.csv");
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
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\rnp08\\PrincipalRNP08_SEIS\\FechamentoRNP08_SEIS.csv");
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
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\rnp08\\PrincipalRNP08_SEIS\\RandomRNP08_SEIS_Fechamento.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		
		List<String[]> listaNumeros = new ArrayList<String[]>();
		for (int i = 0; i < 3; i++) {
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
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\rnp08\\PrincipalRNP08_SEIS\\RandomRNP08_SEIS_NaoFechamento.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		
		List<String[]> listaNumeros = new ArrayList<String[]>();
		for (int i = 0; i < 3; i++) {
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
	
	
	//==============================================================================================//
	//==============================COMBINACOES=====================================================//
	//==============================================================================================//
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp08
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08() throws URISyntaxException, IOException, LotoException {
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP08 rnp08 = new RNP08();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp08.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
						+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
						+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
						+ saida[13] + "," + saida[14];
				lista1525.add(lista);
			}
		}
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp08_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_SEM_RNS() throws URISyntaxException, IOException, LotoException {
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP08 rnp08 = new RNP08();
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp08.aplicar(saida)) {
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
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_SEM_RNS: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp08_rns0105
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS0105() throws URISyntaxException, IOException, LotoException {
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP08 rnp08 = new RNP08();
		RNS0105 rns0105 = new RNS0105();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp08.aplicar(saida)) {
				if (rns0105.aplicar(saida)) {
					cont++;
					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
							+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
							+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
							+ saida[13] + "," + saida[14];
					lista1525.add(lista);
				}
			}
		}
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_RNS0105: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp08_rns0610
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS0610() throws URISyntaxException, IOException, LotoException {
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP08 rnp08 = new RNP08();
		RNS0610 rns0610 = new RNS0610();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp08.aplicar(saida)) {
				if (rns0610.aplicar(saida)) {
					cont++;
					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
							+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
							+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
							+ saida[13] + "," + saida[14];
					lista1525.add(lista);
				}
			}
		}
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_RNS0610: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp08_rns1115
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS1115() throws URISyntaxException, IOException, LotoException {
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP08 rnp08 = new RNP08();
		RNS1115 rns1115 = new RNS1115();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp08.aplicar(saida)) {
				if (rns1115.aplicar(saida)) {
					cont++;
					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
							+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
							+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
							+ saida[13] + "," + saida[14];
					lista1525.add(lista);
				}
			}
		}
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_RNS1115: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp08_rns1620
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS1620() throws URISyntaxException, IOException, LotoException {
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP08 rnp08 = new RNP08();
		RNS1620 rns1620 = new RNS1620();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp08.aplicar(saida)) {
				if (rns1620.aplicar(saida)) {
					cont++;
					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
							+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
							+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
							+ saida[13] + "," + saida[14];
					lista1525.add(lista);
				}
			}
		}
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_RNS1620: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp08_rns2125
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS2125() throws URISyntaxException, IOException, LotoException {
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP08 rnp08 = new RNP08();
		RNS2125 rns2125 = new RNS2125();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp08.aplicar(saida)) {
				if (rns2125.aplicar(saida)) {
					cont++;
					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
							+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
							+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
							+ saida[13] + "," + saida[14];
					lista1525.add(lista);
				}
			}
		}
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_RNS2125: " + cont);
		return lista1525;
	}

}

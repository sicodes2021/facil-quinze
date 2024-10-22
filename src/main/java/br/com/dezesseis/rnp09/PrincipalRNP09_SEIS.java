package br.com.dezesseis.rnp09;

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
import br.com.combinacoes.Combinacoes1525;
import br.com.dezesseis.resultado.Resultado1625MAISSAIU;
import br.com.enumerador.NumeroEnum;
import br.com.excecao.LotoException;
import br.com.regras.pares.RNP09;
import br.com.regras.sequencia.RNS0105;
import br.com.regras.sequencia.RNS0610;
import br.com.regras.sequencia.RNS1115;
import br.com.regras.sequencia.RNS1620;
import br.com.regras.sequencia.RNS2125;


//**************RPN09_SEIS_16****************************
//TOTAL DE LINHAS NO ARQUIVO 16_25: 2042975
//
//TOTAL DE LINHAS NO ARQUIVO 16_25-RNP09: 377520
//listaCincoRPN07: 123312
//
//TOTAL DE LINHAS NO ARQUIVO 16_25-RNP09_SEM_RNS: 233028
//listaSeisRPN09_SEM_RNS: 89502
//
//
//
//VINTE_UM-VINTE_CINCO
//TOTAL DE LINHAS NO ARQUIVO 16_25-RNP09_VINTE_UM: 309
//TOTAL DE LINHAS NO ARQUIVO 16_25-RNP09_VINTE_DOIS: 2884
//TOTAL DE LINHAS NO ARQUIVO 16_25-RNP09_VINTE_TRES: 6549
//TOTAL DE LINHAS NO ARQUIVO 16_25-RNP09_VINTE_QUATRO: 32935
//TOTAL DE LINHAS NO ARQUIVO 16_25-RNP09_VINTE_CINCO: 46825
//Numero de Combinacoes: 230
//Numero  de Fechamentos: 12
//Numero  de NAO Fechamentos: 219
public class PrincipalRNP09_SEIS {

	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		PrincipalRNP09_SEIS principal = new PrincipalRNP09_SEIS();
		Combinacoes1525 combinacoes1525 = new Combinacoes1525();
		Resultado1625MAISSAIU resultado1625maissaiu = new Resultado1625MAISSAIU();
		
		
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] strNaoSaiu = { 2, 5, 6, 8, 11, 13, 14, 15, 22, 23 };
		int[] strSaiu = { 1, 3, 4, 7, 9, 10, 12, 16, 17, 18, 19, 20, 21, 24, 25 };

		/*********************************************************************
		 * RNP09
		 */
		System.out.println("**************RPN09_SEIS_16****************************");
		principal.gerar1625(str);
		
		System.out.println("");
		List<String> listaCombinacoesRNP09 = principal.gerar1625RNP09(str);
		List<String> listaCincoRPN07 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP09, "listaCincoRPN07");
		
		System.out.println("");
		List<String> listaCombinacoesRNP09_SEM_RNS = principal.gerar1625RNP09_SEM_RNS(str);
		List<String> listaSeisRPN09_SEM_RNS = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP09_SEM_RNS, "listaSeisRPN09_SEM_RNS");
		
//		System.out.println("");
//		System.out.println("");
//		List<String> listaCombinacoesRNP09_RNS0105 = principal.gerar1525RNP09_RNS0105();
//		List<String> listaCincoRPN07_RNS0105 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP09_RNS0105, "listaCincoRPN07_RNS0105");
//		List<String> listaCombinacoesRNP09_RNS0105_RNS0610 = principal.gerar1525RNP09_RNS0105_RNS0610();
//		List<String> listaCincoRNP09_RNS0105_RNS1115 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP09_RNS0105_RNS0610, "listaCincoRNP09_RNS0105_RNS0610");
//		List<String> listaCombinacoesRNP09_RNS0105_RNS1115 = principal.gerar1525RNP09_RNS0105_RNS1115();
//		List<String> listaCincoRNP09_RNS0105_RNS1115 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP09_RNS0105_RNS1115, "listaCincoRNP09_RNS0105_RNS1115");
//		List<String> listaCombinacoesRNP09_RNS0105_RNS1620 = principal.gerar1525RNP09_RNS0105_RNS1620();
//		List<String> listaCincoRNP09_RNS0105_RNS1620 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP09_RNS0105_RNS1620, "listaCincoRNP09_RNS0105_RNS1620");
//		List<String> listaCombinacoesRNP09_RNS0105_RNS2125 = principal.gerar1525RNP09_RNS0105_RNS2125();
//		List<String> listaCincoRNP09_RNS0105_RNS2125 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP09_RNS0105_RNS2125, "listaCincoRNP09_RNS0105_RNS2125");
//		Integer total_rns0105 = (listaCombinacoesRNP09_RNS0105.size() 
//				+ listaCombinacoesRNP09_RNS0105_RNS0610.size() 
//				+ listaCombinacoesRNP09_RNS0105_RNS1115.size()
//				+ listaCombinacoesRNP09_RNS0105_RNS1620.size()
//				+ listaCombinacoesRNP09_RNS0105_RNS2125.size());
//		System.out.println("TOTAL_RNS0105: " + total_rns0105);

		
		
//		System.out.println("");
//		System.out.println("");
//		List<String> listaCombinacoesRNP09_RNS0610 = principal.gerar1525RNP09_RNS0610();
//		List<String> listaCincoRNP09_RNS0610 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP09_RNS0610, "listaCincoRNP09_RNS0610");
//		List<String> listaCombinacoesRNP09_RNS0610_RNS1115 = principal.gerar1525RNP09_RNS0610_RNS1115();
//		List<String> listaCincoRNP09_RNS0610_RNS1115 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP09_RNS0610_RNS1115, "listaCincoRNP09_RNS0610_RNS1115");
//		List<String> listaCombinacoesRNP09_RNS0610_RNS2125 = principal.gerar1525RNP09_RNS0610_RNS2125();
//		List<String> listaCincoRNP09_RNS0610_RNS2125 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP09_RNS0610_RNS2125, "listaCincoRNP09_RNS0610_RNS2125");
//		Integer total_rns0610 = (listaCombinacoesRNP09_RNS0610.size() 
//				+ listaCombinacoesRNP09_RNS0610_RNS1115.size() 
//				+ listaCombinacoesRNP09_RNS0610_RNS2125.size());
//		System.out.println("TOTAL_RNS0610: " + total_rns0610);
		
		
		
//		System.out.println("");
//		System.out.println("");
//		List<String> listaCombinacoesRNP09_RNS1115 = principal.gerar1525RNP09_RNS1115();
//		List<String> listaCincoRNP09_RNS1115 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP09_RNS1115, "listaCincoRNP09_RNS1115");
//		List<String> listaCombinacoesRNP09_RNS1115_RNS1620 = principal.gerar1525RNP09_RNS1115_RNS1620();
//		List<String> listaCincoRNP09_RNS1115_RNS1620 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP09_RNS1115_RNS1620, "listaCincoRNP09_RNS1115_RNS1620");
//		List<String> listaCombinacoesRNP09_RNS1115_RNS2125 = principal.gerar1525RNP09_RNS1115_RNS2125();
//		List<String> listaCincoRNP09_RNS1115_RNS2125 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP09_RNS1115_RNS2125, "listaCincoRNP09_RNS1115_RNS2125");
//		Integer total_rns1115 = (listaCombinacoesRNP09_RNS1115.size() 
//				+ listaCombinacoesRNP09_RNS1115_RNS1620.size() 
//				+ listaCombinacoesRNP09_RNS1115_RNS2125.size());
//		System.out.println("TOTAL_RNS1115: " + total_rns1115);
		
		
		
//		System.out.println("");
//		System.out.println("");
//		List<String> listaCombinacoesRNP09_RNS1620 = principal.gerar1525RNP09_RNS1620();
//		List<String> listaCincoRNP09_RNS1620 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP09_RNS1620, "listaCincoRNP09_RNS1620");
//		List<String> listaCombinacoesRNP09_RNS1620_RNS2125 = principal.gerar1525RNP09_RNS1620_RNS2125();
//		List<String> listaCincoRNP09_RNS1620_RNS2125 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP09_RNS1620_RNS2125, "listaCincoRNP09_RNS1620_RNS2125");
//		Integer total_rns1620 = (listaCombinacoesRNP09_RNS1620.size() 
//				+ listaCombinacoesRNP09_RNS1620_RNS2125.size());
//		System.out.println("TOTAL_RNS1620: " + total_rns1620);
		
		
		
//		System.out.println("");
//		System.out.println("");
//		List<String> listaCombinacoesRNP09_RNS2125 = principal.gerar1525RNP09_RNS2125();
//		List<String> listaCincoRPN07_RNS2125 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP09_RNS2125, "listaCincoRPN07_RNS2125");
		

		
		System.out.println("");
		System.out.println("");
		System.out.println("VINTE_UM-VINTE_CINCO");
		List<String> listaFinalVinteUm = principal.resultadoNumerosFinalVinteUm(listaSeisRPN09_SEM_RNS);
		List<String> listaFinalVinteDois = principal.resultadoNumerosFinalVinteDois(listaSeisRPN09_SEM_RNS);
		List<String> listaFinalVinteTres = principal.resultadoNumerosFinalVinteTres(listaSeisRPN09_SEM_RNS);
		List<String> listaFinalVinteQuatro = principal.resultadoNumerosFinalVinteQuatro(listaSeisRPN09_SEM_RNS);
		List<String> listaFinalVinteCinco = principal.resultadoNumerosFinalVinteCinco(listaSeisRPN09_SEM_RNS);
//		principal.gravar(listaFinalVinteCinco, "listaFinalVinteCinco_Seis");
		
		
		/**
		 * Retirar o que ja foi premiado!!!
		 */
		List<String> listaSaiu15RPN05 = principal.retirarSaiu15RNP09(listaFinalVinteUm);
//		//principal.gravarRetirarSaiu15RNP09(listaSaiu15RPN05);
//		System.out.println("Lista Retirar Saiu 15: " + listaSaiu15RPN05.size());

		List<String> listaSaiu14RNP09 = principal.retirarSaiu14RNP09(listaSaiu15RPN05);
//		principal.gravarRetirarSaiu14RNP09(listaSaiu14RNP09);
//		principal.gravarRandom(listaSaiu14RNP09);
//		System.out.println("Lista Retirar Saiu 14: " + listaSaiu14RNP09.size());
		
//		List<String> listaSaiu13RNP09 = principal.retirarSaiu13RNP09(listaSaiu14RNP09);
//		principal.gravarRetirarSaiu13RNP09(listaSaiu13RNP09);
//		System.out.println("Lista Retirar Saiu 13: " + listaSaiu13RNP09.size());

		
		/**
		 * Fechamento para ganhar!!!
		 */
		List<String> listaFechamentoRNP09 = principal.fechamento(listaSaiu14RNP09);
//		principal.gravarFechamento(listaFechamentoRNP09);
//		System.out.println("Fechamento: " + listaFechamentoRNP09.size());
	}

	public List<String> resultadoNumerosMenorQueDezSEIS(List<String> listaCombinacoesRNP09, String nomeLista)
			throws URISyntaxException, IOException, LotoException {

		List<String> listaResultado = new ArrayList<String>();

		for (String lista16 : listaCombinacoesRNP09) {
			int contlinha = 0;
			String lista = null;
			String[] linha16 = lista16.split(",");

			int[] linha1625 = new int[linha16.length];
			for (int i = 0; i < linha16.length; i++) {
				linha1625[i] = Integer.parseInt(String.valueOf(linha16[i]));
			}

			for (int i = 0; i < linha1625.length; i++) {
				if (linha1625[i] < NumeroEnum.DEZ.getValor()) {
					contlinha++;
				}
			}

			if (contlinha == NumeroEnum.SEIS.getValor()) {
				lista = linha1625[0] + "," + linha1625[1] + "," + linha1625[2] + "," + linha1625[3] + "," 
						+ linha1625[4] + "," + linha1625[5] + "," + linha1625[6] + "," + linha1625[7] + "," 
						+ linha1625[8] + "," + linha1625[9] + "," + linha1625[10] + "," + linha1625[11] + "," 
						+ linha1625[12] + "," + linha1625[13] + "," + linha1625[14] + "," + linha1625[15];
				listaResultado.add(lista);
			}
		}

		System.out.println(nomeLista+ ": " + listaResultado.size());
		return listaResultado;
	}

	public List<String> retirarSaiu15RNP09(List<String> listaCombinacoesRNP09)
			throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP09 = new ArrayList<String>();
		for (String lista16 : listaCombinacoesRNP09) {
			String lista = null;
			String[] linha16 = lista16.split(",");

			int[] linha1625 = new int[linha16.length];
			for (int i = 0; i < linha16.length; i++) {
				linha1625[i] = Integer.parseInt(String.valueOf(linha16[i]));
			}

			if (!resultadoRNP0915(linha1625)) {
				lista = linha1625[0] + "," + linha1625[1] + "," + linha1625[2] + "," + linha1625[3] + "," 
						+ linha1625[4] + "," + linha1625[5] + "," + linha1625[6] + "," + linha1625[7] + "," 
						+ linha1625[8] + "," + linha1625[9] + "," + linha1625[10] + "," + linha1625[11] + "," 
						+ linha1625[12] + "," + linha1625[13] + "," + linha1625[14] + "," + linha1625[15];
				listaRNP09.add(lista);
			}
		}

		return listaRNP09;
	}

	@SuppressWarnings("deprecation")
	public boolean resultadoRNP0915(int[] linha1625) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = PrincipalRNP09_SEIS.class.getClassLoader().getResource("\\resultado\\ResultadoRNP09.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				contador = 0;
				int[] resultado1625 = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					resultado1625[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				for (int i = 0; i < linha1625.length; i++) {
					for (int j = 0; j < resultado1625.length; j++) {
						if (linha1625[i] == resultado1625[j]) {
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
			System.out.println("### [ResultadoRNP09.csv] Arquivo nao encontrado... ###");
		}

		return retorno;
	}

	public List<String> retirarSaiu14RNP09(List<String> listaCombinacoesRNP09)
			throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP09 = new ArrayList<String>();
		for (String lista16 : listaCombinacoesRNP09) {
			String lista = null;
			String[] linha16 = lista16.split(",");

			int[] linha1625 = new int[linha16.length];
			for (int i = 0; i < linha16.length; i++) {
				linha1625[i] = Integer.parseInt(String.valueOf(linha16[i]));
			}

			if (resultadoRNP0914(linha1625)) {
				lista = linha1625[0] + "," + linha1625[1] + "," + linha1625[2] + "," + linha1625[3] + "," 
						+ linha1625[4] + "," + linha1625[5] + "," + linha1625[6] + "," + linha1625[7] + "," 
						+ linha1625[8] + "," + linha1625[9] + "," + linha1625[10] + "," + linha1625[11] + "," 
						+ linha1625[12] + "," + linha1625[13] + "," + linha1625[14] + "," + linha1625[15];
				listaRNP09.add(lista);
			}
		}

		return listaRNP09;
	}

	@SuppressWarnings("deprecation")
	public boolean resultadoRNP0914(int[] linha1625) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = PrincipalRNP09_SEIS.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				contador = 0;
				int[] resultado1625 = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					resultado1625[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				for (int i = 0; i < linha1625.length; i++) {
					for (int j = 0; j < resultado1625.length; j++) {
						if (linha1625[i] == resultado1625[j]) {
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
			System.out.println("### [ResultadoRNP09.csv] Arquivo nao encontrado... ###");
		}

		return retorno;
	}
	
	public List<String> retirarSaiu13RNP09(List<String> listaCombinacoesRNP09)
			throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP09 = new ArrayList<String>();
		for (String lista16 : listaCombinacoesRNP09) {
			String lista = null;
			String[] linha16 = lista16.split(",");

			int[] linha1625 = new int[linha16.length];
			for (int i = 0; i < linha16.length; i++) {
				linha1625[i] = Integer.parseInt(String.valueOf(linha16[i]));
			}

			if (resultadoRNP0913(linha1625)) {
				lista = linha1625[0] + "," + linha1625[1] + "," + linha1625[2] + "," + linha1625[3] + "," 
						+ linha1625[4] + "," + linha1625[5] + "," + linha1625[6] + "," + linha1625[7] + "," 
						+ linha1625[8] + "," + linha1625[9] + "," + linha1625[10] + "," + linha1625[11] + "," 
						+ linha1625[12] + "," + linha1625[13] + "," + linha1625[14] + "," + linha1625[15];
				listaRNP09.add(lista);
			}
		}

		return listaRNP09;
	}

	@SuppressWarnings("deprecation")
	public boolean resultadoRNP0913(int[] linha1625) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = PrincipalRNP09_SEIS.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				contador = 0;
				int[] resultado1625 = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					resultado1625[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				for (int i = 0; i < linha1625.length; i++) {
					for (int j = 0; j < resultado1625.length; j++) {
						if (linha1625[i] == resultado1625[j]) {
							contador++;
						}
					}
				}

				if (contador == NumeroEnum.TREZE.getValor()) {
					retorno = true;
					break;
				}
			}
		} else {
			System.out.println("### [ResultadoRNP09.csv] Arquivo nao encontrado... ###");
		}

		return retorno;
	}

	public List<String> fechamento(List<String> lista) throws URISyntaxException, IOException, LotoException {

		List<String[]> listaNumeros = new ArrayList<String[]>();
		List<String[]> listaNAONumeros = new ArrayList<String[]>();
		int contCombinacoes = 0;
		for (String lista16 : lista) {
			String[] linha16 = lista16.split(",");

			String lista16Random = this.getRandomElement(lista);
			String[] linha16Random = lista16Random.split(",");

			if (contCombinacoes == NumeroEnum.ZERO.getValor()) {
				listaNumeros.add(linha16Random);
			}

			if (comparaNumerosfechamento(listaNumeros, linha16)) {
				listaNumeros.add(linha16);
			} else {
				listaNAONumeros.add(linha16);
			}

			contCombinacoes++;
		}

		String listaNova = null;
		List<String> listaqualquer = new ArrayList<String>();
		for (String[] linha1625 : listaNumeros) {
			listaNova = linha1625[0] + "," + linha1625[1] + "," + linha1625[2] + "," + linha1625[3] + "," 
					+ linha1625[4] + "," + linha1625[5] + "," + linha1625[6] + "," + linha1625[7] + "," 
					+ linha1625[8] + "," + linha1625[9] + "," + linha1625[10] + "," + linha1625[11] + "," 
					+ linha1625[12] + "," + linha1625[13] + "," + linha1625[14] + "," + linha1625[15];
			listaqualquer.add(listaNova);
		}

		System.out.println("Numero de Combinacoes: " + contCombinacoes);
		System.out.println("Numero  de Fechamentos: " + listaNumeros.size());
		System.out.println("Numero  de NAO Fechamentos: " + listaNAONumeros.size());

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

	public void gravarRetirarSaiu15RNP09(List<String> lista) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\RNP09\\PrincipalRNP09_CINCO\\RetirarSaiu15RNP09.csv");
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

	public void gravarRetirarSaiu14RNP09(List<String> lista) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\RNP09\\PrincipalRNP09_CINCO\\RetirarSaiu14RNP09.csv");
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
	
	public void gravarRetirarSaiu13RNP09(List<String> lista) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\RNP09\\PrincipalRNP09_CINCO\\RetirarSaiu13RNP09.csv");
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
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\RNP09\\PrincipalRNP09_CINCO\\FechamentoRNP09_CINCO.csv");
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
	
	public void gravarRandom(List<String> lista) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\RNP09\\PrincipalRNP09_CINCO\\RandomRNP09_CINCO_con3036.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		
		List<String[]> listaNumeros = new ArrayList<String[]>();
		String lista16Random = null;
		for (int i = 0; i < 3; i++) {
			for (int r = 0; r < 3036; r++) {
				lista16Random = this.getRandomElement(lista);
			}
			String[] linha16Random = lista16Random.split(",");
			listaNumeros.add(linha16Random);
		}
		
		String listaNova = null;
		for (String[] linha1625 : listaNumeros) {
			listaNova = linha1625[0] + "," + linha1625[1] + "," + linha1625[2] + "," + linha1625[3] + "," 
					+ linha1625[4] + "," + linha1625[5] + "," + linha1625[6] + "," + linha1625[7] + "," 
					+ linha1625[8] + "," + linha1625[9] + "," + linha1625[10] + "," + linha1625[11] + "," 
					+ linha1625[12] + "," + linha1625[13] + "," + linha1625[14] + "," + linha1625[15];
			gravarArqSaiu.printf("%s%n", listaNova);
		}
		arqSaiu.close();
		gravarArqSaiu.close();
	}
	
	public List<String> resultadoNumerosFinalVinteUm(List<String> listaRNP09)
			throws URISyntaxException, IOException, LotoException {
		
		List<String> listaRNP09VinteUm = new ArrayList<String>();
		for (String lista16 : listaRNP09) {
			String lista = null;
			String[] linha16 = lista16.split(",");

			int[] linha1625 = new int[linha16.length];
			for (int i = 0; i < linha16.length; i++) {
				linha1625[i] = Integer.parseInt(String.valueOf(linha16[i]));
			}


			lista = linha1625[0] + "," + linha1625[1] + "," + linha1625[2] + "," + linha1625[3] + "," 
					+ linha1625[4] + "," + linha1625[5] + "," + linha1625[6] + "," + linha1625[7] + "," 
					+ linha1625[8] + "," + linha1625[9] + "," + linha1625[10] + "," + linha1625[11] + "," 
					+ linha1625[12] + "," + linha1625[13] + "," + linha1625[14] + "," + linha1625[15];
			if (linha1625[15] == 21) {
				listaRNP09VinteUm.add(lista);
			}
		}
		

		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP09_VINTE_UM: " + listaRNP09VinteUm.size());

		return listaRNP09VinteUm;
		
	}
	
	public List<String> resultadoNumerosFinalVinteDois(List<String> listaRNP09)
			throws URISyntaxException, IOException, LotoException {
		
		List<String> listaRNP09VinteDois = new ArrayList<String>();
		for (String lista16 : listaRNP09) {
			String lista = null;
			String[] linha16 = lista16.split(",");

			int[] linha1625 = new int[linha16.length];
			for (int i = 0; i < linha16.length; i++) {
				linha1625[i] = Integer.parseInt(String.valueOf(linha16[i]));
			}


			lista = linha1625[0] + "," + linha1625[1] + "," + linha1625[2] + "," + linha1625[3] + "," 
					+ linha1625[4] + "," + linha1625[5] + "," + linha1625[6] + "," + linha1625[7] + "," 
					+ linha1625[8] + "," + linha1625[9] + "," + linha1625[10] + "," + linha1625[11] + "," 
					+ linha1625[12] + "," + linha1625[13] + "," + linha1625[14] + "," + linha1625[15];
			if (linha1625[15] == 22) {
				listaRNP09VinteDois.add(lista);
			}
		}
		
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP09_VINTE_DOIS: " + listaRNP09VinteDois.size());

		return listaRNP09VinteDois;
		
	}
	
	public List<String> resultadoNumerosFinalVinteTres(List<String> listaRNP09)
			throws URISyntaxException, IOException, LotoException {
		
		List<String> listaRNP09VinteTres = new ArrayList<String>();
		for (String lista16 : listaRNP09) {
			String lista = null;
			String[] linha16 = lista16.split(",");

			int[] linha1625 = new int[linha16.length];
			for (int i = 0; i < linha16.length; i++) {
				linha1625[i] = Integer.parseInt(String.valueOf(linha16[i]));
			}


			lista = linha1625[0] + "," + linha1625[1] + "," + linha1625[2] + "," + linha1625[3] + "," 
					+ linha1625[4] + "," + linha1625[5] + "," + linha1625[6] + "," + linha1625[7] + "," 
					+ linha1625[8] + "," + linha1625[9] + "," + linha1625[10] + "," + linha1625[11] + "," 
					+ linha1625[12] + "," + linha1625[13] + "," + linha1625[14] + "," + linha1625[15];
			if (linha1625[15] == 23) {
				listaRNP09VinteTres.add(lista);
			}
		}
		
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP09_VINTE_TRES: " + listaRNP09VinteTres.size());

		return listaRNP09VinteTres;
		
	}
	
	public List<String> resultadoNumerosFinalVinteQuatro(List<String> listaRNP09)
			throws URISyntaxException, IOException, LotoException {
		
		List<String> listaRNP09VinteQuatro = new ArrayList<String>();
		for (String lista16 : listaRNP09) {
			String lista = null;
			String[] linha16 = lista16.split(",");

			int[] linha1625 = new int[linha16.length];
			for (int i = 0; i < linha16.length; i++) {
				linha1625[i] = Integer.parseInt(String.valueOf(linha16[i]));
			}


			lista = linha1625[0] + "," + linha1625[1] + "," + linha1625[2] + "," + linha1625[3] + "," 
					+ linha1625[4] + "," + linha1625[5] + "," + linha1625[6] + "," + linha1625[7] + "," 
					+ linha1625[8] + "," + linha1625[9] + "," + linha1625[10] + "," + linha1625[11] + "," 
					+ linha1625[12] + "," + linha1625[13] + "," + linha1625[14] + "," + linha1625[15];
			if (linha1625[15] == 24) {
				listaRNP09VinteQuatro.add(lista);
			}
		}
		
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP09_VINTE_QUATRO: " + listaRNP09VinteQuatro.size());

		return listaRNP09VinteQuatro;
		
	}
	
	public List<String> resultadoNumerosFinalVinteCinco(List<String> listaRNP09)
			throws URISyntaxException, IOException, LotoException {
		
		List<String> listaRNP09VinteCinco = new ArrayList<String>();
		for (String lista16 : listaRNP09) {
			String lista = null;
			String[] linha16 = lista16.split(",");

			int[] linha1625 = new int[linha16.length];
			for (int i = 0; i < linha16.length; i++) {
				linha1625[i] = Integer.parseInt(String.valueOf(linha16[i]));
			}


			lista = linha1625[0] + "," + linha1625[1] + "," + linha1625[2] + "," + linha1625[3] + "," 
					+ linha1625[4] + "," + linha1625[5] + "," + linha1625[6] + "," + linha1625[7] + "," 
					+ linha1625[8] + "," + linha1625[9] + "," + linha1625[10] + "," + linha1625[11] + "," 
					+ linha1625[12] + "," + linha1625[13] + "," + linha1625[14] + "," + linha1625[15];
			if (linha1625[15] == 25) {
				listaRNP09VinteCinco.add(lista);
			}
		}
		
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP09_VINTE_CINCO: " + listaRNP09VinteCinco.size());

		return listaRNP09VinteCinco;
		
	}
	
	public void gravar(List<String> lista, String nomeArquivo) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\dezesseis\\RNP09\\"+nomeArquivo+".csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		for (String lista16 : lista) {
			String[] linha16 = lista16.split(",");
			int[] jogo = new int[linha16.length];
			for (int i = 0; i < linha16.length; i++) {
				jogo[i] = Integer.parseInt(String.valueOf(linha16[i]));
			}
			gravarArqSaiu.printf("%s%n", linha16);
		}
		arqSaiu.close();
		gravarArqSaiu.close();
	}
	
	
	// ==============================================================================================//
		// ==============================COMBINACOES=====================================================//
		// ==============================================================================================//
	
		/**
		 * Metodo responsavel por gerar as combinacoes 1625 = 2042975
		 * 
		 * @return List<String>
		 */
		public List<String> gerar1625(int[] str) throws URISyntaxException, IOException, LotoException {
			int cont = 0;
			List<String> lista1625 = new ArrayList<String>();
			int[] saida;
			Combinacoes comb1 = new Combinacoes(str, 16);
			while (comb1.hasNext()) {
				String lista = null;
				saida = comb1.next();
					cont++;
					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," 
							+ saida[4] + "," + saida[5] + "," + saida[6] + "," + saida[7] + "," 
							+ saida[8] + "," + saida[9] + "," + saida[10] + "," + saida[11] + "," 
							+ saida[12] + "," + saida[13] + "," + saida[14] + "," + saida[15];
					lista1625.add(lista);
			}
			System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25: " + cont);
			return lista1625;
		}
	
		/**
		 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial RNP09
		 * 
		 * @return
		 * @throws LotoException
		 */
		public List<String> gerar1625RNP09(int[] str) throws URISyntaxException, IOException, LotoException {
			List<String> lista1625 = new ArrayList<String>();
			int[] saida;
			Combinacoes comb1 = new Combinacoes(str, 16);
			RNP09 RNP09 = new RNP09();
			while (comb1.hasNext()) {
				String lista = null;
				saida = comb1.next();
				if (RNP09.aplicar(saida)) {
					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," 
							+ saida[4] + "," + saida[5] + "," + saida[6] + "," + saida[7] + "," 
							+ saida[8] + "," + saida[9] + "," + saida[10] + "," + saida[11] + "," 
							+ saida[12] + "," + saida[13] + "," + saida[14] + "," + saida[15];
					lista1625.add(lista);
				}
			}
			System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP09: " + lista1625.size());
			return lista1625;
		}

		/**
		 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial
		 * RNP09_sem_rns
		 * 
		 * @return
		 * @throws LotoException
		 */
		public List<String> gerar1625RNP09_SEM_RNS(int[] str) throws URISyntaxException, IOException, LotoException {
			List<String> lista1525 = new ArrayList<String>();
			int[] saida;
			Combinacoes comb1 = new Combinacoes(str, 16);
			RNP09 RNP09 = new RNP09();
			RNS0105 rns0105 = new RNS0105();
			RNS0610 rns0610 = new RNS0610();
			RNS1115 rns1115 = new RNS1115();
			RNS1620 rns1620 = new RNS1620();
			RNS2125 rns2125 = new RNS2125();
			while (comb1.hasNext()) {
				String lista = null;
				saida = comb1.next();
				if (RNP09.aplicar(saida)) {
					if (!rns0105.aplicar(saida)) {
						if (!rns0610.aplicar(saida)) {
							if (!rns1115.aplicar(saida)) {
								if (!rns1620.aplicar(saida)) {
									if (!rns2125.aplicar(saida)) {
										lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," 
												+ saida[4] + "," + saida[5] + "," + saida[6] + "," + saida[7] + "," 
												+ saida[8] + "," + saida[9] + "," + saida[10] + "," + saida[11] + "," 
												+ saida[12] + "," + saida[13] + "," + saida[14] + "," + saida[15];
										lista1525.add(lista);
									}
								}
							}
						}
					}
				}
			}
			
			System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP09_SEM_RNS: " + lista1525.size());
			return lista1525;
		}

		/**
		 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
		 * RNP09_rns0105
		 * 
		 * @return
		 * @throws LotoException
		 */
		public List<String> gerar1525RNP09_RNS0105() throws URISyntaxException, IOException, LotoException {
			List<String> lista1525 = new ArrayList<String>();
			int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
			int[] saida;
			Combinacoes comb1 = new Combinacoes(str, 16);
			RNP09 RNP09 = new RNP09();
			RNS0105 rns0105 = new RNS0105();
			RNS0610 rns0610 = new RNS0610();
			RNS1115 rns1115 = new RNS1115();
			RNS1620 rns1620 = new RNS1620();
			RNS2125 rns2125 = new RNS2125();
			while (comb1.hasNext()) {
				String lista = null;
				saida = comb1.next();
				if (RNP09.aplicar(saida)) {
					if (rns0105.aplicar(saida)) {
						if (!rns0610.aplicar(saida)) {
							if (!rns1115.aplicar(saida)) {
								if (!rns1620.aplicar(saida)) {
									if (!rns2125.aplicar(saida)) {
										lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
												+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
												+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
												+ saida[13] + "," + saida[14] + "," + saida[15];
										lista1525.add(lista);
									}
								}
							}
						}
					}
				}
			}
			
			List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP09(lista1525);
			Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
			System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP09_RNS0105: " + lista1525.size() + " - " + listaSaiu15RPN05.size() + " => Saiu: " + saiu);
			return lista1525;
		}
		
		/**
		 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
		 * RNP09_rns0105_rns0610
		 * 
		 * @return
		 * @throws LotoException
		 */
		public List<String> gerar1525RNP09_RNS0105_RNS0610() throws URISyntaxException, IOException, LotoException {
			List<String> lista1525 = new ArrayList<String>();
			int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
			int[] saida;
			Combinacoes comb1 = new Combinacoes(str, 16);
			RNP09 RNP09 = new RNP09();
			RNS0105 rns0105 = new RNS0105();
			RNS0610 rns0610 = new RNS0610();
			RNS1115 rns1115 = new RNS1115();
			RNS1620 rns1620 = new RNS1620();
			RNS2125 rns2125 = new RNS2125();
			while (comb1.hasNext()) {
				String lista = null;
				saida = comb1.next();
				if (RNP09.aplicar(saida)) {
					if (rns0105.aplicar(saida)) {
						if (rns0610.aplicar(saida)) {
							if (!rns1115.aplicar(saida)) {
								if (!rns1620.aplicar(saida)) {
									if (!rns2125.aplicar(saida)) {
										lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
												+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
												+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
												+ saida[13] + "," + saida[14] + "," + saida[15];
										lista1525.add(lista);
									}
								}
							}
						}
					}
				}
			}
			
			List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP09(lista1525);
			Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
			System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP09_RNS0105_RNS0610: " + lista1525.size() + " - " + listaSaiu15RPN05.size() + " => Saiu: " + saiu);
			return lista1525;
		}
		
		/**
		 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
		 * RNP09_rns0105_rns1115
		 * 
		 * @return
		 * @throws LotoException
		 */
		public List<String> gerar1525RNP09_RNS0105_RNS1115() throws URISyntaxException, IOException, LotoException {
			List<String> lista1525 = new ArrayList<String>();
			int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
			int[] saida;
			Combinacoes comb1 = new Combinacoes(str, 16);
			RNP09 RNP09 = new RNP09();
			RNS0105 rns0105 = new RNS0105();
			RNS0610 rns0610 = new RNS0610();
			RNS1115 rns1115 = new RNS1115();
			RNS1620 rns1620 = new RNS1620();
			RNS2125 rns2125 = new RNS2125();
			while (comb1.hasNext()) {
				String lista = null;
				saida = comb1.next();
				if (RNP09.aplicar(saida)) {
					if (rns0105.aplicar(saida)) {
						if (!rns0610.aplicar(saida)) {
							if (rns1115.aplicar(saida)) {
								if (!rns1620.aplicar(saida)) {
									if (!rns2125.aplicar(saida)) {
										lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
												+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
												+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
												+ saida[13] + "," + saida[14] + "," + saida[15];
										lista1525.add(lista);
									}
								}
							}
						}
					}
				}
			}
			
			List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP09(lista1525);
			Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
			System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP09_RNS0105_RNS1115: " + lista1525.size() + " - " + listaSaiu15RPN05.size() + " => Saiu: " + saiu);
			return lista1525;
		}
		
		/**
		 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
		 * RNP09_rns0105_rns1620
		 * 
		 * @return
		 * @throws LotoException
		 */
		public List<String> gerar1525RNP09_RNS0105_RNS1620() throws URISyntaxException, IOException, LotoException {
			List<String> lista1525 = new ArrayList<String>();
			int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
			int[] saida;
			Combinacoes comb1 = new Combinacoes(str, 16);
			RNP09 RNP09 = new RNP09();
			RNS0105 rns0105 = new RNS0105();
			RNS0610 rns0610 = new RNS0610();
			RNS1115 rns1115 = new RNS1115();
			RNS1620 rns1620 = new RNS1620();
			RNS2125 rns2125 = new RNS2125();
			while (comb1.hasNext()) {
				String lista = null;
				saida = comb1.next();
				if (RNP09.aplicar(saida)) {
					if (rns0105.aplicar(saida)) {
						if (!rns0610.aplicar(saida)) {
							if (!rns1115.aplicar(saida)) {
								if (rns1620.aplicar(saida)) {
									if (!rns2125.aplicar(saida)) {
										lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
												+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
												+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
												+ saida[13] + "," + saida[14] + "," + saida[15];
										lista1525.add(lista);
									}
								}
							}
						}
					}
				}
			}
			
			List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP09(lista1525);
			Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
			System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP09_RNS0105_RNS1620: " + lista1525.size() + " - " + listaSaiu15RPN05.size() + " => Saiu: " + saiu);
			return lista1525;
		}
		
		/**
		 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
		 * RNP09_rns0105_rns2125
		 * 
		 * @return
		 * @throws LotoException
		 */
		public List<String> gerar1525RNP09_RNS0105_RNS2125() throws URISyntaxException, IOException, LotoException {
			List<String> lista1525 = new ArrayList<String>();
			int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
			int[] saida;
			Combinacoes comb1 = new Combinacoes(str, 16);
			RNP09 RNP09 = new RNP09();
			RNS0105 rns0105 = new RNS0105();
			RNS0610 rns0610 = new RNS0610();
			RNS1115 rns1115 = new RNS1115();
			RNS1620 rns1620 = new RNS1620();
			RNS2125 rns2125 = new RNS2125();
			while (comb1.hasNext()) {
				String lista = null;
				saida = comb1.next();
				if (RNP09.aplicar(saida)) {
					if (rns0105.aplicar(saida)) {
						if (!rns0610.aplicar(saida)) {
							if (!rns1115.aplicar(saida)) {
								if (!rns1620.aplicar(saida)) {
									if (rns2125.aplicar(saida)) {
										lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
												+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
												+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
												+ saida[13] + "," + saida[14] + "," + saida[15];
										lista1525.add(lista);
									}
								}
							}
						}
					}
				}
			}
			
			List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP09(lista1525);
			Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
			System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP09_RNS0105_RNS2125: " + lista1525.size() + " - " + listaSaiu15RPN05.size() + " => Saiu: " + saiu);
			return lista1525;
		}

		/**
		 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
		 * RNP09_rns0610
		 * 
		 * @return
		 * @throws LotoException
		 */
		public List<String> gerar1525RNP09_RNS0610() throws URISyntaxException, IOException, LotoException {
			List<String> lista1525 = new ArrayList<String>();
			int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
			int[] saida;
			Combinacoes comb1 = new Combinacoes(str, 16);
			RNP09 RNP09 = new RNP09();
			RNS0105 rns0105 = new RNS0105();
			RNS0610 rns0610 = new RNS0610();
			RNS1115 rns1115 = new RNS1115();
			RNS1620 rns1620 = new RNS1620();
			RNS2125 rns2125 = new RNS2125();
			while (comb1.hasNext()) {
				String lista = null;
				saida = comb1.next();
				if (RNP09.aplicar(saida)) {
					if (!rns0105.aplicar(saida)) {
						if (rns0610.aplicar(saida)) {
							if (!rns1115.aplicar(saida)) {
								if (!rns1620.aplicar(saida)) {
									if (!rns2125.aplicar(saida)) {
										lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
												+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
												+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
												+ saida[13] + "," + saida[14] + "," + saida[15];
										lista1525.add(lista);
									}
								}
							}
						}
					}
				}
			}
			
			List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP09(lista1525);
			Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
			System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP09_RNS0610: " + lista1525.size() + " - " + listaSaiu15RPN05.size() + " => Saiu: " + saiu);
			return lista1525;
		}
		
		/**
		 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
		 * RNP09_rns0610_rns1115
		 * 
		 * @return
		 * @throws LotoException
		 */
		public List<String> gerar1525RNP09_RNS0610_RNS1115() throws URISyntaxException, IOException, LotoException {
			List<String> lista1525 = new ArrayList<String>();
			int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
			int[] saida;
			Combinacoes comb1 = new Combinacoes(str, 16);
			RNP09 RNP09 = new RNP09();
			RNS0105 rns0105 = new RNS0105();
			RNS0610 rns0610 = new RNS0610();
			RNS1115 rns1115 = new RNS1115();
			RNS1620 rns1620 = new RNS1620();
			RNS2125 rns2125 = new RNS2125();
			while (comb1.hasNext()) {
				String lista = null;
				saida = comb1.next();
				if (RNP09.aplicar(saida)) {
					if (!rns0105.aplicar(saida)) {
						if (rns0610.aplicar(saida)) {
							if (rns1115.aplicar(saida)) {
								if (!rns1620.aplicar(saida)) {
									if (!rns2125.aplicar(saida)) {
										lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
												+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
												+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
												+ saida[13] + "," + saida[14] + "," + saida[15];
										lista1525.add(lista);
									}
								}
							}
						}
					}
				}
			}
			
			List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP09(lista1525);
			Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
			System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP09_RNS0610_RNS1115: " + lista1525.size() + " - " + listaSaiu15RPN05.size() + " => Saiu: " + saiu);
			return lista1525;
		}
		
		/**
		 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
		 * RNP09_rns0610_rns2125
		 * 
		 * @return
		 * @throws LotoException
		 */
		public List<String> gerar1525RNP09_RNS0610_RNS2125() throws URISyntaxException, IOException, LotoException {
			List<String> lista1525 = new ArrayList<String>();
			int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
			int[] saida;
			Combinacoes comb1 = new Combinacoes(str, 16);
			RNP09 RNP09 = new RNP09();
			RNS0105 rns0105 = new RNS0105();
			RNS0610 rns0610 = new RNS0610();
			RNS1115 rns1115 = new RNS1115();
			RNS1620 rns1620 = new RNS1620();
			RNS2125 rns2125 = new RNS2125();
			while (comb1.hasNext()) {
				String lista = null;
				saida = comb1.next();
				if (RNP09.aplicar(saida)) {
					if (!rns0105.aplicar(saida)) {
						if (rns0610.aplicar(saida)) {
							if (!rns1115.aplicar(saida)) {
								if (!rns1620.aplicar(saida)) {
									if (rns2125.aplicar(saida)) {
										lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
												+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
												+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
												+ saida[13] + "," + saida[14] + "," + saida[15];
										lista1525.add(lista);
									}
								}
							}
						}
					}
				}
			}
			
			List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP09(lista1525);
			Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
			System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP09_RNS0610_RNS2125: " + lista1525.size() + " - " + listaSaiu15RPN05.size() + " => Saiu: " + saiu);
			return lista1525;
		}

		/**
		 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
		 * RNP09_rns1115
		 * 
		 * @return
		 * @throws LotoException
		 */
		public List<String> gerar1525RNP09_RNS1115() throws URISyntaxException, IOException, LotoException {
			List<String> lista1525 = new ArrayList<String>();
			int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
			int[] saida;
			Combinacoes comb1 = new Combinacoes(str, 16);
			RNP09 RNP09 = new RNP09();
			RNS0105 rns0105 = new RNS0105();
			RNS0610 rns0610 = new RNS0610();
			RNS1115 rns1115 = new RNS1115();
			RNS1620 rns1620 = new RNS1620();
			RNS2125 rns2125 = new RNS2125();
			while (comb1.hasNext()) {
				String lista = null;
				saida = comb1.next();
				if (RNP09.aplicar(saida)) {
					if (!rns0105.aplicar(saida)) {
						if (!rns0610.aplicar(saida)) {
							if (rns1115.aplicar(saida)) {
								if (!rns1620.aplicar(saida)) {
									if (!rns2125.aplicar(saida)) {
										lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
												+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
												+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
												+ saida[13] + "," + saida[14] + "," + saida[15];
										lista1525.add(lista);
									}
								}
							}
						}
					}
				}
			}
			
			List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP09(lista1525);
			Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
			System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP09_RNS1115: " + lista1525.size() + " - " + listaSaiu15RPN05.size() + " => Saiu: " + saiu);
			return lista1525;
		}
		
		/**
		 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
		 * RNP09_rns1115_rns1620
		 * 
		 * @return
		 * @throws LotoException
		 */
		public List<String> gerar1525RNP09_RNS1115_RNS1620() throws URISyntaxException, IOException, LotoException {
			List<String> lista1525 = new ArrayList<String>();
			int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
			int[] saida;
			Combinacoes comb1 = new Combinacoes(str, 16);
			RNP09 RNP09 = new RNP09();
			RNS0105 rns0105 = new RNS0105();
			RNS0610 rns0610 = new RNS0610();
			RNS1115 rns1115 = new RNS1115();
			RNS1620 rns1620 = new RNS1620();
			RNS2125 rns2125 = new RNS2125();
			while (comb1.hasNext()) {
				String lista = null;
				saida = comb1.next();
				if (RNP09.aplicar(saida)) {
					if (!rns0105.aplicar(saida)) {
						if (!rns0610.aplicar(saida)) {
							if (rns1115.aplicar(saida)) {
								if (rns1620.aplicar(saida)) {
									if (!rns2125.aplicar(saida)) {
										lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
												+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
												+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
												+ saida[13] + "," + saida[14] + "," + saida[15];
										lista1525.add(lista);
									}
								}
							}
						}
					}
				}
			}
			
			List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP09(lista1525);
			Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
			System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP09_RNS1115_RNS1620: " + lista1525.size() + " - " + listaSaiu15RPN05.size() + " => Saiu: " + saiu);
			return lista1525;
		}
		
		/**
		 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
		 * RNP09_rns1115_rns1620
		 * 
		 * @return
		 * @throws LotoException
		 */
		public List<String> gerar1525RNP09_RNS1115_RNS2125() throws URISyntaxException, IOException, LotoException {
			List<String> lista1525 = new ArrayList<String>();
			int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
			int[] saida;
			Combinacoes comb1 = new Combinacoes(str, 16);
			RNP09 RNP09 = new RNP09();
			RNS0105 rns0105 = new RNS0105();
			RNS0610 rns0610 = new RNS0610();
			RNS1115 rns1115 = new RNS1115();
			RNS1620 rns1620 = new RNS1620();
			RNS2125 rns2125 = new RNS2125();
			while (comb1.hasNext()) {
				String lista = null;
				saida = comb1.next();
				if (RNP09.aplicar(saida)) {
					if (!rns0105.aplicar(saida)) {
						if (!rns0610.aplicar(saida)) {
							if (rns1115.aplicar(saida)) {
								if (!rns1620.aplicar(saida)) {
									if (rns2125.aplicar(saida)) {
										lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
												+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
												+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
												+ saida[13] + "," + saida[14] + "," + saida[15];
										lista1525.add(lista);
									}
								}
							}
						}
					}
				}
			}
			
			List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP09(lista1525);
			Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
			System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP09_RNS1115_RNS2125: " + lista1525.size() + " - " + listaSaiu15RPN05.size() + " => Saiu: " + saiu);
			return lista1525;
		}
		

		/**
		 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
		 * RNP09_rns1620
		 * 
		 * @return
		 * @throws LotoException
		 */
		public List<String> gerar1525RNP09_RNS1620() throws URISyntaxException, IOException, LotoException {
			List<String> lista1525 = new ArrayList<String>();
			int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
			int[] saida;
			Combinacoes comb1 = new Combinacoes(str, 16);
			RNP09 RNP09 = new RNP09();
			RNS0105 rns0105 = new RNS0105();
			RNS0610 rns0610 = new RNS0610();
			RNS1115 rns1115 = new RNS1115();
			RNS1620 rns1620 = new RNS1620();
			RNS2125 rns2125 = new RNS2125();
			while (comb1.hasNext()) {
				String lista = null;
				saida = comb1.next();
				if (RNP09.aplicar(saida)) {
					if (!rns0105.aplicar(saida)) {
						if (!rns0610.aplicar(saida)) {
							if (!rns1115.aplicar(saida)) {
								if (rns1620.aplicar(saida)) {
									if (!rns2125.aplicar(saida)) {
										lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
												+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
												+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
												+ saida[13] + "," + saida[14] + "," + saida[15];
										lista1525.add(lista);
									}
								}
							}
						}
					}
				}
			}
			
			List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP09(lista1525);
			Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
			System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP09_RNS1620: " + lista1525.size() + " - " + listaSaiu15RPN05.size() + " => Saiu: " + saiu);
			return lista1525;
		}
		
		/**
		 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
		 * RNP09_rns1620
		 * 
		 * @return
		 * @throws LotoException
		 */
		public List<String> gerar1525RNP09_RNS1620_RNS2125() throws URISyntaxException, IOException, LotoException {
			List<String> lista1525 = new ArrayList<String>();
			int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
			int[] saida;
			Combinacoes comb1 = new Combinacoes(str, 16);
			RNP09 RNP09 = new RNP09();
			RNS0105 rns0105 = new RNS0105();
			RNS0610 rns0610 = new RNS0610();
			RNS1115 rns1115 = new RNS1115();
			RNS1620 rns1620 = new RNS1620();
			RNS2125 rns2125 = new RNS2125();
			while (comb1.hasNext()) {
				String lista = null;
				saida = comb1.next();
				if (RNP09.aplicar(saida)) {
					if (!rns0105.aplicar(saida)) {
						if (!rns0610.aplicar(saida)) {
							if (!rns1115.aplicar(saida)) {
								if (rns1620.aplicar(saida)) {
									if (rns2125.aplicar(saida)) {
										lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
												+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
												+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
												+ saida[13] + "," + saida[14] + "," + saida[15];
										lista1525.add(lista);
									}
								}
							}
						}
					}
				}
			}
			
			List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP09(lista1525);
			Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
			System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP09_RNS1620_RNS2125: " + lista1525.size() + " - " + listaSaiu15RPN05.size() + " => Saiu: " + saiu);
			return lista1525;
		}

		/**
		 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
		 * RNP09_rns2125
		 * 
		 * @return
		 * @throws LotoException
		 */
		public List<String> gerar1525RNP09_RNS2125() throws URISyntaxException, IOException, LotoException {
			List<String> lista1525 = new ArrayList<String>();
			int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
			int[] saida;
			Combinacoes comb1 = new Combinacoes(str, 16);
			RNP09 RNP09 = new RNP09();
			RNS0105 rns0105 = new RNS0105();
			RNS0610 rns0610 = new RNS0610();
			RNS1115 rns1115 = new RNS1115();
			RNS1620 rns1620 = new RNS1620();
			RNS2125 rns2125 = new RNS2125();
			while (comb1.hasNext()) {
				String lista = null;
				saida = comb1.next();
				if (RNP09.aplicar(saida)) {
					if (!rns0105.aplicar(saida)) {
						if (!rns0610.aplicar(saida)) {
							if (!rns1115.aplicar(saida)) {
								if (!rns1620.aplicar(saida)) {
									if (rns2125.aplicar(saida)) {
										lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
												+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
												+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + ","
												+ saida[13] + "," + saida[14] + "," + saida[15];
										lista1525.add(lista);
									}
								}
							}
						}
					}
				}
			}
			
			List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP09(lista1525);
			Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
			System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP09_RNS2125: " + lista1525.size() + " - " + listaSaiu15RPN05.size() + " => Saiu: " + saiu);
			return lista1525;
		}

}

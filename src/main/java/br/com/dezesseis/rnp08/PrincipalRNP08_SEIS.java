package br.com.dezesseis.rnp08;

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
import br.com.regras.pares.RNP08;
import br.com.regras.sequencia.RNS0105;
import br.com.regras.sequencia.RNS0610;
import br.com.regras.sequencia.RNS1115;
import br.com.regras.sequencia.RNS1620;
import br.com.regras.sequencia.RNS2125;


//**************RPN08_SEIS_16****************************
//TOTAL DE LINHAS NO ARQUIVO 16_25: 2042975
//
//TOTAL DE LINHAS NO ARQUIVO 16_25-RNP08: 637065
//listaSeisRPN08: 205632
//
//TOTAL DE LINHAS NO ARQUIVO 16_25-RNP08_SEM_RNS: 379893
//listaSeisRPN08_SEM_RNS: 145623
//
//
//
//VINTE_UM-VINTE_CINCO
//TOTAL DE LINHAS NO ARQUIVO 16_25-RNP08_VINTE_UM: 620
//TOTAL DE LINHAS NO ARQUIVO 16_25-RNP08_VINTE_DOIS: 3717
//TOTAL DE LINHAS NO ARQUIVO 16_25-RNP08_VINTE_TRES: 12940
//TOTAL DE LINHAS NO ARQUIVO 16_25-RNP08_VINTE_QUATRO: 41160
//TOTAL DE LINHAS NO ARQUIVO 16_25-RNP08_VINTE_CINCO: 87186
//Lista Retirar Saiu 15: 619
//Lista Retirar Saiu 14: 429
//Numero de Combinacoes: 429
//Numero  de Fechamentos: 24
//Numero  de NAO Fechamentos: 406
public class PrincipalRNP08_SEIS {

	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		PrincipalRNP08_SEIS principal = new PrincipalRNP08_SEIS();
		Combinacoes1525 combinacoes1525 = new Combinacoes1525();
		Resultado1625MAISSAIU resultado1625maissaiu = new Resultado1625MAISSAIU();
		
		
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] strNaoSaiu = { 5, 6, 7, 9, 10, 13, 14, 19, 23, 24 };
		int[] strSaiu = { 1,2,3,4,8,11,12,15,16,17,18,20,21,22,25 };

		/*********************************************************************
		 * RNP08
		 */
		System.out.println("**************RPN08_SEIS_16****************************");
		principal.gerar1625(str);
		
		System.out.println("");
		List<String> listaCombinacoesRNP08 = principal.gerar1625RNP08(str);
		List<String> listaSeisRPN08 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08, "listaSeisRPN08");
//		List<String> listaSaiu15RPN08 = principal.retirarSaiu15RNP08(listaSeisRPN08);
//		List<String> listaSaiu14RNP08 = principal.retirarSaiu14RNP08(listaSaiu15RPN08);
//		resultado1625maissaiu.resultado1625MAISSAIU(listaSaiu14RNP08, "rnp08\\listaSeisRPN08");

		System.out.println("");
		List<String> listaCombinacoesRNP08_SEM_RNS = principal.gerar1625RNP08_SEM_RNS(str);
		List<String> listaSeisRPN08_SEM_RNS = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_SEM_RNS, "listaSeisRPN08_SEM_RNS");
//		List<String> listaSaiu15RPN08_SEM_RNS = principal.retirarSaiu15RNP08(listaSeisRPN08_SEM_RNS);
//		List<String> listaSaiu14RNP08_SEM_RNS = principal.retirarSaiu14RNP08(listaSaiu15RPN08_SEM_RNS);
//		resultado1625maissaiu.resultado1625MAISSAIU(listaSaiu14RNP08_SEM_RNS, "rnp08\\listaSeisRPN08_SEM_RNS");

//		System.out.println("");
//		System.out.println("");
//		List<String> listaCombinacoesRNP08_RNS0105 = principal.gerar1525RNP08_RNS0105();
//		List<String> listaCincoRPN07_RNS0105 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS0105, "listaCincoRPN07_RNS0105");
//		List<String> listaCombinacoesRNP08_RNS0105_RNS0610 = principal.gerar1525RNP08_RNS0105_RNS0610();
//		List<String> listaCincoRNP08_RNS0105_RNS1115 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS0105_RNS0610, "listaCincoRNP08_RNS0105_RNS0610");
//		List<String> listaCombinacoesRNP08_RNS0105_RNS1115 = principal.gerar1525RNP08_RNS0105_RNS1115();
//		List<String> listaCincoRNP08_RNS0105_RNS1115 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS0105_RNS1115, "listaCincoRNP08_RNS0105_RNS1115");
//		List<String> listaCombinacoesRNP08_RNS0105_RNS1620 = principal.gerar1525RNP08_RNS0105_RNS1620();
//		List<String> listaCincoRNP08_RNS0105_RNS1620 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS0105_RNS1620, "listaCincoRNP08_RNS0105_RNS1620");
//		List<String> listaCombinacoesRNP08_RNS0105_RNS2125 = principal.gerar1525RNP08_RNS0105_RNS2125();
//		List<String> listaCincoRNP08_RNS0105_RNS2125 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS0105_RNS2125, "listaCincoRNP08_RNS0105_RNS2125");
//		Integer total_rns0105 = (listaCombinacoesRNP08_RNS0105.size() 
//				+ listaCombinacoesRNP08_RNS0105_RNS0610.size() 
//				+ listaCombinacoesRNP08_RNS0105_RNS1115.size()
//				+ listaCombinacoesRNP08_RNS0105_RNS1620.size()
//				+ listaCombinacoesRNP08_RNS0105_RNS2125.size());
//		System.out.println("TOTAL_RNS0105: " + total_rns0105);
		
		
		
//		System.out.println("");
//		System.out.println("");
//		List<String> listaCombinacoesRNP08_RNS0610 = principal.gerar1525RNP08_RNS0610();
//		List<String> listaCincoRNP08_RNS0610 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS0610, "listaCincoRNP08_RNS0610");
//		List<String> listaCombinacoesRNP08_RNS0610_RNS1115 = principal.gerar1525RNP08_RNS0610_RNS1115();
//		List<String> listaCincoRNP08_RNS0610_RNS1115 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS0610_RNS1115, "listaCincoRNP08_RNS0610_RNS1115");
//		List<String> listaCombinacoesRNP08_RNS0610_RNS2125 = principal.gerar1525RNP08_RNS0610_RNS2125();
//		List<String> listaCincoRNP08_RNS0610_RNS2125 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS0610_RNS2125, "listaCincoRNP08_RNS0610_RNS2125");
//		Integer total_rns0610 = (listaCombinacoesRNP08_RNS0610.size() 
//				+ listaCombinacoesRNP08_RNS0610_RNS1115.size() 
//				+ listaCombinacoesRNP08_RNS0610_RNS2125.size());
//		System.out.println("TOTAL_RNS0610: " + total_rns0610);
		
		
		
//		System.out.println("");
//		System.out.println("");
//		List<String> listaCombinacoesRNP08_RNS1115 = principal.gerar1525RNP08_RNS1115();
//		List<String> listaCincoRNP08_RNS1115 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS1115, "listaCincoRNP08_RNS1115");
//		List<String> listaCombinacoesRNP08_RNS1115_RNS1620 = principal.gerar1525RNP08_RNS1115_RNS1620();
//		List<String> listaCincoRNP08_RNS1115_RNS1620 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS1115_RNS1620, "listaCincoRNP08_RNS1115_RNS1620");
//		List<String> listaCombinacoesRNP08_RNS1115_RNS2125 = principal.gerar1525RNP08_RNS1115_RNS2125();
//		List<String> listaCincoRNP08_RNS1115_RNS2125 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS1115_RNS2125, "listaCincoRNP08_RNS1115_RNS2125");
//		Integer total_rns1115 = (listaCombinacoesRNP08_RNS1115.size() 
//				+ listaCombinacoesRNP08_RNS1115_RNS1620.size() 
//				+ listaCombinacoesRNP08_RNS1115_RNS2125.size());
//		System.out.println("TOTAL_RNS1115: " + total_rns1115);
		
		
		
//		System.out.println("");
//		System.out.println("");
//		List<String> listaCombinacoesRNP08_RNS1620 = principal.gerar1525RNP08_RNS1620(str);
//		List<String> listaCincoRNP08_RNS1620 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS1620, "listaCincoRNP08_RNS1620");
//		List<String> listaCombinacoesRNP08_RNS1620_RNS2125 = principal.gerar1525RNP08_RNS1620_RNS2125();
//		List<String> listaCincoRNP08_RNS1620_RNS2125 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS1620_RNS2125, "listaCincoRNP08_RNS1620_RNS2125");
//		Integer total_rns1620 = (listaCombinacoesRNP08_RNS1620.size() 
//				+ listaCombinacoesRNP08_RNS1620_RNS2125.size());
//		System.out.println("TOTAL_RNS1620: " + total_rns1620);

		
		
//		System.out.println("");
//		System.out.println("");
//		List<String> listaCombinacoesRNP08_RNS2125 = principal.gerar1525RNP08_RNS2125();
//		List<String> listaCincoRPN07_RNS2125 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08_RNS2125, "listaCincoRPN07_RNS2125");

		
		
//		System.out.println("");
//		System.out.println("");
//		System.out.println("VINTE_UM-VINTE_CINCO");
//		List<String> listaFinalVinteUm = principal.resultadoNumerosFinalVinteUm(listaSeisRPN08_SEM_RNS);
//		List<String> listaFinalVinteDois = principal.resultadoNumerosFinalVinteDois(listaSeisRPN08_SEM_RNS);
//		List<String> listaFinalVinteTres = principal.resultadoNumerosFinalVinteTres(listaSeisRPN08_SEM_RNS);
//		List<String> listaFinalVinteQuatro = principal.resultadoNumerosFinalVinteQuatro(listaSeisRPN08_SEM_RNS);
//		List<String> listaFinalVinteCinco = principal.resultadoNumerosFinalVinteCinco(listaSeisRPN08_SEM_RNS);
//		principal.gravar(listaFinalVinteCinco, "listaFinalVinteCinco_Seis");
		
		

		/**
		 * Retirar o que ja foi premiado!!!
		 */
//		List<String> listaSaiu15RPN08 = principal.retirarSaiu15RNP08(listaSeisRPN08_SEM_RNS);
//		principal.gravarRetirarSaiu15RNP08(listaSaiu15RPN05);
//		System.out.println("Lista Retirar Saiu 15: " + listaSaiu15RPN08.size());

//		List<String> listaSaiu14RNP08 = principal.retirarSaiu14RNP08(listaSaiu15RPN08);
//		principal.gravarRetirarSaiu14RNP08(listaSaiu14RNP08);
//		principal.gravarRandom(listaSaiu14RNP08);
//		System.out.println("Lista Retirar Saiu 14: " + listaSaiu14RNP08.size());
		
//		List<String> listaSaiu13RNP08 = principal.retirarSaiu13RNP08(listaSaiu14RNP08);
//		principal.gravarRetirarSaiu13RNP08(listaSaiu13RNP08);
//		System.out.println("Lista Retirar Saiu 13: " + listaSaiu13RNP08.size());

		
		/**
		 * Combinacoes Saiu e NaoSaiu
		 */
////		List<String> listaCombinacoesNaoSaiuDezSeis = combinacoes1525.gerarNaoSaiuDezSeis(strNaoSaiu);
////		List<String> listaCombinacoesSaiuQuinzeOito = combinacoes1525.gerarSaiuQuinzeOito(strSaiu);
//		List<String> listaCombinacoesSaiuQuinzeNove = combinacoes1525.gerarSaiuQuinzeNove(strSaiu);
////		List<String> listaCombinacoesSaiuQuinzeDez = combinacoes1525.gerarSaiuQuinzeDez(strSaiu);
//		
//		List<String> listaComparadas = principal.compararListas(listaSaiu14RNP08, listaCombinacoesSaiuQuinzeNove);
//		
//		
//		/**
//		 * Fechamento para ganhar!!!
//		 */
//		List<String> listaFechamentoRNP08 = principal.fechamento(listaComparadas);
//		principal.gravarFechamento(listaFechamentoRNP08);
////		principal.gravarRandom(listaFechamentoRNP08);
		
		/**
		 * Mais saiu
		 */
//		resultado1625maissaiu.resultado1625MAISSAIU(listaSaiu14RNP08);
	}

	public List<String> resultadoNumerosMenorQueDezSEIS(List<String> listaCombinacoesRNP08, String nomeLista)
			throws URISyntaxException, IOException, LotoException {

		List<String> listaResultado = new ArrayList<String>();

		for (String lista15 : listaCombinacoesRNP08) {
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
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4] + "," 
						+ linha1525[5] + ","  + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + "," + linha1525[9] + "," 
						+ linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + "," + linha1525[13] + "," + linha1525[14] + "," 
						+ linha1525[15];
				listaResultado.add(lista);
			}
		}


		System.out.println(nomeLista + ": " + listaResultado.size());
		return listaResultado;
	}
	
	public List<String> resultadoNumerosMenorQueDezCINCO(List<String> listaCombinacoesRNP08, String nomeLista)
			throws URISyntaxException, IOException, LotoException {

		List<String> listaResultado = new ArrayList<String>();

		for (String lista15 : listaCombinacoesRNP08) {
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

			if (contlinha == NumeroEnum.CINCO.getValor()) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4] + "," 
						+ linha1525[5] + ","  + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + "," + linha1525[9] + "," 
						+ linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + "," + linha1525[13] + "," + linha1525[14] + "," 
						+ linha1525[15];
				listaResultado.add(lista);
			}
		}


		System.out.println(nomeLista + ": " + listaResultado.size());
		return listaResultado;
	}

	public List<String> retirarSaiu15RNP08(List<String> listaCombinacoesRNP08)
			throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP08 = new ArrayList<String>();
		for (String lista16 : listaCombinacoesRNP08) {
			String lista = null;
			String[] linha16 = lista16.split(",");

			int[] linha1625 = new int[linha16.length];
			for (int i = 0; i < linha16.length; i++) {
				linha1625[i] = Integer.parseInt(String.valueOf(linha16[i]));
			}

			if (!resultadoRNP0815(linha1625)) {
				lista = linha1625[0] + "," + linha1625[1] + "," + linha1625[2] + "," + linha1625[3] + "," 
						+ linha1625[4] + "," + linha1625[5] + "," + linha1625[6] + "," + linha1625[7] + "," 
						+ linha1625[8] + "," + linha1625[9] + "," + linha1625[10] + "," + linha1625[11] + "," 
						+ linha1625[12] + "," + linha1625[13] + "," + linha1625[14] + "," + linha1625[15];
				listaRNP08.add(lista);
			}
		}

		return listaRNP08;
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

	public List<String> retirarSaiu14RNP08(List<String> listaCombinacoesRNP08)
			throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP08 = new ArrayList<String>();
		for (String lista15 : listaCombinacoesRNP08) {
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			if (resultadoRNP0814(linha1525)) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," 
						+ linha1525[4] + "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," 
						+ linha1525[8] + "," + linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," 
						+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14] + "," + linha1525[15];
				listaRNP08.add(lista);
			}
		}

		return listaRNP08;
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

	public List<String> retirarSaiu13RNP08(List<String> listaCombinacoesRNP08)
			throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP08 = new ArrayList<String>();
		for (String lista15 : listaCombinacoesRNP08) {
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			if (resultadoRNP0813(linha1525)) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
						+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
						+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
						+ linha1525[13] + "," + linha1525[14];
				listaRNP08.add(lista);
			}
		}

		return listaRNP08;
	}

	@SuppressWarnings("deprecation")
	public boolean resultadoRNP0813(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
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

				if (contador == NumeroEnum.TREZE.getValor()) {
					retorno = true;
					break;
				}
			}
		} else {
			System.out.println("### [ResultadoRNP08.csv] Arquivo nao encontrado... ###");
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

	public void gravarRetirarSaiu15RNP08(List<String> lista) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\RNP08\\PrincipalRNP08_CINCO\\RetirarSaiu15RNP08.csv");
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
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\RNP08\\PrincipalRNP08_CINCO\\RetirarSaiu14RNP08.csv");
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

	public void gravarRetirarSaiu13RNP08(List<String> lista) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\RNP08\\PrincipalRNP08_CINCO\\RetirarSaiu13RNP08.csv");
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
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\dezesseis\\rnp08\\FechamentoRNP08_SEIS_con3216.csv");
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
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\RNP08\\PrincipalRNP08_SEIS\\RandomRNP08_SEIS_con3100.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);

		List<String[]> listaNumeros = new ArrayList<String[]>();
		String lista15Random = null;
		for (int i = 0; i < 1; i++) {
			for (int r = 0; r < 3100; r++) {
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
					+ linha1525[13] + "," + linha1525[14] + "," + linha1525[15];
			gravarArqSaiu.printf("%s%n", listaNova);
		}
		arqSaiu.close();
		gravarArqSaiu.close();
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
					+ linha1525[13] + "," + linha1525[14] + "," + linha1525[15];
			if (linha1525[15] == 21) {
				listaRNP08VinteUm.add(lista);
			}
		}


		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP08_VINTE_UM: " + listaRNP08VinteUm.size());

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
					+ linha1525[13] + "," + linha1525[14] + "," + linha1525[15];
			if (linha1525[15] == 22) {
				listaRNP08VinteDois.add(lista);
			}
		}


		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP08_VINTE_DOIS: " + listaRNP08VinteDois.size());

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
					+ linha1525[13] + "," + linha1525[14] + "," + linha1525[15];
			if (linha1525[15] == 23) {
				listaRNP08VinteTres.add(lista);
			}
		}


		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP08_VINTE_TRES: " + listaRNP08VinteTres.size());

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
					+ linha1525[13] + "," + linha1525[14] + "," + linha1525[15];
			if (linha1525[15] == 24) {
				listaRNP08VinteQuatro.add(lista);
			}
		}


		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP08_VINTE_QUATRO: " + listaRNP08VinteQuatro.size());

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

			lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4] + "," 
					+ linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + "," + linha1525[9] + "," 
					+ linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + "," + linha1525[13] + "," + linha1525[14] + "," 
					+ linha1525[15];
			if (linha1525[15] == 25) {
				listaRNP08VinteCinco.add(lista);
			}
		}

		
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP08_VINTE_CINCO: " + listaRNP08VinteCinco.size());

		return listaRNP08VinteCinco;

	}

	public void gravar(List<String> lista, String nomeArquivo) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"C:\\sicodes\\facil-quinze\\src\\main\\resources\\dezesseis\\rnp08\\" + nomeArquivo + ".csv");
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
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial RNP08
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP08(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1625 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP08 rnp08 = new RNP08();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp08.aplicar(saida)) {
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," 
						+ saida[4] + "," + saida[5] + "," + saida[6] + "," + saida[7] + "," 
						+ saida[8] + "," + saida[9] + "," + saida[10] + "," + saida[11] + "," 
						+ saida[12] + "," + saida[13] + "," + saida[14] + "," + saida[15];
				lista1625.add(lista);
			}
		}
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP08: " + lista1625.size());
		return lista1625;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial
	 * RNP08_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP08_SEM_RNS(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
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
									lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," 
											+ saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," 
											+ saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," 
											+ saida[15];
									lista1525.add(lista);
								}
							}
						}
					}
				}
			}
		}

		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP08_SEM_RNS: " + lista1525.size());
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * RNP08_rns0105
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS0105() throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
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

		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP08(lista1525);
		Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_RNS0105: " + lista1525.size() + " - "
				+ listaSaiu15RPN05.size() + " => Saiu: " + saiu);
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * RNP08_rns0105_rns0610
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS0105_RNS0610() throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
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

		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP08(lista1525);
		Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_RNS0105_RNS0610: " + lista1525.size() + " - "
				+ listaSaiu15RPN05.size() + " => Saiu: " + saiu);
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * RNP08_rns0105_rns1115
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS0105_RNS1115() throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
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

		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP08(lista1525);
		Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_RNS0105_RNS1115: " + lista1525.size() + " - "
				+ listaSaiu15RPN05.size() + " => Saiu: " + saiu);
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * RNP08_rns0105_rns1620
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS0105_RNS1620() throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
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

		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP08(lista1525);
		Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_RNS0105_RNS1620: " + lista1525.size() + " - "
				+ listaSaiu15RPN05.size() + " => Saiu: " + saiu);
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * RNP08_rns0105_rns2125
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS0105_RNS2125() throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
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

		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP08(lista1525);
		Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_RNS0105_RNS2125: " + lista1525.size() + " - "
				+ listaSaiu15RPN05.size() + " => Saiu: " + saiu);
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * RNP08_rns0610
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS0610() throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
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

		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP08(lista1525);
		Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_RNS0610: " + lista1525.size() + " - "
				+ listaSaiu15RPN05.size() + " => Saiu: " + saiu);
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * RNP08_rns0610_rns1115
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS0610_RNS1115() throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
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

		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP08(lista1525);
		Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_RNS0610_RNS1115: " + lista1525.size() + " - "
				+ listaSaiu15RPN05.size() + " => Saiu: " + saiu);
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * RNP08_rns0610_rns2125
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS0610_RNS2125() throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
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

		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP08(lista1525);
		Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_RNS0610_RNS2125: " + lista1525.size() + " - "
				+ listaSaiu15RPN05.size() + " => Saiu: " + saiu);
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * RNP08_rns1115
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS1115() throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
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

		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP08(lista1525);
		Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_RNS1115: " + lista1525.size() + " - "
				+ listaSaiu15RPN05.size() + " => Saiu: " + saiu);
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * RNP08_rns1115_rns1620
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS1115_RNS1620() throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
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

		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP08(lista1525);
		Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_RNS1115_RNS1620: " + lista1525.size() + " - "
				+ listaSaiu15RPN05.size() + " => Saiu: " + saiu);
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * RNP08_rns1115_rns1620
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS1115_RNS2125() throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
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

		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP08(lista1525);
		Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_RNS1115_RNS2125: " + lista1525.size() + " - "
				+ listaSaiu15RPN05.size() + " => Saiu: " + saiu);
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial
	 * RNP08_rns1620
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS1620(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
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
							if (rns1620.aplicar(saida)) {
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

		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP08_RNS1620: " + lista1525.size());
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * RNP08_rns1620
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS1620_RNS2125() throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
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

		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP08(lista1525);
		Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_RNS1620_RNS2125: " + lista1525.size() + " - "
				+ listaSaiu15RPN05.size() + " => Saiu: " + saiu);
		return lista1525;
	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * RNP08_rns2125
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_RNS2125() throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
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

		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP08(lista1525);
		Integer saiu = (lista1525.size() - listaSaiu15RPN05.size());
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08_RNS2125: " + lista1525.size() + " - "
				+ listaSaiu15RPN05.size() + " => Saiu: " + saiu);
		return lista1525;
	}
	
	public List<String> compararListas(List<String> listaPrincipal, List<String> listaCombinacoes) throws URISyntaxException, IOException, LotoException {

		List<String[]> listaNumeros = new ArrayList<String[]>();
		List<String[]> listaNAONumeros = new ArrayList<String[]>();
		int contCombinacoes = 0;
		for (String lista16 : listaPrincipal) {
			String[] linhaPrincipal = lista16.split(",");

			if (comparaNumerosLista(linhaPrincipal, listaCombinacoes)) {
				listaNumeros.add(linhaPrincipal);
			} else {
				listaNAONumeros.add(linhaPrincipal);
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
		System.out.println("Numero  de SIM: " + listaNumeros.size());
		System.out.println("Numero  de NAO: " + listaNAONumeros.size());

		return listaqualquer;
	}

	public static boolean comparaNumerosLista(String[] linhaPrincipal, List<String> listaCombinacoes) {

		boolean retorno = false;
		int contJogo = 0;
		for (String lista10 : listaCombinacoes) {
			String[] linha10 = lista10.split(",");
			
			contJogo = 0;
			for (int i = 0; i < linha10.length; i++) {
				for (int j = 0; j < linhaPrincipal.length; j++) {
					if (linha10[i].equals(linhaPrincipal[j])) {
						contJogo++;
					}
				}
			}

			if (contJogo == NumeroEnum.DEZ.getValor()) {
				retorno = true;
				break;
			} else {
				retorno = false;
			}
		}

		return retorno;
	}

}

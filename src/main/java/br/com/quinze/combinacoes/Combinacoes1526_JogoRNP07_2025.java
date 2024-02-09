package br.com.quinze.combinacoes;

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

import com.opencsv.CSVReader;

import br.com.quinze.enumerador.NumeroEnum;
import br.com.quinze.excecao.LotoException;
import br.com.quinze.regras.pares.RNP02;
import br.com.quinze.regras.pares.RNP03;
import br.com.quinze.regras.pares.RNP04;
import br.com.quinze.regras.pares.RNP05;
import br.com.quinze.regras.pares.RNP06;
import br.com.quinze.regras.pares.RNP07;
import br.com.quinze.regras.pares.RNP08;
import br.com.quinze.regras.pares.RNP09;
import br.com.quinze.regras.pares.RNP10;
import br.com.quinze.regras.pares.RNP11;
import br.com.quinze.regras.pares.RNP12;

public class Combinacoes1526_JogoRNP07_2025 {
	
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		
		Combinacoes1526_JogoRNP07_2025 combinacoes1525 = new Combinacoes1526_JogoRNP07_2025();
		combinacoes1525.gerar1525();
		
		combinacoes1525.gerar1525RNP02();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP02();
		
		combinacoes1525.gerar1525RNP03();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP03();
		
		combinacoes1525.gerar1525RNP04();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP04();
		
		combinacoes1525.gerar1525RNP05();
		combinacoes1525.resultadoNumerosMenorQueDezRNP05();
		
		combinacoes1525.gerar1525RNP06();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP06();
		
		combinacoes1525.gerar1525RNP07();
		combinacoes1525.resultadoNumerosMenorQueDezRNP07();
		
		combinacoes1525.gerar1525RNP08();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP08();
		
		combinacoes1525.gerar1525RNP09();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP09();
//		
		combinacoes1525.gerar1525RNP10();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP10();
//		
		combinacoes1525.gerar1525RNP11();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP11();
//		
		combinacoes1525.gerar1525RNP12();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP12();
		
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 = 3268760
	 * 
	 * @return List<String>
	 */
	public List<String> gerar1525() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivo1525 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25.csv");
		PrintWriter gravarArquivo1525 = new PrintWriter(arquivo1525);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 21, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivo1525.printf("%s%n", lista);
				lista1525.add(lista);
		}
		arquivo1525.close();
		gravarArquivo1525.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp02
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP02() throws URISyntaxException, IOException, LotoException  {
		FileWriter arquivoRNP02 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP02.csv");
		PrintWriter gravarArquivoRNP02 = new PrintWriter(arquivoRNP02);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 21, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP02 rnp02 = new RNP02();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp02.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP02.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP02.close();
		gravarArquivoRNP02.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP02: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP02() throws URISyntaxException, IOException, LotoException {
		
//		FileWriter arquivoZERO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP02\\15_25-RNP02_ZERO.csv");
//		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
//		FileWriter arquivoUM = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP02\\15_25-RNP02_UM.csv");
//		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
//		FileWriter arquivoDOIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP02\\15_25-RNP02_DOIS.csv");
//		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
//		FileWriter arquivoTRES = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP02\\15_25-RNP02_TRES.csv");
//		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
//		FileWriter arquivoQUATRO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP02\\15_25-RNP02_QUATRO.csv");
//		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP02\\15_25-RNP02_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP02\\15_25-RNP02_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP02\\15_25-RNP02_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
//		FileWriter arquivoOITO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP02\\15_25-RNP02_OITO.csv");
//		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
//		FileWriter arquivoNOVE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP02\\15_25-RNP02_NOVE.csv");
//		PrintWriter gravarArquivoNOVE = new PrintWriter(arquivoNOVE);
		
		int cont = 0;
		int contlinha = 0;
		int zero = 0;
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int cinco = 0;
		int seis = 0;
		int sete = 0;
		int oito = 0;
		int nove = 0;
		URL resultado1525 = Combinacoes1526_JogoRNP07_2025.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP02\\15_25-RNP02.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				cont++;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
					}
				}

//				if (contlinha == NumeroEnum.ZERO.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoZERO.printf("%s%n", lista);
//					zero++;
//				} else if (contlinha == NumeroEnum.UM.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoUM.printf("%s%n", lista);
//					um++;
//				} else if (contlinha == NumeroEnum.DOIS.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoDOIS.printf("%s%n", lista);
//					dois++;
//				} else if (contlinha == NumeroEnum.TRES.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoTRES.printf("%s%n", lista);
//					tres++;
//				} else if (contlinha == NumeroEnum.QUATRO.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoQUATRO.printf("%s%n", lista);
//					quatro++;
//				} else 
				if (contlinha == NumeroEnum.CINCO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoCINCO.printf("%s%n", lista);
					cinco++;
				} else if (contlinha == NumeroEnum.SEIS.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSEIS.printf("%s%n", lista);
					seis++;
				} else if (contlinha == NumeroEnum.SETE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSETE.printf("%s%n", lista);
					sete++;
				} 
//				else if (contlinha == NumeroEnum.OITO.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoOITO.printf("%s%n", lista);
//					oito++;
//				} else if (contlinha == NumeroEnum.NOVE.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoNOVE.printf("%s%n", lista);
//					nove++;
//				}

			}
			
//			arquivoZERO.close();
//			gravarArquivoZERO.close();
//			arquivoUM.close();
//			gravarArquivoUM.close();
//			arquivoDOIS.close();
//			gravarArquivoDOIS.close();
//			arquivoTRES.close();
//			gravarArquivoTRES.close();
//			arquivoQUATRO.close();
//			gravarArquivoQUATRO.close();
			arquivoCINCO.close();
			gravarArquivoCINCO.close();
			arquivoSEIS.close();
			gravarArquivoSEIS.close();
			arquivoSETE.close();
			gravarArquivoSETE.close();
//			arquivoOITO.close();
//			gravarArquivoOITO.close();
//			arquivoNOVE.close();
//			gravarArquivoNOVE.close();
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP02] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP02: " + cont);
		System.out.println("ZERO: " + zero);
		System.out.println("UM: " + um);
		System.out.println("DOIS: " + dois);
		System.out.println("TRES: " + tres);
		System.out.println("QUATRO: " + quatro);
		System.out.println("CINCO: " + cinco);
		System.out.println("SEIS: " + seis);
		System.out.println("SETE: " + sete);
		System.out.println("OITO: " + oito);
		System.out.println("NOVE: " + nove);
		
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp03
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP03() throws URISyntaxException, IOException, LotoException  {
		FileWriter arquivoRNP03 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP03.csv");
		PrintWriter gravarArquivoRNP03 = new PrintWriter(arquivoRNP03);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 21, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP03 rnp03 = new RNP03();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp03.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP03.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP03.close();
		gravarArquivoRNP03.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP03: " + cont);
		return lista1525;
	}

	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP03() throws URISyntaxException, IOException, LotoException {
		
//		FileWriter arquivoZERO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03_ZERO.csv");
//		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
//		FileWriter arquivoUM = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03_UM.csv");
//		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
//		FileWriter arquivoDOIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03_DOIS.csv");
//		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
//		FileWriter arquivoTRES = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03_TRES.csv");
//		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
//		FileWriter arquivoNOVE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03_NOVE.csv");
//		PrintWriter gravarArquivoNOVE = new PrintWriter(arquivoNOVE);
		
		int cont = 0;
		int contlinha = 0;
		int zero = 0;
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int cinco = 0;
		int seis = 0;
		int sete = 0;
		int oito = 0;
		int nove = 0;
		URL resultado1525 = Combinacoes1526_JogoRNP07_2025.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				cont++;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
					}
				}

//				if (contlinha == NumeroEnum.ZERO.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoZERO.printf("%s%n", lista);
//					zero++;
//				} else if (contlinha == NumeroEnum.UM.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoUM.printf("%s%n", lista);
//					um++;
//				} else if (contlinha == NumeroEnum.DOIS.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoDOIS.printf("%s%n", lista);
//					dois++;
//				} else if (contlinha == NumeroEnum.TRES.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoTRES.printf("%s%n", lista);
//					tres++;
//				} else 
				if (contlinha == NumeroEnum.QUATRO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoQUATRO.printf("%s%n", lista);
					quatro++;
				} else if (contlinha == NumeroEnum.CINCO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoCINCO.printf("%s%n", lista);
					cinco++;
				} else if (contlinha == NumeroEnum.SEIS.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSEIS.printf("%s%n", lista);
					seis++;
				} else if (contlinha == NumeroEnum.SETE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSETE.printf("%s%n", lista);
					sete++;
				} else if (contlinha == NumeroEnum.OITO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoOITO.printf("%s%n", lista);
					oito++;
				} 
//				else if (contlinha == NumeroEnum.NOVE.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoNOVE.printf("%s%n", lista);
//					nove++;
//				}

			}
			
//			arquivoZERO.close();
//			gravarArquivoZERO.close();
//			arquivoUM.close();
//			gravarArquivoUM.close();
//			arquivoDOIS.close();
//			gravarArquivoDOIS.close();
//			arquivoTRES.close();
//			gravarArquivoTRES.close();
			arquivoQUATRO.close();
			gravarArquivoQUATRO.close();
			arquivoCINCO.close();
			gravarArquivoCINCO.close();
			arquivoSEIS.close();
			gravarArquivoSEIS.close();
			arquivoSETE.close();
			gravarArquivoSETE.close();
			arquivoOITO.close();
			gravarArquivoOITO.close();
//			arquivoNOVE.close();
//			gravarArquivoNOVE.close();
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP03] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP03: " + cont);
		System.out.println("ZERO: " + zero);
		System.out.println("UM: " + um);
		System.out.println("DOIS: " + dois);
		System.out.println("TRES: " + tres);
		System.out.println("QUATRO: " + quatro);
		System.out.println("CINCO: " + cinco);
		System.out.println("SEIS: " + seis);
		System.out.println("SETE: " + sete);
		System.out.println("OITO: " + oito);
		System.out.println("NOVE: " + nove);
		
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp04
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP04() throws URISyntaxException, IOException, LotoException  {
		FileWriter arquivoRNP04 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP04.csv");
		PrintWriter gravarArquivoRNP04 = new PrintWriter(arquivoRNP04);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 21, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP04 rnp04 = new RNP04();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp04.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP04.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP04.close();
		gravarArquivoRNP04.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP04: " + cont);
		return lista1525;
	}
	
	
	
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP04() throws URISyntaxException, IOException, LotoException {
		
//		FileWriter arquivoZERO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04_ZERO.csv");
//		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
//		FileWriter arquivoUM = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04_UM.csv");
//		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
//		FileWriter arquivoDOIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04_DOIS.csv");
//		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04_NOVE.csv");
		PrintWriter gravarArquivoNOVE = new PrintWriter(arquivoNOVE);
		
		int cont = 0;
		int contlinha = 0;
		int zero = 0;
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int cinco = 0;
		int seis = 0;
		int sete = 0;
		int oito = 0;
		int nove = 0;
		URL resultado1525 = Combinacoes1526_JogoRNP07_2025.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				cont++;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
					}
				}

//				if (contlinha == NumeroEnum.ZERO.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoZERO.printf("%s%n", lista);
//					zero++;
//				} else if (contlinha == NumeroEnum.UM.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoUM.printf("%s%n", lista);
//					um++;
//				} else if (contlinha == NumeroEnum.DOIS.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoDOIS.printf("%s%n", lista);
//					dois++;
//				} else 
				if (contlinha == NumeroEnum.TRES.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoTRES.printf("%s%n", lista);
					tres++;
				} else if (contlinha == NumeroEnum.QUATRO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoQUATRO.printf("%s%n", lista);
					quatro++;
				} else if (contlinha == NumeroEnum.CINCO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoCINCO.printf("%s%n", lista);
					cinco++;
				} else if (contlinha == NumeroEnum.SEIS.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSEIS.printf("%s%n", lista);
					seis++;
				} else if (contlinha == NumeroEnum.SETE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSETE.printf("%s%n", lista);
					sete++;
				} else if (contlinha == NumeroEnum.OITO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoOITO.printf("%s%n", lista);
					oito++;
				} else if (contlinha == NumeroEnum.NOVE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoNOVE.printf("%s%n", lista);
					nove++;
				}

			}
			
//			arquivoZERO.close();
//			gravarArquivoZERO.close();
//			arquivoUM.close();
//			gravarArquivoUM.close();
//			arquivoDOIS.close();
//			gravarArquivoDOIS.close();
			arquivoTRES.close();
			gravarArquivoTRES.close();
			arquivoQUATRO.close();
			gravarArquivoQUATRO.close();
			arquivoCINCO.close();
			gravarArquivoCINCO.close();
			arquivoSEIS.close();
			gravarArquivoSEIS.close();
			arquivoSETE.close();
			gravarArquivoSETE.close();
			arquivoOITO.close();
			gravarArquivoOITO.close();
			arquivoNOVE.close();
			gravarArquivoNOVE.close();
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP04] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP04: " + cont);
		System.out.println("ZERO: " + zero);
		System.out.println("UM: " + um);
		System.out.println("DOIS: " + dois);
		System.out.println("TRES: " + tres);
		System.out.println("QUATRO: " + quatro);
		System.out.println("CINCO: " + cinco);
		System.out.println("SEIS: " + seis);
		System.out.println("SETE: " + sete);
		System.out.println("OITO: " + oito);
		System.out.println("NOVE: " + nove);
		
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP05() throws URISyntaxException, IOException, LotoException  {
		FileWriter arquivoRNP05 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP05.csv");
		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 21, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP05 rnp05 = new RNP05();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp05.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP05.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP05.close();
		gravarArquivoRNP05.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP05: " + cont);
		return lista1525;
	}
	
	
	
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP05() throws URISyntaxException, IOException, LotoException {

//		FileWriter arquivoDOIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05_ZERO.csv");
//		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
//		FileWriter arquivoTRES = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05_UM.csv");
//		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP05_DOIS.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP05_TRES.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP05_QUATRO.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP05_CINCO.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP05_SEIS.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP05_SETE.csv");
		PrintWriter gravarArquivoNOVE = new PrintWriter(arquivoNOVE);
		
		int cont = 0;
		int contlinha = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int cinco = 0;
		int seis = 0;
		int sete = 0;
		int oito = 0;
		int nove = 0;
		URL resultado1525 = Combinacoes1526_JogoRNP07_2025.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP05.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				cont++;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
					}
				}

//				if (contlinha == NumeroEnum.DOIS.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoDOIS.printf("%s%n", lista);
//					dois++;
//				} else if (contlinha == NumeroEnum.TRES.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoTRES.printf("%s%n", lista);
//					tres++;
//				} else 
				if (contlinha == NumeroEnum.QUATRO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoQUATRO.printf("%s%n", lista);
					quatro++;
				} else if (contlinha == NumeroEnum.CINCO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoCINCO.printf("%s%n", lista);
					cinco++;
				} else if (contlinha == NumeroEnum.SEIS.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSEIS.printf("%s%n", lista);
					seis++;
				} else if (contlinha == NumeroEnum.SETE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSETE.printf("%s%n", lista);
					sete++;
				} else if (contlinha == NumeroEnum.OITO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoOITO.printf("%s%n", lista);
					oito++;
				} else if (contlinha == NumeroEnum.NOVE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoNOVE.printf("%s%n", lista);
					nove++;
				}

			}
			
//			arquivoDOIS.close();
//			gravarArquivoDOIS.close();
//			arquivoTRES.close();
//			gravarArquivoTRES.close();
			arquivoQUATRO.close();
			gravarArquivoQUATRO.close();
			arquivoCINCO.close();
			gravarArquivoCINCO.close();
			arquivoSEIS.close();
			gravarArquivoSEIS.close();
			arquivoSETE.close();
			gravarArquivoSETE.close();
			arquivoOITO.close();
			gravarArquivoOITO.close();
			arquivoNOVE.close();
			gravarArquivoNOVE.close();
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP05] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP05: " + cont);
		System.out.println("DOIS: " + dois);
		System.out.println("TRES: " + tres);
		System.out.println("QUATRO: " + quatro);
		System.out.println("CINCO: " + cinco);
		System.out.println("SEIS: " + seis);
		System.out.println("SETE: " + sete);
		System.out.println("OITO: " + oito);
		System.out.println("NOVE: " + nove);
		
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp06
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP06() throws URISyntaxException, IOException, LotoException  {
		FileWriter arquivoRNP06 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP06.csv");
		PrintWriter gravarArquivoRNP06 = new PrintWriter(arquivoRNP06);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 21, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP06 rnp06 = new RNP06();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp06.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP06.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP06.close();
		gravarArquivoRNP06.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP06: " + cont);
		return lista1525;
	}
	
	
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP06() throws URISyntaxException, IOException, LotoException {
		
//		FileWriter arquivoZERO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_ZERO.csv");
//		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
		FileWriter arquivoUM = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_UM.csv");
		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
		FileWriter arquivoDOIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_DOIS.csv");
		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06_NOVE.csv");
		PrintWriter gravarArquivoNOVE = new PrintWriter(arquivoNOVE);
		
		int cont = 0;
		int contlinha = 0;
		int zero = 0;
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int cinco = 0;
		int seis = 0;
		int sete = 0;
		int oito = 0;
		int nove = 0;
		URL resultado1525 = Combinacoes1526_JogoRNP07_2025.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				cont++;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
					}
				}

//				if (contlinha == NumeroEnum.ZERO.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoZERO.printf("%s%n", lista);
//					zero++;
//				} else 
				if (contlinha == NumeroEnum.UM.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoUM.printf("%s%n", lista);
					um++;
				} else if (contlinha == NumeroEnum.DOIS.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoDOIS.printf("%s%n", lista);
					dois++;
				} else if (contlinha == NumeroEnum.TRES.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoTRES.printf("%s%n", lista);
					tres++;
				} else if (contlinha == NumeroEnum.QUATRO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoQUATRO.printf("%s%n", lista);
					quatro++;
				} else if (contlinha == NumeroEnum.CINCO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoCINCO.printf("%s%n", lista);
					cinco++;
				} else if (contlinha == NumeroEnum.SEIS.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSEIS.printf("%s%n", lista);
					seis++;
				} else if (contlinha == NumeroEnum.SETE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSETE.printf("%s%n", lista);
					sete++;
				} else if (contlinha == NumeroEnum.OITO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoOITO.printf("%s%n", lista);
					oito++;
				} else if (contlinha == NumeroEnum.NOVE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoNOVE.printf("%s%n", lista);
					nove++;
				}

			}
			
//			arquivoZERO.close();
//			gravarArquivoZERO.close();
			arquivoUM.close();
			gravarArquivoUM.close();
			arquivoDOIS.close();
			gravarArquivoDOIS.close();
			arquivoTRES.close();
			gravarArquivoTRES.close();
			arquivoQUATRO.close();
			gravarArquivoQUATRO.close();
			arquivoCINCO.close();
			gravarArquivoCINCO.close();
			arquivoSEIS.close();
			gravarArquivoSEIS.close();
			arquivoSETE.close();
			gravarArquivoSETE.close();
			arquivoOITO.close();
			gravarArquivoOITO.close();
			arquivoNOVE.close();
			gravarArquivoNOVE.close();
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP06] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP06: " + cont);
		System.out.println("ZERO: " + zero);
		System.out.println("UM: " + um);
		System.out.println("DOIS: " + dois);
		System.out.println("TRES: " + tres);
		System.out.println("QUATRO: " + quatro);
		System.out.println("CINCO: " + cinco);
		System.out.println("SEIS: " + seis);
		System.out.println("SETE: " + sete);
		System.out.println("OITO: " + oito);
		System.out.println("NOVE: " + nove);
		
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp07
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP07() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivoRNP07 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP07.csv");
		PrintWriter gravarArquivoRNP07 = new PrintWriter(arquivoRNP07);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 21, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP07 rnp07 = new RNP07();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp07.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP07.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP07.close();
		gravarArquivoRNP07.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP07: " + cont);
		return lista1525;
	}
	
	
	
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP07() throws URISyntaxException, IOException, LotoException {
		
		FileWriter arquivoZERO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP07_ZERO.csv");
		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
		FileWriter arquivoUM = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP07_UM.csv");
		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
		FileWriter arquivoDOIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP07_DOIS.csv");
		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP07_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP07_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP07_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP07_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP07_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP07_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP07_NOVE.csv");
		PrintWriter gravarArquivoNOVE = new PrintWriter(arquivoNOVE);
		
		int cont = 0;
		int contlinha = 0;
		int zero = 0;
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int cinco = 0;
		int seis = 0;
		int sete = 0;
		int oito = 0;
		int nove = 0;
		URL resultado1525 = Combinacoes1526_JogoRNP07_2025.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP07.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				cont++;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
					}
				}

				if (contlinha == NumeroEnum.ZERO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoZERO.printf("%s%n", lista);
					zero++;
				} else if (contlinha == NumeroEnum.UM.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoUM.printf("%s%n", lista);
					um++;
				} else if (contlinha == NumeroEnum.DOIS.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoDOIS.printf("%s%n", lista);
					dois++;
				} else if (contlinha == NumeroEnum.TRES.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoTRES.printf("%s%n", lista);
					tres++;
				} else if (contlinha == NumeroEnum.QUATRO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoQUATRO.printf("%s%n", lista);
					quatro++;
				} else if (contlinha == NumeroEnum.CINCO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoCINCO.printf("%s%n", lista);
					cinco++;
				} else if (contlinha == NumeroEnum.SEIS.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSEIS.printf("%s%n", lista);
					seis++;
				} else if (contlinha == NumeroEnum.SETE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSETE.printf("%s%n", lista);
					sete++;
				} else if (contlinha == NumeroEnum.OITO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoOITO.printf("%s%n", lista);
					oito++;
				} else if (contlinha == NumeroEnum.NOVE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoNOVE.printf("%s%n", lista);
					nove++;
				}

			}
			
			arquivoZERO.close();
			gravarArquivoZERO.close();
			arquivoUM.close();
			gravarArquivoUM.close();
			arquivoDOIS.close();
			gravarArquivoDOIS.close();
			arquivoTRES.close();
			gravarArquivoTRES.close();
			arquivoQUATRO.close();
			gravarArquivoQUATRO.close();
			arquivoCINCO.close();
			gravarArquivoCINCO.close();
			arquivoSEIS.close();
			gravarArquivoSEIS.close();
			arquivoSETE.close();
			gravarArquivoSETE.close();
			arquivoOITO.close();
			gravarArquivoOITO.close();
			arquivoNOVE.close();
			gravarArquivoNOVE.close();
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP07] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP07: " + cont);
		System.out.println("ZERO: " + zero);
		System.out.println("UM: " + um);
		System.out.println("DOIS: " + dois);
		System.out.println("TRES: " + tres);
		System.out.println("QUATRO: " + quatro);
		System.out.println("CINCO: " + cinco);
		System.out.println("SEIS: " + seis);
		System.out.println("SETE: " + sete);
		System.out.println("OITO: " + oito);
		System.out.println("NOVE: " + nove);
		
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp08
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivoRNP08 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP08.csv");
		PrintWriter gravarArquivoRNP08 = new PrintWriter(arquivoRNP08);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 21, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP08 rnp08 = new RNP08();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp08.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP08.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP08.close();
		gravarArquivoRNP08.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP08() throws URISyntaxException, IOException, LotoException {
		
		FileWriter arquivoZERO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_ZERO.csv");
		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
		FileWriter arquivoUM = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_UM.csv");
		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
		FileWriter arquivoDOIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_DOIS.csv");
		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08_NOVE.csv");
		PrintWriter gravarArquivoNOVE = new PrintWriter(arquivoNOVE);
		
		int cont = 0;
		int contlinha = 0;
		int zero = 0;
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int cinco = 0;
		int seis = 0;
		int sete = 0;
		int oito = 0;
		int nove = 0;
		URL resultado1525 = Combinacoes1526_JogoRNP07_2025.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				cont++;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
					}
				}

				if (contlinha == NumeroEnum.ZERO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoZERO.printf("%s%n", lista);
					zero++;
				} else if (contlinha == NumeroEnum.UM.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoUM.printf("%s%n", lista);
					um++;
				} else if (contlinha == NumeroEnum.DOIS.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoDOIS.printf("%s%n", lista);
					dois++;
				} else if (contlinha == NumeroEnum.TRES.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoTRES.printf("%s%n", lista);
					tres++;
				} else if (contlinha == NumeroEnum.QUATRO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoQUATRO.printf("%s%n", lista);
					quatro++;
				} else if (contlinha == NumeroEnum.CINCO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoCINCO.printf("%s%n", lista);
					cinco++;
				} else if (contlinha == NumeroEnum.SEIS.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSEIS.printf("%s%n", lista);
					seis++;
				} else if (contlinha == NumeroEnum.SETE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSETE.printf("%s%n", lista);
					sete++;
				} else if (contlinha == NumeroEnum.OITO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoOITO.printf("%s%n", lista);
					oito++;
				} else if (contlinha == NumeroEnum.NOVE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoNOVE.printf("%s%n", lista);
					nove++;
				}

			}
			
			arquivoZERO.close();
			gravarArquivoZERO.close();
			arquivoUM.close();
			gravarArquivoUM.close();
			arquivoDOIS.close();
			gravarArquivoDOIS.close();
			arquivoTRES.close();
			gravarArquivoTRES.close();
			arquivoQUATRO.close();
			gravarArquivoQUATRO.close();
			arquivoCINCO.close();
			gravarArquivoCINCO.close();
			arquivoSEIS.close();
			gravarArquivoSEIS.close();
			arquivoSETE.close();
			gravarArquivoSETE.close();
			arquivoOITO.close();
			gravarArquivoOITO.close();
			arquivoNOVE.close();
			gravarArquivoNOVE.close();
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP08] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08: " + cont);
		System.out.println("ZERO: " + zero);
		System.out.println("UM: " + um);
		System.out.println("DOIS: " + dois);
		System.out.println("TRES: " + tres);
		System.out.println("QUATRO: " + quatro);
		System.out.println("CINCO: " + cinco);
		System.out.println("SEIS: " + seis);
		System.out.println("SETE: " + sete);
		System.out.println("OITO: " + oito);
		System.out.println("NOVE: " + nove);
		
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp09
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP09() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivoRNP09 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP09.csv");
		PrintWriter gravarArquivoRNP09 = new PrintWriter(arquivoRNP09);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 21, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP09 rnp09 = new RNP09();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp09.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP09.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP09.close();
		gravarArquivoRNP09.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP09: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP09() throws URISyntaxException, IOException, LotoException {
		
//		FileWriter arquivoZERO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_ZERO.csv");
//		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
		FileWriter arquivoUM = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_UM.csv");
		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
		FileWriter arquivoDOIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_DOIS.csv");
		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09_NOVE.csv");
		PrintWriter gravarArquivoNOVE = new PrintWriter(arquivoNOVE);
		
		int cont = 0;
		int contlinha = 0;
		int zero = 0;
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int cinco = 0;
		int seis = 0;
		int sete = 0;
		int oito = 0;
		int nove = 0;
		URL resultado1525 = Combinacoes1526_JogoRNP07_2025.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				cont++;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
					}
				}

//				if (contlinha == NumeroEnum.ZERO.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoZERO.printf("%s%n", lista);
//					zero++;
//				} else 
				if (contlinha == NumeroEnum.UM.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoUM.printf("%s%n", lista);
					um++;
				} else if (contlinha == NumeroEnum.DOIS.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoDOIS.printf("%s%n", lista);
					dois++;
				} else if (contlinha == NumeroEnum.TRES.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoTRES.printf("%s%n", lista);
					tres++;
				} else if (contlinha == NumeroEnum.QUATRO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoQUATRO.printf("%s%n", lista);
					quatro++;
				} else if (contlinha == NumeroEnum.CINCO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoCINCO.printf("%s%n", lista);
					cinco++;
				} else if (contlinha == NumeroEnum.SEIS.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSEIS.printf("%s%n", lista);
					seis++;
				} else if (contlinha == NumeroEnum.SETE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSETE.printf("%s%n", lista);
					sete++;
				} else if (contlinha == NumeroEnum.OITO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoOITO.printf("%s%n", lista);
					oito++;
				} else if (contlinha == NumeroEnum.NOVE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoNOVE.printf("%s%n", lista);
					nove++;
				}

			}
			
//			arquivoZERO.close();
//			gravarArquivoZERO.close();
			arquivoUM.close();
			gravarArquivoUM.close();
			arquivoDOIS.close();
			gravarArquivoDOIS.close();
			arquivoTRES.close();
			gravarArquivoTRES.close();
			arquivoQUATRO.close();
			gravarArquivoQUATRO.close();
			arquivoCINCO.close();
			gravarArquivoCINCO.close();
			arquivoSEIS.close();
			gravarArquivoSEIS.close();
			arquivoSETE.close();
			gravarArquivoSETE.close();
			arquivoOITO.close();
			gravarArquivoOITO.close();
			arquivoNOVE.close();
			gravarArquivoNOVE.close();
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP09] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP09: " + cont);
		System.out.println("ZERO: " + zero);
		System.out.println("UM: " + um);
		System.out.println("DOIS: " + dois);
		System.out.println("TRES: " + tres);
		System.out.println("QUATRO: " + quatro);
		System.out.println("CINCO: " + cinco);
		System.out.println("SEIS: " + seis);
		System.out.println("SETE: " + sete);
		System.out.println("OITO: " + oito);
		System.out.println("NOVE: " + nove);
		
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp10
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP10() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivoRNP10 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP10.csv");
		PrintWriter gravarArquivoRNP10 = new PrintWriter(arquivoRNP10);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 21, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP10 rnp10 = new RNP10();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp10.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP10.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP10.close();
		gravarArquivoRNP10.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP10: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP10() throws URISyntaxException, IOException, LotoException {
		
//		FileWriter arquivoZERO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10_ZERO.csv");
//		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
//		FileWriter arquivoUM = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10_UM.csv");
//		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
		FileWriter arquivoDOIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10_DOIS.csv");
		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10_NOVE.csv");
		PrintWriter gravarArquivoNOVE = new PrintWriter(arquivoNOVE);
		
		int cont = 0;
		int contlinha = 0;
		int zero = 0;
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int cinco = 0;
		int seis = 0;
		int sete = 0;
		int oito = 0;
		int nove = 0;
		URL resultado1525 = Combinacoes1526_JogoRNP07_2025.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				cont++;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
					}
				}

//				if (contlinha == NumeroEnum.ZERO.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoZERO.printf("%s%n", lista);
//					zero++;
//				} else if (contlinha == NumeroEnum.UM.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoUM.printf("%s%n", lista);
//					um++;
//				} else 
				if (contlinha == NumeroEnum.DOIS.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoDOIS.printf("%s%n", lista);
					dois++;
				} else if (contlinha == NumeroEnum.TRES.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoTRES.printf("%s%n", lista);
					tres++;
				} else if (contlinha == NumeroEnum.QUATRO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoQUATRO.printf("%s%n", lista);
					quatro++;
				} else if (contlinha == NumeroEnum.CINCO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoCINCO.printf("%s%n", lista);
					cinco++;
				} else if (contlinha == NumeroEnum.SEIS.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSEIS.printf("%s%n", lista);
					seis++;
				} else if (contlinha == NumeroEnum.SETE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSETE.printf("%s%n", lista);
					sete++;
				} else if (contlinha == NumeroEnum.OITO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoOITO.printf("%s%n", lista);
					oito++;
				} else if (contlinha == NumeroEnum.NOVE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoNOVE.printf("%s%n", lista);
					nove++;
				}

			}
			
//			arquivoZERO.close();
//			gravarArquivoZERO.close();
//			arquivoUM.close();
//			gravarArquivoUM.close();
			arquivoDOIS.close();
			gravarArquivoDOIS.close();
			arquivoTRES.close();
			gravarArquivoTRES.close();
			arquivoQUATRO.close();
			gravarArquivoQUATRO.close();
			arquivoCINCO.close();
			gravarArquivoCINCO.close();
			arquivoSEIS.close();
			gravarArquivoSEIS.close();
			arquivoSETE.close();
			gravarArquivoSETE.close();
			arquivoOITO.close();
			gravarArquivoOITO.close();
			arquivoNOVE.close();
			gravarArquivoNOVE.close();
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP10] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP10: " + cont);
		System.out.println("ZERO: " + zero);
		System.out.println("UM: " + um);
		System.out.println("DOIS: " + dois);
		System.out.println("TRES: " + tres);
		System.out.println("QUATRO: " + quatro);
		System.out.println("CINCO: " + cinco);
		System.out.println("SEIS: " + seis);
		System.out.println("SETE: " + sete);
		System.out.println("OITO: " + oito);
		System.out.println("NOVE: " + nove);
		
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp11
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP11() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivoRNP11 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP11.csv");
		PrintWriter gravarArquivoRNP11 = new PrintWriter(arquivoRNP11);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 21, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP11 rnp11 = new RNP11();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp11.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP11.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP11.close();
		gravarArquivoRNP11.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP11: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP11() throws URISyntaxException, IOException, LotoException {
		
//		FileWriter arquivoZERO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11_ZERO.csv");
//		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
//		FileWriter arquivoUM = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11_UM.csv");
//		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
//		FileWriter arquivoDOIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11_DOIS.csv");
//		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
//		FileWriter arquivoNOVE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11_NOVE.csv");
//		PrintWriter gravarArquivoNOVE = new PrintWriter(arquivoNOVE);
		
		int cont = 0;
		int contlinha = 0;
		int zero = 0;
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int cinco = 0;
		int seis = 0;
		int sete = 0;
		int oito = 0;
		int nove = 0;
		URL resultado1525 = Combinacoes1526_JogoRNP07_2025.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				cont++;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
					}
				}

//				if (contlinha == NumeroEnum.ZERO.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoZERO.printf("%s%n", lista);
//					zero++;
//				} else if (contlinha == NumeroEnum.UM.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoUM.printf("%s%n", lista);
//					um++;
//				} else if (contlinha == NumeroEnum.DOIS.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoDOIS.printf("%s%n", lista);
//					dois++;
//				} else 
				if (contlinha == NumeroEnum.TRES.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoTRES.printf("%s%n", lista);
					tres++;
				} else if (contlinha == NumeroEnum.QUATRO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoQUATRO.printf("%s%n", lista);
					quatro++;
				} else if (contlinha == NumeroEnum.CINCO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoCINCO.printf("%s%n", lista);
					cinco++;
				} else if (contlinha == NumeroEnum.SEIS.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSEIS.printf("%s%n", lista);
					seis++;
				} else if (contlinha == NumeroEnum.SETE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSETE.printf("%s%n", lista);
					sete++;
				} else if (contlinha == NumeroEnum.OITO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoOITO.printf("%s%n", lista);
					oito++;
				} 
//				else if (contlinha == NumeroEnum.NOVE.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoNOVE.printf("%s%n", lista);
//					nove++;
//				}

			}
			
//			arquivoZERO.close();
//			gravarArquivoZERO.close();
//			arquivoUM.close();
//			gravarArquivoUM.close();
//			arquivoDOIS.close();
//			gravarArquivoDOIS.close();
			arquivoTRES.close();
			gravarArquivoTRES.close();
			arquivoQUATRO.close();
			gravarArquivoQUATRO.close();
			arquivoCINCO.close();
			gravarArquivoCINCO.close();
			arquivoSEIS.close();
			gravarArquivoSEIS.close();
			arquivoSETE.close();
			gravarArquivoSETE.close();
			arquivoOITO.close();
			gravarArquivoOITO.close();
//			arquivoNOVE.close();
//			gravarArquivoNOVE.close();
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP11] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP11: " + cont);
		System.out.println("ZERO: " + zero);
		System.out.println("UM: " + um);
		System.out.println("DOIS: " + dois);
		System.out.println("TRES: " + tres);
		System.out.println("QUATRO: " + quatro);
		System.out.println("CINCO: " + cinco);
		System.out.println("SEIS: " + seis);
		System.out.println("SETE: " + sete);
		System.out.println("OITO: " + oito);
		System.out.println("NOVE: " + nove);
		
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp12
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP12() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivoRNP12 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\jogo_rnp07\\15_25-RNP12.csv");
		PrintWriter gravarArquivoRNP12 = new PrintWriter(arquivoRNP12);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 21, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP12 rnp12 = new RNP12();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp12.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP12.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP12.close();
		gravarArquivoRNP12.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP12: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP12() throws URISyntaxException, IOException, LotoException {
		
//		FileWriter arquivoZERO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP12\\15_25-RNP12_ZERO.csv");
//		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
//		FileWriter arquivoUM = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP12\\15_25-RNP12_UM.csv");
//		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
//		FileWriter arquivoDOIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP12\\15_25-RNP12_DOIS.csv");
//		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
//		FileWriter arquivoTRES = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP12\\15_25-RNP12_TRES.csv");
//		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP12\\15_25-RNP12_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP12\\15_25-RNP12_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP12\\15_25-RNP12_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP12\\15_25-RNP12_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
//		FileWriter arquivoOITO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP12\\15_25-RNP12_OITO.csv");
//		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
//		FileWriter arquivoNOVE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP12\\15_25-RNP12_NOVE.csv");
//		PrintWriter gravarArquivoNOVE = new PrintWriter(arquivoNOVE);
		
		int cont = 0;
		int contlinha = 0;
		int zero = 0;
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int cinco = 0;
		int seis = 0;
		int sete = 0;
		int oito = 0;
		int nove = 0;
		URL resultado1525 = Combinacoes1526_JogoRNP07_2025.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP12\\15_25-RNP12.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				cont++;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
					}
				}

//				if (contlinha == NumeroEnum.ZERO.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoZERO.printf("%s%n", lista);
//					zero++;
//				} else if (contlinha == NumeroEnum.UM.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoUM.printf("%s%n", lista);
//					um++;
//				} else if (contlinha == NumeroEnum.DOIS.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoDOIS.printf("%s%n", lista);
//					dois++;
//				} else if (contlinha == NumeroEnum.TRES.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoTRES.printf("%s%n", lista);
//					tres++;
//				} else 
				if (contlinha == NumeroEnum.QUATRO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoQUATRO.printf("%s%n", lista);
					quatro++;
				} else if (contlinha == NumeroEnum.CINCO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoCINCO.printf("%s%n", lista);
					cinco++;
				} else if (contlinha == NumeroEnum.SEIS.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSEIS.printf("%s%n", lista);
					seis++;
				} else if (contlinha == NumeroEnum.SETE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSETE.printf("%s%n", lista);
					sete++;
				} 
//				else if (contlinha == NumeroEnum.OITO.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoOITO.printf("%s%n", lista);
//					oito++;
//				} else if (contlinha == NumeroEnum.NOVE.getValor()) {
//					String lista = null;
//					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
//							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
//							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
//							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
//							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
//					gravarArquivoNOVE.printf("%s%n", lista);
//					nove++;
//				}

			}
			
//			arquivoZERO.close();
//			gravarArquivoZERO.close();
//			arquivoUM.close();
//			gravarArquivoUM.close();
//			arquivoDOIS.close();
//			gravarArquivoDOIS.close();
//			arquivoTRES.close();
//			gravarArquivoTRES.close();
			arquivoQUATRO.close();
			gravarArquivoQUATRO.close();
			arquivoCINCO.close();
			gravarArquivoCINCO.close();
			arquivoSEIS.close();
			gravarArquivoSEIS.close();
			arquivoSETE.close();
			gravarArquivoSETE.close();
//			arquivoOITO.close();
//			gravarArquivoOITO.close();
//			arquivoNOVE.close();
//			gravarArquivoNOVE.close();
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP12] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP12: " + cont);
		System.out.println("ZERO: " + zero);
		System.out.println("UM: " + um);
		System.out.println("DOIS: " + dois);
		System.out.println("TRES: " + tres);
		System.out.println("QUATRO: " + quatro);
		System.out.println("CINCO: " + cinco);
		System.out.println("SEIS: " + seis);
		System.out.println("SETE: " + sete);
		System.out.println("OITO: " + oito);
		System.out.println("NOVE: " + nove);
		
	}
	

}

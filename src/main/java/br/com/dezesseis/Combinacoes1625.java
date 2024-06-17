package br.com.dezesseis;

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

import br.com.combinacoes.Combinacoes;
import br.com.enumerador.NumeroEnum;
import br.com.excecao.LotoException;
import br.com.regras.pares.RNP03;
import br.com.regras.pares.RNP04;
import br.com.regras.pares.RNP05;
import br.com.regras.pares.RNP06;
import br.com.regras.pares.RNP07;
import br.com.regras.pares.RNP08;
import br.com.regras.pares.RNP09;
import br.com.regras.pares.RNP10;
import br.com.regras.pares.RNP11;
import br.com.regras.pares.RNP12;
import br.com.regras.sequencia.RNS0105;
import br.com.regras.sequencia.RNS0610;
import br.com.regras.sequencia.RNS1115;
import br.com.regras.sequencia.RNS1620;
import br.com.regras.sequencia.RNS2125;

public class Combinacoes1625 {
	
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		
		Combinacoes1625 combinacoes1525 = new Combinacoes1625();
		
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		
		combinacoes1525.gerar1625(str);
		combinacoes1525.gerar1625SEMRNS(str);
//		List<String> listaCombinacoes1725 = combinacoes1525.gerar1725();
//		List<String> listaCombinacoes1825 = combinacoes1525.gerar1825();
//		List<String> listaCombinacoes1925 = combinacoes1525.gerar1925();
//		List<String> listaCombinacoes2025 = combinacoes1525.gerar2025();
		
		
//		combinacoes1525.gerar1625RNP03(str);
//		combinacoes1525.gerar1625RNP03SEMRNS(str);
//		combinacoes1525.resultadoNumerosMenorQueDezRNP03();
		
//		List<String> listaCombinacoesRNP03RNS0105 = combinacoes1525.gerar1525RNP03RNS0105();
//		System.out.println("RNP03RNS0105: " + listaCombinacoesRNP03RNS0105.size());
//		List<String> listaCombinacoesRNP03RNS0610 = combinacoes1525.gerar1525RNP03RNS0610();
//		System.out.println("RNP03RNS0610: " + listaCombinacoesRNP03RNS0610.size());
//		List<String> listaCombinacoesRNP03RNS1115 = combinacoes1525.gerar1525RNP03RNS1115();
//		System.out.println("RNP03RNS1115: " + listaCombinacoesRNP03RNS1115.size());
//		List<String> listaCombinacoesRNP03RNS1620 = combinacoes1525.gerar1525RNP03RNS1620();
//		System.out.println("RNP03RNS1620: " + listaCombinacoesRNP03RNS1620.size());
//		List<String> listaCombinacoesRNP03RNS2125 = combinacoes1525.gerar1525RNP03RNS2125();
//		System.out.println("RNP03RNS2125: " + listaCombinacoesRNP03RNS2125.size());
		
//		combinacoes1525.gerar1625RNP04(str);
//		combinacoes1525.gerar1625RNP04SEMRNS(str);
//		System.out.println("RNP04: " + listaCombinacoesRNP04.size());
//		combinacoes1525.resultadoNumerosMenorQueDezRNP04();
		
//		List<String> listaCombinacoesRNP04RNS0105 = combinacoes1525.gerar1525RNP04RNS0105();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP04RNS0105.size());
//		List<String> listaCombinacoesRNP04RNS0610 = combinacoes1525.gerar1525RNP04RNS0610();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP04RNS0610.size());
//		List<String> listaCombinacoesRNP04RNS1115 = combinacoes1525.gerar1525RNP04RNS1115();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP04RNS1115.size());
//		List<String> listaCombinacoesRNP04RNS1620 = combinacoes1525.gerar1525RNP04RNS1620();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP04RNS1620.size());
//		List<String> listaCombinacoesRNP04RNS2125 = combinacoes1525.gerar1525RNP04RNS2125();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP04RNS2125.size());
		
		combinacoes1525.gerar1625RNP05(str);
		combinacoes1525.gerar1625RNP05SEMRNS(str);
//		System.out.println("RNP05: " + listaCombinacoesRNP05.size());
//		combinacoes1525.resultadoNumerosMenorQueDezRNP05();
		
//		List<String> listaCombinacoesRNP05RNS0105 = combinacoes1525.gerar1525RNP05RNS0105();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP05RNS0105.size());
//		List<String> listaCombinacoesRNP05RNS0610 = combinacoes1525.gerar1525RNP05RNS0610();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP05RNS0610.size());
//		List<String> listaCombinacoesRNP05RNS1115 = combinacoes1525.gerar1525RNP05RNS1115();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP05RNS1115.size());
//		List<String> listaCombinacoesRNP05RNS1620 = combinacoes1525.gerar1525RNP05RNS1620();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP05RNS1620.size());
//		List<String> listaCombinacoesRNP05RNS2125 = combinacoes1525.gerar1525RNP05RNS2125();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP05RNS2125.size());
		
		combinacoes1525.gerar1625RNP06(str);
		combinacoes1525.gerar1625RNP06SEMRNS(str);
//		System.out.println("RNP06: " + listaCombinacoesRNP06.size());
//		combinacoes1525.resultadoNumerosMenorQueDezRNP06();
		
//		List<String> listaCombinacoesRNP06RNS0105 = combinacoes1525.gerar1525RNP06RNS0105();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP06RNS0105.size());
//		List<String> listaCombinacoesRNP06RNS0610 = combinacoes1525.gerar1525RNP06RNS0610();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP06RNS0610.size());
//		List<String> listaCombinacoesRNP06RNS1115 = combinacoes1525.gerar1525RNP06RNS1115();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP06RNS1115.size());
//		List<String> listaCombinacoesRNP06RNS1620 = combinacoes1525.gerar1525RNP06RNS1620();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP06RNS1620.size());
//		List<String> listaCombinacoesRNP06RNS2125 = combinacoes1525.gerar1525RNP06RNS2125();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP06RNS2125.size());
		
		combinacoes1525.gerar1625RNP07(str);
		combinacoes1525.gerar1625RNP07SEMRNS(str);
//		combinacoes1525.resultadoNumerosMenorQueDezRNP07();
		
//		combinacoes1525.gerar1625RNP07RNS0105();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP07RNS0105.size());
//		List<String> listaCombinacoesRNP07RNS0610 = combinacoes1525.gerar1525RNP07RNS0610();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP07RNS0610.size());
//		List<String> listaCombinacoesRNP07RNS1115 = combinacoes1525.gerar1525RNP07RNS1115();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP07RNS1115.size());
//		List<String> listaCombinacoesRNP07RNS1620 = combinacoes1525.gerar1525RNP07RNS1620();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP07RNS1620.size());
//		List<String> listaCombinacoesRNP07RNS2125 = combinacoes1525.gerar1525RNP07RNS2125();
//		System.out.println("RNP04RNS0105: " + listaCombinacoesRNP07RNS2125.size());
		
		combinacoes1525.gerar1625RNP08(str);
		combinacoes1525.gerar1625RNP08SEMRNS(str);
//		System.out.println("RNP08: " + listaCombinacoesRNP08.size());
//		combinacoes1525.resultadoNumerosMenorQueDezRNP08();
		
		combinacoes1525.gerar1625RNP09(str);
		combinacoes1525.gerar1625RNP09SEMRNS(str);
//		System.out.println("RNP09: " + listaCombinacoesRNP09.size());
//		combinacoes1525.gravarRNP09(listaCombinacoesRNP09);
//		combinacoes1525.resultadoNumerosMenorQueDezRNP09();
		
//		combinacoes1525.gerar1625RNP10(str);
//		combinacoes1525.gerar1625RNP10SEMRNS(str);
//		System.out.println("RNP10: " + listaCombinacoesRNP10.size());
//		combinacoes1525.resultadoNumerosMenorQueDezRNP10();
		
//		combinacoes1525.gerar1625RNP11(str);
//		combinacoes1525.gerar1625RNP11SEMRNS(str);
//		System.out.println("RNP11: " + listaCombinacoesRNP11.size());
//		combinacoes1525.resultadoNumerosMenorQueDezRNP11();
		
//		combinacoes1525.gerar1625RNP12(str);
//		combinacoes1525.gerar1625RNP12SEMRNS(str);
//		System.out.println("RNP12: " + listaCombinacoesRNP12.size());
//		combinacoes1525.resultadoNumerosMenorQueDezRNP12();
		
//		combinacoes1525.resultadoParesImparesFechamento11();
//		combinacoes1525.resultadoNumerosMenorQueDez();
		
//		combinacoes1525.juntar89_1416();
		
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1625 = 2042975
	 * 
	 * @return List<String>
	 */
	public List<String> gerar1625(int[] str) throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivo1525 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25.csv");
//		PrintWriter gravarArquivo1525 = new PrintWriter(arquivo1525);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			//if (!saiu15(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
						saida[15];
//				gravarArquivo1525.printf("%s%n", lista);
				lista1525.add(lista);
			//}
		}
//		arquivo1525.close();
//		gravarArquivo1525.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1625 = 2042975
	 * 
	 * @return List<String>
	 */
	public List<String> gerar1625SEMRNS(int[] str) throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivo1525 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25_SEMRNS.csv");
//		PrintWriter gravarArquivo1525 = new PrintWriter(arquivo1525);
		
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (!rns0105.aplicar(saida)) {
				if (!rns0610.aplicar(saida)) {
					if (!rns1115.aplicar(saida)) {
						if (!rns1620.aplicar(saida)) {
							if (!rns2125.aplicar(saida)) {
								cont++;
								lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
										saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
										saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
										saida[15];
//								gravarArquivo1525.printf("%s%n", lista);
								lista1525.add(lista);
							}
						}
					}
				}
			}
		}
//		arquivo1525.close();
//		gravarArquivo1525.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25_SEMRNS: " + cont);
		return lista1525;
	}
	
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1725 = 1081575
	 * 
	 * @return List<String>
	 */
	public List<String> gerar1725() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivo1525 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\17_25-1081575\\17_25.csv");
		PrintWriter gravarArquivo1525 = new PrintWriter(arquivo1525);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 17);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			//if (!saiu15(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
						saida[15] + "," + saida[16];
				gravarArquivo1525.printf("%s%n", lista);
				lista1525.add(lista);
			//}
		}
		arquivo1525.close();
		gravarArquivo1525.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 17_25: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1825 = 480700
	 * 
	 * @return List<String>
	 */
	public List<String> gerar1825() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivo1525 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\18_25-480700\\18_25.csv");
		PrintWriter gravarArquivo1525 = new PrintWriter(arquivo1525);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 18);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			//if (!saiu15(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
						saida[15] + "," + saida[16] + "," + saida[17];
				gravarArquivo1525.printf("%s%n", lista);
				lista1525.add(lista);
			//}
		}
		arquivo1525.close();
		gravarArquivo1525.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 18_25: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1925 = 177100
	 * 
	 * @return List<String>
	 */
	public List<String> gerar1925() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivo1525 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\19_25-177100\\19_25.csv");
		PrintWriter gravarArquivo1525 = new PrintWriter(arquivo1525);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 19);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			//if (!saiu15(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
						saida[15] + "," + saida[16] + "," + saida[17] + "," + saida[18];
				gravarArquivo1525.printf("%s%n", lista);
				lista1525.add(lista);
			//}
		}
		arquivo1525.close();
		gravarArquivo1525.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 19_25: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 2025 = 53130
	 * 
	 * @return List<String>
	 */
	public List<String> gerar2025() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivo1525 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\20_25-53130\\20_25.csv");
		PrintWriter gravarArquivo1525 = new PrintWriter(arquivo1525);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 20);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			//if (!saiu15(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
						saida[15] + "," + saida[16] + "," + saida[17] + "," + saida[18] + "," + saida[19];
				gravarArquivo1525.printf("%s%n", lista);
				lista1525.add(lista);
			//}
		}
		arquivo1525.close();
		gravarArquivo1525.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 20_25: " + cont);
		return lista1525;
	}
	
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp03
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP03(int[] str) throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP03 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP03.csv");
//		PrintWriter gravarArquivoRNP03 = new PrintWriter(arquivoRNP03);
		
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP03 rnp03 = new RNP03();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp03.aplicar(saida)) {
				if (!rns0105.aplicar(saida)) {
					if (!rns0610.aplicar(saida)) {
						if (!rns1115.aplicar(saida)) {
							if (!rns1620.aplicar(saida)) {
								if (!rns2125.aplicar(saida)) {
									cont++;
									lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
											saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
											saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
											saida[15];
//									gravarArquivoRNP03.printf("%s%n", lista);
									lista1525.add(lista);
								}
							}
						}
					}
				}
			}
		}
//		arquivoRNP03.close();
//		gravarArquivoRNP03.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP03: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp03
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP03SEMRNS(int[] str) throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP03 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP03_SEMRNS.csv");
//		PrintWriter gravarArquivoRNP03 = new PrintWriter(arquivoRNP03);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP03 rnp03 = new RNP03();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp03.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
						saida[15];
//				gravarArquivoRNP03.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP03.close();
//		gravarArquivoRNP03.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP03_SEMRNS: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp03/rns0105
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP03RNS0105(int[] str) throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP03 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03.csv");
//		PrintWriter gravarArquivoRNP03 = new PrintWriter(arquivoRNP03);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP03 rnp03 = new RNP03();
		RNS0105 rns0105 = new RNS0105();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp03.aplicar(saida) && rns0105.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP03.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP03.close();
//		gravarArquivoRNP03.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP03: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp03/rns0610
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP03RNS0610(int[] str) throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP03 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03.csv");
//		PrintWriter gravarArquivoRNP03 = new PrintWriter(arquivoRNP03);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP03 rnp03 = new RNP03();
		RNS0610 rns0610 = new RNS0610();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp03.aplicar(saida) && rns0610.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP03.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP03.close();
//		gravarArquivoRNP03.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP03: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp03/rns1115
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP03RNS1115(int[] str) throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP03 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03.csv");
//		PrintWriter gravarArquivoRNP03 = new PrintWriter(arquivoRNP03);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP03 rnp03 = new RNP03();
		RNS1115 rns1115 = new RNS1115();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp03.aplicar(saida) && rns1115.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP03.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP03.close();
//		gravarArquivoRNP03.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP03: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp03/rns1620
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP03RNS1620(int[] str) throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP03 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03.csv");
//		PrintWriter gravarArquivoRNP03 = new PrintWriter(arquivoRNP03);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP03 rnp03 = new RNP03();
		RNS1620 rns1620 = new RNS1620();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp03.aplicar(saida) && rns1620.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP03.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP03.close();
//		gravarArquivoRNP03.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP03: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp03/rns2125
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP03RNS2125(int[] str) throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP03 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03.csv");
//		PrintWriter gravarArquivoRNP03 = new PrintWriter(arquivoRNP03);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP03 rnp03 = new RNP03();
		RNS2125 rns2125 = new RNS2125();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp03.aplicar(saida) && rns2125.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP03.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP03.close();
//		gravarArquivoRNP03.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP03: " + cont);
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
		URL resultado1525 = Combinacoes1625.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP03\\15_25-RNP03.csv");
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
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp04
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP04(int[] str) throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP04 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP04.csv");
//		PrintWriter gravarArquivoRNP04 = new PrintWriter(arquivoRNP04);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP04 rnp04 = new RNP04();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp04.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
						saida[15];
//				gravarArquivoRNP04.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP04.close();
//		gravarArquivoRNP04.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP04: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp04
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP04SEMRNS(int[] str) throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP04 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP04_SEMRNS.csv");
//		PrintWriter gravarArquivoRNP04 = new PrintWriter(arquivoRNP04);
		
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		
		
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP04 rnp04 = new RNP04();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp04.aplicar(saida)) {
				if (!rns0105.aplicar(saida)) {
					if (!rns0610.aplicar(saida)) {
						if (!rns1115.aplicar(saida)) {
							if (!rns1620.aplicar(saida)) {
								if (!rns2125.aplicar(saida)) {
									cont++;
									lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
											saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
											saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
											saida[15];
//									gravarArquivoRNP04.printf("%s%n", lista);
									lista1525.add(lista);
								}
							}
						}
					}
				}
			}
		}
//		arquivoRNP04.close();
//		gravarArquivoRNP04.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP04_SEMRNS: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp04/rns0105
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP04RNS0105() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP04 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04.csv");
//		PrintWriter gravarArquivoRNP04 = new PrintWriter(arquivoRNP04);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP04 rnp04 = new RNP04();
		RNS0105 rns0105 = new RNS0105();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp04.aplicar(saida) && rns0105.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP04.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP04.close();
//		gravarArquivoRNP04.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP04: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp04/rns0610
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP04RNS0610() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP04 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04.csv");
//		PrintWriter gravarArquivoRNP04 = new PrintWriter(arquivoRNP04);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP04 rnp04 = new RNP04();
		RNS0610 rns0610 = new RNS0610();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp04.aplicar(saida) && rns0610.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP04.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP04.close();
//		gravarArquivoRNP04.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP04: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp04/rns1115
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP04RNS1115() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP04 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04.csv");
//		PrintWriter gravarArquivoRNP04 = new PrintWriter(arquivoRNP04);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP04 rnp04 = new RNP04();
		RNS1115 rns1115 = new RNS1115();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp04.aplicar(saida) && rns1115.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP04.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP04.close();
//		gravarArquivoRNP04.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP04: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp04/rns1620
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP04RNS1620() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP04 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04.csv");
//		PrintWriter gravarArquivoRNP04 = new PrintWriter(arquivoRNP04);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP04 rnp04 = new RNP04();
		RNS1620 rns1620 = new RNS1620();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp04.aplicar(saida) && rns1620.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP04.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP04.close();
//		gravarArquivoRNP04.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP04: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp04/rns2125
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP04RNS2125() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP04 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04.csv");
//		PrintWriter gravarArquivoRNP04 = new PrintWriter(arquivoRNP04);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP04 rnp04 = new RNP04();
		RNS2125 rns2125 = new RNS2125();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp04.aplicar(saida) && rns2125.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP04.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP04.close();
//		gravarArquivoRNP04.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP04: " + cont);
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
		URL resultado1525 = Combinacoes1625.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP04\\15_25-RNP04.csv");
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
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp05
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP05(int[] str) throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP05.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP05 rnp05 = new RNP05();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp05.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP05.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP05: " + cont);
		return lista1525;
	}
	
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp05
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP05SEMRNS(int[] str) throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP05_SEMRNS.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
		
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP05 rnp05 = new RNP05();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp05.aplicar(saida)) {
				if (!rns0105.aplicar(saida)) {
					if (!rns0610.aplicar(saida)) {
						if (!rns1115.aplicar(saida)) {
							if (!rns1620.aplicar(saida)) {
								if (!rns2125.aplicar(saida)) {
									cont++;
									lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
											saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
											saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//									gravarArquivoRNP05.printf("%s%n", lista);
									lista1525.add(lista);
								}
							}
						}
					}
				}
			}
		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP05_SEMRNS: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05/rns0105
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP05RNS0105() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP05 rnp05 = new RNP05();
		RNS0105 rns0105 = new RNS0105();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp05.aplicar(saida) && rns0105.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP05.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP05: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05/rns0610
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP05RNS0610() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP05 rnp05 = new RNP05();
		RNS0610 rns0610 = new RNS0610();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp05.aplicar(saida) && rns0610.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP05.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP05: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05/rns1115
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP05RNS1115() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP05 rnp05 = new RNP05();
		RNS1115 rns1115 = new RNS1115();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp05.aplicar(saida) && rns1115.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP05.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP05: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05/rns1620
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP05RNS1620() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP05 rnp05 = new RNP05();
		RNS1620 rns1620 = new RNS1620();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp05.aplicar(saida) && rns1620.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP05.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP05: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05/rns2125
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP05RNS2125() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP05 rnp05 = new RNP05();
		RNS2125 rns2125 = new RNS2125();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp05.aplicar(saida) && rns2125.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP05.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP05: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP05() throws URISyntaxException, IOException, LotoException {

//		FileWriter arquivoDOIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05_ZERO.csv");
//		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
//		FileWriter arquivoTRES = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05_UM.csv");
//		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05_DOIS.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05_TRES.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05_QUATRO.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05_CINCO.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05_SEIS.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05_SETE.csv");
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
		URL resultado1525 = Combinacoes1625.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP05\\15_25-RNP05.csv");
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
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp06
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP06(int[] str) throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP06 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP06.csv");
//		PrintWriter gravarArquivoRNP06 = new PrintWriter(arquivoRNP06);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP06 rnp06 = new RNP06();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp06.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
						saida[15];
//				gravarArquivoRNP06.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP06.close();
//		gravarArquivoRNP06.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP06: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp06
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP06SEMRNS(int[] str) throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP06 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP06_SEMRNS.csv");
//		PrintWriter gravarArquivoRNP06 = new PrintWriter(arquivoRNP06);
		
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		
		
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP06 rnp06 = new RNP06();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp06.aplicar(saida)) {
				if (!rns0105.aplicar(saida)) {
					if (!rns0610.aplicar(saida)) {
						if (!rns1115.aplicar(saida)) {
							if (!rns1620.aplicar(saida)) {
								if (!rns2125.aplicar(saida)) {
									cont++;
									lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
											saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
											saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
											saida[15];
//									gravarArquivoRNP06.printf("%s%n", lista);
									lista1525.add(lista);
								}
							}
						}
					}
				}
			}
		}
//		arquivoRNP06.close();
//		gravarArquivoRNP06.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP06_SEMRNS: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp06/rns0105
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP06RNS0105() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP06 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06.csv");
//		PrintWriter gravarArquivoRNP06 = new PrintWriter(arquivoRNP06);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP06 rnp06 = new RNP06();
		RNS0105 rns0105 = new RNS0105();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp06.aplicar(saida) && rns0105.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP06.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP06.close();
//		gravarArquivoRNP06.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP06: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp06/rns0610
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP06RNS0610() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP06 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06.csv");
//		PrintWriter gravarArquivoRNP06 = new PrintWriter(arquivoRNP06);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP06 rnp06 = new RNP06();
		RNS0610 rns0610 = new RNS0610();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp06.aplicar(saida) && rns0610.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP06.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP06.close();
//		gravarArquivoRNP06.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP06: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp06/rns1115
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP06RNS1115() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP06 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06.csv");
//		PrintWriter gravarArquivoRNP06 = new PrintWriter(arquivoRNP06);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP06 rnp06 = new RNP06();
		RNS1115 rns1115 = new RNS1115();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp06.aplicar(saida) && rns1115.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP06.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP06.close();
//		gravarArquivoRNP06.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP06: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp06/rns1620
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP06RNS1620() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP06 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06.csv");
//		PrintWriter gravarArquivoRNP06 = new PrintWriter(arquivoRNP06);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP06 rnp06 = new RNP06();
		RNS1620 rns1620 = new RNS1620();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp06.aplicar(saida) && rns1620.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP06.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP06.close();
//		gravarArquivoRNP06.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP06: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp06/rns2125
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP06RNS2125() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP06 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06.csv");
//		PrintWriter gravarArquivoRNP06 = new PrintWriter(arquivoRNP06);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP06 rnp06 = new RNP06();
		RNS2125 rns2125 = new RNS2125();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp06.aplicar(saida) && rns2125.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP06.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP06.close();
//		gravarArquivoRNP06.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP06: " + cont);
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
		URL resultado1525 = Combinacoes1625.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP06\\15_25-RNP06.csv");
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
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp07
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP07(int[] str) throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivoRNP07 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP07.csv");
//		PrintWriter gravarArquivoRNP07 = new PrintWriter(arquivoRNP07);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP07 rnp07 = new RNP07();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp07.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
						saida[15];
//				gravarArquivoRNP07.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP07.close();
//		gravarArquivoRNP07.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP07: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp07
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP07SEMRNS(int[] str) throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivoRNP07 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP07_SEMRNS.csv");
//		PrintWriter gravarArquivoRNP07 = new PrintWriter(arquivoRNP07);
		
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP07 rnp07 = new RNP07();
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
									lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
											saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
											saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
											saida[15];
//									gravarArquivoRNP07.printf("%s%n", lista);
									lista1525.add(lista);
								}
							}
						}
					}
				}
			}
		}
//		arquivoRNP07.close();
//		gravarArquivoRNP07.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP07_SEMRNS: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp07/rns0105
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP07RNS0105() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivoRNP07 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP07_RNS0105.csv");
		PrintWriter gravarArquivoRNP07 = new PrintWriter(arquivoRNP07);
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
			if (rnp07.aplicar(saida) && rns0105.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
						saida[15];
				gravarArquivoRNP07.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP07.close();
		gravarArquivoRNP07.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP07: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp07/rns0610
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP07RNS0610() throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivoRNP07 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07.csv");
//		PrintWriter gravarArquivoRNP07 = new PrintWriter(arquivoRNP07);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP07 rnp07 = new RNP07();
		RNS0610 rns0610 = new RNS0610();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp07.aplicar(saida) && rns0610.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP07.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP07.close();
//		gravarArquivoRNP07.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP07: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp07/rns1115
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP07RNS1115() throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivoRNP07 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07.csv");
//		PrintWriter gravarArquivoRNP07 = new PrintWriter(arquivoRNP07);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP07 rnp07 = new RNP07();
		RNS1115 rns1115 = new RNS1115();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp07.aplicar(saida) && rns1115.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP07.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP07.close();
//		gravarArquivoRNP07.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP07: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp07/rns1620
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP07RNS1620() throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivoRNP07 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07.csv");
//		PrintWriter gravarArquivoRNP07 = new PrintWriter(arquivoRNP07);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP07 rnp07 = new RNP07();
		RNS1620 rns1620 = new RNS1620();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp07.aplicar(saida) && rns1620.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP07.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP07.close();
//		gravarArquivoRNP07.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP07: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp07/rns2125
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP07RNS2125() throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivoRNP07 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07.csv");
//		PrintWriter gravarArquivoRNP07 = new PrintWriter(arquivoRNP07);
//		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP07 rnp07 = new RNP07();
		RNS2125 rns2125 = new RNS2125();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp07.aplicar(saida) && rns2125.aplicar(saida)) {
//				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP07.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP07.close();
//		gravarArquivoRNP07.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP07: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP07() throws URISyntaxException, IOException, LotoException {
		
		FileWriter arquivoZERO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_ZERO.csv");
		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
		FileWriter arquivoUM = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_UM.csv");
		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
		FileWriter arquivoDOIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_DOIS.csv");
		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07_NOVE.csv");
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
		URL resultado1525 = Combinacoes1625.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP07\\15_25-RNP07.csv");
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
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp08
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP08(int[] str) throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivoRNP08 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP08.csv");
//		PrintWriter gravarArquivoRNP08 = new PrintWriter(arquivoRNP08);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP08 rnp08 = new RNP08();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp08.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
						saida[15];
//				gravarArquivoRNP08.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP08.close();
//		gravarArquivoRNP08.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP08: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp08
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP08SEMRNS(int[] str) throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivoRNP08 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP08_SEMRNS.csv");
//		PrintWriter gravarArquivoRNP08 = new PrintWriter(arquivoRNP08);
		
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP08 rnp08 = new RNP08();
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
									lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
											saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
											saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
											saida[15];
//									gravarArquivoRNP08.printf("%s%n", lista);
									lista1525.add(lista);
								}
							}
						}
					}
				}
			}
		}
//		arquivoRNP08.close();
//		gravarArquivoRNP08.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP08_SEMRNS: " + cont);
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
		URL resultado1525 = Combinacoes1625.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP08\\15_25-RNP08.csv");
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
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp09
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP09(int[] str) throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivoRNP09 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP09.csv");
//		PrintWriter gravarArquivoRNP09 = new PrintWriter(arquivoRNP09);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP09 rnp09 = new RNP09();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp09.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
						saida[15];
//				gravarArquivoRNP09.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP09.close();
//		gravarArquivoRNP09.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP09: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp09
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP09SEMRNS(int[] str) throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivoRNP09 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP09_SEMRNS.csv");
//		PrintWriter gravarArquivoRNP09 = new PrintWriter(arquivoRNP09);
		
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP09 rnp09 = new RNP09();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp09.aplicar(saida)) {
				if (!rns0105.aplicar(saida)) {
					if (!rns0610.aplicar(saida)) {
						if (!rns1115.aplicar(saida)) {
							if (!rns1620.aplicar(saida)) {
								if (!rns2125.aplicar(saida)) {
									cont++;
									lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
											saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
											saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
											saida[15];
//									gravarArquivoRNP09.printf("%s%n", lista);
									lista1525.add(lista);
								}
							}
						}
					}
				}
			}
		}
//		arquivoRNP09.close();
//		gravarArquivoRNP09.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP09_SEMRNS: " + cont);
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
		URL resultado1525 = Combinacoes1625.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP09\\15_25-RNP09.csv");
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
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp10
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP10(int[] str) throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivoRNP10 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP10.csv");
//		PrintWriter gravarArquivoRNP10 = new PrintWriter(arquivoRNP10);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP10 rnp10 = new RNP10();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp10.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
						saida[15];
//				gravarArquivoRNP10.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP10.close();
//		gravarArquivoRNP10.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP10: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp10
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP10SEMRNS(int[] str) throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivoRNP10 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP10_SEMRNS.csv");
//		PrintWriter gravarArquivoRNP10 = new PrintWriter(arquivoRNP10);
		
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP10 rnp10 = new RNP10();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp10.aplicar(saida)) {
				if (!rns0105.aplicar(saida)) {
					if (!rns0610.aplicar(saida)) {
						if (!rns1115.aplicar(saida)) {
							if (!rns1620.aplicar(saida)) {
								if (!rns2125.aplicar(saida)) {
									cont++;
									lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
											saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
											saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
											saida[15];
//									gravarArquivoRNP10.printf("%s%n", lista);
									lista1525.add(lista);
								}
							}
						}
					}
				}
			}
		}
//		arquivoRNP10.close();
//		gravarArquivoRNP10.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP10_SEMRNS: " + cont);
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
		URL resultado1525 = Combinacoes1625.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP10\\15_25-RNP10.csv");
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
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp11
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP11(int[] str) throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivoRNP11 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP11.csv");
//		PrintWriter gravarArquivoRNP11 = new PrintWriter(arquivoRNP11);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP11 rnp11 = new RNP11();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp11.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
						saida[15];
//				gravarArquivoRNP11.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP11.close();
//		gravarArquivoRNP11.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP11: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp11
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP11SEMRNS(int[] str) throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivoRNP11 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP11_SEMRNS.csv");
//		PrintWriter gravarArquivoRNP11 = new PrintWriter(arquivoRNP11);
		
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP11 rnp11 = new RNP11();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp11.aplicar(saida)) {
				if (!rns0105.aplicar(saida)) {
					if (!rns0610.aplicar(saida)) {
						if (!rns1115.aplicar(saida)) {
							if (!rns1620.aplicar(saida)) {
								if (!rns2125.aplicar(saida)) {
									cont++;
									lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
											saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
											saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
											saida[15];
//									gravarArquivoRNP11.printf("%s%n", lista);
									lista1525.add(lista);
								}
							}
						}
					}
				}
			}
		}
//		arquivoRNP11.close();
//		gravarArquivoRNP11.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP11_SEMRNS: " + cont);
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
		URL resultado1525 = Combinacoes1625.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP11\\15_25-RNP11.csv");
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
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp12
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP12(int[] str) throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivoRNP12 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP12.csv");
//		PrintWriter gravarArquivoRNP12 = new PrintWriter(arquivoRNP12);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP12 rnp12 = new RNP12();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp12.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
						saida[15];
//				gravarArquivoRNP12.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
//		arquivoRNP12.close();
//		gravarArquivoRNP12.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP12: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1625 com a regra negocial rnp12
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1625RNP12SEMRNS(int[] str) throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivoRNP12 = new FileWriter("C:\\sicodes\\facil-quinze\\src\\main\\resources\\combinacoes\\16_25-2042975\\16_25-RNP12_SEMRNS.csv");
//		PrintWriter gravarArquivoRNP12 = new PrintWriter(arquivoRNP12);
		
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		RNP12 rnp12 = new RNP12();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp12.aplicar(saida)) {
				if (!rns0105.aplicar(saida)) {
					if (!rns0610.aplicar(saida)) {
						if (!rns1115.aplicar(saida)) {
							if (!rns1620.aplicar(saida)) {
								if (!rns2125.aplicar(saida)) {
									cont++;
									lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
											saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
											saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
											saida[15];
//									gravarArquivoRNP12.printf("%s%n", lista);
									lista1525.add(lista);
								}
							}
						}
					}
				}
			}
		}
//		arquivoRNP12.close();
//		gravarArquivoRNP12.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25-RNP12_SEMRNS: " + cont);
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
		URL resultado1525 = Combinacoes1625.class.getClassLoader().getResource("combinacoes\\15_25-3268760\\RNP12\\15_25-RNP12.csv");
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
	
//	@SuppressWarnings("deprecation")
//	public boolean saiu15RNP02(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
//		boolean retorno = false;
//		int contador = 0;
//		URL resultado = Combinacoes1525.class.getClassLoader().getResource("resultado\\ResultadoRNP02.csv");
//		if (Objects.nonNull(resultado)) {
//			Path caminho = Paths.get(resultado.toURI());
//			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
//			String[] linhaResultado;
//			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
//				contador = 0;
//				int[] resultado1525 = new int[linhaResultado.length];
//				for (int i = 0; i < linhaResultado.length; i++) {
//					resultado1525[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
//				}
//
//				for (int i = 0; i < linha1525.length; i++) {
//					for (int j = 0; j < resultado1525.length; j++) {
//						if (linha1525[i] == resultado1525[j]) {
//							contador++;
//						}
//					}
//				}
//
//				if (contador == NumeroEnum.QUINZE.getValor()) {
//					retorno = true;
//					break;
//				}
//			}
//		} else {
//			System.out.println("### [resultado\\ResultadoRNP02.csv] Arquivo nao encontrado... ###");
//		}
//
//		return retorno;
//	}
//	
//	@SuppressWarnings("deprecation")
//	public boolean saiu15RNP03(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
//		boolean retorno = false;
//		int contador = 0;
//		URL resultado = Combinacoes1525.class.getClassLoader().getResource("resultado\\ResultadoRNP03.csv");
//		if (Objects.nonNull(resultado)) {
//			Path caminho = Paths.get(resultado.toURI());
//			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
//			String[] linhaResultado;
//			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
//				contador = 0;
//				int[] resultado1525 = new int[linhaResultado.length];
//				for (int i = 0; i < linhaResultado.length; i++) {
//					resultado1525[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
//				}
//
//				for (int i = 0; i < linha1525.length; i++) {
//					for (int j = 0; j < resultado1525.length; j++) {
//						if (linha1525[i] == resultado1525[j]) {
//							contador++;
//						}
//					}
//				}
//
//				if (contador == NumeroEnum.QUINZE.getValor()) {
//					retorno = true;
//					break;
//				}
//			}
//		} else {
//			System.out.println("### [resultado\\ResultadoRNP03.csv] Arquivo nao encontrado... ###");
//		}
//
//		return retorno;
//	}
//	
//	@SuppressWarnings("deprecation")
//	public void resultadoParesImparesFechamento11() throws URISyntaxException, IOException, LotoException  {
//		
//		URL resultadoOrdenado = Principal.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-FECHAMENTO11.csv");
//		int contTotalLinhaArquivo = 0;
//		RNP02 rnp02 = new RNP02();
//		List<String[]> listaRNP02 = new ArrayList<String[]>();
//		RNP03 rnp03 = new RNP03();
//		List<String[]> listaRNP03 = new ArrayList<String[]>();
//		RNP04 rnp04 = new RNP04();
//		List<String[]> listaRNP04 = new ArrayList<String[]>();
//		RNP05 rnp05 = new RNP05();
//		List<String[]> listaRNP05 = new ArrayList<String[]>();
//		RNP06 rnp06 = new RNP06();
//		List<String[]> listaRNP06 = new ArrayList<String[]>();
//		RNP07 rnp07 = new RNP07();
//		List<String[]> listaRNP07 = new ArrayList<String[]>();
//		RNP08 rnp08 = new RNP08();
//		List<String[]> listaRNP08 = new ArrayList<String[]>();
//		RNP09 rnp09 = new RNP09();
//		List<String[]> listaRNP09 = new ArrayList<String[]>();
//		RNP10 rnp10 = new RNP10();
//		List<String[]> listaRNP10 = new ArrayList<String[]>();
//		RNP11 rnp11 = new RNP11();
//		List<String[]> listaRNP11 = new ArrayList<String[]>();
//		RNP12 rnp12 = new RNP12();
//		List<String[]> listaRNP12 = new ArrayList<String[]>();
//
//		int cont02 = 0;
//		int cont03 = 0;
//		int cont04 = 0;
//		int cont05 = 0;
//		int cont06 = 0;
//		int cont07 = 0;
//		int cont08 = 0;
//		int cont09 = 0;
//		int cont10 = 0;
//		int cont11 = 0;
//		int cont12 = 0;
//		
//		int contLinha = 0;
//
//		if (Objects.nonNull(resultadoOrdenado)) {
//
//			Path caminho = Paths.get(resultadoOrdenado.toURI());
//			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
//			String[] linha15;
//			while (Objects.nonNull((linha15 = csvReader.readNext()))) {
//				contTotalLinhaArquivo++;
//				int[] linha = new int[linha15.length];
//				for (int i = 0; i < linha15.length; i++) {
//					linha[i] = Integer.parseInt(String.valueOf(linha15[i]));
//				}
//				
//				if (rnp02.aplicar(linha)) {
//					cont02++;
//					listaRNP02.add(linha15);
//				} else if (rnp03.aplicar(linha)) {
//					cont03++;
//					listaRNP03.add(linha15);
//				} else if (rnp04.aplicar(linha)) {
//					cont04++;
//					listaRNP04.add(linha15);
//				} else if (rnp05.aplicar(linha)) {
//					cont05++;
//					listaRNP05.add(linha15);
//				} else if (rnp06.aplicar(linha)) {
//					cont06++;
//					listaRNP06.add(linha15);
//				} else if (rnp07.aplicar(linha)) {
//					cont07++;
//					listaRNP07.add(linha15);
//				} else if (rnp08.aplicar(linha)) {
//					cont08++;
//					listaRNP08.add(linha15);
//				} else if (rnp09.aplicar(linha)) {
//					cont09++;
//					listaRNP09.add(linha15);
//				} else if (rnp10.aplicar(linha)) {
//					cont10++;
//					listaRNP10.add(linha15);
//				} else if (rnp11.aplicar(linha)) {
//					cont11++;
//					listaRNP11.add(linha15);
//				} else if (rnp12.aplicar(linha)) {
//					cont12++;
//					listaRNP12.add(linha15);
//				} else {
//					System.out.println("#### FUDEU... ####");
//				}
//				
//				if (linha[0] > NumeroEnum.NOVE.getValor()) {
//					contLinha++;
//				}
//				
//			}
//			
//			System.out.println("TOTAL DE LINHAS NO ARQUIVO: " + contTotalLinhaArquivo);
//			System.out.println("TOTAL RNP02: " + cont02);
//			for (String[] saida : listaRNP02) {
//    			System.out.println(
//					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//    			);
//			}
//			System.out.println("TOTAL RNP03: " + cont03);
//			for (String[] saida : listaRNP03) {
//    			System.out.println(
//					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//    			);
//			}
//			System.out.println("TOTAL RNP04: " + cont04);
//			for (String[] saida : listaRNP04) {
//    			System.out.println(
//					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//    			);
//			}
//			System.out.println("TOTAL RNP05: " + cont05);
//			for (String[] saida : listaRNP05) {
//    			System.out.println(
//					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//    			);
//			}
//			System.out.println("TOTAL RNP06: " + cont06);
//			for (String[] saida : listaRNP06) {
//    			System.out.println(
//					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//    			);
//			}
//			System.out.println("TOTAL RNP07: " + cont07);
//			for (String[] saida : listaRNP07) {
//    			System.out.println(
//					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//    			);
//			}
//			System.out.println("TOTAL RNP08: " + cont08);
//			for (String[] saida : listaRNP08) {
//    			System.out.println(
//					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//    			);
//			}
//			System.out.println("TOTAL RNP09: " + cont09);
//			for (String[] saida : listaRNP09) {
//    			System.out.println(
//					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//    			);
//			}
//			System.out.println("TOTAL RNP10: " + cont10);
//			for (String[] saida : listaRNP10) {
//    			System.out.println(
//					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//    			);
//			}
//			System.out.println("TOTAL RNP11: " + cont11);
//			for (String[] saida : listaRNP11) {
//    			System.out.println(
//					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//    			);
//			}
//			System.out.println("TOTAL RNP12: " + cont12);
//			for (String[] saida : listaRNP12) {
//    			System.out.println(
//					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//    			);
//			}
//			System.out.println("TOTAL >9: " + contLinha);
//			
//			
//		} else {
//			System.out.println("#### [resultadoParesImpares] - Arquivo nao encontrado... ####");
//		}
//		
//	}
//	
//	@SuppressWarnings("deprecation")
//	public void resultadoNumerosMenorQueDez() throws URISyntaxException, IOException, LotoException {
//		
//		int cont = 0;
//		int contlinha = 0;
//		int zero = 0;
//		List<String[]> listaZero = new ArrayList<String[]>();
//		int um = 0;
//		List<String[]> listaUm = new ArrayList<String[]>();
//		int dois = 0;
//		List<String[]> listaDois = new ArrayList<String[]>();
//		int tres = 0;
//		List<String[]> listaTres = new ArrayList<String[]>();
//		int quatro = 0;
//		List<String[]> listaQuatro = new ArrayList<String[]>();
//		int cinco = 0;
//		List<String[]> listaCinco = new ArrayList<String[]>();
//		int seis = 0;
//		List<String[]> listaSeis = new ArrayList<String[]>();
//		int sete = 0;
//		List<String[]> listaSete = new ArrayList<String[]>();
//		int oito = 0;
//		List<String[]> listaOito = new ArrayList<String[]>();
//		int nove = 0;
//		List<String[]> listaNove = new ArrayList<String[]>();
//		URL resultado1525 = Principal.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-FECHAMENTO11.csv");
//		if (Objects.nonNull(resultado1525)) {
//			Path caminho = Paths.get(resultado1525.toURI());
//			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
//
//			String[] linhaResultado1525;
//			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {
//
//				cont++;
//				contlinha = 0;
//				int[] linha1525 = new int[linhaResultado1525.length];
//				for (int i = 0; i < linhaResultado1525.length; i++) {
//					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
//				}
//
//				for (int i = 0; i < linha1525.length; i++) {
//					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
//						contlinha++;
//					}
//				}
//
//				if (contlinha == NumeroEnum.ZERO.getValor()) {
//					zero++;
//					listaZero.add(linhaResultado1525);
//				} else if (contlinha == NumeroEnum.UM.getValor()) {
//					um++;
//					listaUm.add(linhaResultado1525);
//				} else if (contlinha == NumeroEnum.DOIS.getValor()) {
//					dois++;
//					listaDois.add(linhaResultado1525);
//				} else if (contlinha == NumeroEnum.TRES.getValor()) {
//					tres++;
//					listaTres.add(linhaResultado1525);
//				} else if (contlinha == NumeroEnum.QUATRO.getValor()) {
//					quatro++;
//					listaQuatro.add(linhaResultado1525);
//				} else if (contlinha == NumeroEnum.CINCO.getValor()) {
//					cinco++;
//					listaCinco.add(linhaResultado1525);
//				} else if (contlinha == NumeroEnum.SEIS.getValor()) {
//					seis++;
//					listaSeis.add(linhaResultado1525);
//				} else if (contlinha == NumeroEnum.SETE.getValor()) {
//					sete++;
//					listaSete.add(linhaResultado1525);
//				} else if (contlinha == NumeroEnum.OITO.getValor()) {
//					oito++;
//					listaOito.add(linhaResultado1525);
//				} else if (contlinha == NumeroEnum.NOVE.getValor()) {
//					nove++;
//					listaNove.add(linhaResultado1525);
//				}
//			}
//		} else {
//			System.out.println("### [resultadoNumerosMenorQueDez] - Arquivo nao encontrado... ###");
//		}
//
//		System.out.println();
//		System.out.println();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO: " + cont);
//		System.out.println("ZERO: " + zero);
//		for (String[] saida : listaZero) {
//			System.out.println(
//				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//			);
//		}
//		System.out.println("UM: " + um);
//		for (String[] saida : listaUm) {
//			System.out.println(
//				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//			);
//		}
//		System.out.println("DOIS: " + dois);
//		for (String[] saida : listaDois) {
//			System.out.println(
//				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//			);
//		}
//		System.out.println("TRES: " + tres);
//		for (String[] saida : listaTres) {
//			System.out.println(
//				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//			);
//		}
//		System.out.println("QUATRO: " + quatro);
//		for (String[] saida : listaQuatro) {
//			System.out.println(
//				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//			);
//		}
//		System.out.println("CINCO: " + cinco);
//		for (String[] saida : listaCinco) {
//			System.out.println(
//				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//			);
//		}
//		System.out.println("SEIS: " + seis);
//		for (String[] saida : listaSeis) {
//			System.out.println(
//				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//			);
//		}
//		System.out.println("SETE: " + sete);
//		for (String[] saida : listaSete) {
//			System.out.println(
//				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//			);
//		}
//		System.out.println("OITO: " + oito);
//		for (String[] saida : listaOito) {
//			System.out.println(
//				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//			);
//		}
//		System.out.println("NOVE: " + nove);
//		for (String[] saida : listaNove) {
//			System.out.println(
//				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//			);
//		}
//		
//	}
//	
//	@SuppressWarnings("deprecation")
//	public void resultadoParesImparesFechamento12() throws URISyntaxException, IOException, LotoException  {
//		
//		URL resultadoOrdenado = Principal.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-FECHAMENTO12.csv");
//		int contTotalLinhaArquivo = 0;
//		RNP02 rnp02 = new RNP02();
//		RNP03 rnp03 = new RNP03();
//		RNP04 rnp04 = new RNP04();
//		RNP05 rnp05 = new RNP05();
//		RNP06 rnp06 = new RNP06();
//		RNP07 rnp07 = new RNP07();
//		RNP08 rnp08 = new RNP08();
//		RNP09 rnp09 = new RNP09();
//		RNP10 rnp10 = new RNP10();
//		RNP11 rnp11 = new RNP11();
//		RNP12 rnp12 = new RNP12();
//
//		int cont02 = 0;
//		int cont03 = 0;
//		int cont04 = 0;
//		int cont05 = 0;
//		int cont06 = 0;
//		int cont07 = 0;
//		int cont08 = 0;
//		int cont09 = 0;
//		int cont10 = 0;
//		int cont11 = 0;
//		int cont12 = 0;
//		
//		int contLinha = 0;
//
//		if (Objects.nonNull(resultadoOrdenado)) {
//
//			Path caminho = Paths.get(resultadoOrdenado.toURI());
//			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
//			String[] linha15;
//			while (Objects.nonNull((linha15 = csvReader.readNext()))) {
//				contTotalLinhaArquivo++;
//				int[] linha = new int[linha15.length];
//				for (int i = 0; i < linha15.length; i++) {
//					linha[i] = Integer.parseInt(String.valueOf(linha15[i]));
//				}
//				
//				if (rnp02.aplicar(linha)) {
//					cont02++;
//				} else if (rnp03.aplicar(linha)) {
//					cont03++;
//				} else if (rnp04.aplicar(linha)) {
//					cont04++;
//				} else if (rnp05.aplicar(linha)) {
//					cont05++;
//				} else if (rnp06.aplicar(linha)) {
//					cont06++;
//				} else if (rnp07.aplicar(linha)) {
//					cont07++;
//				} else if (rnp08.aplicar(linha)) {
//					cont08++;
//				} else if (rnp09.aplicar(linha)) {
//					cont09++;
//				} else if (rnp10.aplicar(linha)) {
//					cont10++;
//				} else if (rnp11.aplicar(linha)) {
//					cont11++;
//				} else if (rnp12.aplicar(linha)) {
//					cont12++;
//				} else {
//					System.out.println("#### FUDEU... ####");
//				}
//				
//				if (linha[0] > NumeroEnum.NOVE.getValor()) {
//					contLinha++;
//				}
//				
//			}
//			
//			System.out.println("TOTAL DE LINHAS NO ARQUIVO: " + contTotalLinhaArquivo);
//			System.out.println("TOTAL RNP02: " + cont02);
//			System.out.println("TOTAL RNP03: " + cont03);
//			System.out.println("TOTAL RNP04: " + cont04);
//			System.out.println("TOTAL RNP05: " + cont05);
//			System.out.println("TOTAL RNP06: " + cont06);
//			System.out.println("TOTAL RNP07: " + cont07);
//			System.out.println("TOTAL RNP08: " + cont08);
//			System.out.println("TOTAL RNP09: " + cont09);
//			System.out.println("TOTAL RNP10: " + cont10);
//			System.out.println("TOTAL RNP11: " + cont11);
//			System.out.println("TOTAL RNP12: " + cont12);
//			System.out.println("TOTAL >9: " + contLinha);
//			
//		} else {
//			System.out.println("#### [resultadoParesImpares] - Arquivo nao encontrado... ####");
//		}
//		
//	}
//	
//	@SuppressWarnings("deprecation")
//	public void resultadoParesImparesFechamento13() throws URISyntaxException, IOException, LotoException  {
//		
//		URL resultadoOrdenado = Principal.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-FECHAMENTO13.csv");
//		int contTotalLinhaArquivo = 0;
//		RNP02 rnp02 = new RNP02();
//		RNP03 rnp03 = new RNP03();
//		RNP04 rnp04 = new RNP04();
//		RNP05 rnp05 = new RNP05();
//		RNP06 rnp06 = new RNP06();
//		RNP07 rnp07 = new RNP07();
//		RNP08 rnp08 = new RNP08();
//		RNP09 rnp09 = new RNP09();
//		RNP10 rnp10 = new RNP10();
//		RNP11 rnp11 = new RNP11();
//		RNP12 rnp12 = new RNP12();
//
//		int cont02 = 0;
//		int cont03 = 0;
//		int cont04 = 0;
//		int cont05 = 0;
//		int cont06 = 0;
//		int cont07 = 0;
//		int cont08 = 0;
//		int cont09 = 0;
//		int cont10 = 0;
//		int cont11 = 0;
//		int cont12 = 0;
//		
//		int contLinha = 0;
//
//		if (Objects.nonNull(resultadoOrdenado)) {
//
//			Path caminho = Paths.get(resultadoOrdenado.toURI());
//			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
//			String[] linha15;
//			while (Objects.nonNull((linha15 = csvReader.readNext()))) {
//				contTotalLinhaArquivo++;
//				int[] linha = new int[linha15.length];
//				for (int i = 0; i < linha15.length; i++) {
//					linha[i] = Integer.parseInt(String.valueOf(linha15[i]));
//				}
//				
//				if (rnp02.aplicar(linha)) {
//					cont02++;
//				} else if (rnp03.aplicar(linha)) {
//					cont03++;
//				} else if (rnp04.aplicar(linha)) {
//					cont04++;
//				} else if (rnp05.aplicar(linha)) {
//					cont05++;
//				} else if (rnp06.aplicar(linha)) {
//					cont06++;
//				} else if (rnp07.aplicar(linha)) {
//					cont07++;
//				} else if (rnp08.aplicar(linha)) {
//					cont08++;
//				} else if (rnp09.aplicar(linha)) {
//					cont09++;
//				} else if (rnp10.aplicar(linha)) {
//					cont10++;
//				} else if (rnp11.aplicar(linha)) {
//					cont11++;
//				} else if (rnp12.aplicar(linha)) {
//					cont12++;
//				} else {
//					System.out.println("#### FUDEU... ####");
//				}
//				
//				if (linha[0] > NumeroEnum.NOVE.getValor()) {
//					contLinha++;
//				}
//				
//			}
//			
//			System.out.println("TOTAL DE LINHAS NO ARQUIVO: " + contTotalLinhaArquivo);
//			System.out.println("TOTAL RNP02: " + cont02);
//			System.out.println("TOTAL RNP03: " + cont03);
//			System.out.println("TOTAL RNP04: " + cont04);
//			System.out.println("TOTAL RNP05: " + cont05);
//			System.out.println("TOTAL RNP06: " + cont06);
//			System.out.println("TOTAL RNP07: " + cont07);
//			System.out.println("TOTAL RNP08: " + cont08);
//			System.out.println("TOTAL RNP09: " + cont09);
//			System.out.println("TOTAL RNP10: " + cont10);
//			System.out.println("TOTAL RNP11: " + cont11);
//			System.out.println("TOTAL RNP12: " + cont12);
//			System.out.println("TOTAL >9: " + contLinha);
//			
//		} else {
//			System.out.println("#### [resultadoParesImpares] - Arquivo nao encontrado... ####");
//		}
//		
//	}
//	
//	@SuppressWarnings("deprecation")
//	public void resultadoParesImparesFechamento14() throws URISyntaxException, IOException, LotoException  {
//		
//		URL resultadoOrdenado = Principal.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-FECHAMENTO14.csv");
//		int contTotalLinhaArquivo = 0;
//		RNP02 rnp02 = new RNP02();
//		RNP03 rnp03 = new RNP03();
//		RNP04 rnp04 = new RNP04();
//		RNP05 rnp05 = new RNP05();
//		RNP06 rnp06 = new RNP06();
//		RNP07 rnp07 = new RNP07();
//		RNP08 rnp08 = new RNP08();
//		RNP09 rnp09 = new RNP09();
//		RNP10 rnp10 = new RNP10();
//		RNP11 rnp11 = new RNP11();
//		RNP12 rnp12 = new RNP12();
//
//		int cont02 = 0;
//		int cont03 = 0;
//		int cont04 = 0;
//		int cont05 = 0;
//		int cont06 = 0;
//		int cont07 = 0;
//		int cont08 = 0;
//		int cont09 = 0;
//		int cont10 = 0;
//		int cont11 = 0;
//		int cont12 = 0;
//		
//		int contLinha = 0;
//
//		if (Objects.nonNull(resultadoOrdenado)) {
//
//			Path caminho = Paths.get(resultadoOrdenado.toURI());
//			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
//			String[] linha15;
//			while (Objects.nonNull((linha15 = csvReader.readNext()))) {
//				contTotalLinhaArquivo++;
//				int[] linha = new int[linha15.length];
//				for (int i = 0; i < linha15.length; i++) {
//					linha[i] = Integer.parseInt(String.valueOf(linha15[i]));
//				}
//				
//				if (rnp02.aplicar(linha)) {
//					cont02++;
//				} else if (rnp03.aplicar(linha)) {
//					cont03++;
//				} else if (rnp04.aplicar(linha)) {
//					cont04++;
//				} else if (rnp05.aplicar(linha)) {
//					cont05++;
//				} else if (rnp06.aplicar(linha)) {
//					cont06++;
//				} else if (rnp07.aplicar(linha)) {
//					cont07++;
//				} else if (rnp08.aplicar(linha)) {
//					cont08++;
//				} else if (rnp09.aplicar(linha)) {
//					cont09++;
//				} else if (rnp10.aplicar(linha)) {
//					cont10++;
//				} else if (rnp11.aplicar(linha)) {
//					cont11++;
//				} else if (rnp12.aplicar(linha)) {
//					cont12++;
//				} else {
//					System.out.println("#### FUDEU... ####");
//				}
//				
//				if (linha[0] > NumeroEnum.NOVE.getValor()) {
//					contLinha++;
//				}
//				
//			}
//			
//			System.out.println("TOTAL DE LINHAS NO ARQUIVO: " + contTotalLinhaArquivo);
//			System.out.println("TOTAL RNP02: " + cont02);
//			System.out.println("TOTAL RNP03: " + cont03);
//			System.out.println("TOTAL RNP04: " + cont04);
//			System.out.println("TOTAL RNP05: " + cont05);
//			System.out.println("TOTAL RNP06: " + cont06);
//			System.out.println("TOTAL RNP07: " + cont07);
//			System.out.println("TOTAL RNP08: " + cont08);
//			System.out.println("TOTAL RNP09: " + cont09);
//			System.out.println("TOTAL RNP10: " + cont10);
//			System.out.println("TOTAL RNP11: " + cont11);
//			System.out.println("TOTAL RNP12: " + cont12);
//			System.out.println("TOTAL >9: " + contLinha);
//			
//		} else {
//			System.out.println("#### [resultadoParesImpares] - Arquivo nao encontrado... ####");
//		}
//		
//	}
//	
//	@SuppressWarnings({ "deprecation" })
//	public static boolean verificarResultado(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
//
//		boolean retorno = false;
//		int cont = 0;
//		URL resultado = Combinacoes1525.class.getClassLoader().getResource("resultado.csv");
//		if (Objects.nonNull(resultado)) {
//			
//			Path caminho = Paths.get(resultado.toURI());
//			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
//			String[] linhaResultado;
//			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
//
//				cont = 0;
//				int[] linha = new int[linhaResultado.length];
//				for (int i = 0; i < linhaResultado.length; i++) {
//					linha[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
//				}
//
//				for (int i = 0; i < linha1525.length; i++) {
//					for (int j = 0; j < linha.length; j++) {
//						if (linha1525[i] == linha[j]) {
//							cont++;
//						}
//					}
//				}
//
//				if (cont == NumeroEnum.QUINZE.getValor()) {
//					retorno = true;
//				}
//			}
//		} else {
//			System.out.println("### Arquivo nao encontrado... ###");
//		}
//		
//		return retorno;
//	}
//	
//	public void juntar89_1416() throws URISyntaxException, IOException, LotoException {
//		
//		FileWriter arquivo = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\89_1416.csv");
//		PrintWriter gravarArquivo = new PrintWriter(arquivo);
//		
//		List<String> lista89 = gerar89();
//		List<String> lista1416 = gerar1416();
//		List<String> listaCompleta = new ArrayList<String>();
//		
//		for (String lista : lista89) {
//			for (String listaDois : lista1416) {
//				listaCompleta.add(lista + "," + listaDois);
//			}
//		}
//		
//		for (String listaNova : listaCompleta) {
//			System.out.println(listaNova);
//			gravarArquivo.printf("%s%n", listaNova);
//		}
//		
//		arquivo.close();
//		gravarArquivo.close();
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 89 = 9
//	 * 
//	 * @return List<String>
//	 */
//	public List<String> gerar89() throws URISyntaxException, IOException, LotoException {
////		FileWriter arquivo89 = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\8_9\\8_9.csv");
////		PrintWriter gravarArquivo89 = new PrintWriter(arquivo89);
//		int cont = 0;
//		List<String> lista89 = new ArrayList<String>();
//		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 8);
//		while (comb1.hasNext()) {
//			cont++;
//			String lista = null;
//			saida = comb1.next();
//			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//					saida[5] + "," + saida[6] + "," + saida[7];
////			gravarArquivo89.printf("%s%n", lista);
//			lista89.add(lista);
//		}
////		arquivo89.close();
////		gravarArquivo89.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 8_9: " + cont);
//		return lista89;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1416 = 120
//	 * 
//	 * @return List<String>
//	 */
//	public List<String> gerar1416() throws URISyntaxException, IOException, LotoException {
////		FileWriter arquivo1416 = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\14_16\\14_16.csv");
////		PrintWriter gravarArquivo1416 = new PrintWriter(arquivo1416);
//		int cont = 0;
//		List<String> lista1416 = new ArrayList<String>();
//		int[] str = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 14);
//		while (comb1.hasNext()) {
//			cont++;
//			String lista = null;
//			saida = comb1.next();
//			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13];
////			gravarArquivo1416.printf("%s%n", lista);
//			lista1416.add(lista);
//		}
////		arquivo1416.close();
////		gravarArquivo1416.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 14_16: " + cont);
//		return lista1416;
//	}
//	
//	public void gravarRNP05(List<String> listaCombinacoes1525) throws URISyntaxException, IOException, LotoException {
//
//		FileWriter arquivo = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\20_25-53130\\RNP05-MAIS-SAIU.csv");
//		PrintWriter gravarArquivo = new PrintWriter(arquivo);
//
//		for (String lista15 : listaCombinacoes1525) {
//			String[] linha15 = lista15.split(",");
//			String lista = null;
//			lista = linha15[0] + "," + linha15[1] + "," + linha15[2] + "," + linha15[3] + "," + linha15[4] + ","
//					+ linha15[5] + "," + linha15[6] + "," + linha15[7] + "," + linha15[8] + "," + linha15[9] + ","
//					+ linha15[10] + "," + linha15[11] + "," + linha15[12] + "," + linha15[13] + "," + linha15[14];
//			
//			gravarArquivo.printf("%s%n", lista);
//		}
//		arquivo.close();
//		gravarArquivo.close();
//	}
//	
//	public void gravarRNP06(List<String> listaCombinacoes1525) throws URISyntaxException, IOException, LotoException {
//
//		FileWriter arquivo = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\20_25-53130\\RNP06-MAIS-SAIU.csv");
//		PrintWriter gravarArquivo = new PrintWriter(arquivo);
//
//		for (String lista15 : listaCombinacoes1525) {
//			String[] linha15 = lista15.split(",");
//			String lista = null;
//			lista = linha15[0] + "," + linha15[1] + "," + linha15[2] + "," + linha15[3] + "," + linha15[4] + ","
//					+ linha15[5] + "," + linha15[6] + "," + linha15[7] + "," + linha15[8] + "," + linha15[9] + ","
//					+ linha15[10] + "," + linha15[11] + "," + linha15[12] + "," + linha15[13] + "," + linha15[14];
//			
//			gravarArquivo.printf("%s%n", lista);
//		}
//		arquivo.close();
//		gravarArquivo.close();
//	}
//	
//	public void gravarRNP07(List<String> listaCombinacoes1525) throws URISyntaxException, IOException, LotoException {
//
//		FileWriter arquivo = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\20_25-53130\\RNP07-MAIS-SAIU.csv");
//		PrintWriter gravarArquivo = new PrintWriter(arquivo);
//
//		for (String lista15 : listaCombinacoes1525) {
//			String[] linha15 = lista15.split(",");
//			String lista = null;
//			lista = linha15[0] + "," + linha15[1] + "," + linha15[2] + "," + linha15[3] + "," + linha15[4] + ","
//					+ linha15[5] + "," + linha15[6] + "," + linha15[7] + "," + linha15[8] + "," + linha15[9] + ","
//					+ linha15[10] + "," + linha15[11] + "," + linha15[12] + "," + linha15[13] + "," + linha15[14];
//			
//			gravarArquivo.printf("%s%n", lista);
//		}
//		arquivo.close();
//		gravarArquivo.close();
//	}
//	
//	public void gravarRNP08(List<String> listaCombinacoes1525) throws URISyntaxException, IOException, LotoException {
//
//		FileWriter arquivo = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\20_25-53130\\RNP08-MAIS-SAIU.csv");
//		PrintWriter gravarArquivo = new PrintWriter(arquivo);
//
//		for (String lista15 : listaCombinacoes1525) {
//			String[] linha15 = lista15.split(",");
//			String lista = null;
//			lista = linha15[0] + "," + linha15[1] + "," + linha15[2] + "," + linha15[3] + "," + linha15[4] + ","
//					+ linha15[5] + "," + linha15[6] + "," + linha15[7] + "," + linha15[8] + "," + linha15[9] + ","
//					+ linha15[10] + "," + linha15[11] + "," + linha15[12] + "," + linha15[13] + "," + linha15[14];
//			
//			gravarArquivo.printf("%s%n", lista);
//		}
//		arquivo.close();
//		gravarArquivo.close();
//	}
//	
//	public void gravarRNP09(List<String> listaCombinacoes1525) throws URISyntaxException, IOException, LotoException {
//
//		FileWriter arquivo = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\20_25-53130\\RNP09-MAIS-SAIU.csv");
//		PrintWriter gravarArquivo = new PrintWriter(arquivo);
//
//		for (String lista15 : listaCombinacoes1525) {
//			String[] linha15 = lista15.split(",");
//			String lista = null;
//			lista = linha15[0] + "," + linha15[1] + "," + linha15[2] + "," + linha15[3] + "," + linha15[4] + ","
//					+ linha15[5] + "," + linha15[6] + "," + linha15[7] + "," + linha15[8] + "," + linha15[9] + ","
//					+ linha15[10] + "," + linha15[11] + "," + linha15[12] + "," + linha15[13] + "," + linha15[14];
//			
//			gravarArquivo.printf("%s%n", lista);
//		}
//		arquivo.close();
//		gravarArquivo.close();
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarNaoSaiuDezUm() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\naosaiudez\\1_10.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 2, 3, 5, 8, 13, 14, 17, 22, 23, 25 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 1);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + ",";
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 1_10: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarNaoSaiuDezDois() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\naosaiudez\\2_10.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 2, 3, 5, 8, 13, 14, 17, 22, 23, 25 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 2);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 2_10: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarNaoSaiuDezTres() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\naosaiudez\\3_10.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 2, 3, 5, 8, 13, 14, 17, 22, 23, 25 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 3);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 3_10: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarNaoSaiuDezQuatro() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\naosaiudez\\4_10.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 2, 3, 5, 8, 13, 14, 17, 22, 23, 25 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 4);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 4_10: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarNaoSaiuDezCinco() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\naosaiudez\\5_10.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 2, 3, 5, 8, 13, 14, 17, 22, 23, 25 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 5);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 5_10: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarNaoSaiuDezSeis() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\naosaiudez\\6_10.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 2, 3, 5, 8, 13, 14, 17, 22, 23, 25 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 6);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + saida[5];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 6_10: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarNaoSaiuDezSete() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\naosaiudez\\7_10.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 2, 3, 5, 8, 13, 14, 17, 22, 23, 25 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 7);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + saida[5] + "," + saida[6];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 7_10: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarNaoSaiuDezOito() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\naosaiudez\\8_10.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 2, 3, 5, 8, 13, 14, 17, 22, 23, 25 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 8);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + saida[5] + "," + saida[6] + "," + saida[7];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 8_10: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarNaoSaiuDezNove() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\naosaiudez\\9_10.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 2, 3, 5, 8, 13, 14, 17, 22, 23, 25 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 9);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] 
//						+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 9_10: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarNaoSaiuDezDez() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\naosaiudez\\10_10.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 2, 3, 5, 8, 13, 14, 17, 22, 23, 25 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 10);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] 
//						+ "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 10_10: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarSaiuQuinzeCinco() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\saiuquinze\\5_15.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 1, 4, 6, 7, 8, 10, 11, 12, 15, 16, 17, 18, 19, 20, 21 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 5);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 5_15: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarSaiuQuinzeSeis() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\saiuquinze\\6_15.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 1, 4, 6, 7, 8, 10, 11, 12, 15, 16, 17, 18, 19, 20, 21 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 6);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + saida[5];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 6_15: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarSaiuQuinzeSete() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\saiuquinze\\7_15.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 1, 4, 6, 7, 8, 10, 11, 12, 15, 16, 17, 18, 19, 20, 21 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 7);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + saida[5] + "," + saida[6];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 7_15: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarSaiuQuinzeOito() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\saiuquinze\\8_15.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 1, 4, 6, 7, 8, 10, 11, 12, 15, 16, 17, 18, 19, 20, 21 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 8);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
//						 + "," + saida[5] + "," + saida[6] + "," + saida[7];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 8_15: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarSaiuQuinzeNove() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\saiuquinze\\9_15.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 1, 4, 6, 7, 8, 10, 11, 12, 15, 16, 17, 18, 19, 20, 21 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 9);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
//						 + "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 9_15: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarSaiuQuinzeDez() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\saiuquinze\\10_15.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 1, 4, 6, 7, 8, 10, 11, 12, 15, 16, 17, 18, 19, 20, 21 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 10);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
//						 + "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 10_15: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarSaiuQuinzeOnze() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\saiuquinze\\11_15.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 1, 4, 6, 7, 8, 10, 11, 12, 15, 16, 17, 18, 19, 20, 21 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 11);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
//						 + "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + saida[10];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 11_15: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarSaiuQuinzeDoze() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\saiuquinze\\12_15.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 1, 4, 6, 7, 8, 10, 11, 12, 15, 16, 17, 18, 19, 20, 21 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 12);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
//						 + "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] 
//						 + "," + saida[10] + "," + saida[11];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 12_15: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarSaiuQuinzeTreze() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\saiuquinze\\13_15.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 1, 4, 6, 7, 8, 10, 11, 12, 15, 16, 17, 18, 19, 20, 21 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 13);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
//						 + "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] 
//						 + "," + saida[10] + "," + saida[11] + "," + saida[12];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 13_15: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarSaiuQuinzeQuatorze() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\saiuquinze\\14_15.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 1, 4, 6, 7, 8, 10, 11, 12, 15, 16, 17, 18, 19, 20, 21 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 14);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
//						 + "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] 
//						 + "," + saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 14_15: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> gerarSaiuQuinzeQuinze() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\saiuquinze\\15_15.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] str = { 1, 4, 6, 7, 8, 10, 11, 12, 15, 16, 17, 18, 19, 20, 21 };
//		int[] saida;
//		Combinacoes comb1 = new Combinacoes(str, 15);
//		//RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			String lista = null;
//			saida = comb1.next();
//			//if (rnp05.aplicar(saida)) {
//				cont++;
//				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4]
//						 + "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] 
//						 + "," + saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
//				gravarArquivoRNP05.printf("%s%n", lista);
//				lista1525.add(lista);
//			//}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_15: " + cont);
//		return lista1525;
//	}
//	
//	/**
//	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
//	 * @return
//	 * @throws LotoException
//	 */
//	public List<String> juntarNaoSaiuDezSeisESaiuQuinzeNove() throws URISyntaxException, IOException, LotoException  {
//		FileWriter arquivoRNP05 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\naosaiudez\\6_10_e_9_15.csv");
//		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
//		int cont = 0;
//		List<String> lista1525 = new ArrayList<String>();
//		int[] strNaoSaiu = { 3, 4, 7, 8, 9, 14, 16, 19, 22, 25 };
//		int[] strSaiu = { 1, 2, 5, 6, 10, 11, 12, 13, 15, 17, 18, 20, 21, 23, 24 };
//		int[] saida;
//		int[] saida2;
//		Combinacoes comb1 = new Combinacoes(strNaoSaiu, 6);
//		RNP05 rnp05 = new RNP05();
//		while (comb1.hasNext()) {
//			saida = comb1.next();
//			Combinacoes comb2 = new Combinacoes(strSaiu, 9);
//			while (comb2.hasNext()) {
//				String lista = null;
//				saida2 = comb2.next();
//					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + saida[5]
//							+ "," + saida2[0] + "," + saida2[1] + "," + saida2[2] + "," + saida2[3] + "," + saida2[4]
//									+ "," + saida2[5] + "," + saida2[6] + "," + saida2[7] + "," + saida2[8];
//					int[] juntado = { saida[0],saida[1],saida[2],saida[3],saida[4],saida[5],saida2[0],saida2[1],saida2[2],saida2[3],saida2[4],saida2[5],saida2[6],saida2[7],saida2[8] };
//				if (rnp05.aplicar(juntado)) {
//					cont++;
//					gravarArquivoRNP05.printf("%s%n", lista);
//					lista1525.add(lista);
//				}
//			}
//		}
//		arquivoRNP05.close();
//		gravarArquivoRNP05.close();
//		System.out.println("TOTAL DE LINHAS NO ARQUIVO 6_10: " + cont);
//		return lista1525;
//	}

}

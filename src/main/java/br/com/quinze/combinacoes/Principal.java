package br.com.quinze.combinacoes;

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

import br.com.quinze.enumerador.NumeroEnum;
import br.com.quinze.excecao.LotoException;



public class Principal {

	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		Principal principal = new Principal();
		Combinacoes1525 combinacoes1525 = new Combinacoes1525();
		List<String> listaCombinacoes1525 = combinacoes1525.gerar1525();
		System.out.println("listaCombinacoes1525: " + listaCombinacoes1525.size());
		
		/********************************************************************
		 * RPN05
		 */
		/*System.out.println("**************RPN05****************************");
		List<String> listaCombinacoesRNP05 = combinacoes1525.gerar1525RNP05();
		System.out.println("listaCombinacoesRNP05: " + listaCombinacoesRNP05.size());
		
		List<String> listaCincoRPN05 = principal.resultadoNumerosMenorQueDezCINCO(listaCombinacoesRNP05);
		System.out.println("listaCincoRNP05: " + listaCincoRPN05.size());
		List<String> listaSeisRPN05 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP05);
		System.out.println("listaSeisRNP05: " + listaSeisRPN05.size());
		List<String> lista = new ArrayList<String>();
		for (String lCinco : listaCincoRPN05) {
			lista.add(lCinco);
		}
		
		for (String lSeis : listaSeisRPN05) {
			lista.add(lSeis);
		}
		
		List<String> listaSaiu15 = principal.retirarSaiu15(lista);
		System.out.println("Lista Retirar Saiu 15: " + listaSaiu15.size());
		
		List<String> listaSaiu14 = principal.retirarSaiu14(listaSaiu15);
		System.out.println("Lista Retirar Saiu 14: " + listaSaiu14.size());
		
		List<String> listaFechamentoCinco = principal.fechamento14(listaSaiu14);
		principal.imprimirNaTela(listaFechamentoCinco);
		*/
		
		/*********************************************************************
		 * RNP06
		 */
		/*System.out.println("**************RPN06****************************");
		List<String> listaCombinacoesRNP06 = combinacoes1525.gerar1525RNP06();
		System.out.println("listaCombinacoesRNP06: " + listaCombinacoesRNP06.size());
		
		List<String> listaQuatroRPN06 = principal.resultadoNumerosMenorQueDezQUATRO(listaCombinacoesRNP06);
		System.out.println("listaQuatroRNP06: " + listaQuatroRPN06.size());
		List<String> listaCincoRPN06 = principal.resultadoNumerosMenorQueDezCINCO(listaCombinacoesRNP06);
		System.out.println("listaCincoRNP06: " + listaCincoRPN06.size());
		List<String> listaSeisRPN06 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP06);
		System.out.println("listaSeisRNP06: " + listaSeisRPN06.size());
		List<String> lista = new ArrayList<String>();
		for (String lQuatro : listaQuatroRPN06) {
			lista.add(lQuatro);
		}
		
		for (String lCinco : listaCincoRPN06) {
			lista.add(lCinco);
		}
		
		for (String lSeis : listaSeisRPN06) {
			lista.add(lSeis);
		}
		
		List<String> listaSaiu15 = principal.retirarSaiu15(lista);
		System.out.println("Lista Retirar Saiu 15: " + listaSaiu15.size());
		
		List<String> listaSaiu14 = principal.retirarSaiu14(listaSaiu15);
		System.out.println("Lista Retirar Saiu 14: " + listaSaiu14.size());
		
		List<String> listaFechamentoCinco = principal.fechamento14(listaSaiu14);
		principal.imprimirNaTela(listaFechamentoCinco);
		*/
		
		
		/*********************************************************************
		 * RNP07
		 */
		/*System.out.println("**************RPN07****************************");
		List<String> listaCombinacoesRNP07 = combinacoes1525.gerar1525RNP07();
		System.out.println("listaCombinacoesRNP07: " + listaCombinacoesRNP07.size());
		
		List<String> listaQuatroRPN07 = principal.resultadoNumerosMenorQueDezQUATRO(listaCombinacoesRNP07);
		System.out.println("listaQuatroRNP07: " + listaQuatroRPN07.size());
		List<String> listaCincoRPN07 = principal.resultadoNumerosMenorQueDezCINCO(listaCombinacoesRNP07);
		System.out.println("listaCincoRNP07: " + listaCincoRPN07.size());
		List<String> listaSeisRPN07 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP07);
		System.out.println("listaSeisRNP07: " + listaSeisRPN07.size());
		List<String> lista = new ArrayList<String>();
		for (String lQuatro : listaQuatroRPN07) {
			lista.add(lQuatro);
		}
		
		for (String lCinco : listaCincoRPN07) {
			lista.add(lCinco);
		}
		
		for (String lSeis : listaSeisRPN07) {
			lista.add(lSeis);
		}
		
		List<String> listaSaiu15 = principal.retirarSaiu15(lista);
		System.out.println("Lista Retirar Saiu 15: " + listaSaiu15.size());
		
		List<String> listaSaiu14 = principal.retirarSaiu14(listaSaiu15);
		System.out.println("Lista Retirar Saiu 14: " + listaSaiu14.size());
		
		List<String> listaFechamentoCinco = principal.fechamento14(listaSaiu14);
		principal.imprimirNaTela(listaFechamentoCinco);
		*/
		
		/**********************************************************************
		 * RPN08
		 */
		/*System.out.println("**************RPN08****************************");
		List<String> listaCombinacoesRNP08 = combinacoes1525.gerar1525RNP08();
		System.out.println("listaCombinacoesRNP08: " + listaCombinacoesRNP08.size());
		
		List<String> listaQuatroRPN08 = principal.resultadoNumerosMenorQueDezQUATRO(listaCombinacoesRNP08);
		System.out.println("listaQuatroRNP08: " + listaQuatroRPN08.size());
		List<String> listaCincoRPN08 = principal.resultadoNumerosMenorQueDezCINCO(listaCombinacoesRNP08);
		System.out.println("listaCincoRNP08: " + listaCincoRPN08.size());
		List<String> listaSeisRPN08 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP08);
		System.out.println("listaSeisRNP08: " + listaSeisRPN08.size());
		List<String> lista = new ArrayList<String>();
		for (String lQuatro : listaQuatroRPN08) {
			lista.add(lQuatro);
		}
		
		for (String lCinco : listaCincoRPN08) {
			lista.add(lCinco);
		}
		
		for (String lSeis : listaSeisRPN08) {
			lista.add(lSeis);
		}
		
		List<String> listaSaiu15 = principal.retirarSaiu15(lista);
		System.out.println("Lista Retirar Saiu 15: " + listaSaiu15.size());
		
		List<String> listaSaiu14 = principal.retirarSaiu14(listaSaiu15);
		System.out.println("Lista Retirar Saiu 14: " + listaSaiu14.size());
		
		List<String> listaFechamentoCinco = principal.fechamento14(listaSaiu14);
		principal.imprimirNaTela(listaFechamentoCinco);
		*/
		
		/**********************************************************************
		 * RPN09
		 */
		/*System.out.println("**************RPN09****************************");
		List<String> listaCombinacoesRNP09 = combinacoes1525.gerar1525RNP09();
		System.out.println("listaCombinacoesRNP09: " + listaCombinacoesRNP09.size());
		
		List<String> listaQuatroRPN09 = principal.resultadoNumerosMenorQueDezQUATRO(listaCombinacoesRNP09);
		System.out.println("listaQuatroRNP09: " + listaQuatroRPN09.size());
		List<String> listaCincoRPN09 = principal.resultadoNumerosMenorQueDezCINCO(listaCombinacoesRNP09);
		System.out.println("listaCincoRNP09: " + listaCincoRPN09.size());
		List<String> listaSeisRPN09 = principal.resultadoNumerosMenorQueDezSEIS(listaCombinacoesRNP09);
		System.out.println("listaSeisRNP09: " + listaSeisRPN09.size());
		List<String> lista = new ArrayList<String>();
		for (String lQuatro : listaQuatroRPN09) {
			lista.add(lQuatro);
		}
		
		for (String lCinco : listaCincoRPN09) {
			lista.add(lCinco);
		}
		
		for (String lSeis : listaSeisRPN09) {
			lista.add(lSeis);
		}
		
		List<String> listaSaiu15 = principal.retirarSaiu15(lista);
		System.out.println("Lista Retirar Saiu 15: " + listaSaiu15.size());
		
		List<String> listaSaiu14 = principal.retirarSaiu14(listaSaiu15);
		System.out.println("Lista Retirar Saiu 14: " + listaSaiu14.size());
		
		List<String> listaFechamentoCinco = principal.fechamento14(listaSaiu14);
		principal.imprimirNaTela(listaFechamentoCinco);
		*/
		
		
	}
	
	public List<String> resultadoNumerosMenorQueDezQUATRO(List<String> listaCombinacoesRNP05)
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

			if (contlinha == NumeroEnum.QUATRO.getValor()) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
						+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
						+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
						+ linha1525[13] + "," + linha1525[14];
				listaResultado.add(lista);
			}
		}

		return listaResultado;
	}
	
	public List<String> resultadoNumerosMenorQueDezCINCO(List<String> listaCombinacoesRNP05)
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

			if (contlinha == NumeroEnum.CINCO.getValor()) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
						+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
						+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
						+ linha1525[13] + "," + linha1525[14];
				listaResultado.add(lista);
			}
		}

		return listaResultado;
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
	
	
	public List<String> retirarSaiu15(List<String> listaCombinacoesRNP05)
			throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP05 = new ArrayList<String>();
		for (String lista15 : listaCombinacoesRNP05) {
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			if (!resultadoRNP0515(linha1525)) {
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
	public boolean resultadoRNP0515(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = Principal.class.getClassLoader().getResource("resultado.csv");
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
			System.out.println("### [ResultadoRNP05.csv] Arquivo nao encontrado... ###");
		}

		return retorno;
	}
	
	public List<String> retirarSaiu14(List<String> listaCombinacoesRNP05)
			throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP05 = new ArrayList<String>();
		for (String lista15 : listaCombinacoesRNP05) {
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			if (!resultadoRNP0514(linha1525)) {
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
	public boolean resultadoRNP0514(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = Principal.class.getClassLoader().getResource("resultado.csv");
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
			System.out.println("### [ResultadoRNP05.csv] Arquivo nao encontrado... ###");
		}

		return retorno;
	}
	
	public List<String> fechamento14(List<String> lista) throws URISyntaxException, IOException, LotoException {

		List<String[]> listaNumeros = new ArrayList<String[]>();
		int contCombinacoes = 0;
//		int contFechamento = 0;
		for (String lista15 : lista) {
			String[] linha15 = lista15.split(",");

			if (contCombinacoes == NumeroEnum.ZERO.getValor()) {
				listaNumeros.add(linha15);
			}

			if (comparaNumerosfechamento14(listaNumeros, linha15)) {
				listaNumeros.add(linha15);
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

		System.out.println("Numero de Combinacoes: " + contCombinacoes);
		System.out.println("Numero  de Fechamentos: " + listaNumeros.size());

		return listaqualquer;
	}
	
	public static boolean comparaNumerosfechamento14(List<String[]> listaNumeros, String[] linhaCombinacoes) {

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
	
	public void imprimirNaTela(List<String> lista) throws URISyntaxException, IOException, LotoException {
		//FileWriter arqSaiu = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\imprimeTela\\imprimeTela.csv");
		//PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		for (String lista15 : lista) {
			String[] linha15 = lista15.split(",");
			//String listagrava = null;

			int[] jogo = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				jogo[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			System.out.println(jogo[0] + "," + jogo[1] + "," + jogo[2] + "," + jogo[3] + "," + jogo[4] + "," + 
			                   jogo[5] + "," + jogo[6] + "," + jogo[7] + "," + jogo[8] + "," + jogo[9] + "," + 
					           jogo[10] + "," + jogo[11] + "," + jogo[12] + "," + jogo[13] + "," + jogo[14]);
			//listagrava = jogo[0] + "," + jogo[1] + "," + jogo[2] + "," + jogo[3] + "," + jogo[4] + "," + 
			//		jogo[5] + "," + jogo[6] + "," + jogo[7] + "," + jogo[8] + "," + jogo[9] + "," + 
			//		jogo[10] + "," + jogo[11] + "," + jogo[12] + "," + jogo[13] + "," + jogo[14];
			//gravarArqSaiu.printf("%s%n", lista15);
		}
		//arqSaiu.close();
		//gravarArqSaiu.close();
	}
	
	
		
}

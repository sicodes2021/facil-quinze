package br.com.quinze.resultado;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import br.com.combinacoes.Combinacoes1525;
import br.com.excecao.LotoException;

public class NaoSaiuDez {
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		//NaoSaiuDez naoSaiuDez = new NaoSaiuDez();
		
		int[] str = { 1,2,6,7,8,9,13,14,16,21,23 };
		
		Combinacoes1525 combinacoes1525 = new Combinacoes1525();
//		List<String> listaCombinacoesNaoSaiuDezUm = combinacoes1525.gerarNaoSaiuDezUm(str);
//		System.out.println("Lista Combinacoes NaoSaiuDezUm: " + listaCombinacoesNaoSaiuDezUm.size());
//		List<String> listaCombinacoesNaoSaiuDezDois = combinacoes1525.gerarNaoSaiuDezDois(str);
//		System.out.println("Lista Combinacoes NaoSaiuDezDois: " + listaCombinacoesNaoSaiuDezDois.size());
//		List<String> listaCombinacoesNaoSaiuDezTres = combinacoes1525.gerarNaoSaiuDezTres(str);
//		System.out.println("Lista Combinacoes NaoSaiuDezTres: " + listaCombinacoesNaoSaiuDezTres.size());
		List<String> listaCombinacoesNaoSaiuDezQuatro = combinacoes1525.gerarNaoSaiuDezQuatro(str);
		System.out.println("Lista Combinacoes NaoSaiuDezQuatro: " + listaCombinacoesNaoSaiuDezQuatro.size());
		List<String> listaCombinacoesNaoSaiuDezCinco = combinacoes1525.gerarNaoSaiuDezCinco(str);
		System.out.println("Lista Combinacoes NaoSaiuDezCinco: " + listaCombinacoesNaoSaiuDezCinco.size());
		List<String> listaCombinacoesNaoSaiuDezSeis = combinacoes1525.gerarNaoSaiuDezSeis(str);
		System.out.println("Lista Combinacoes NaoSaiuDezSeis: " + listaCombinacoesNaoSaiuDezSeis.size());
//		List<String> listaCombinacoesNaoSaiuDezSete = combinacoes1525.gerarNaoSaiuDezSete(str);
//		System.out.println("Lista Combinacoes NaoSaiuDezSete: " + listaCombinacoesNaoSaiuDezSete.size());
//		List<String> listaCombinacoesNaoSaiuDezOito = combinacoes1525.gerarNaoSaiuDezOito(str);
//		System.out.println("Lista Combinacoes NaoSaiuDezOito: " + listaCombinacoesNaoSaiuDezOito.size());
//		List<String> listaCombinacoesNaoSaiuDezNove = combinacoes1525.gerarNaoSaiuDezNove(str);
//		System.out.println("Lista Combinacoes NaoSaiuDezNove: " + listaCombinacoesNaoSaiuDezNove.size());
//		List<String> listaCombinacoesNaoSaiuDezDez = combinacoes1525.gerarNaoSaiuDezDez(str);
//		System.out.println("Lista Combinacoes NaoSaiuDezDez: " + listaCombinacoesNaoSaiuDezDez.size());
	}

}

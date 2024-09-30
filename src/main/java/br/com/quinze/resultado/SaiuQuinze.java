package br.com.quinze.resultado;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import br.com.combinacoes.Combinacoes1525;
import br.com.excecao.LotoException;

public class SaiuQuinze {
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		
		int[] str = { 2,3,4,5,10,11,12,15,17,18,19,20,22,24,25 };
		
		//SaiuQuinze saiuDez = new SaiuQuinze();
		Combinacoes1525 combinacoes1525 = new Combinacoes1525();
//		List<String> listaCombinacoesSaiuQuinzeCinco = combinacoes1525.gerarSaiuQuinzeCinco(str);
//		System.out.println("Lista Combinacoes SaiuQuinzeCinco: " + listaCombinacoesSaiuQuinzeCinco.size());
//		List<String> listaCombinacoesSaiuQuinzeSeis = combinacoes1525.gerarSaiuQuinzeSeis(str);
//		System.out.println("Lista Combinacoes SaiuQuinzeSeis: " + listaCombinacoesSaiuQuinzeSeis.size());
//		List<String> listaCombinacoesSaiuQuinzeSete = combinacoes1525.gerarSaiuQuinzeSete(str);
//		System.out.println("Lista Combinacoes SaiuQuinzeSete: " + listaCombinacoesSaiuQuinzeSete.size());
//		List<String> listaCombinacoesSaiuQuinzeOito = combinacoes1525.gerarSaiuQuinzeOito(str);
//		System.out.println("Lista Combinacoes SaiuQuinzeOito: " + listaCombinacoesSaiuQuinzeOito.size());
		List<String> listaCombinacoesSaiuQuinzeNove = combinacoes1525.gerarSaiuQuinzeNove(str);
		System.out.println("Lista Combinacoes SaiuQuinzeNove: " + listaCombinacoesSaiuQuinzeNove.size());
		List<String> listaCombinacoesSaiuQuinzeDez = combinacoes1525.gerarSaiuQuinzeDez(str);
		System.out.println("Lista Combinacoes SaiuQuinzeDez: " + listaCombinacoesSaiuQuinzeDez.size());
		List<String> listaCombinacoesSaiuQuinzeOnze = combinacoes1525.gerarSaiuQuinzeOnze(str);
		System.out.println("Lista Combinacoes SaiuQuinzeOnze: " + listaCombinacoesSaiuQuinzeOnze.size());
//		List<String> listaCombinacoesSaiuQuinzeDoze = combinacoes1525.gerarSaiuQuinzeDoze(str);
//		System.out.println("Lista Combinacoes SaiuQuinzeDoze: " + listaCombinacoesSaiuQuinzeDoze.size());
//		List<String> listaCombinacoesSaiuQuinzeTreze = combinacoes1525.gerarSaiuQuinzeTreze(str);
//		System.out.println("Lista Combinacoes SaiuQuinzeTreze: " + listaCombinacoesSaiuQuinzeTreze.size());
//		List<String> listaCombinacoesSaiuQuinzeQuatorze = combinacoes1525.gerarSaiuQuinzeQuatorze(str);
//		System.out.println("Lista Combinacoes SaiuQuinzeQuatorze: " + listaCombinacoesSaiuQuinzeQuatorze.size());
//		List<String> listaCombinacoesSaiuQuinzeQuinze = combinacoes1525.gerarSaiuQuinzeQuinze(str);
//		System.out.println("Lista Combinacoes SaiuQuinzeQuinze: " + listaCombinacoesSaiuQuinzeQuinze.size());
	}

}

package br.com.quinze;

import java.io.FileReader;
import java.io.IOException;
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
import br.com.regras.pares.RNP09;
import br.com.regras.sequencia.RNS0105;
import br.com.regras.sequencia.RNS0610;
import br.com.regras.sequencia.RNS1115;
import br.com.regras.sequencia.RNS1620;
import br.com.regras.sequencia.RNS2125;

public class PrincipalRNS_RPN9 {

	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		PrincipalRNS_RPN9 principal = new PrincipalRNS_RPN9();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };


		/*********************************************************************
		 * RNP09
		 */
//		System.out.println("**************RPN09-RNS0105****************************");
//		principal.buscarRPN05_CINCO_NUM_SORTE(str);
//		principal.buscarRPN05_SEIS_NUM_SORTE(str);
//		principal.buscarRPN05_SETE_NUM_SORTE(str);
//		System.out.println("");
//		System.out.println("");
//		System.out.println("**************RPN09-RNS0610****************************");
//		principal.buscarRPN05_RNS0610_QUATRO_NUM_SORTE(str);
//		principal.buscarRPN05_RNS0610_CINCO_NUM_SORTE(str);
//		principal.buscarRPN05_RNS0610_SEIS_NUM_SORTE(str);
//		principal.buscarRPN05_RNS0610_SETE_NUM_SORTE(str);
//		System.out.println("");
//		System.out.println("");
//		System.out.println("**************RPN09-RNS1115****************************");
//		principal.buscarRPN05_RNS1115_QUATRO_NUM_SORTE(str);
//		principal.buscarRPN05_RNS1115_CINCO_NUM_SORTE(str);
//		principal.buscarRPN05_RNS1115_SEIS_NUM_SORTE(str);
//		principal.buscarRPN05_RNS1115_SETE_NUM_SORTE(str);
//		System.out.println("");
//		System.out.println("");
		System.out.println("**************RPN09-RNS1620****************************");
		principal.buscarRPN05_RNS1620_QUATRO_NUM_SORTE(str);
		principal.buscarRPN05_RNS1620_CINCO_NUM_SORTE(str);
		principal.buscarRPN05_RNS1620_SEIS_NUM_SORTE(str);
		principal.buscarRPN05_RNS1620_SETE_NUM_SORTE(str);
		System.out.println("");
		System.out.println("");
//		System.out.println("**************RPN09-RNS2125****************************");
//		principal.buscarRPN05_RNS2125_QUATRO_NUM_SORTE(str);
//		principal.buscarRPN05_RNS2125_CINCO_NUM_SORTE(str);
//		principal.buscarRPN05_RNS2125_SEIS_NUM_SORTE(str);
//		principal.buscarRPN05_RNS2125_SETE_NUM_SORTE(str);
		

	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_CINCO_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS0105 = this.gerar1525RNP05_RNS0105(str);
		List<String> listaCincoRPN05_RNS0105 = this.resultadoNumerosMenorQueDezCINCO(lista1525RNP05_RNS0105, "listaCincoRPN05_RNS0105");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaCincoRPN05_RNS0105);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_SEIS_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS0105 = this.gerar1525RNP05_RNS0105(str);
		List<String> listaSeisRPN05_RNS0105 = this.resultadoNumerosMenorQueDezSEIS(lista1525RNP05_RNS0105, "listaSeisRPN05_RNS0105");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaSeisRPN05_RNS0105);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_SETE_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS0105 = this.gerar1525RNP05_RNS0105(str);
		List<String> listaSeteRPN05_RNS0105 = this.resultadoNumerosMenorQueDezSETE(lista1525RNP05_RNS0105, "listaSeteRPN05_RNS0105");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaSeteRPN05_RNS0105);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_RNS0610_QUATRO_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS0610 = this.gerar1525RNP05_RNS0610(str);
		List<String> listaQuatroRPN05_RNS0610 = this.resultadoNumerosMenorQueDezQUATRO(lista1525RNP05_RNS0610, "listaQuatroRPN05_RNS0610");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaQuatroRPN05_RNS0610);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_RNS0610_CINCO_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS0610 = this.gerar1525RNP05_RNS0610(str);
		List<String> listaCincoRPN05_RNS0610 = this.resultadoNumerosMenorQueDezCINCO(lista1525RNP05_RNS0610, "listaCincoRPN05_RNS0610");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaCincoRPN05_RNS0610);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_RNS0610_SEIS_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS0610 = this.gerar1525RNP05_RNS0610(str);
		List<String> listaSeisRPN05_RNS0610 = this.resultadoNumerosMenorQueDezSEIS(lista1525RNP05_RNS0610, "listaSeisRPN05_RNS0610");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaSeisRPN05_RNS0610);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_RNS0610_SETE_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS0610 = this.gerar1525RNP05_RNS0610(str);
		List<String> listaSeteRPN05_RNS0610 = this.resultadoNumerosMenorQueDezSETE(lista1525RNP05_RNS0610, "listaSeteRPN05_RNS0610");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaSeteRPN05_RNS0610);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_RNS1115_QUATRO_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS1115 = this.gerar1525RNP05_RNS1115(str);
		List<String> listaQuatroRPN05_RNS1115 = this.resultadoNumerosMenorQueDezQUATRO(lista1525RNP05_RNS1115, "listaQuatroRPN05_RNS1115");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaQuatroRPN05_RNS1115);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_RNS1115_CINCO_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS1115 = this.gerar1525RNP05_RNS1115(str);
		List<String> listaCincoRPN05_RNS1115 = this.resultadoNumerosMenorQueDezCINCO(lista1525RNP05_RNS1115, "listaCincoRPN05_RNS1115");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaCincoRPN05_RNS1115);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_RNS1115_SEIS_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS1115 = this.gerar1525RNP05_RNS1115(str);
		List<String> listaSeisRPN05_RNS1115 = this.resultadoNumerosMenorQueDezSEIS(lista1525RNP05_RNS1115, "listaSeisRPN05_RNS1115");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaSeisRPN05_RNS1115);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_RNS1115_SETE_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS1115 = this.gerar1525RNP05_RNS1115(str);
		List<String> listaSeteRPN05_RNS1115 = this.resultadoNumerosMenorQueDezSETE(lista1525RNP05_RNS1115, "listaSeteRPN05_RNS1115");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaSeteRPN05_RNS1115);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_RNS1620_QUATRO_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS1620 = this.gerar1525RNP05_RNS1620(str);
		List<String> listaQuatroRPN05_RNS1620 = this.resultadoNumerosMenorQueDezQUATRO(lista1525RNP05_RNS1620, "listaQuatroRPN05_RNS1620");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaQuatroRPN05_RNS1620);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_RNS1620_CINCO_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS1620 = this.gerar1525RNP05_RNS1620(str);
		List<String> listaCincoRPN05_RNS1620 = this.resultadoNumerosMenorQueDezCINCO(lista1525RNP05_RNS1620, "listaCincoRPN05_RNS1620");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaCincoRPN05_RNS1620);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_RNS1620_SEIS_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS1620 = this.gerar1525RNP05_RNS1620(str);
		List<String> listaSeisRPN05_RNS1620 = this.resultadoNumerosMenorQueDezSEIS(lista1525RNP05_RNS1620, "listaSeisRPN05_RNS1620");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaSeisRPN05_RNS1620);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_RNS1620_SETE_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS1620 = this.gerar1525RNP05_RNS1620(str);
		List<String> listaSeteRPN05_RNS1620 = this.resultadoNumerosMenorQueDezSETE(lista1525RNP05_RNS1620, "listaSeteRPN05_RNS1620");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaSeteRPN05_RNS1620);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_RNS2125_QUATRO_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS2125 = this.gerar1525RNP05_RNS2125(str);
		List<String> listaQuatroRPN05_RNS2125 = this.resultadoNumerosMenorQueDezQUATRO(lista1525RNP05_RNS2125, "listaQuatroRPN05_RNS2125");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaQuatroRPN05_RNS2125);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_RNS2125_CINCO_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS2125 = this.gerar1525RNP05_RNS2125(str);
		List<String> listaCincoRPN05_RNS2125 = this.resultadoNumerosMenorQueDezCINCO(lista1525RNP05_RNS2125, "listaCincoRPN05_RNS2125");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaCincoRPN05_RNS2125);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_RNS2125_SEIS_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS2125 = this.gerar1525RNP05_RNS2125(str);
		List<String> listaSeisRPN05_RNS2125 = this.resultadoNumerosMenorQueDezSEIS(lista1525RNP05_RNS2125, "listaSeisRPN05_RNS2125");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaSeisRPN05_RNS2125);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_RNS2125_SETE_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_RNS2125 = this.gerar1525RNP05_RNS2125(str);
		List<String> listaSeteRPN05_RNS2125 = this.resultadoNumerosMenorQueDezSETE(lista1525RNP05_RNS2125, "listaSeteRPN05_RNS2125");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaSeteRPN05_RNS2125);
//		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu15RPN05);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP05);
		return listaRandom;
	}
	
	
	
	public List<String> resultadoNumerosMenorQueDezQUATRO(List<String> listaCombinacoesRNP05, String nomeLista)
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

		System.out.println(nomeLista + ": " + listaResultado.size());
		return listaResultado;
	}

	public List<String> resultadoNumerosMenorQueDezCINCO(List<String> listaCombinacoesRNP05, String nomeLista)
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

		System.out.println(nomeLista + ": " + listaResultado.size());
		return listaResultado;
	}
	
	public List<String> resultadoNumerosMenorQueDezSEIS(List<String> listaCombinacoesRNP05, String nomeLista)
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

		System.out.println(nomeLista + ": " + listaResultado.size());
		return listaResultado;
	}
	
	public List<String> resultadoNumerosMenorQueDezSETE(List<String> listaCombinacoesRNP05, String nomeLista)
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

			if (contlinha == NumeroEnum.SETE.getValor()) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
						+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
						+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
						+ linha1525[13] + "," + linha1525[14];
				listaResultado.add(lista);
			}
		}

		System.out.println(nomeLista + ": " + listaResultado.size());
		return listaResultado;
	}

	public List<String> retirarSaiu15RNP05(List<String> listaCombinacoesRNP05)
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

		System.out.println("Lista Retirar Saiu 15: " + listaRNP05.size());
		return listaRNP05;
	}

	@SuppressWarnings("deprecation")
	public boolean resultadoRNP0515(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = PrincipalRNS_RPN9.class.getClassLoader().getResource("resultado.csv");
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

	public List<String> retirarSaiu14RNP05(List<String> listaCombinacoesRNP05)
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

		System.out.println("Lista Retirar Saiu 14: " + listaRNP05.size());
		return listaRNP05;
	}

	@SuppressWarnings("deprecation")
	public boolean resultadoRNP0514(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = PrincipalRNS_RPN9.class.getClassLoader().getResource("resultado.csv");
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

//		System.out.println("Numero de Combinacoes: " + contCombinacoes);
		System.out.println("Numero  de Fechamentos: " + listaNumeros.size());
//		System.out.println("Numero  de NAO Fechamentos: " + listaNAONumeros.size());

		return listaqualquer;
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

	public List<String> gravarRandom(List<String> lista) throws URISyntaxException, IOException, LotoException {
		List<String[]> listaNumeros = new ArrayList<String[]>();
		for (int i = 0; i < 1; i++) {
			String lista15Random = this.getRandomElement(lista);
			String[] linha15Random = lista15Random.split(",");
			listaNumeros.add(linha15Random);
		}

		String listaNova = null;
		List<String> listaqualquer = new ArrayList<String>();
		for (String[] linha1525 : listaNumeros) {
			listaNova = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
					+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
					+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
					+ linha1525[13] + "," + linha1525[14];
			System.out.println(listaNova);
			listaqualquer.add(listaNova);
		}

		return listaqualquer;
	}

	public String getRandomElement(List<String> lista) {
		Random rand = new Random();
		return lista.get(rand.nextInt(lista.size()));
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_rns0105
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP05_RNS0105(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP09 rnp09 = new RNP09();
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp09.aplicar(saida)) {
				if (rns0105.aplicar(saida)) {
					if (!rns0610.aplicar(saida)) {
						if (!rns1115.aplicar(saida)) {
							if (!rns1620.aplicar(saida)) {
								if (!rns2125.aplicar(saida)) {
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
		
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_rns0105
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP05_RNS0610(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP09 rnp09 = new RNP09();
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp09.aplicar(saida)) {
				if (!rns0105.aplicar(saida)) {
					if (rns0610.aplicar(saida)) {
						if (!rns1115.aplicar(saida)) {
							if (!rns1620.aplicar(saida)) {
								if (!rns2125.aplicar(saida)) {
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
		
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_rns0105
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP05_RNS1115(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP09 rnp09 = new RNP09();
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp09.aplicar(saida)) {
				if (!rns0105.aplicar(saida)) {
					if (!rns0610.aplicar(saida)) {
						if (rns1115.aplicar(saida)) {
							if (!rns1620.aplicar(saida)) {
								if (!rns2125.aplicar(saida)) {
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
		
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_rns0105
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP05_RNS1620(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP09 rnp09 = new RNP09();
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp09.aplicar(saida)) {
				if (!rns0105.aplicar(saida)) {
					if (!rns0610.aplicar(saida)) {
						if (!rns1115.aplicar(saida)) {
							if (rns1620.aplicar(saida)) {
								if (!rns2125.aplicar(saida)) {
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
		
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_rns0105
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP05_RNS2125(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP09 rnp09 = new RNP09();
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp09.aplicar(saida)) {
				if (!rns0105.aplicar(saida)) {
					if (!rns0610.aplicar(saida)) {
						if (!rns1115.aplicar(saida)) {
							if (!rns1620.aplicar(saida)) {
								if (rns2125.aplicar(saida)) {
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
		
		return lista1525;
	}
	
	

}

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
import br.com.regras.pares.RNP05;
import br.com.regras.pares.RNP06;
import br.com.regras.pares.RNP07;
import br.com.regras.pares.RNP08;
import br.com.regras.pares.RNP09;
import br.com.regras.sequencia.RNS0105;
import br.com.regras.sequencia.RNS0610;
import br.com.regras.sequencia.RNS1115;
import br.com.regras.sequencia.RNS1620;
import br.com.regras.sequencia.RNS2125;

public class PrincipalRNS {

	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		PrincipalRNS principal = new PrincipalRNS();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };


		/*********************************************************************
		 * RNP05
		 */
		System.out.println("");
		System.out.println("");
		System.out.println("**************RPN05****************************");
		System.out.println("");
		List<String> RPN05_CINCO_NUM_SORTE = principal.buscarRPN05_CINCO_NUM_SORTE(str);
		List<String> RPN05_SEIS_NUM_SORTE = principal.buscarRPN05_SEIS_NUM_SORTE(str);
		
		/*********************************************************************
		 * RNP06
		 */
		System.out.println("");
		System.out.println("");
		System.out.println("**************RPN06****************************");
		System.out.println("");
		List<String> RPN06_CINCO_NUM_SORTE = principal.buscarRPN06_CINCO_NUM_SORTE(str);
		List<String> RPN06_SEIS_NUM_SORTE = principal.buscarRPN06_SEIS_NUM_SORTE(str);
		
		/*********************************************************************
		 * RNP07
		 */
		System.out.println("");
		System.out.println("");
		System.out.println("**************RPN07****************************");
		System.out.println("");
		List<String> RPN07_QUATRO_NUM_SORTE = principal.buscarRPN07_QUATRO_NUM_SORTE(str);
		List<String> RPN07_CINCO_NUM_SORTE = principal.buscarRPN07_CINCO_NUM_SORTE(str);
		List<String> RPN07_SEIS_NUM_SORTE = principal.buscarRPN07_SEIS_NUM_SORTE(str);
		
		
		/**********************************************************************
		 * RPN08
		 */
		System.out.println("");
		System.out.println("");
		System.out.println("**************RPN08****************************");
		System.out.println("");
		List<String> RPN08_QUATRO_NUM_SORTE = principal.buscarRPN08_QUATRO_NUM_SORTE(str);
		List<String> RPN08_CINCO_NUM_SORTE = principal.buscarRPN08_CINCO_NUM_SORTE(str);
		List<String> RPN08_SEIS_NUM_SORTE = principal.buscarRPN08_SEIS_NUM_SORTE(str);
		
		
		/**********************************************************************
		 * RPN09
		 */
		System.out.println("");
		System.out.println("");
		System.out.println("**************RPN09****************************");
		System.out.println("");
		List<String> RPN09_QUATRO_NUM_SORTE = principal.buscarRPN09_QUATRO_NUM_SORTE(str);
		List<String> RPN09_CINCO_NUM_SORTE = principal.buscarRPN09_CINCO_NUM_SORTE(str);
		List<String> RPN09_SEIS_NUM_SORTE = principal.buscarRPN09_SEIS_NUM_SORTE(str);
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP05_SEM_RNS(int[] str) throws URISyntaxException, IOException, LotoException {
		
		List<String> lista1525 = new ArrayList<String>();
		
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP05 rnp05 = new RNP05();
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp05.aplicar(saida)) {
				if (!rns0105.aplicar(saida)) {
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
	 * rnp06_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP06_SEM_RNS(int[] str) throws URISyntaxException, IOException, LotoException {
		
		List<String> lista1525 = new ArrayList<String>();
		
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP06 rnp06 = new RNP06();
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp06.aplicar(saida)) {
				if (!rns0105.aplicar(saida)) {
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
	 * rnp07_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP07_SEM_RNS(int[] str) throws URISyntaxException, IOException, LotoException {
		
		List<String> lista1525 = new ArrayList<String>();
		
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
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp08_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08_SEM_RNS(int[] str) throws URISyntaxException, IOException, LotoException {
		
		List<String> lista1525 = new ArrayList<String>();
		
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
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp09
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP09_SEM_RNS(int[] str) throws URISyntaxException, IOException, LotoException {
		
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
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN05_CINCO_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP05_SEM_RNS = this.gerar1525RNP05_SEM_RNS(str);
		List<String> listaCincoRPN05_SEM_RNS = this.resultadoNumerosMenorQueDezCINCO(lista1525RNP05_SEM_RNS, "listaCincoRPN05_SEM_RNS");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaCincoRPN05_SEM_RNS);
		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu14RNP05);
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
		List<String> lista1525RNP05_SEM_RNS = this.gerar1525RNP05_SEM_RNS(str);
		List<String> listaCincoRPN05_SEM_RNS = this.resultadoNumerosMenorQueDezSEIS(lista1525RNP05_SEM_RNS, "listaSeisRPN05_SEM_RNS");
		List<String> listaSaiu15RPN05 = this.retirarSaiu15RNP05(listaCincoRPN05_SEM_RNS);
		List<String> listaSaiu14RNP05 = this.retirarSaiu14RNP05(listaSaiu15RPN05);
		List<String> listaFechamentoRNP05 = this.fechamento(listaSaiu14RNP05);
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
	public List<String> buscarRPN06_CINCO_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP06_SEM_RNS = this.gerar1525RNP06_SEM_RNS(str);
		List<String> listaCincoRPN06_SEM_RNS = this.resultadoNumerosMenorQueDezCINCO(lista1525RNP06_SEM_RNS, "listaCincoRPN06_SEM_RNS");
		List<String> listaSaiu15RPN06 = this.retirarSaiu15RNP05(listaCincoRPN06_SEM_RNS);
		List<String> listaSaiu14RNP06 = this.retirarSaiu14RNP05(listaSaiu15RPN06);
		List<String> listaFechamentoRNP06 = this.fechamento(listaSaiu14RNP06);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP06);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN06_SEIS_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP06_SEM_RNS = this.gerar1525RNP06_SEM_RNS(str);
		List<String> listaCincoRPN06_SEM_RNS = this.resultadoNumerosMenorQueDezSEIS(lista1525RNP06_SEM_RNS, "listaSeisRPN06_SEM_RNS");
		List<String> listaSaiu15RPN06 = this.retirarSaiu15RNP05(listaCincoRPN06_SEM_RNS);
		List<String> listaSaiu14RNP06 = this.retirarSaiu14RNP05(listaSaiu15RPN06);
		List<String> listaFechamentoRNP06 = this.fechamento(listaSaiu14RNP06);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP06);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN07_QUATRO_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP07_SEM_RNS = this.gerar1525RNP07_SEM_RNS(str);
		List<String> listaQuatroRPN07_SEM_RNS = this.resultadoNumerosMenorQueDezQUATRO(lista1525RNP07_SEM_RNS, "listaQuatroRPN07_SEM_RNS");
		List<String> listaSaiu15RPN07 = this.retirarSaiu15RNP05(listaQuatroRPN07_SEM_RNS);
		List<String> listaSaiu14RNP07 = this.retirarSaiu14RNP05(listaSaiu15RPN07);
		List<String> listaFechamentoRNP07 = this.fechamento(listaSaiu14RNP07);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP07);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN07_CINCO_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP07_SEM_RNS = this.gerar1525RNP07_SEM_RNS(str);
		List<String> listaCincoRPN07_SEM_RNS = this.resultadoNumerosMenorQueDezCINCO(lista1525RNP07_SEM_RNS, "listaCincoRPN07_SEM_RNS");
		List<String> listaSaiu15RPN07 = this.retirarSaiu15RNP05(listaCincoRPN07_SEM_RNS);
		List<String> listaSaiu14RNP07 = this.retirarSaiu14RNP05(listaSaiu15RPN07);
		List<String> listaFechamentoRNP07 = this.fechamento(listaSaiu14RNP07);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP07);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN07_SEIS_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP07_SEM_RNS = this.gerar1525RNP07_SEM_RNS(str);
		List<String> listaSeisRPN07_SEM_RNS = this.resultadoNumerosMenorQueDezSEIS(lista1525RNP07_SEM_RNS, "listaSeisRPN07_SEM_RNS");
		List<String> listaSaiu15RPN07 = this.retirarSaiu15RNP05(listaSeisRPN07_SEM_RNS);
		List<String> listaSaiu14RNP07 = this.retirarSaiu14RNP05(listaSaiu15RPN07);
		List<String> listaFechamentoRNP07 = this.fechamento(listaSaiu14RNP07);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP07);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN08_QUATRO_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP08_SEM_RNS = this.gerar1525RNP08_SEM_RNS(str);
		List<String> listaQuatroRPN08_SEM_RNS = this.resultadoNumerosMenorQueDezQUATRO(lista1525RNP08_SEM_RNS, "listaQuatroRPN08_SEM_RNS");
		List<String> listaSaiu15RPN08 = this.retirarSaiu15RNP05(listaQuatroRPN08_SEM_RNS);
		List<String> listaSaiu14RNP08 = this.retirarSaiu14RNP05(listaSaiu15RPN08);
		List<String> listaFechamentoRNP08 = this.fechamento(listaSaiu14RNP08);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP08);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN08_CINCO_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP08_SEM_RNS = this.gerar1525RNP08_SEM_RNS(str);
		List<String> listaCincoRPN08_SEM_RNS = this.resultadoNumerosMenorQueDezCINCO(lista1525RNP08_SEM_RNS, "listaCincoRPN08_SEM_RNS");
		List<String> listaSaiu15RPN08 = this.retirarSaiu15RNP05(listaCincoRPN08_SEM_RNS);
		List<String> listaSaiu14RNP08 = this.retirarSaiu14RNP05(listaSaiu15RPN08);
		List<String> listaFechamentoRNP08 = this.fechamento(listaSaiu14RNP08);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP08);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN08_SEIS_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP08_SEM_RNS = this.gerar1525RNP08_SEM_RNS(str);
		List<String> listaSeisRPN08_SEM_RNS = this.resultadoNumerosMenorQueDezSEIS(lista1525RNP08_SEM_RNS, "listaSeisRPN08_SEM_RNS");
		List<String> listaSaiu15RPN08 = this.retirarSaiu15RNP05(listaSeisRPN08_SEM_RNS);
		List<String> listaSaiu14RNP08 = this.retirarSaiu14RNP05(listaSaiu15RPN08);
		List<String> listaFechamentoRNP08 = this.fechamento(listaSaiu14RNP08);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP08);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN09_QUATRO_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP09_SEM_RNS = this.gerar1525RNP09_SEM_RNS(str);
		List<String> listaQuatroRPN09_SEM_RNS = this.resultadoNumerosMenorQueDezQUATRO(lista1525RNP09_SEM_RNS, "listaQuatroRPN09_SEM_RNS");
		List<String> listaSaiu15RPN09 = this.retirarSaiu15RNP05(listaQuatroRPN09_SEM_RNS);
		List<String> listaSaiu14RNP09 = this.retirarSaiu14RNP05(listaSaiu15RPN09);
		List<String> listaFechamentoRNP09 = this.fechamento(listaSaiu14RNP09);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP09);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN09_CINCO_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP09_SEM_RNS = this.gerar1525RNP09_SEM_RNS(str);
		List<String> listaCincoRPN09_SEM_RNS = this.resultadoNumerosMenorQueDezCINCO(lista1525RNP09_SEM_RNS, "listaCincoRPN09_SEM_RNS");
		List<String> listaSaiu15RPN09 = this.retirarSaiu15RNP05(listaCincoRPN09_SEM_RNS);
		List<String> listaSaiu14RNP09 = this.retirarSaiu14RNP05(listaSaiu15RPN09);
		List<String> listaFechamentoRNP09 = this.fechamento(listaSaiu14RNP09);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP09);
		return listaRandom;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial
	 * rnp05_sem_rns
	 * 
	 * @return
	 * @throws LotoException
	 */
	public List<String> buscarRPN09_SEIS_NUM_SORTE(int[] str) throws URISyntaxException, IOException, LotoException {
		List<String> lista1525RNP09_SEM_RNS = this.gerar1525RNP09_SEM_RNS(str);
		List<String> listaSeisRPN09_SEM_RNS = this.resultadoNumerosMenorQueDezSEIS(lista1525RNP09_SEM_RNS, "listaSeisRPN09_SEM_RNS");
		List<String> listaSaiu15RPN09 = this.retirarSaiu15RNP05(listaSeisRPN09_SEM_RNS);
		List<String> listaSaiu14RNP09 = this.retirarSaiu14RNP05(listaSaiu15RPN09);
		List<String> listaFechamentoRNP09 = this.fechamento(listaSaiu14RNP09);
		List<String> listaRandom = this.gravarRandom(listaFechamentoRNP09);
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
		URL resultado = PrincipalRNS.class.getClassLoader().getResource("\\resultado\\ResultadoRNP05.csv");
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
		URL resultado = PrincipalRNS.class.getClassLoader().getResource("resultado.csv");
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
	
	

}

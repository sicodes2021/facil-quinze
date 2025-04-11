package br.com.regras.sequencia;

import java.io.IOException;
import java.net.URISyntaxException;

import br.com.enumerador.NumeroEnum;
import br.com.excecao.LotoException;
import br.com.regras.RegraNegocio;

/**
 * RN01: 
 * Regra Negocial para retirar todas as sequencias de combinacoes entre os
 * numeros de 1 a 5.
 * 
 * @author Santunis.Oliveira
 *
 */
public class RNSRetirar implements RegraNegocio<String[], Boolean> {

	int[] regraCinco = { 1, 2, 3, 4, 5 };

	public Boolean aplicar(String[] entrada) throws LotoException {
		
		boolean retorno = false;
		int contRegra = 0;
		
		int[] linhaEntrada = new int[entrada.length];
		for (int i = 0; i < entrada.length; i++) {
			linhaEntrada[i] = Integer.parseInt(String.valueOf(entrada[i]));
		}
		
		for (int i = 0; i < regraCinco.length; i++) {
			for (int j = 0; j < linhaEntrada.length; j++) {
				if (regraCinco[i] == linhaEntrada[j]) {
					contRegra++;
				}
			}
		}
		
		if (contRegra == NumeroEnum.CINCO.getValor()) {
			retorno = true;
		}

		return retorno;
	}
	
	public Boolean aplicarRetirarTres(String[] entrada, int[] regraTres) throws LotoException {
		
		boolean retorno = false;
		int contRegra = 0;
		
		int[] linhaEntrada = new int[entrada.length];
		for (int i = 0; i < entrada.length; i++) {
			linhaEntrada[i] = Integer.parseInt(String.valueOf(entrada[i]));
		}
		
		for (int i = 0; i < regraTres.length; i++) {
			for (int j = 0; j < linhaEntrada.length; j++) {
				if (regraTres[i] == linhaEntrada[j]) {
					contRegra++;
				}
			}
		}
		
		if (contRegra == NumeroEnum.TRES.getValor()) {
			retorno = true;
		}

		return retorno;
	}
	
	public Boolean aplicar(int[] entrada) throws LotoException {
		
		boolean retorno = false;
		int contRegra = 0;
		
		for (int i = 0; i < regraCinco.length; i++) {
			for (int j = 0; j < entrada.length; j++) {
				if (regraCinco[i] == entrada[j]) {
					contRegra++;
				}
			}
		}
		
		if (contRegra == NumeroEnum.CINCO.getValor()) {
			retorno = true;
		}

		return retorno;
	}
	
	public Boolean aplicarRetirarTres(int[] entrada, int[] regraTres) throws LotoException {
		
		boolean retorno = false;
		int contRegra = 0;
		
		for (int i = 0; i < regraTres.length; i++) {
			for (int j = 0; j < entrada.length; j++) {
				if (regraTres[i] == entrada[j]) {
					contRegra++;
				}
			}
		}
		
		if (contRegra == NumeroEnum.TRES.getValor()) {
			retorno = true;
		}

		return retorno;
	}
	
	public Boolean aplicarRetirarQuatro(int[] entrada, int[] regraQuatro) throws LotoException {
		
		boolean retorno = false;
		int contRegra = 0;
		
		for (int i = 0; i < regraQuatro.length; i++) {
			for (int j = 0; j < entrada.length; j++) {
				if (regraQuatro[i] == entrada[j]) {
					contRegra++;
				}
			}
		}
		
		if (contRegra == NumeroEnum.QUATRO.getValor()) {
			retorno = true;
		}

		return retorno;
	}
	
	public Boolean aplicarRetirarCinco(int[] entrada, int[] regraCinco) throws LotoException {
		
		boolean retorno = false;
		int contRegra = 0;
		
		for (int i = 0; i < regraCinco.length; i++) {
			for (int j = 0; j < entrada.length; j++) {
				if (regraCinco[i] == entrada[j]) {
					contRegra++;
				}
			}
		}
		
		if (contRegra == NumeroEnum.CINCO.getValor()) {
			retorno = true;
		}

		return retorno;
	}
	
	public Boolean aplicarRetirarSeis(int[] entrada, int[] regraSeis) throws LotoException {
		
		boolean retorno = false;
		int contRegra = 0;
		
		for (int i = 0; i < regraSeis.length; i++) {
			for (int j = 0; j < entrada.length; j++) {
				if (regraSeis[i] == entrada[j]) {
					contRegra++;
				}
			}
		}
		
		if (contRegra == NumeroEnum.SEIS.getValor()) {
			retorno = true;
		}

		return retorno;
	}

	public Boolean verificar(String[] entrada) throws LotoException, URISyntaxException, IOException {
		return null;
	}

}

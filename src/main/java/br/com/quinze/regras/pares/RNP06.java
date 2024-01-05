package br.com.quinze.regras.pares;

import java.io.IOException;
import java.net.URISyntaxException;

import br.com.quinze.enumerador.NumeroEnum;
import br.com.quinze.excecao.LotoException;
import br.com.quinze.regras.RegraNegocio;

public class RNP06 implements RegraNegocio<int[], Boolean> {

	public Boolean aplicar(int[] entrada) throws LotoException {

		boolean retorno = false;
		int contLinha = 0;

		for (int i = 0; i < entrada.length; i++) {
			if (entrada[i] % NumeroEnum.DOIS.getValor() == NumeroEnum.ZERO.getValor()) {
				contLinha++;
			}
		}

		if (contLinha == NumeroEnum.SEIS.getValor()) {
			retorno = true;
		}

		return retorno;
	}

	public Boolean verificar(int[] entrada) throws LotoException, URISyntaxException, IOException {
		return null;
	}

}

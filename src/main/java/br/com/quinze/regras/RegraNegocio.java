package br.com.quinze.regras;

import java.io.IOException;
import java.net.URISyntaxException;

import br.com.quinze.excecao.LotoException;

public interface RegraNegocio<F, T> {

	T aplicar(F entrada) throws LotoException;
	
	T verificar(F entrada) throws LotoException, URISyntaxException, IOException;

}

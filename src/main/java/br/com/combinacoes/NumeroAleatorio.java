package br.com.combinacoes;

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

public class NumeroAleatorio {

	public static void main(String[] args) throws NumberFormatException, URISyntaxException, IOException {
		NumeroAleatorio na = new NumeroAleatorio();
		na.random();
	}
	
	
	@SuppressWarnings("deprecation")
	public void random() throws URISyntaxException, NumberFormatException, IOException {
		URL resultado = NumeroAleatorio.class.getClassLoader().getResource("\\rnp07\\PrincipalRNP07RNS0105_CINCO\\FechamentoRNP07RNS0105_CINCO.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			List<String> listaRNP05 = new ArrayList<String>();
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				//String[] linha15 = lista15.split(",");
				for (String linha : linhaResultado) {
					listaRNP05.add(linha);
				}
			}
			for (int i = 0; i <= 10; i++) {
				String lista15Random = getRandomElement(listaRNP05);
				String[] linha15Random = lista15Random.split(",");
				System.out.println(linha15Random);
			}
		} else {
			System.out.println("### [random] Arquivo nao encontrado... ###");
		}

	}
	
	public String getRandomElement(List<String> lista) {
		Random rand = new Random();
		return lista.get(rand.nextInt(lista.size()));
	}

}

package br.com.Strategy.Ass.App;

import java.util.stream.Stream;

import br.com.Strategy.Ass.Interfaces.IContentTransformer;
import br.com.Strategy.Ass.Interfaces.IPreco;
import br.com.Strategy.Ass.Interfaces.PreparadorNumeroTransmissoes;

public class Assinatura {
	
	private IPreco preco;
	private IContentTransformer telas;
	private PreparadorNumeroTransmissoes transmissoes;

	public Assinatura(IPreco preco ,IContentTransformer telas, PreparadorNumeroTransmissoes transmissoes) {
		
		this.preco = preco;
		this.telas = telas;
		this.transmissoes = transmissoes;
	}

	public double getPreco() throws Exception{
		
		return preco.getCalculaPreco();
	}

	public Stream<?> disponibilizarConteudo() throws Exception{

		return telas.converterQualidade();
	}

	public int permitirNumeroTransmissoes() throws Exception{

		return transmissoes.prepararAmbienteParaTransmissoesSimultaneas();
	}

}
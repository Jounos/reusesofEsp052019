package br.com.Strategy.Ass.Transmissoes;

import br.com.Strategy.Ass.Interfaces.PreparadorNumeroTransmissoes;

public class TransmissaoUnica implements PreparadorNumeroTransmissoes{
	
	public int prepararAmbienteParaTransmissoesSimultaneas() {

		return new Integer(1);
	}
}

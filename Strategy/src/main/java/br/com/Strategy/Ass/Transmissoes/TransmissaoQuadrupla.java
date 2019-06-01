package br.com.Strategy.Ass.Transmissoes;

import br.com.Strategy.Ass.Interfaces.PreparadorNumeroTransmissoes;

public class TransmissaoQuadrupla implements PreparadorNumeroTransmissoes{
	
	public int prepararAmbienteParaTransmissoesSimultaneas() {
		
		return new Integer(4);
	}
}

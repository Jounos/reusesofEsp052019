package br.com.Observer.App.Concrete;

import java.util.ArrayList;
import java.util.List;

import br.com.Observer.App.Interfaces.IEstacao;
import br.com.Observer.App.Interfaces.IInteressados;

public class Estacao implements IEstacao{
	
	private Double temperatura;
	private Double pressao;
	private Double umidade;
	
	private List<IInteressados> listaInteressados;
	
	public Estacao() {
		listaInteressados = new ArrayList<IInteressados>();
	}
	
	public void attach(IInteressados interessado) throws Exception {
		
		listaInteressados.add(interessado);
	}
	
	public void detach(IInteressados interessado) throws Exception {
		
		listaInteressados.remove(interessado);
	}
	
	public void notificar() throws Exception {

		for(IInteressados interessado: listaInteressados) {
			
			interessado.update();
		}
	}

	public Double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}

	public Double getPressao() {
		return pressao;
	}

	public void setPressao(Double pressao) {
		this.pressao = pressao;
	}

	public Double getUmidade() {
		return umidade;
	}

	public void setUmidade(Double umidade) {
		this.umidade = umidade;
	}

}

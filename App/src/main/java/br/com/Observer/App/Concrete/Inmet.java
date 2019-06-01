package br.com.Observer.App.Concrete;

import br.com.Observer.App.Interfaces.IInteressados;

public class Inmet implements IInteressados{
	
	private Double temperatura;
	private Double pressao;
	private Double umidade;
	
	private Estacao observerState;
	
	public Inmet() {
		this.observerState = new Estacao();
	}
	
	public void update() throws Exception {
		
		this.temperatura = observerState.getTemperatura();
		this.pressao = observerState.getPressao();
		this.umidade = observerState.getUmidade();
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

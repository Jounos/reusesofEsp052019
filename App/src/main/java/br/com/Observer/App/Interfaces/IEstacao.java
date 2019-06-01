package br.com.Observer.App.Interfaces;

public interface IEstacao {
	
	void attach(IInteressados interessado) throws Exception;
	
	void detach(IInteressados interessado) throws Exception;
	
	void notificar() throws Exception;
}

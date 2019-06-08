package concrete;

import creator.Besta;
import creator.Carro;
import creator.Escort;
import creator.Opala;
import creator.Tesla;
import enumeradores.CondicaoMetereologica;

public class Cconcreto extends Ccarro {

	@Override
	public Carro factoryMethod(CondicaoMetereologica cmeterologia, int qtdepessoas) {
		
		if(qtdepessoas > 0 && qtdepessoas <= 2) {
			return new Tesla();
		}
		
		if(qtdepessoas <= 5 && cmeterologia == CondicaoMetereologica.SOL) {
			return new Escort();
		}
		
		if(qtdepessoas <= 5 && cmeterologia == CondicaoMetereologica.CHUVA) {
			return new Opala();
		}
		
		if(qtdepessoas < 20) {
			return new Besta();
		}
		
		return null;
	}

	
}

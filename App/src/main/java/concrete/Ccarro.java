package concrete;

import creator.Carro;
import enumeradores.CondicaoMetereologica;

public abstract class Ccarro {
	
	public abstract Carro factoryMethod(CondicaoMetereologica cmeterologia,int qtdepessoas);
}

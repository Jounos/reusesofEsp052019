package application;

import concrete.Cconcreto;
import creator.Besta;
import creator.Escort;
import creator.Opala;
import creator.Tesla;
import enumeradores.CondicaoMetereologica;

public class appFactorymethod {

	public static void main(String[] args) {
		Cconcreto carros = new Cconcreto();
		
		
		Tesla ctesla = (Tesla) carros.factoryMethod(CondicaoMetereologica.SOL, 2);
		System.out.println(ctesla.toString());
		
		Escort cescort = (Escort) carros.factoryMethod(CondicaoMetereologica.SOL, 4);
		System.out.println(cescort.toString());
		
		Opala copala = (Opala) carros.factoryMethod(CondicaoMetereologica.CHUVA, 5);
		System.out.println(copala.toString());
		
		
		Besta cbesta = (Besta) carros.factoryMethod(CondicaoMetereologica.SOL, 15);
		System.out.println(cbesta.toString());
	}

}

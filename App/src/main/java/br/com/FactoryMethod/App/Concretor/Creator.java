package br.com.FactoryMethod.App.Concretor;

import br.com.FactoryMethod.App.Interfaces.ICreator;
import br.com.FactoryMethod.App.Interfaces.IProduct;

public class Creator implements ICreator{
	
	IProduct product;
	
	public void anOperation() {
		this.product = factoryMethod();
	}
	
	public IProduct factoryMethod() {
		
		return new Product();
	}
}

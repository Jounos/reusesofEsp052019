package br.com.FactoryMethod.App;

import org.junit.Test;

import br.com.FactoryMethod.App.Concretor.Product;
import junit.framework.Assert;

public class FactoryTest {
	
	Product produto;
	
	@Test
	public void setup() {
		
		try {
			
		} catch (Exception e) {
			Assert.assertFalse(e instanceof Exception);
		}
	}
}

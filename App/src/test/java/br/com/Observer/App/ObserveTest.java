package br.com.Observer.App;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.Observer.App.Concrete.CamposUniversitarios;
import br.com.Observer.App.Concrete.ClimaTempo;
import br.com.Observer.App.Concrete.Estacao;
import br.com.Observer.App.Concrete.Inmet;
import br.com.Observer.App.Interfaces.IEstacao;

public class ObserveTest {
	
	CamposUniversitarios cUniversitarios;
	ClimaTempo cTempo;
	Inmet inmet;
	
	IEstacao estacao; 
	
	@Before
	public void setup() {
		
		try {
			
			estacao = new Estacao();
		
			cUniversitarios = new CamposUniversitarios();
			cTempo = new ClimaTempo();
			inmet = new Inmet();
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestInteresseCUniversitario() {
		
		try {
			
			estacao.attach(cUniversitarios);
			
			cUniversitarios.update();
			
			Assert.assertTrue(Boolean.TRUE);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			Assert.assertFalse(e instanceof Exception);
		}
	}
	
	@Test
	public void TestInteresseCTempo() {
		
		try {
			
			estacao.attach(cTempo);
			
			cTempo.update();
			
			Assert.assertTrue(Boolean.TRUE);
		} catch (Exception e) {
			
			e.printStackTrace();
			Assert.assertFalse(e instanceof Exception);
		}
	}
	
	@Test
	public void TestInteresseInmet() {
		
		try {
			
			estacao.attach(inmet);
			
			estacao.notificar();
			
			assertTrue(Boolean.TRUE);
		} catch (Exception e) {
			
			e.printStackTrace();
			Assert.assertFalse(e instanceof Exception);
		}
	}
	
}

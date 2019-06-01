package br.com.Strategy.Ass;

import org.junit.Before;
import org.junit.Test;

import br.com.Strategy.Ass.App.Assinatura;
import br.com.Strategy.Ass.Preco.PrecoBasico;
import br.com.Strategy.Ass.Preco.PrecoPadrao;
import br.com.Strategy.Ass.Preco.PrecoPremium;
import br.com.Strategy.Ass.Qualidades.HD;
import br.com.Strategy.Ass.Qualidades.Simples;
import br.com.Strategy.Ass.Qualidades.UltraHD;
import br.com.Strategy.Ass.Transmissoes.TransmissaoDupla;
import br.com.Strategy.Ass.Transmissoes.TransmissaoQuadrupla;
import br.com.Strategy.Ass.Transmissoes.TransmissaoUnica;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AssinaturaTest {
	
	private Assinatura assBasico;
	private Assinatura assPadrao;
	private Assinatura assPremium;
	
	@Before
	public void setup() {
		
		this.assBasico = new Assinatura(new PrecoBasico(), new Simples(), new TransmissaoUnica());
		this.assPadrao = new Assinatura(new PrecoPadrao(), new HD(), new TransmissaoDupla());
		this.assPremium = new Assinatura(new PrecoPremium(), new UltraHD(), new TransmissaoQuadrupla());
	}
	
	@Test
	public void TestAssinaturaBasica1() {
		try {
			
			this.assBasico.getPreco();
			this.assBasico.disponibilizarConteudo();
			this.assBasico.permitirNumeroTransmissoes();
		} catch(Exception e) {
			Assert.assertFalse(e instanceof Exception);
		}
	}
	
	@Test
	public void TestAssinaturaPadrao1() {
		try {
			
			this.assPadrao.getPreco();
			this.assPadrao.disponibilizarConteudo();
			this.assPadrao.permitirNumeroTransmissoes();
		} catch(Exception e) {
			Assert.assertFalse(e instanceof Exception);
		}
	}
	
	@Test
	public void TestAssinaturaPremium1() {
		try {
			
			this.assPremium.getPreco();
			this.assPremium.disponibilizarConteudo();
			this.assPremium.permitirNumeroTransmissoes();
		} catch(Exception e) {
			Assert.assertFalse(e instanceof Exception);
		}
	}
}

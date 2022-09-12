package index;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FIlmeTest {
	Filme f;
	
	@Before
	public void setUp() throws Exception {
		f = new Filme("Vingadores", GeneroENUM.Ação);
	}
	
	@Test
	public void filmeTest() {
		assertEquals("Vingadores", f.nome);
		assertEquals(GeneroENUM.Ação,f.generoENUM);
	}
	
	@Test
	public void setValorCompraTest() {
		f.setValorCompra(50);
		assertEquals(50,f.getValorCompra(), 0.1);
	}
	
	@Test
	public void setValorLocacaoTest() {
		f.setValorLocacao(20);
		assertEquals(20, f.getValorLocacao(), 0.1);
	}
}

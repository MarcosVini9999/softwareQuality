package index;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ComprarTest {
	Filme f;
	Cliente c;
	Comprar buy;
	
	@Before
	public void setUp() throws Exception {
		f = new Filme("Vingadores", GeneroENUM.Ação);
		c= new Cliente("Marcos", 10);
		buy = new Comprar(f, c, 50);
	}
	
	@Test
	public void pagarTest() {
		assertEquals(50, buy.valorCompra, 0.1);
	}
		
	@Test
	public void compraBemSucedidaTest() {
		f.setValorCompra(50);
		c.setIsAtivo(true);
		assertEquals(c ,buy.cliente);
		assertEquals(f, buy.filme);
		assertEquals(50, buy.valorCompra, 0.1);
	}
	
}
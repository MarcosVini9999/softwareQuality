package index;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClienteTest {

	@Test
	public void clienteTest() {
		Cliente c = new Cliente("Marcos", 10);
		assertEquals("Marcos", c.nome);
		assertEquals(10, c.id);
		assertEquals(true, c.statusAtivo);
	}
	
	@Test
	public void clienteStatusTest() {
		Cliente c = new Cliente("Marcos", 10);
		c.setIsAtivo(false);
		assertEquals(false, c.statusAtivo);
	}

}

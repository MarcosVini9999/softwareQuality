package index;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LocacaoTest {
	Filme f;
	Cliente c;
	Locacao locacao;
	
	
	@Before
	public void setUp() throws Exception {
		f = new Filme("Vingadores", GeneroENUM.Ação);
		c= new Cliente("Marcos", 10);
		locacao = new Locacao();
		locacao.alugar(c, f, 20);
	}
	
	
	@Test
	public void alugarComSucessoTest() {

	}
	
	@Test
	public void setDescontoPorGeneroTest() {

	}
	
}
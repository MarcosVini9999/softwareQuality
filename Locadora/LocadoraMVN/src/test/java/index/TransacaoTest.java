package index;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TransacaoTest {
	Filme f;
	Cliente c;
	Locacao locacao;
	Transacao t;
	
	
	@Before
	public void setUp() throws Exception {
		f = new Filme("Vingadores", GeneroENUM.Ação);
		c= new Cliente("Marcos", 10);
		locacao = new Locacao();
		locacao.alugar(c, f, 20);
		t=Transacao.getInstance();
		t.locacoes.add(locacao);
	}
	
	@After
	public void tearDown() throws Exception {
		t.locacoes.clear();
	}
	
	@Test
	public void getTopGeneroMaisAlugadoTest() {
		Filme f2 = new Filme("Vingadores2", GeneroENUM.Aventura);
		Filme f3 = new Filme("Vingadores3", GeneroENUM.Ação);
		Locacao locacao2 = new Locacao();
		locacao2.alugar(c, f2, 0);
		Locacao locacao3 = new Locacao();
		locacao3.alugar(c, f3, 0);
		t.locacoes.add(locacao2);
		t.locacoes.add(locacao3);
		assertEquals(GeneroENUM.Ação, t.getTopGeneroMaisAlugado());
	}
	@Test
	public void setDescontoPorGeneroTest() {
		t.setDescontoPorGenero(GeneroENUM.Ação, 10);
		assertEquals(10, locacao.valorPagoNoAluguel, 0.1);
	}
	@Test
	public void valorLocacaoTotalTest() {
		assertEquals(20, t.getValorLocacaoTotal(), 0.1);
	}


}

package index;

import java.util.ArrayList;

public class Transacao {
	public ArrayList<Locacao> locacoes;
	private static Transacao instance = null;
	
	private Transacao() {
		locacoes = new ArrayList<Locacao>();
	}
	
	public static Transacao getInstance() {
		if (instance == null) {
			instance = new Transacao();
		}
		return instance;
	}
	
	public double getValorLocacaoTotal() {
		double total = 0;
		
		for (Locacao locacao : locacoes) {
			double valorAluguelFilme = locacao.getValor();
			total += valorAluguelFilme;
		}
		return total;
	}
	
	public void setDescontoPorGenero(GeneroENUM genero, double valorDoDesconto) {
		for (Locacao locacao : locacoes) {
			if (locacao.filme.generoENUM == genero) {
				
			}
		}
	}

	public GeneroENUM getTopGeneroMaisAlugado() {
		GeneroENUM topGenero = null;
		int aux = 0;
		for (GeneroENUM genero : GeneroENUM.values()) {
			int contador = 0;
			for (Locacao locacao : locacoes) {
				if (locacao.filme.generoENUM == genero) {
					contador = contador + 1;
				}
			}
			if (contador > aux) {
				aux = contador;
				topGenero = genero;
			}
		}
		return topGenero;
	}
}

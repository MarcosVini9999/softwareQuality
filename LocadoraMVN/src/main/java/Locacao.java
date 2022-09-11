package index;

import java.util.ArrayList;
import java.util.Calendar;

public class Locacao implements Pagamento {
	protected Cliente cliente;
	protected Filme filme;
	protected double valorPagoNoAluguel;
	protected Calendar data;
	protected ArrayList<Locacao> alugueis;
	protected GeneroENUM topsGenero;
	private static Locacao instance = null;

	@Override
	public void pagar(double valorDoPagamento) {
		this.valorPagoNoAluguel = valorDoPagamento;
	}

	public void alugar(Cliente c, Filme f, double valorDoPagamento) {
		if ((valorDoPagamento == f.getValorLocacao()) || (c.statusAtivo == true)) {
			this.cliente = c;
			this.filme = f;
			pagar(valorDoPagamento);
			alugueis = new ArrayList<Locacao>();
			this.data = Calendar.getInstance();
		} else {
			System.out.println("Não foi possivel alugar o filme, valor insuficiente ou cliente inativo");
		}
	}

	public void setDescontoPorGenero(GeneroENUM generoENUM, double valorDoDesconto) {
		for (Locacao locacao : alugueis) {
			if (locacao.filme.generoENUM == generoENUM) {
				locacao.filme.setValorLocacao(locacao.filme.getValorLocacao() - valorDoDesconto);
			}
		}
	}

	private void setTopMaisAlugado() {
		int contador = 0;
		int aux = 0;
		for (GeneroENUM generos : GeneroENUM.values()) {
			for (Locacao locacao : alugueis) {
				if (locacao.filme.generoENUM == generos) {
					contador = contador + 1;
				}
			}
			if (contador > aux) {
				aux = contador;
				this.topsGenero = generos;
			}
			contador = 0;
		}
		return;
	}

	public GeneroENUM getTopMaisAlugado() {
		setTopMaisAlugado();
		return this.topsGenero;
	}

	public static Locacao getInstance() {
		if (instance == null) {
			instance = new Locacao();
		}
		return instance;
	}
}

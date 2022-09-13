package index;

import java.util.Calendar;

public class Locacao implements Pagamento {
	protected Cliente cliente;
	protected Filme filme;
	protected double valorPagoNoAluguel;
	protected Calendar data;
	
	public void pagar(double valorDoPagamento) {
		this.valorPagoNoAluguel = valorDoPagamento;
	}

	public void alugar(Cliente c, Filme f, double valorDoPagamento) {
		if (c.isAtivo() == true) {
			this.cliente = c;
			this.filme = f;
			pagar(valorDoPagamento);
			this.data = Calendar.getInstance();
		} else {
			return;
		}
	}

	public double getValor() {
		return this.valorPagoNoAluguel;
	}
}

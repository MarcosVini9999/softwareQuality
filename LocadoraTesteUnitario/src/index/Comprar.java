package index;

import java.util.ArrayList;
import java.util.Calendar;

public class Comprar implements Pagamento {
	protected Cliente cliente;
	protected Filme filme;
	protected double valorCompra;
	protected Calendar data;
	protected ArrayList<Locacao> compras;

	@Override
	public void pagar(double valorDaCompra) {
		this.valorCompra = valorDaCompra;
	}

	public void comprar(Filme f, Cliente c, double valorDaCompra) {
		if ((valorDaCompra == f.getValorCompra()) || (c.statusAtivo == true)) {
			this.cliente = c;
			this.filme = f;
			pagar(valorDaCompra);
			compras = new ArrayList<Locacao>();
			this.data = Calendar.getInstance();
		} else {
			System.out.println("Não foi possivel comprar o filme, valor insuficiente ou cliente inativo");
		}
	}

}

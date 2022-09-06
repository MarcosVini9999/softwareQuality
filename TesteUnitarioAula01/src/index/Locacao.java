package index;

public class Locacao implements Pagamento {
	protected Cliente cliente;
	protected Filme filme;
	protected double valorAluguel;
	
	@Override
	public void pagar(double valorDoPagamento) {
		this.valorAluguel = valorDoPagamento;
	}
	
	public void alugar(Cliente c, Filme f, double valorAluguel) {
		this.cliente = c;
		this.filme = f;
		pagar(valorAluguel);
	}
}

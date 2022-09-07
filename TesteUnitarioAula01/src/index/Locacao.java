package index;

import java.util.ArrayList;
import java.util.Calendar;

public class Locacao implements Pagamento {
	protected Cliente cliente;
	protected Filme filme;
	protected double valorAluguel;
	protected Calendar data;
	protected  ArrayList<Locacao> alugueis;
	
	@Override
	public void pagar(double valorDoPagamento) {
		this.valorAluguel = valorDoPagamento;
	}
	
	public void alugar(Cliente c, Filme f, double valorAluguel) {
		if((valorAluguel == f.getValorCompra()) || (c.statusAtivo==true)) {
			this.cliente = c;
			this.filme = f;
			pagar(valorAluguel);
			alugueis= new ArrayList<Locacao>();
			this.data = Calendar.getInstance();
		}else {
			System.out.println("Não foi possivel alugar o filme, valor insuficiente ou cliente inativo");
		}
	}
}

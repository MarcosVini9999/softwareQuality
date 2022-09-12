package index;

public class Filme {
	protected String nome;
	protected int id;
	private double valorCompra;
	private double valorLocacao;
	protected GeneroENUM generoENUM;

	public Filme(String nome, GeneroENUM generoENUM) {
		this.nome = nome;
		this.generoENUM = generoENUM;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getValorCompra() {
		return this.valorCompra;
	}

	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public double getValorLocacao() {
		return this.valorLocacao;
	}
}
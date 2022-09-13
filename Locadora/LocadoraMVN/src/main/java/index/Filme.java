package index;

public class Filme {
	protected String nome;
	protected int id;
	protected GeneroENUM generoENUM;

	public Filme(String nome, GeneroENUM generoENUM) {
		this.nome = nome;
		this.generoENUM = generoENUM;
	}
}
package index;

public class Main {
	public static void main(String[] args) {
		Filme f = new Filme("Java muito feliz", GeneroENUM.Aventura);
		f.setValorLocacao(10);
		Cliente c = new Cliente("Marcos", 1);
		Locacao locacao = new Locacao();
		locacao.alugar(c, f, 9);
		locacao.alugar(c, f, 10);
	}
}

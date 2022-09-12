package index;

public class Main {
	public static void main(String[] args) {
		Filme f = new Filme("Java muito feliz", GeneroENUM.Aventura);
		f.setValorLocacao(10);
		Cliente c = new Cliente("Marcos", 1);
		Locacao alugarFilme = new Locacao();
		alugarFilme.alugar(c, f, 9);
		alugarFilme.alugar(c, f, 10);
	}
}

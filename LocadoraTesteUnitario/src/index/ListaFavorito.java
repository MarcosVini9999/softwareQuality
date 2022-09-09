package index;

import java.util.ArrayList;

public class ListaFavorito {
	private ArrayList<Filme> filmes;
	private Cliente cliente;
	
	public ListaFavorito(Cliente cliente) {
		filmes = new ArrayList<Filme>();
		this.cliente = cliente;
	}
	
	protected Cliente getCliente() {
		return this.cliente;
	}
	
	public void adiciona(Filme filme) throws Exception {
		int filmeId = filme.id;
		Filme f = busca(filmeId);
		
		if (f != null) {
			throw new Exception("Filme should be unique in list");
		}
		
		filmes.add(filme);
	}
	
	public Filme busca(int filmeId) {
		for (Filme filme : filmes) {
			if (filme.id == filmeId) return filme;
		}
		
		return null;
	}
	
	public ArrayList<Filme> lista() {
		return this.filmes;
	}
	
	public int getTamanhoLista() {
		return this.filmes.size();
	}
	
	public Filme remove(int idFilme) {
		Filme filmeAchado = busca(idFilme);
		if (filmeAchado == null) return null;
		filmes.remove(filmeAchado);
		return filmeAchado;
	}
	
	public void alugar(int filmeId, double valorDoPagamento) throws Exception {
		Locacao locacao = new Locacao();
		Filme f = busca(filmeId);
		
		if (f == null) return;
		locacao.alugar(cliente, f, valorDoPagamento);
	}
}

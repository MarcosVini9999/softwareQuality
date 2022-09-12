package index;

public class Cliente {
	protected String nome;
	protected int id;
	protected boolean statusAtivo;
	protected ListaFavorito listaFavorito;
	
	
	public Cliente(String nome, int id) {
		this.nome = nome;
		this.id = id;
		statusAtivo = true;
	}

	public boolean isAtivo() {
		return this.statusAtivo;
	}

	public void setIsAtivo(boolean status) {
		this.statusAtivo = status;
	}
}

package index;

public class Cliente {
	protected String nome;
	protected int id;
	protected boolean statusAtivo;
	
	public Cliente(String nome, int id, boolean statusAtivo) {
		this.nome= nome;
		this.id= id;
		this.statusAtivo=statusAtivo; 
	}
}

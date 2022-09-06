package index;

import java.util.Calendar;

public class Filme {
	protected String nome;
	protected int id;
	protected double valorCompra;
	protected Genero genero;
	protected Calendar data;
	
	public Filme(String nome, Genero genero) {
		this.nome = nome;
		this.genero = genero;
		this.data = Calendar.getInstance();
	}
}

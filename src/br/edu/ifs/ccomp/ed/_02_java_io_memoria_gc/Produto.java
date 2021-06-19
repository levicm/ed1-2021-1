package br.edu.ifs.ccomp.ed._02_java_io_memoria_gc;

public class Produto {

	private String nome;
	private double valor;
	private long estoque;

	public Produto() {
	}

	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public Produto(String nome, double valor, long estoque) {
		this.nome = nome;
		this.valor = valor;
		this.estoque = estoque;
	}

	public void mostrar() {
		System.out.println(nome + " - " + valor + " - " + estoque);
	}

	public double getValor() {
		return valor;
	}

	public void reajustar(float indice) {
		valor = valor * (1 + indice);
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.printf("Produto %s finalizado%n", nome);
	}
}

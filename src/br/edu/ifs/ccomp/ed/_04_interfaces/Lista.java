package br.edu.ifs.ccomp.ed._04_interfaces;

public interface Lista<T> {
	public void adiciona(T element);
	public void adiciona(int posicao, T element);
	public T pega(int posicao);
	public void remove(int posicao);
	public int tamanho();
}

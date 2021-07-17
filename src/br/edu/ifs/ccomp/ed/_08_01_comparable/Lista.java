package br.edu.ifs.ccomp.ed._08_01_comparable;

public interface Lista<T> {
	public void adiciona(T element);
	public void adiciona(int posicao, T element);
	public T pega(int posicao);
	public int busca(T element);
	public void remove(int posicao);
	public int tamanho();
}

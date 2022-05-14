package br.edu.ifs.ccomp.ed._10_lista_ligada_03_interface;

public interface Lista<T> {
	public void adiciona(T element);
	public void adiciona(int posicao, T element);
	public T pega(int posicao);
	public void remove(int posicao);
	public int tamanho();
}

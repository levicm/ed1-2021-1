package br.edu.ifs.ccomp.ed._07_prova;

public interface Lista<T> {
	public void adiciona(T element);
	public void adiciona(int posicao, T element);
	public T pega(int posicao);
	public int busca(T element);
	public void remove(int posicao);
	public int tamanho();
	
	public void substitui(int posicao, T elemento);
	public void copiaPara(T[] arranjo);
	public void inverte();
	public Lista<T> segmento(int inicio, int fim);
}

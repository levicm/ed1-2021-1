package br.edu.ifs.ccomp.ed._08_02_lista_ordenada_04_composicao;

public interface Lista<T> {
	public void adiciona(T element);
	public void adiciona(int posicao, T element);
	public T pega(int posicao);
	public int busca(T element);
	public void remove(int posicao);
	public int tamanho();
	
    // Adicionados na revisão
    public int remove(T elemento);
    public boolean removeTodos(T elemento);
    public void copiaDe(T[] origem);
    public void copiaDe(Lista<T> origem);
    public boolean igual(Lista<T> lista);

    // Adicionados na prova
    public void substitui(int posicao, T elemento);
	public void copiaPara(T[] arranjo);
	public void inverte();
	public Lista<T> segmento(int inicio, int fim);
}

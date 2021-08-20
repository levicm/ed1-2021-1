package br.edu.ifs.ccomp.ed._13_fila;

public interface Fila<T> {
    public void adiciona(T elemento);
    public T remove();
    public T consulta();
    public int tamanho();
    public boolean vazia();

}

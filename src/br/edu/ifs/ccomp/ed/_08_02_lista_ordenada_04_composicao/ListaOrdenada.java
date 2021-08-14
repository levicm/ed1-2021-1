package br.edu.ifs.ccomp.ed._08_02_lista_ordenada_04_composicao;

public class ListaOrdenada<T extends Comparable<T>> implements Lista<T> {

    private Lista<T> lista = new ListaArranjo<T>();

    public void adiciona(T element) {
        boolean inseriu = false;
        for (int i = 0; i < tamanho(); i++) {
            // Se encontrou um elemento maior, encontrou a posição
            if (element.compareTo(pega(i)) <= 0) {
                lista.adiciona(i, element);
                inseriu = true;
                break;
            }
        }
        if (!inseriu) {
            lista.adiciona(element);
        }
    }

    public void adiciona(int posicao, T element) {
        adiciona(element);
    }

    public T pega(int posicao) {
        return lista.pega(posicao);
    }

    public int busca(T element) {
        return lista.busca(element);
    }

    public void remove(int posicao) {
        lista.remove(posicao);
    }

    public int tamanho() {
        return lista.tamanho();
    }

    public int remove(T elemento) {
        return lista.remove(elemento);
    }

    public boolean removeTodos(T elemento) {
        return lista.removeTodos(elemento);
    }

    public void copiaDe(T[] origem) {
        lista.copiaDe(origem);
    }

    public void copiaDe(Lista<T> origem) {
        lista.copiaDe(origem);
    }

    public boolean igual(Lista<T> lista) {
        return lista.igual(lista);
    }

    public void substitui(int posicao, T elemento) {
        lista.substitui(posicao, elemento);
    }

    public void copiaPara(T[] arranjo) {
        lista.copiaPara(arranjo);
    }

    public void inverte() {
        lista.inverte();
    }

    public Lista<T> segmento(int inicio, int fim) {
        return lista.segmento(inicio, fim);
    }

    @Override
    public String toString() {
        return lista.toString();
    }
}

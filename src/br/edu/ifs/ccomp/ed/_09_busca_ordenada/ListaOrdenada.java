package br.edu.ifs.ccomp.ed._09_busca_ordenada;

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

    @Override
    public void adiciona(int posicao, T element) {
        adiciona(element);
    }

    @Override
    public T pega(int posicao) {
        return lista.pega(posicao);
    }

    @Override
    public int busca(T element) {
//        return lista.busca(element); // Busca linear sequencial
        return buscaOrdenada(element);
    }
    
    private int buscaOrdenada(T element) {
        for (int i = 0; i < tamanho(); ++i) {
            int comparacao = element.compareTo(pega(i));
            if (comparacao == 0) {
                return i;
            } else {
                if (comparacao < 0) {
                    return -1;
                }
            }
        }
        return -1;
    }

    @Override
    public void remove(int posicao) {
        lista.remove(posicao);
    }

    @Override
    public int tamanho() {
        return lista.tamanho();
    }

    @Override
    public int remove(T elemento) {
        return lista.remove(elemento);
    }

    @Override
    public boolean removeTodos(T elemento) {
        return lista.removeTodos(elemento);
    }

    @Override
    public void copiaDe(T[] origem) {
        lista.copiaDe(origem);
    }

    @Override
    public void copiaDe(Lista<T> origem) {
        lista.copiaDe(origem);
    }

    @Override
    public boolean igual(Lista<T> lista) {
        return lista.igual(lista);
    }

    @Override
    public void substitui(int posicao, T elemento) {
        lista.substitui(posicao, elemento);
    }

    @Override
    public void copiaPara(T[] arranjo) {
        lista.copiaPara(arranjo);
    }

    @Override
    public void inverte() {
        lista.inverte();
    }

    @Override
    public Lista<T> segmento(int inicio, int fim) {
        return lista.segmento(inicio, fim);
    }

    @Override
    public String toString() {
        return lista.toString();
    }
}

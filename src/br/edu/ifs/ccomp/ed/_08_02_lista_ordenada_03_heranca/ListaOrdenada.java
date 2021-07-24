package br.edu.ifs.ccomp.ed._08_02_lista_ordenada_03_heranca;

public class ListaOrdenada<T extends Comparable<T>> extends ListaArranjo<T> {

    public void adiciona(T element) {
        boolean inseriu = false;
        for (int i = 0; i < tamanho(); i++) {
            // Se encontrou um elemento maior, encontrou a posição
            if (element.compareTo(pega(i)) <= 0) {
                super.adiciona(i, element);
                inseriu = true;
                break;
            }
        }
        if (!inseriu) {
            super.adiciona(element);
        }
    }

    @Override
    public void adiciona(int posicao, T element) {
        adiciona(element);
    }

}

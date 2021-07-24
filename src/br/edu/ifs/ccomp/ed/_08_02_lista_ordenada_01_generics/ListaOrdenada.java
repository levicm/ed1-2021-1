package br.edu.ifs.ccomp.ed._08_02_lista_ordenada_01_generics;

public class ListaOrdenada<T extends Comparable<T>> {
    private Object[] arranjo = new Object[100];
    private int tamanho = 0;

    @SuppressWarnings({ "unchecked" })
    public void adiciona(T element) {
        garanteEspaco();
        boolean inseriu = false;
        for (int i = 0; i < this.tamanho; i++) {
            // Se encontrou um elemento maior, encontrou a posição
            if (element.compareTo((T) arranjo[i]) <= 0) {
                // Faz o deslocamento dos elementos posteriores
                for (int j = this.tamanho; j > i; --j) {
                    this.arranjo[j] = this.arranjo[j - 1];
                }
                this.arranjo[i] = element;
                inseriu = true;
                break;
            }
        }
        if (!inseriu) {
            // Adiciona no final
            this.arranjo[this.tamanho] = element;
        }
        this.tamanho++;
    }

    private void garanteEspaco() {
        if (tamanho() == arranjo.length) {
            Object[] novoArranjo = new Object[this.arranjo.length * 2];
            for (int i = 0; i < this.arranjo.length; i++) {
                novoArranjo[i] = this.arranjo[i];
            }
            this.arranjo = novoArranjo;
        }
    }

    public T pega(int posicao) {
        return null;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        int i = 0;
        while (arranjo[i] != null) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(arranjo[i]);
            ++i;
        }
        result.append("]");
        return result.toString();
    }

}

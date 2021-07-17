package br.edu.ifs.ccomp.ed._08_02_lista_ordenada;

public class ListaOrdenada<T> {
    private Object[] arranjo = new Object[100];
    private int tamanho = 0;

    @SuppressWarnings("unchecked")
    public void adiciona(Comparable<T> element) {
        garanteEspaco();
        int pos = -1;
        for (int i = 0; i < tamanho; i++) {
            // Se encontrou um elemento maior, insere nessa posição
            if (element.compareTo((T) arranjo[i]) <= 0) {
                // Faz o deslocamento dos elementos posteriores
                for (int j = this.tamanho; j > i; --j) {
                    arranjo[j] = arranjo[j - 1];
                }
                arranjo[i] = element;
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            arranjo[tamanho] = element;
        }
        tamanho++;
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

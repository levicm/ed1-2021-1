package br.edu.ifs.ccomp.ed._08_02_lista_ordenada;

public class ListaOrdenada {
    private Object[] arranjo = new Object[100];
    private int tamanho = 0;

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void adiciona(Comparable element) {
        garanteEspaco();
        boolean inseriuNoMeio = false;
        for (int i = 0; i < this.tamanho; i++) {
            // Se encontrou um elemento maior, encontrou a posição
            if (element.compareTo(arranjo[i]) <= 0) {
                // Faz o deslocamento dos elementos posteriores
                for (int j = this.tamanho; j > i; --j) {
                    this.arranjo[j] = this.arranjo[j - 1];
                }
                this.arranjo[i] = element;
                inseriuNoMeio = true;
                break;
            }
        }
        if (!inseriuNoMeio) {
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

package br.edu.ifs.ccomp.ed._07_prova;

public class ListaArranjo<T> implements Lista<T> {
    private Object[] arranjo = new Object[100];
    private int tamanho = 0;

    public void adiciona(T element) {
        garanteEspaco();
        arranjo[tamanho] = element;
        tamanho++;
    }

    public void adiciona(int posicao, T element) {
        if (!posicaoValidaAdicao(posicao)) {
            throw new IllegalArgumentException("Posicao informada não é válida para adicionar: " + posicao);
        }
        garanteEspaco();
        if (posicao == tamanho) {
            arranjo[posicao] = element;
        } else {
            for (int i = tamanho; i > posicao; --i) {
                arranjo[i] = arranjo[i - 1];
            }
            arranjo[posicao] = element;
        }
        tamanho++;
    }

    private boolean posicaoValidaAdicao(int posicao) {
        return posicao >= 0 && posicao <= tamanho();
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

    @SuppressWarnings("unchecked")
    public T pega(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição informada não está ocupada: " + posicao);
        }
        return (T) arranjo[posicao];
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < tamanho();
    }

    public void remove(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição informada não está ocupada: " + posicao);
        }
        for (int i = posicao; i < tamanho - 1; ++i) {
            arranjo[i] = arranjo[i + 1];
        }
        arranjo[tamanho] = null;
        tamanho--;
    }

    public int tamanho() {
        return tamanho;
    }

    public int busca(T element) {
        for (int i = 0; i < tamanho; ++i) {
            if (arranjo[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void limpa() {
        for (int i = 0; i < tamanho; i++) {
            arranjo[i] = null;
        }
        tamanho = 0;
    }

    public int remove(T element) {
        int pos = busca(element);
        if (pos != -1) {
            remove(pos);
        }
        return pos;
    }

    public boolean removeTodos(T element) {
        boolean result = false;
        for (int i = 0; i < this.tamanho; ++i) {
            if (arranjo[i].equals(element)) {
                remove(i);
                i--;
                result = true;
            }
        }
        return result;
    }

    public void copiaDe(T[] origem) {
        // Se a origem for maior que o arranjo, cria um novo arranjo
        if (origem.length > arranjo.length) {
            this.arranjo = new Object[origem.length];
        } else {
            // Se tinha mais elementos que a origem, limpa os elementos após o tamanho da
            // origem
            if (tamanho > origem.length) {
                for (int i = origem.length; i < tamanho; ++i) {
                    this.arranjo[i] = null;
                }
            }
        }
        // Copia a origem para o arranjo local
        for (int i = 0; i < origem.length; i++) {
            this.arranjo[i] = origem[i];
        }
        tamanho = origem.length;
    }

    public void copiaDe(Lista<T> origem) {
        // Simplesmente adiciona a esta lista os elementos da origem
        int tamanhoOrigem = origem.tamanho();
        for (int i = 0; i < tamanhoOrigem; ++i) {
            adiciona(origem.pega(i));
        }
    }

    public boolean igual(Lista<T> origem) {
        if (this == origem) {
            return true;
        }
        if (tamanho() == origem.tamanho()) {
            for (int i = 0; i < arranjo.length; i++) {
                if (!arranjo[i].equals(origem.pega(i))) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public void substitui(int posicao, T elemento) {
        if (!posicaoOcupada(posicao)) {
            throw new IndexOutOfBoundsException(posicao);
        }
        arranjo[posicao] = elemento;
    }

    @SuppressWarnings("unchecked")
    public void copiaPara(T[] arranjo) {
        for (int i = 0; i < arranjo.length && i < tamanho; i++) {
            arranjo[i] = (T) this.arranjo[i];
        }
    }

    /**
     * Complexidade: O(n/2) ~ O(n)
     */
    public void inverte() {
        Object tmp;
        int meio = tamanho / 2;
        for (int i = 0; i < meio; i++) {
            tmp = arranjo[i];
            arranjo[i] = arranjo[tamanho - i - 1];
            arranjo[tamanho - i - 1] = tmp;
        }
    }

    @SuppressWarnings("unchecked")
    public Lista<T> segmento(int inicio, int fim) {
        if (!(inicio < fim && posicaoOcupada(inicio) && posicaoOcupada(fim))) {
            throw new IllegalArgumentException("Posicoes inválidas ou fora da faixa: " + inicio + ", " + fim);
        }
        Lista<T> result = new ListaArranjo<T>();
        for (int i = inicio; i < fim; ++i) {
            result.adiciona((T) this.arranjo[i]);
        }
        return result;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ListaArranjo lista = (ListaArranjo) obj;
        if (tamanho != lista.tamanho()) {
            return false;
        }
        for (int i = 0; i < tamanho; i++) {
            if (!this.arranjo[i].equals(lista.arranjo[i])) {
                return false;
            }
        }
        return true;
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

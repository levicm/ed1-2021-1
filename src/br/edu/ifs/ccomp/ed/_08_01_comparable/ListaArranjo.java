package br.edu.ifs.ccomp.ed._08_01_comparable;

public class ListaArranjo<T> implements Lista<T> {
    private Object[] arranjo = new Object[100];
    private int tamanho = 0;

    public void adiciona(T element) {
        garanteEspaco();
        arranjo[this.tamanho] = element;
        tamanho++;
    }

    public void adiciona(int posicao, T element) {
        if (!posicaoValidaAdicao(posicao)) {
            throw new IllegalArgumentException("Posicao informada não é válida para adicionar: " + posicao);
        }
        garanteEspaco();
        if (posicao == this.tamanho) {
            arranjo[posicao] = element;
        } else {
            for (int i = this.tamanho; i > posicao; --i) {
                arranjo[i] = arranjo[i - 1];
            }
            arranjo[posicao] = element;
        }
        this.tamanho++;
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

    /**
     * Retorna a posição do elemento encontrado ou -1 caso não seja encontrado.
     */
    public int busca(T element) {
        for (int i = 0; i < this.tamanho; ++i) {
            if (arranjo[i].equals(element)) {
                return i;
            }
        }
        return -1;
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

    /**
     * Remove o elemento passado caso seja encontrado.
     * 
     * @return a posição do elemento removido ou -1 caso não seja encontrado.
     */
    public int remove(T elemento) {
        int pos = busca(elemento);
        if (pos > -1) {
            remove(pos);
            return pos;
        }
        return -1;
    }

    /**
     * Remove todas as ocorrências do elemento passado caso seja encontrado.
     * 
     * @return a posição do elemento removido ou -1 caso não seja encontrado.
     */
    public boolean removeTodos(T elemento) {
        boolean result = false;
        int pos = remove(elemento);
        while (pos > -1) {
            result = true;
            pos = remove(elemento);
        }
        return result;
    }

    public boolean removeTodos2(T elemento) {
        boolean result = false;
        for (int i = 0; i < this.tamanho; ++i) {
            if (arranjo[i].equals(elemento)) {
                remove(i);
                i--;
                result = true;
            }
        }
        return result;
    }

    public void copiaDe(T[] origem) {
        if (origem.length > arranjo.length) {
            arranjo = new Object[origem.length];
        } else {
            if (tamanho > origem.length) {
                for (int i = origem.length; i < tamanho; i++) {
                    arranjo[i] = null;
                }
            }
        }
        for (int i = 0; i < origem.length; i++) {
            arranjo[i] = origem[i];
        }
        tamanho = origem.length;
    }

    public void copiaDe(Lista<T> origem) {
        int tamanhoOrigem = origem.tamanho();
        for (int i = 0; i < tamanhoOrigem; i++) {
            adiciona(origem.pega(i));
        }
    }

    public boolean igual(Lista<T> lista) {
        if (this == lista) {
            return true;
        }
        if (tamanho() == lista.tamanho()) {
            for (int i = 0; i < arranjo.length; i++) {
                if (!arranjo[i].equals(lista.pega(i))) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
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
    
    public Lista<T> segment(int i, int i1) {
        Lista<T> result = new ListaArranjo<T>();
        // Lógica de adicionar elementos...
        for (int j = 0; j < arranjo.length; j++) {
            result.adiciona(null);
        }
        
        return result;
    }
}

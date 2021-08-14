package br.edu.ifs.ccomp.ed._08_02_lista_ordenada_02_interface;

public class ListaOrdenada<T extends Comparable<T>> implements Lista<T> {
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

    public T pega(int posicao) {
        return null;
    }

    public void adiciona(int posicao, T element) {
        // TODO Auto-generated method stub
        
    }

    public int busca(T element) {
        // TODO Auto-generated method stub
        return 0;
    }

    public void remove(int posicao) {
        // TODO Auto-generated method stub
        
    }

    public int remove(T elemento) {
        // TODO Auto-generated method stub
        return 0;
    }

    public boolean removeTodos(T elemento) {
        // TODO Auto-generated method stub
        return false;
    }

    public void copiaDe(T[] origem) {
        // TODO Auto-generated method stub
        
    }

    public void copiaDe(Lista<T> origem) {
        // TODO Auto-generated method stub
        
    }

    public boolean igual(Lista<T> lista) {
        // TODO Auto-generated method stub
        return false;
    }

    public void substitui(int posicao, T elemento) {
        // TODO Auto-generated method stub
        
    }

    public void copiaPara(T[] arranjo) {
        // TODO Auto-generated method stub
        
    }

    public void inverte() {
        // TODO Auto-generated method stub
        
    }

    public Lista<T> segmento(int inicio, int fim) {
        // TODO Auto-generated method stub
        return null;
    }

}

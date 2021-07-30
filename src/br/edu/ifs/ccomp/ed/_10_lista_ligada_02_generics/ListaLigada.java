package br.edu.ifs.ccomp.ed._10_lista_ligada_02_generics;

public class ListaLigada<T> {

    private Celula<T> inicio;
    private int totalDeElementos;

    public void adiciona(T elemento) {
        if (totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        } else {
            Celula<T> atual = inicio;
            while(atual.getProxima() != null) {
                atual = atual.getProxima();
            }
            Celula<T> celula = new Celula<T>(elemento, null);
            atual.setProxima(celula);
            this.totalDeElementos++;
        }
    }

    public void adiciona(int posicao, T elemento) {
        if (!posicaoValidaAdicao(posicao)) {
            throw new IllegalArgumentException("Posição inválida para adição: " + posicao);
        }
        if (posicao == 0) {
            adicionaNoComeco(elemento);
        } else if (posicao == tamanho()) {
            adiciona(elemento);
        } else {
            Celula<T> anterior = pegaCelula(posicao - 1);
            Celula<T> nova = new Celula<T>(elemento, anterior.getProxima());
            anterior.setProxima(nova);
            this.totalDeElementos++;
        }
        
    }
    
    private boolean posicaoValidaAdicao(int posicao) {
        return posicao >= 0 && posicao <= tamanho();
    }

    public void adicionaNoComeco(T elemento) { 
        Celula<T> nova = new Celula<T>(elemento, inicio);
        inicio = nova;
        totalDeElementos++;
    }

    public T pega(int posicao) {
        return pegaCelula(posicao).getElemento();
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < tamanho();
    }
    
    private Celula<T> pegaCelula(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não ocupada: " + posicao);
        }
        Celula<T> celula = inicio;
        for (int i = 0; celula != null && i < posicao; ++i) {
            celula = celula.getProxima();
        }
        return celula;
    }

    public void remove(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não ocupada: " + posicao);
        }
        if (posicao == 0) {
            // Remove do começo
            inicio = inicio.getProxima();
        } else {
            // Remove do meio ou do final
            Celula<T> anterior = pegaCelula(posicao - 1);
            Celula<T> remover = anterior.getProxima();
            anterior.setProxima(remover.getProxima());
        }
        this.totalDeElementos--;
    }

    public int tamanho() {
        return this.totalDeElementos;
    }

    public int busca(T elemento) {
        Celula<T> celula = inicio;
        for (int i = 0; celula != null && i < tamanho(); ++i) {
            if (celula.getElemento().equals(elemento)) {
                return i; 
            }
            celula = celula.getProxima();
        }
        return -1;
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Celula<T> celula = inicio;
        while(celula != null) {
            if (result.length() > 1) {
                result.append(", ");
            }
            result.append(celula.getElemento());
            celula = celula.getProxima();
        }
        result.append("]");
        return result.toString();
    }
}

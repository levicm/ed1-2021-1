package br.edu.ifs.ccomp.ed._11_lista_duplamente_ligada_01_basica;

public class ListaDuplamenteLigada<T> {

    private Celula<T> inicio;
    private Celula<T> fim;
    
    private int totalDeElementos;

    public void adiciona(T elemento) {
        if (totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        } else {
            Celula<T> nova = new Celula<T>(elemento, null, fim);
            fim.setProxima(nova);
            fim = nova;
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
            Celula<T> atual = pegaCelula(posicao);
            Celula<T> anterior = atual.getAnterior();
            Celula<T> nova = new Celula<T>(elemento, atual, anterior);
            anterior.setProxima(nova);
            atual.setAnterior(nova);
            this.totalDeElementos++;
        }
        
    }
    
    private boolean posicaoValidaAdicao(int posicao) {
        return posicao >= 0 && posicao <= tamanho();
    }

    public void adicionaNoComeco(T elemento) { 
        Celula<T> nova = new Celula<T>(elemento);
        if (totalDeElementos == 0) {
            fim = nova;
        } else {
            inicio.setAnterior(nova);
            nova.setProxima(inicio);
        }
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
        if (totalDeElementos == 1) {
            // Tem apenas um elemento
            inicio = null;
            fim = null;
        } else if (posicao == 0) {
            // Remove do começo
            inicio = inicio.getProxima();
            inicio.setAnterior(null);
        } else if (posicao == totalDeElementos - 1) {
            // Remove do fim
            fim = fim.getAnterior();
            fim.setProxima(null);
        } else {
            // Remove do meio ou do final
            Celula<T> atual = pegaCelula(posicao);
            Celula<T> anterior = atual.getAnterior();
            Celula<T> proximo = atual.getProxima();
            anterior.setProxima(proximo);
            proximo.setAnterior(anterior);
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

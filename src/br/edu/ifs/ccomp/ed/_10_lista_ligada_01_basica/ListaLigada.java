package br.edu.ifs.ccomp.ed._10_lista_ligada_01_basica;

public class ListaLigada {

    private Celula inicio;
    private int totalDeElementos;

    public void adiciona(Object elemento) {
        if (totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        } else {
            Celula atual = inicio;
            while(atual.getProxima() != null) {
                atual = atual.getProxima();
            }
            Celula celula = new Celula(elemento, null);
            atual.setProxima(celula);
            this.totalDeElementos++;
        }
    }

    public void adiciona(int posicao, Object elemento) {
        if (!posicaoValidaAdicao(posicao)) {
            throw new IllegalArgumentException("Posição inválida para adição: " + posicao);
        }
        if (posicao == 0) {
            adicionaNoComeco(elemento);
        } else if (posicao == tamanho()) {
            adiciona(elemento);
        } else {
            Celula anterior = pegaCelula(posicao - 1);
            Celula nova = new Celula(elemento, anterior.getProxima());
            anterior.setProxima(nova);
            this.totalDeElementos++;
        }
        
    }
    
    private boolean posicaoValidaAdicao(int posicao) {
        return posicao >= 0 && posicao <= tamanho();
    }

    public void adicionaNoComeco(Object elemento) { 
        Celula nova = new Celula(elemento, inicio);
        inicio = nova;
        totalDeElementos++;
    }

    public Object pega(int posicao) {
        return pegaCelula(posicao).getElemento();
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < tamanho();
    }
    
    private Celula pegaCelula(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não ocupada: " + posicao);
        }
        Celula celula = inicio;
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
            Celula anterior = pegaCelula(posicao - 1);
            Celula remover = anterior.getProxima();
            anterior.setProxima(remover.getProxima());
        }
        this.totalDeElementos--;
    }

    public int tamanho() {
        return this.totalDeElementos;
    }

    public int busca(Object elemento) {
        Celula celula = inicio;
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
        Celula celula = inicio;
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

package br.edu.ifs.ccomp.ed._12_pilha;

public class TestePilha {

    /**
     * Esperado:
     * []
     * Vazia: true
     * [Grade da frente, Acabamento, Parafuso, Helice, Grade do fundo, Motor]
     * Vazia: false
     * Motor
     * [Grade da frente, Acabamento, Parafuso, Helice, Grade do fundo]
     * Grade do fundo
     * [Grade da frente, Acabamento, Parafuso, Helice, Grade do fundo]
     * Grade do fundo
     * Helice
     * Parafuso
     * Acabamento
     * Grade da frente
     * 
     * @param args
     */
    public static void main(String[] args) {
        Pilha<Peca> pilha = new PilhaArranjo<Peca>();
        System.out.println(pilha);
        
        System.out.println("Vazia: " + pilha.vazia());
        pilha.adiciona(new Peca("Grade da frente"));
        pilha.adiciona(new Peca("Acabamento"));
        pilha.adiciona(new Peca("Parafuso"));
        pilha.adiciona(new Peca("Helice"));
        pilha.adiciona(new Peca("Grade do fundo"));
        pilha.adiciona(new Peca("Motor"));
        
        System.out.println(pilha);
        System.out.println("Vazia: " + pilha.vazia());
        System.out.println(pilha.remove());
        System.out.println(pilha);
        System.out.println(pilha.topo());
        System.out.println(pilha);
        
        while(!pilha.vazia()) {
            System.out.println(pilha.remove());
        }
    }

}

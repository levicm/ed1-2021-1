package br.edu.ifs.ccomp.ed._14_collections;

import java.util.Stack;

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
        Stack<Peca> pilha = new Stack<Peca>();
        System.out.println(pilha);
        
        System.out.println("Vazia: " + pilha.empty());
        pilha.push(new Peca("Grade da frente"));
        pilha.push(new Peca("Acabamento"));
        pilha.push(new Peca("Parafuso"));
        pilha.push(new Peca("Helice"));
        pilha.push(new Peca("Grade do fundo"));
        pilha.push(new Peca("Motor"));
        
        System.out.println(pilha);
        System.out.println("Vazia: " + pilha.empty());
        System.out.println(pilha.pop());
        System.out.println(pilha);
        System.out.println(pilha.peek());
        System.out.println(pilha);
        
        while(!pilha.empty()) {
            System.out.println(pilha.pop());
        }
    }

}

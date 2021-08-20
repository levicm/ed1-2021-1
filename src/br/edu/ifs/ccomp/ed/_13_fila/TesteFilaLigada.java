package br.edu.ifs.ccomp.ed._13_fila;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TesteFilaLigada {

    /**
     * Esperado:
     * []
     * 0
     * true
     * [Jo�o, Maria, Paulo]
     * 3
     * false
     * Jo�o
     * [Jo�o, Maria, Paulo]
     * Jo�o
     * [Maria, Paulo]
     * [Maria, Paulo, Rafaela, Let�cia]
     * Maria
     * Paulo
     * Rafaela
     * Let�cia
     * []
     * 
     * @param args
     */
    public static void main(String[] args) {
        String esperada = "[]\r\n"
                + "0\r\n"
                + "true\r\n"
                + "[Jo�o, Maria, Paulo]\r\n"
                + "3\r\n"
                + "false\r\n"
                + "Jo�o\r\n"
                + "[Jo�o, Maria, Paulo]\r\n"
                + "Jo�o\r\n"
                + "[Maria, Paulo]\r\n"
                + "[Maria, Paulo, Rafaela, Let�cia]\r\n"
                + "Maria\r\n"
                + "Paulo\r\n"
                + "Rafaela\r\n"
                + "Let�cia\r\n"
                + "[]\r\n";
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        
        Fila<Aluno> fila = new FilaLigada<Aluno>();
        out.println(fila);
        out.println(fila.tamanho());
        out.println(fila.vazia());
        
        fila.adiciona(new Aluno("Jo�o"));
        fila.adiciona(new Aluno("Maria"));
        fila.adiciona(new Aluno("Paulo"));
        out.println(fila);
        out.println(fila.tamanho());
        out.println(fila.vazia());
        
        out.println(fila.consulta());
        out.println(fila);
        out.println(fila.remove());
        out.println(fila);

        fila.adiciona(new Aluno("Rafaela"));
        fila.adiciona(new Aluno("Let�cia"));
        out.println(fila);
        
        while (fila.tamanho() > 0) {
            out.println(fila.remove());
        }
        out.println(fila);
       
        System.out.println("Teste: " + baos.toString().equals(esperada));
    }

}

package br.edu.ifs.ccomp.ed._14_collections;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Queue;

public class TesteFilaLigada {

    /**
     * Esperado:
     * []
     * 0
     * true
     * [João, Maria, Paulo]
     * 3
     * false
     * João
     * [João, Maria, Paulo]
     * João
     * [Maria, Paulo]
     * [Maria, Paulo, Rafaela, Letícia]
     * Maria
     * Paulo
     * Rafaela
     * Letícia
     * []
     * 
     * @param args
     */
    public static void main(String[] args) {
        String esperada = "[]\r\n"
                + "0\r\n"
                + "true\r\n"
                + "[João, Maria, Paulo]\r\n"
                + "3\r\n"
                + "false\r\n"
                + "João\r\n"
                + "[João, Maria, Paulo]\r\n"
                + "João\r\n"
                + "[Maria, Paulo]\r\n"
                + "[Maria, Paulo, Rafaela, Letícia]\r\n"
                + "Maria\r\n"
                + "Paulo\r\n"
                + "Rafaela\r\n"
                + "Letícia\r\n"
                + "[]\r\n";
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        
        Queue<Aluno> fila = new LinkedList<Aluno>();
        out.println(fila);
        out.println(fila.size());
        out.println(fila.isEmpty());
        
        fila.add(new Aluno("João"));
        fila.add(new Aluno("Maria"));
        fila.add(new Aluno("Paulo"));
        out.println(fila);
        out.println(fila.size());
        out.println(fila.isEmpty());
        
        out.println(fila.element());
        out.println(fila);
        out.println(fila.remove());
        out.println(fila);

        fila.add(new Aluno("Rafaela"));
        fila.add(new Aluno("Letícia"));
        out.println(fila);
        
        while (fila.size() > 0) {
            out.println(fila.remove());
        }
        out.println(fila);
       
        System.out.println("Teste: " + baos.toString().equals(esperada));
        System.out.println(baos.toString());
    }

}

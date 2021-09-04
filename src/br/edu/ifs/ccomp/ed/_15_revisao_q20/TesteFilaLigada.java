package br.edu.ifs.ccomp.ed._15_revisao_q20;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TesteFilaLigada {

    /**
     * Esperado:
     * []
     * 0
     * true
     * [João, Maria, Paulo]
     * []
     * 
     * @param args
     */
    public static void main(String[] args) {
        String esperada = "[]\r\n"
                + "0\r\n"
                + "true\r\n"
                + "[João, Maria, Paulo]\r\n"
                + "[]\r\n";
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        
        Fila<Aluno> fila = new FilaLigada<Aluno>();
        out.println(fila);
        out.println(fila.tamanho());
        out.println(fila.vazia());
        
        fila.adiciona(new Aluno("João"));
        fila.adiciona(new Aluno("Maria"));
        fila.adiciona(new Aluno("Paulo"));
        
        out.println(fila);
        fila.limpa();
        out.println(fila);
       
        System.out.println(baos.toString());
        System.out.println("Teste: " + baos.toString().equals(esperada));
    }

}

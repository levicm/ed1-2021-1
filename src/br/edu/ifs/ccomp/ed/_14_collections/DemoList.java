package br.edu.ifs.ccomp.ed._14_collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoList {

    public static void main(String[] args) {
        List<String> alunos = new LinkedList<String>();
        
        alunos.add("Maria");
        alunos.add("Tereza");
        alunos.add("Rafaela");
        alunos.add("Paulo");
        alunos.add("João");
        
        System.out.println("\r\nFor tradicional:");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i));
        }
        
        Collections.sort(alunos);
        
        System.out.println("\r\nIterator:");
        Iterator it = alunos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        System.out.println("Posição de Rafaela: " +Collections.binarySearch(alunos, "Rafaela"));
        System.out.println("Posição de Levi: " +Collections.binarySearch(alunos, "Levi"));
        
        Collections.reverse(alunos);
        
        System.out.println("\r\nFor-each:");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        
        List listaVazia = Collections.emptyList();
        System.out.println(listaVazia);
        
        
        String[] pecas = new String[] {"volante", null, "pneu", "calota"};
        System.out.println(pecas);
        System.out.println(Arrays.toString(pecas));

        List<String> listaPecas = Arrays.asList(pecas);
        System.out.println(listaPecas);        
    }

}

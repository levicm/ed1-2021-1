package br.edu.ifs.ccomp.ed._14_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class DemoList2 {

    public static void main(String[] args) {
        List<String> alunos1 = new LinkedList<String>();
        fill(alunos1);
        show(alunos1);

        List<String> alunos2 = new ArrayList<String>();
        fill(alunos2);
        show(alunos2);

        List<String> alunos3 = new Vector<String>();
        fill(alunos3);
        show(alunos3);
    }

    public static void fill(List<String> lista) {
        lista.add("João");
        lista.add("Maria");
        lista.add("Paulo");
        lista.add("Rafaela");
        lista.add("Maria");
        lista.add("Tereza");
    }

    public static void show(Collection collection) {
        System.out.println("----------");
        System.out.println("Coleção:");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

}

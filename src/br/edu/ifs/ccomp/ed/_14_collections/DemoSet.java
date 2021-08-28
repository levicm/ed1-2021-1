package br.edu.ifs.ccomp.ed._14_collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSet {

    public static void main(String[] args) {
        Set<String> alunos1 = new HashSet<String>();
        fill(alunos1);
        show(alunos1);
    }

    public static void fill(Set<String> lista) {
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

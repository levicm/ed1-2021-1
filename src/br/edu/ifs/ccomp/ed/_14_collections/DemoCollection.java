package br.edu.ifs.ccomp.ed._14_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DemoCollection {

    public static void main(String[] args) {
        Collection<String> lista1 = new ArrayList<String>();
        
        lista1.add("João");
        lista1.add("Maria");
        lista1.add("Paulo");
        lista1.add("Rafaela");
        lista1.add("Tereza");
        
        show(lista1);
        System.out.println("Contém: " + lista1.contains("Paulo"));
        lista1.remove("Tereza");
        show(lista1);
        System.out.println("Tamanho: " + lista1.size());

        System.out.println("Arranjo:");
        Object[] arranjo = lista1.toArray();
        for (int i = 0; i < arranjo.length; i++) {
            System.out.println(arranjo[i]);
        }
    }
    
    public static void show(Collection collection) {
        System.out.println("Coleção:\r\n----------");
        Iterator it = collection.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

}

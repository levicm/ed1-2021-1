package br.edu.ifs.ccomp.ed._08_02_lista_ordenada;

public class TesteListaOrdenada {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        ListaOrdenada lista = new ListaOrdenada();
        lista.adiciona(new Candidato("Joao", 42, 62));
        lista.adiciona(new Candidato("Maria", 40, 80));
        lista.adiciona(new Candidato("Rafael", 30, 80));
        lista.adiciona(new Candidato("Paula", 23, 55));
        System.out.println(lista);
        System.out.println(lista.tamanho());
        
    }

}

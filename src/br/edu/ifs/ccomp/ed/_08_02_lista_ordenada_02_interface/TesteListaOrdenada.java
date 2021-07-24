package br.edu.ifs.ccomp.ed._08_02_lista_ordenada_02_interface;

public class TesteListaOrdenada {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        Lista<Candidato> lista = new ListaOrdenada<Candidato>();
        lista.adiciona(new Candidato("Joao", 42, 62));
        lista.adiciona(new Candidato("Maria", 40, 80));
        lista.adiciona(new Candidato("Rafael", 30, 80));
        lista.adiciona(new Candidato("Paula", 23, 55));
        
        System.out.println(lista);
        System.out.println(lista.tamanho());

        Candidato cand = lista.pega(0);
        System.out.println(cand);
    }

}

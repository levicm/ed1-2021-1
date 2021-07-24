package br.edu.ifs.ccomp.ed._08_02_lista_ordenada_03_heranca;

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

        Candidato josefina = new Candidato("Josefina", 27, 65);
        lista.adiciona(1, josefina);
        System.out.println(lista);
        
        Candidato cand = lista.pega(0);
        System.out.println(cand);
        
        System.out.println("Posicao de Josefina: " + lista.busca(josefina));

        System.out.println(lista.segmento(2, 4));
}

}

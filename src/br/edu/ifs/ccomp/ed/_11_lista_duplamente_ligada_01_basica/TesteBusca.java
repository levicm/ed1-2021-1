package br.edu.ifs.ccomp.ed._11_lista_duplamente_ligada_01_basica;

public class TesteBusca {

    /**
     * Esperado: 
     * [Maria, Jo�o, Rafael]
     * 1
     * 2
     * -1
     * 
     * @param args
     */
    public static void main(String[] args) {
        ListaDuplamenteLigada<Aluno> lista = new ListaDuplamenteLigada<Aluno>();

        lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
        lista.adiciona(new Aluno("Jo�o", "joao@gmail.com"));
        Aluno rafael = new Aluno("Rafael", "rafael@gmail.com");
        lista.adiciona(rafael);

        System.out.println(lista);
        
        System.out.println(lista.busca(new Aluno("Jo�o", "joao@gmail.com")));
        System.out.println(lista.busca(rafael));
        System.out.println(lista.busca(new Aluno("Josefa", "josefa@gmail.com")));
    }

}

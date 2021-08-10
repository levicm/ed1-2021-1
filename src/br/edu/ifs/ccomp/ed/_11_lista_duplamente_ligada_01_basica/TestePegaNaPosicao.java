package br.edu.ifs.ccomp.ed._11_lista_duplamente_ligada_01_basica;

public class TestePegaNaPosicao {

    /**
     * Esperado: 
     * Maria
     * João
     * Rafael
     * 
     * @param args
     */
    public static void main(String[] args) {
        ListaDuplamenteLigada<Aluno> lista = new ListaDuplamenteLigada<Aluno>();

        lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
        lista.adiciona(new Aluno("João", "joao@gmail.com"));
        lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));

        System.out.println(lista.pega(0));
        System.out.println(lista.pega(1));
        System.out.println(lista.pega(2));
    }

}

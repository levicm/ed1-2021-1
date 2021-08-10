package br.edu.ifs.ccomp.ed._11_lista_duplamente_ligada_01_basica;

public class TesteAdicionaNoComeco {

    /**
     * Esperado: 
     * [Rafael, Jo�o, Maria]
     * 
     * @param args
     */
    public static void main(String[] args) {
        ListaDuplamenteLigada<Aluno> lista = new ListaDuplamenteLigada<Aluno>();

        lista.adicionaNoComeco(new Aluno("Maria", "maria@gmail.com"));
        lista.adicionaNoComeco(new Aluno("Jo�o", "joao@gmail.com"));
        lista.adicionaNoComeco(new Aluno("Rafael", "rafael@gmail.com"));

        System.out.println(lista);
    }

}

package br.edu.ifs.ccomp.ed._10_lista_ligada_01_basica;

public class TesteAdicionaNoComeco {

    /**
     * Esperado: 
     * [Rafael, Jo�o, Maria]
     * 
     * @param args
     */
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adicionaNoComeco(new Aluno("Maria", "maria@gmail.com"));
        lista.adicionaNoComeco(new Aluno("Jo�o", "joao@gmail.com"));
        lista.adicionaNoComeco(new Aluno("Rafael", "rafael@gmail.com"));

        System.out.println(lista);
    }

}

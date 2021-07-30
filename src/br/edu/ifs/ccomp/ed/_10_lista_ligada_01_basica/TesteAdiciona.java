package br.edu.ifs.ccomp.ed._10_lista_ligada_01_basica;

public class TesteAdiciona {

    /**
     * Esperado: 
     * [Maria, Jo�o, Rafael]
     * 
     * @param args
     */
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
        lista.adiciona(new Aluno("Jo�o", "joao@gmail.com"));
        lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));

        System.out.println(lista);
    }

}

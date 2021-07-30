package br.edu.ifs.ccomp.ed._10_lista_ligada_01_basica;

public class TesteAdicionaNaPosicao {

    /**
     * Esperado: 
     * [João, Rafael, Maria, Paulo]
     * 
     * @param args
     */
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adiciona(0, new Aluno("Maria", "maria@gmail.com"));
        lista.adiciona(0, new Aluno("João", "joao@gmail.com"));
        lista.adiciona(1, new Aluno("Rafael", "rafael@gmail.com"));
        lista.adiciona(3, new Aluno("Paulo", "paulo@gmail.com"));

        System.out.println(lista);
    }

}

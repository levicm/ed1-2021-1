package br.edu.ifs.ccomp.ed._15_revisao_q18;

public class TesteRemoveTodos {

    /**
     * Esperado: 
     * [Maria, João, Rafael, Maria, Maria, Mauricio, Paulo]
     * [João, Rafael, Mauricio, Paulo]
     * 
     * @param args
     */
    public static void main(String[] args) {
        ListaLigada<Aluno> lista = new ListaLigada<Aluno>();

        lista.adiciona(new Aluno("Maria"));
        lista.adiciona(new Aluno("João"));
        lista.adiciona(new Aluno("Rafael"));
        lista.adiciona(new Aluno("Maria"));
        lista.adiciona(new Aluno("Maria"));
        lista.adiciona(new Aluno("Mauricio"));
        lista.adiciona(new Aluno("Paulo"));
        lista.adiciona(new Aluno("Maria"));

        System.out.println(lista);
        lista.removeTodos(new Aluno("Maria"));

        System.out.println(lista);
    }

}

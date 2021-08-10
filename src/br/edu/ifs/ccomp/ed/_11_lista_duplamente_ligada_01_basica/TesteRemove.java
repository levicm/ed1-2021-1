package br.edu.ifs.ccomp.ed._11_lista_duplamente_ligada_01_basica;

public class TesteRemove {

    /**
     * Esperado: 
     * [Maria, João, Rafael, Jose, Paulo]
     * [Maria, João, Jose, Paulo]
     * [João, Jose, Paulo]
     * [João, Jose]
     * []
     * 
     * @param args
     */
    public static void main(String[] args) {
        ListaDuplamenteLigada<Aluno> lista = new ListaDuplamenteLigada<Aluno>();

        lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
        lista.adiciona(new Aluno("João", "joao@gmail.com"));
        lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
        lista.adiciona(new Aluno("Jose", "jose@gmail.com"));
        lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));

        System.out.println(lista);

        lista.remove(2);
        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista);

        lista.remove(2);
        System.out.println(lista);

        lista.remove(0);
        lista.remove(0);
        System.out.println(lista);
    }

}

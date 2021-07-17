package br.edu.ifs.ccomp.ed._07_prova;

public class TesteProva {

    /**
     * @param args
     */
    public static void main(String[] args) {
        testeSubstitui();
        testeCopiaPara();
        testeInverte();
        testeSegmento();
        testeEquals();
    }

    private static void testeSubstitui() {
        Lista<String> lista = new ListaArranjo<String>();

        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        lista.adiciona("Maria");

        lista.substitui(1, "Joao");

        boolean test = lista.tamanho() == 3 
                && "Rafael".equals(lista.pega(0)) 
                && "Joao".equals(lista.pega(1))
                && "Maria".equals(lista.pega(2));
        System.out.println("Substitui: " + test);
    }

    private static void testeCopiaPara() {
        Lista<String> lista = new ListaArranjo<String>();

        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        lista.adiciona("Maria");

        String[] arranjo = new String[4];
        lista.copiaPara(arranjo);

        boolean test = "Rafael".equals(arranjo[0]) 
                && "Paulo".equals(arranjo[1]) 
                && "Maria".equals(arranjo[2])
                && arranjo[3] == null;
        System.out.println("CopiaPara: " + test);
    }

    private static void testeInverte() {
        Lista<String> lista = new ListaArranjo<String>();

        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        lista.adiciona("Maria");

        lista.inverte();

        boolean test = "Maria".equals(lista.pega(0)) 
                && "Paulo".equals(lista.pega(1)) 
                && "Rafael".equals(lista.pega(2));
        System.out.println("Inverte: " + test);
    }

    private static void testeSegmento() {
        Lista<String> lista1 = new ListaArranjo<String>();
        lista1.adiciona("Rafael");
        lista1.adiciona("Paulo");
        lista1.adiciona("Maria");
        lista1.adiciona("Joao");

        Lista<String> lista2 = lista1.segmento(1, 3);

        boolean test = lista2 != null 
                && lista2.tamanho() == 2 
                && "Paulo".equals(lista2.pega(0))
                && "Maria".equals(lista2.pega(1));
        System.out.println("Segmento: " + test);
    }

    private static void testeEquals() {
        Lista<String> lista1 = new ListaArranjo<String>();
        lista1.adiciona("Rafael");
        lista1.adiciona("Paulo");
        lista1.adiciona("Maria");
        lista1.adiciona("Joao");

        Lista<String> lista2 = new ListaArranjo<String>();
        lista2.adiciona("Rafael");
        lista2.adiciona("Paulo");
        lista2.adiciona("Maria");
        lista2.adiciona("Joao");

        Lista<Integer> lista3 = new ListaArranjo<Integer>();
        lista3.adiciona(34);
        lista3.adiciona(128);

        boolean test = lista1.equals(lista2) 
                && !lista2.equals(lista3) 
                && !lista2.equals("Valor");
        System.out.println("Equals: " + test);
    }

}

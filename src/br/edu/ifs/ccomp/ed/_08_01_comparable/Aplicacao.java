package br.edu.ifs.ccomp.ed._08_01_comparable;

public class Aplicacao {

    public static void main(String[] args) {
        Lista<Candidato> lista = new ListaArranjo<Candidato>();
        lista.adiciona(new Candidato("Joao", 42, 62));
        lista.adiciona(new Candidato("Maria", 40, 80));
        lista.adiciona(new Candidato("Rafael", 30, 80));
        lista.adiciona(new Candidato("Paula", 23, 55));

        Candidato maior = null;
        for (int i = 0; i < lista.tamanho(); i++) {
            Candidato cand = lista.pega(i);
            if (maior == null) {
                maior = cand;
            } else {
                if (cand.compareTo(maior) > 0) {
                    maior = cand;
                }
            }
        }
        System.out.println("Candidato aprovado: " + maior);
    }

}

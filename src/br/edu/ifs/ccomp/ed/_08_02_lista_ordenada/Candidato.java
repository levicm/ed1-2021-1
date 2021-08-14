package br.edu.ifs.ccomp.ed._08_02_lista_ordenada;

public class Candidato implements Comparable<Candidato> {

    private String nome;
    private int idade;
    private int nota;

    public Candidato(String nome, int idade, int nota) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome + ": " + idade + " (" + nota + ")";
    }

    public int compareTo(Candidato o) {
        if (nota > o.nota) {
            return 1;
        } else if (nota < o.nota) {
            return -1;
        } else {
            if (idade > o.idade) {
                return 1;
            } else if (idade < o.idade) {
                return -1;
            }
            return 0;
        }
    }
}

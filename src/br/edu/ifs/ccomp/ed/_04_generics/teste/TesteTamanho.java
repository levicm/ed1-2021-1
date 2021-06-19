package br.edu.ifs.ccomp.ed._04_generics.teste;

import br.edu.ifs.ccomp.ed._03_lista.Aluno;
import br.edu.ifs.ccomp.ed._04_generics.Lista;

public class TesteTamanho {

	/**
	 * Esperado:
	 * 2
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Lista<Aluno> lista = new Lista<Aluno>();
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
		
		System.out.println(lista.tamanho());
	}

}

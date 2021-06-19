package br.edu.ifs.ccomp.ed._03_lista.teste;

import br.edu.ifs.ccomp.ed._03_lista.Aluno;
import br.edu.ifs.ccomp.ed._03_lista.Lista;

public class TestePegaNaPosicao {

	/**
	 * Esperado:
	 * [Rafael, Paulo]
	 * Rafael
	 * Paulo
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
		
		System.out.println(lista);
		
		Aluno aluno1 = lista.pega(0);
		System.out.println(aluno1);

		Aluno aluno2 = lista.pega(1);
		System.out.println(aluno2);

		// Situações sem tratamento:
		System.out.println(lista.pega(3));
		System.out.println(lista.pega(101));
	}

}

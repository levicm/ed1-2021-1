package br.edu.ifs.ccomp.ed._04_interfaces.teste;

import br.edu.ifs.ccomp.ed._03_lista.Aluno;
import br.edu.ifs.ccomp.ed._04_interfaces.Lista;
import br.edu.ifs.ccomp.ed._04_interfaces.ListaArranjo;

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
		Lista<Aluno> lista = new ListaArranjo<Aluno>();
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
		
		System.out.println(lista);
		
		Aluno aluno1;
		aluno1 = lista.pega(0);
		
		System.out.println(aluno1);

		Aluno aluno2 = lista.pega(1);
		System.out.println(aluno2);
	}

}

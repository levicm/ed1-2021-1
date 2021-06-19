package br.edu.ifs.ccomp.ed._04_generics.teste;

import br.edu.ifs.ccomp.ed._03_lista.Aluno;
import br.edu.ifs.ccomp.ed._04_generics.Lista;

public class TesteAdiciona {

	/**
	 * Esperado:
	 * [Rafael, Paulo]
	 * [Maria, João]
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Lista<Aluno> lista = new Lista<Aluno>();
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
		
		System.out.println(lista);

		Lista<String> lista2 = new Lista<String>();
		lista2.adiciona("Maria");
		lista2.adiciona("João");
		
		System.out.println(lista2);
	}

}

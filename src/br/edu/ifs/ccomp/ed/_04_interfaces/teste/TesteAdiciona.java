package br.edu.ifs.ccomp.ed._04_interfaces.teste;

import br.edu.ifs.ccomp.ed._03_lista.Aluno;
import br.edu.ifs.ccomp.ed._04_interfaces.Lista;
import br.edu.ifs.ccomp.ed._04_interfaces.ListaArranjo;

public class TesteAdiciona {

	/**
	 * Esperado:
	 * [Rafael, Paulo]
	 * [Maria, João]
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Lista<Aluno> lista1 = new ListaArranjo<Aluno>();
		Lista<String> lista2 = new ListaArranjo<String>();
		test(lista1, lista2);
	}
	
	public static void test(Lista<Aluno> lista1, Lista<String> lista2) {
		lista1.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista1.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
		System.out.println(lista1);

		lista2.adiciona("Maria");
		lista2.adiciona("João");
		System.out.println(lista2);
	}

}

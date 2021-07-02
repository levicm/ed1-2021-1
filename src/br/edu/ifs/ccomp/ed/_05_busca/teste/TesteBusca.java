package br.edu.ifs.ccomp.ed._05_busca.teste;

import br.edu.ifs.ccomp.ed._05_busca.Aluno;
import br.edu.ifs.ccomp.ed._05_busca.Lista;
import br.edu.ifs.ccomp.ed._05_busca.ListaArranjo;

public class TesteBusca {

	/**
	 * Esperado:
	 * [Rafael, Paulo, Maria, João]
	 * 2
	 * 1
	 * 3
	 * -1
	 * -1
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Lista<Aluno> lista = new ListaArranjo<Aluno>();
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		Aluno aluno1 = new Aluno("João", "joao@gmail.com");
		lista.adiciona(aluno1);
		
		System.out.println(lista);
		
		System.out.println(lista.busca(new Aluno("Maria")));
		System.out.println(lista.busca(new Aluno("paulo")));
		System.out.println(lista.busca(aluno1));
		System.out.println(lista.busca(new Aluno("José")));
		System.out.println(lista.busca(null));
	}

}

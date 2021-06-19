package br.edu.ifs.ccomp.ed._03_lista.teste;

import br.edu.ifs.ccomp.ed._03_lista.Aluno;
import br.edu.ifs.ccomp.ed._03_lista.Lista;

public class TesteAdiciona {

	/**
	 * Esperado:
	 * [Rafael, Paulo]
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
		
		System.out.println(lista);
	}

}

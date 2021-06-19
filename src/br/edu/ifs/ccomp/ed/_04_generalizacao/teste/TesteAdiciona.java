package br.edu.ifs.ccomp.ed._04_generalizacao.teste;

import br.edu.ifs.ccomp.ed._03_lista.Aluno;
import br.edu.ifs.ccomp.ed._04_generalizacao.Lista;

public class TesteAdiciona {

	/**
	 * Esperado:
	 * [Rafael, Paulo]
	 * [Rafael, Paulo, Maria, Jo�o]
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
		
		System.out.println(lista);

		lista.adiciona(new String("Maria"));
		lista.adiciona(new String("Jo�o"));

		System.out.println(lista);
	}

}

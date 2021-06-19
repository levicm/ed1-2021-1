package br.edu.ifs.ccomp.ed._04_generalizacao.teste;

import br.edu.ifs.ccomp.ed._03_lista.Aluno;
import br.edu.ifs.ccomp.ed._04_generalizacao.Lista;

public class TestePegaNaPosicao {

	/**
	 * Esperado:
	 * [Rafael, Paulo]
	 * Rafael
	 * Paulo
	 * [Rafael, Paulo, Maria, João]
	 * Maria
	 * João
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
		
		System.out.println(lista);
		
		Aluno aluno1 = (Aluno) lista.pega(0);
		System.out.println(aluno1);

		Aluno aluno2 = (Aluno) lista.pega(1);
		System.out.println(aluno2);

		lista.adiciona(new String("Maria"));
		lista.adiciona(new String("João"));

		System.out.println(lista);

		// Essa implementação daria erro:
//		Aluno aluno3 = (Aluno) lista.pega(2);
//		System.out.println(aluno3);
		
		String nome3 = null;
		Object elemento3 = lista.pega(2);
		if (elemento3 instanceof Aluno) {
			Aluno aluno3 = (Aluno) elemento3;
			nome3 = aluno3.getNome();
		} else if (elemento3 instanceof String) {
			nome3 = (String) elemento3;
		} else {
			nome3 = elemento3.toString();
		}
		System.out.println(nome3);

		System.out.println(lista.pega(3));
	}

}

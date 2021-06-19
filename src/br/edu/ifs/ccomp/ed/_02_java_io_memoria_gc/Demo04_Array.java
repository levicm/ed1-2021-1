package br.edu.ifs.ccomp.ed._02_java_io_memoria_gc;
import java.util.Scanner;

public class Demo04_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos produtos? ");
		int n = sc.nextInt();
		
		Produto[] vetor = new Produto[n];
		
		for (int i = 0; i < n; ++i) {
			System.out.println("Informe os dados do produto " + (i+1));
			System.out.println("Nome do produto: ");
			String nome = sc.next();
			System.out.println("Valor do produto: ");
			double valor = sc.nextDouble();
			vetor[i] = new Produto(nome, valor);
		}
		
		double media = 0;
		for (Produto produto : vetor) {
			media += produto.getValor();
		}
		media = media / vetor.length;
		System.out.println("Média de valores: " + media);
		
		sc.close();
	}

}

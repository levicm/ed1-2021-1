package br.edu.ifs.ccomp.ed._02_java_io_memoria_gc;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Demo01_EntradaSaida {

	public static void main(String[] args) throws Exception {
		// Exemplo de InputStreams "empilhados"
		FileInputStream fis = new FileInputStream("Dados.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		dis.close();

		// Exemplo de println
		System.out.println("Imprimir \"algo\" \tcom tabulação.\r\nEm outra linha");

		// Exemplo de printf
		double d = 2873873.45;
		float p = 20.4f;
		System.out.printf("O Valor foi de:\n%.2f reais, o que equivale a %.2f%%", d, p);
		System.out.println();

		// Exemplos de Scanner
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome;
		float nota;

		System.out.print("Entre com o seu nome e nota: ");
		nome = sc.next();
		nota = sc.nextFloat();

		System.out.printf("Seu nome é %s %n", nome);
		System.out.printf("Sua nota é %.1f %n", nota);

		sc.close();
	}

}

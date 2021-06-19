package br.edu.ifs.ccomp.ed._02_java_io_memoria_gc;

public class Demo03_GC {
	public static void main(String[] args) {
		Produto p1 = new Produto("Vaso", 20, 12);
		p1.mostrar();

		Produto p2 = new Produto();
		p2.mostrar();

		p2 = p1;
		Runtime.getRuntime().gc();

		p2.reajustar(0.2f);

		p1.mostrar();
		p2.mostrar();
	}
}

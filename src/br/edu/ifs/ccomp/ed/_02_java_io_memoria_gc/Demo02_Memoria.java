package br.edu.ifs.ccomp.ed._02_java_io_memoria_gc;

public class Demo02_Memoria {

	public static void main(String[] args) {
		Produto p1 = new Produto("Vaso", 20, 12);
		p1.mostrar();
		
		Produto p2 = new Produto();
		p2.mostrar();

		Produto p3;
		
		p3 = p1;
		p3.reajustar(0.2f);

		p1.mostrar();
		p2.mostrar();
		p3.mostrar();
	}

}

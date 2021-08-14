package br.edu.ifs.ccomp.ed._05_busca;

public class ListaArranjo<T> implements Lista<T> {
	private Object[] arranjo = new Object[100];
	private int tamanho = 0;

	public void adiciona(T element) {
		garanteEspaco();
		arranjo[this.tamanho] = element;
		tamanho++;
	}

	public void adiciona(int posicao, T element) {
		if (!posicaoValidaAdicao(posicao)) {
			throw new IllegalArgumentException("Posicao informada não é válida para adicionar: " + posicao);
		}
		garanteEspaco();
		if (posicao == this.tamanho) {
			arranjo[posicao] = element;
		} else {
			for (int i = this.tamanho; i > posicao; --i) {
				arranjo[i] = arranjo[i - 1];
			}
			arranjo[posicao] = element;
		}
		this.tamanho++;
	}

	private boolean posicaoValidaAdicao(int posicao) {
		return posicao >= 0 && posicao <= tamanho();
	}

	private void garanteEspaco() {
		if (tamanho() == arranjo.length) {
			Object[] novoArranjo = new Object[this.arranjo.length * 2];
			for (int i = 0; i < this.arranjo.length; i++) {
				novoArranjo[i] = this.arranjo[i];
			}
			this.arranjo = novoArranjo;
		}
	}

	@SuppressWarnings("unchecked")
	public T pega(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição informada não está ocupada: " + posicao);
		}
		return (T) arranjo[posicao];
	}

	public int busca(T element) {
		for (int i = 0; i < this.tamanho; ++i) {
			if (arranjo[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < tamanho();
	}

	public void remove(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição informada não está ocupada: " + posicao);
		}
		for (int i = posicao; i < tamanho - 1; ++i) {
			arranjo[i] = arranjo[i + 1];
		}
		arranjo[tamanho] = null;
		tamanho--;
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		int i = 0;
		while (arranjo[i] != null) {
			if (i > 0) {
				result.append(", ");
			}
			result.append(arranjo[i]);
			++i;
		}
		result.append("]");
		return result.toString();
	}
}

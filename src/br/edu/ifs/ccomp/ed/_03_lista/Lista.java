package br.edu.ifs.ccomp.ed._03_lista;

public class Lista {
	private Aluno[] arranjo = new Aluno[100];

	public void adiciona(Aluno aluno) {
		garanteEspaco();
		for (int i = 0; i < arranjo.length; ++i) {
			if (arranjo[i] == null) {
				arranjo[i] = aluno;
				break;
			}
		}
	}

	public void adiciona(int posicao, Aluno aluno) {
		if (!posicaoValidaAdicao(posicao)) {
			throw new IllegalArgumentException("Posicao informada não é válida para adicionar: " + posicao);
		}
		garanteEspaco();
		int tamanho = tamanho();
		if (posicao == tamanho) {
			arranjo[posicao] = aluno;
		} else {
			for (int i = tamanho; i > posicao; --i) {
				arranjo[i] = arranjo[i - 1];
			}
			arranjo[posicao] = aluno;
		}
	}

	private void garanteEspaco() {
		if (tamanho() == arranjo.length) {
			Aluno[] novoArranjo = new Aluno[this.arranjo.length * 2];
			for (int i = 0; i < this.arranjo.length; i++) {
				novoArranjo[i] = this.arranjo[i];
			}
			this.arranjo = novoArranjo;
		}
	}

	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição informada não está ocupada: " + posicao);
		}
		return arranjo[posicao];
	}

	private boolean posicaoValidaAdicao(int posicao) {
		return posicao >= 0 && posicao <= tamanho();
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < tamanho();
	}

	public void remove(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição informada não está ocupada: " + posicao);
		}
		int tamanho = tamanho();
		for (int i = posicao; i < tamanho; ++i) {
			arranjo[i] = arranjo[i + 1];
		}
		// Se o arranjo estiver completo, essa implementação vai dar erro
		// na última iteração
	}

	public int tamanho() {
		int result = 0;
		for (int i = 0; i < arranjo.length; ++i) {
			if (arranjo[i] == null) {
				result = i;
				break;
			}
		}
		return result;
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

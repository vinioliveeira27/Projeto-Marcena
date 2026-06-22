package model;

public class Gaveta {
	private double largura;
	private double altura;
	private double profundidade;
	private TipoCorredica corredica;

	public Gaveta(double largura, double altura, double profundidade, TipoCorredica corredica) {
		this.largura = largura;
		this.altura = altura;
		this.profundidade = profundidade;
		this.corredica = corredica;
	}

	public double getLargura() {
		return largura;
	}

	public double getAltura() {
		return altura;
	}

	public double getProfundidade() {
		return profundidade;
	}

	public TipoCorredica getCorredica() {
		return corredica;
	}

}

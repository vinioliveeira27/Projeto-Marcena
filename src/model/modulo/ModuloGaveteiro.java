package model.modulo;

import model.Gaveta;

public class ModuloGaveteiro {

	private int quantidadeGavetas;
	private Gaveta gaveta; // todas as gavetas são iguais

	public ModuloGaveteiro(int quantidadeGavetas, Gaveta gaveta) {
		this.quantidadeGavetas = quantidadeGavetas;
		this.gaveta = gaveta;
	}

	public int getQuantidadeGavetas() {
		return quantidadeGavetas;
	}

	public Gaveta getGaveta() {
		return gaveta;
	}
}
package br.unipe.mlpIII.curso.model;

public class Aluno extends Pessoa{
	
	private double media;
	private int qtdFalta;
	

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public int getQtdFalta() {
		return qtdFalta;
	}

	public void setQtdFalta(int qtdFalta) {
		this.qtdFalta = qtdFalta;
	}

	@Override
	public String toString() {
		return  super.toString() + 
				"Média: " + this.getMedia() + 
				"\nFaltas: "  + this.getQtdFalta() + "\n";
	}

	

}

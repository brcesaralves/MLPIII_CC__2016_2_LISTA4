package br.unipe.mlpIII.curso.model;


public class Pessoa implements Comparable<Pessoa>{
	private String matricula;
	private String nome;
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return  "Matricula: " + this.getMatricula() +
				"\nNome:  " + this.getNome() + "\n";
	}
		
	public int compareTo(Pessoa p){
		return this.nome.compareTo(p.getNome());
	}
	
	
}

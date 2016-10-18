package br.unipe.mlpIII.curso.model;

import java.util.Set;
import java.util.TreeSet;

public class Curso {
	private int id;
	private String nome;
	private Set<Aluno> alunos = new TreeSet<>();
	private Professor professor;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Set<Aluno> getAluno() {
		return alunos;
	}
	
	public void setAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
	public void listarAlunos(){
		
		for(Aluno a : alunos){
			System.out.println(a.toString());
		}
		
	}

	@Override
	public String toString() {
		return "ID do Curso: " + id + 
				"\nNome: " + nome + 
				"\nProfessor: " + professor + "\n";
	}
	
	
	

}

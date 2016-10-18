package br.unipe.mlpIII.curso.util;

import java.util.Scanner;

public class Util {
	
	private int opcao;
	private Scanner leitor = new Scanner(System.in);
	
	public int Menu(){
		
		System.out.println("Digite sua Opção:");
		System.out.println("");
		System.out.println("1 - Incluir alunos");
		System.out.println("2 - Remover aluno (por nome ou matrícula)");
		System.out.println("3 - Verificar se um aluno está matriculado (por matrícula)");
		System.out.println("4 - Listar todos os alunos aprovados (média superior à 7,0)");
		System.out.println("5 - Listar todos os alunos reprovados por falta (faltas superiores à 15 faltas)");
		System.out.println("6 - Listar por ordem alfabética");
		System.out.println("0 - Sair");
		
		this.opcao = Integer.parseInt(ler());
				
		return opcao;
	}
	
	public String ler(){
		return leitor.next();
	}

}
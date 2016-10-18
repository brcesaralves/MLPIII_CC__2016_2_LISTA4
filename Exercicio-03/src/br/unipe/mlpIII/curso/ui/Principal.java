package br.unipe.mlpIII.curso.ui;

import br.unipe.mlpIII.curso.model.Aluno;
import br.unipe.mlpIII.curso.model.Curso;
import br.unipe.mlpIII.curso.model.Professor;
import br.unipe.mlpIII.curso.util.Util;

public class Principal {

	public static void main(String[] args) {
		
		Aluno aluno;// = new Aluno();
		Professor professor = new Professor();
		Curso curso = new Curso();
		Util util = new Util();
		String str;
		boolean flag = false;
					
		
		do{
			switch (util.Menu()) {
				case 1:
					aluno = new Aluno();
					
					System.out.println("Digite a Matricula:");
					aluno.setMatricula(util.ler());
					
					System.out.println("Digite o Nome:");
					aluno.setNome(util.ler());
					
					System.out.println("Digite a Media");
					aluno.setMedia(Double.parseDouble(util.ler()));
					
					System.out.println("Digite a Quantidade de Faltas:");
					aluno.setQtdFalta(Integer.parseInt(util.ler()));
					
//					System.out.println("Digite a Matricula:");
//					professor.setMatricula(util.ler());
//					
//					System.out.println("Digite o Nome:");
//					professor.setNome(util.ler());
//					
//					System.out.println("Digite a Especialidade:");
//					professor.setEspecialidade(util.ler());
//															
//					System.out.println("Digite o Código do Curso:");
//					curso.setId(Integer.parseInt(util.ler()));
//					
//					System.out.println("Digite o Nome do Curso:");
//					curso.setNome(util.ler());
//					
//					curso.setProfessor(professor);
					curso.setAluno(aluno);
					break;
					
				case 2:
					aluno = new Aluno();
					
					System.out.println("Digite a Matricula/Nome:");
					str = util.ler();
					
					for(Aluno a : curso.getAluno()){
						if(a.getMatricula().equals(str) || a.getNome().equals(str)){
							curso.getAluno().remove(a);
							flag = true;
						}
					}
					
					if(flag){
						System.out.println("Aluno Removido");
					} else {
						System.out.println("Aluno Não Encontrado");
					}
					
					flag = false;
					
					break;
					
				case 3:
					aluno = new Aluno();
					
					System.out.println("Digite a Matricula:");
					str = util.ler();
					
					for(Aluno a : curso.getAluno()){
						if(a.getMatricula().equals(str)){
							flag = true;
						}
					}
					
					if(flag){
						System.out.println("Aluno Matriculado");
					} else {
						System.out.println("Aluno Não Matriculado");
					}
					
					flag = false;
					
					break;
					
				case 4:
					System.out.println("======================= LISTA DE ALUNOS APROVADOS =======================");
					for(Aluno a : curso.getAluno()){
						if(a.getMedia() >= 7.0){
							System.out.println(a.getNome());
						}
					}
					System.out.println("=========================================================================");
					break;
	
				case 5:
					System.out.println("================= LISTA DE ALUNOS REPROVADOS POR FALTA =================");
					for(Aluno a : curso.getAluno()){
						if(a.getQtdFalta() > 15){
							System.out.println(a.getNome());
						}
					}
					System.out.println("========================================================================");
					break;
					
				case 6:
					System.out.println("=========================== LISTA DE ALUNOS ===========================");
					curso.listarAlunos();
					System.out.println("=======================================================================");
					break;
					
				case 0:
					System.exit(0);
					break;	
					
				default:
					break;
			}
		}while(true);
		
		
	}

}

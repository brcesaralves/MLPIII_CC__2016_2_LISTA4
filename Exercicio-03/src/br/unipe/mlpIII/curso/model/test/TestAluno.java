package br.unipe.mlpIII.curso.model.test;

import br.unipe.mlpIII.curso.model.Aluno;
import junit.framework.TestCase;

public class TestAluno extends TestCase{
	
	private Aluno aluno;
	
	
	public void setUp(){
		aluno = new Aluno();
	}
	
	public void tearDown(){
		aluno = null;
	}
	

}

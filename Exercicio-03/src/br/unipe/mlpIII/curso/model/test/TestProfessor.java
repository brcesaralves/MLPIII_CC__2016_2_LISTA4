package br.unipe.mlpIII.curso.model.test;

import br.unipe.mlpIII.curso.model.Professor;
import junit.framework.TestCase;

public class TestProfessor extends TestCase{
	
	private Professor professor;
	
	
	public void setUp(){
		professor = new Professor();
	}
	
	public void tearDown(){
		professor = null;
	}
	
	
}

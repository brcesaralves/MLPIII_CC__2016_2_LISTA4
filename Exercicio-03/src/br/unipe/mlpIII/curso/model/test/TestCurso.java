package br.unipe.mlpIII.curso.model.test;

import br.unipe.mlpIII.curso.model.Curso;
import junit.framework.TestCase;

public class TestCurso extends TestCase{
	
	private Curso curso;
	
	
	public void setUp(){
		curso = new Curso();
	}
	
	public void tearDown(){
		curso = null; 
	}
	

}

package Teste;

import java.util.Date;

public class Aluno extends Pessoa  {
	
	private  String matricula;

	
	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public Aluno(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
		// TODO Auto-generated constructor stub
	}


	public Aluno(String _nome, String _cpf, Date _data, String matricula) {
		super(_nome, _cpf, _data);
		this.matricula = matricula;
	}


		
	

}

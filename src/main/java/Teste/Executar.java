package Teste;

import java.util.Date;

public class Executar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno i = new Aluno("Jose Francisco", "123.456.789-00", new Date(), "132131312");
		
		System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + i.getNome());
		System.out.println("CPF: " + i.getCpf());
		System.out.println("Data de nascimento: " + i.getData_nascimento().toString());
		System.out.println("Matricula: " + i.getMatricula());
	
//		Professor p = new Professor("Carlos alberto", "123.135.458-88", new Date());
//		System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + p.nome);
//		System.out.println("CPF: " + p.cpf);
//		System.out.println("Data de nascimento: " + p.data_nascimento.toString());
//	

	}

}

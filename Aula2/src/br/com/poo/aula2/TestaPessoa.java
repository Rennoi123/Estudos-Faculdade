package br.com.poo.aula2;

public class TestaPessoa {
	
	//Método main da classe (ponto de entrada)
	public static <sysout> void main (String args[]) {
		
		//Criar uma pessoa
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Rennan");
		p1.setIdade(21);
		p1.setSexo("M");
		
		Pessoa p2 = new Pessoa("Jurema", 24, "F");
		
		Pessoa p3 = new Pessoa();
		p3.setNome("Maria");
		p3.setIdade(54);
		p3.setSexo("F");
		
		
		System.out.println("Aluno: " + p1.getNome() + " Sexo " + p1.getSexo());
		
		System.out.println("Aluno: " + p2.getNome() + " Sexo: " + p2.getSexo());

		System.out.println("Aluno: " + p3.getNome() + " Sexo: " + p3.getSexo());

		
	}
	
}

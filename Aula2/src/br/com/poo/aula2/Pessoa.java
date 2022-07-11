package br.com.poo.aula2;

public class Pessoa {

	//Atributos
	private String nome;
	private String sexo;
	private int idade;
	
	//Método construtor
	public Pessoa() {
			  
	}

	//Método Sobrecarregado
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}

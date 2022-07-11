public class Pessoa {

//ATRIBUTOS
	private String nome;
	private int idade;     	
	private String sexo;
	
//METODO CONSTRUTOR
	public Pessoa() {    
		
	}
	
//MÉTODOS PARA MANIPULAR O VALOR DOS ATRIBUTOS
	public String getNome() {    
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
//MÉTODO TOSTRING
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", getNome()=" + getNome()
				+ ", getIdade()=" + getIdade() + ", getSexo()=" + getSexo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
public class Cachorro {

	//Atributos da classe
	private String raca;
	private String cor;
	private String tamanho;
	private int idade;
	
	//Método construtor
	public Cachorro() {
		
	}

	//Método que imprime o objeto
	@Override
	public String toString() {
		return "Cachorro [raca=" + raca + ", cor=" + cor + ", tamanho=" + tamanho + ", idade=" + idade + "]";
	}

	//Métodos Get & Set
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getRaca() {
		return this.raca;
	}

	public String getCor() {
		return cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public int getIdade() {
		return idade;
	}

	

}

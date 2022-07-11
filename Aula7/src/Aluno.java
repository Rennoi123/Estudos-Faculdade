
public class Aluno extends Pessoa {
	//Atributo
	
	private int Faltas;
	private double nota;
	
	//Método construtor
	 public Aluno (String nome, String sexo, int idade, double nota, int faltas ) {
		 super.setNome(nome);
		 super.setSexo(sexo);
		 super.setIdade(idade);
		 this.nota = nota;
		 this.Faltas = faltas;
	 }

	public int getFaltas() {
		return Faltas;
	}

	public void setFaltas(int faltas) {
		Faltas = faltas;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	//Método ToString()
	@Override
		public String toString() {
			String msg;
			msg = "Aluno " + super.getNome() + "\n" +
                  "Idade " + super.getIdade() + "\n" +	
				  "Sexo " + super.getSexo() + "\n" +
                  "Nota " + this.nota +"\n" +
				  "Faltas " + this.Faltas;
			return msg;
		}

}
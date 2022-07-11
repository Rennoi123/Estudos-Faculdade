
	public class Cliente extends Pessoa {
		
		private String cpf;
			

		//METODO CONSTRUTOR

		public Cliente() {
			
		}

		//METODO GET AND SET

		public String getCpf() {
			return cpf;
		}


		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		//METODO TO STRING
		@Override
		public String toString() {
			return "Cliente [cpf=" + cpf + ", getCpf()=" + getCpf() + ", getNome()=" + getNome() + ", getIdade()=" + getIdade()
					+ ", getSexo()=" + getSexo() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + "]";
		}

		}
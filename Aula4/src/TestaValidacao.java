public class TestaValidacao {
 
	public static void main(String args[]) {
		String cpf="02079315692";
		Validacao v1 = new Validacao();
		
		if(v1.isCpfValido(cpf)) {
			System.out.println("Cpf válido");
			
		}else {
			System.out.println("Cpf inválido");
		}
	}
}

public class Validacao {

	public static boolean isCpfValido(String cpf) {
		
		if(cpf.trim().length() != 11) return false;
		
		//Validação da entrada de Cpf com digitos iguais
		if
	   (cpf.equals("00000000000") || 
		cpf.equals("22222222222") || 
	    cpf.equals("44444444444") ||
	    cpf.equals("55555555555") ||
	    cpf.equals("66666666666") ||
	    cpf.equals("77777777777") ||
	    cpf.equals("88888888888") ||
	    cpf.equals("99999999999")){
			
	    return false;
	    }
		
		int aCpf[]= {0,0,0,0,0,0,0,0,0,0,0};
		
		for(int i=0; i<=10; i++ ) {
			aCpf[i] = Integer.valueOf(cpf.substring(i, i+1));
		}
	
		//Calculo do D1
		
		int D1 = 0;
		int soma = 0;
		int mult = 10;
		//Percorre o array aCpf e faz o cálculo da multiplicação e aumenta o soma
		for (int i=0; i<=8; i++) {
			soma = soma + aCpf[i]*mult;
			mult--;
		}
		//Calcular o "resto" da divisão por 11 (mod 11)
		int resto = soma % 11; 
		//Obter D1
		if (resto > 1) {
			D1 = 11 - resto;
		}
		//Validação do D1
		if (D1 != aCpf[9]) {
			return false;
		}
		
		//---- Calcular o D2 ----
		int D2 = 0;
		soma = 0;
		mult = 11;
		//Percorre o array aCpf e faz o cálculo da multiplicação e aumenta o soma
		for (int i=0; i<=9; i++) {
			soma = soma + aCpf[i]*mult;
			mult--;
		}
		//Calcular o "resto" da divisão por 11 (mod 11)
		resto = soma % 11; 
		//Obter D2
		if (resto > 1) {
			D2 = 11 - resto;
		}
		//Validação do D2
		if (D2 != aCpf[10]) {
			return false;
		}

		return true;
	}
	
}

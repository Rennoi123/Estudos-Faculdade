public class ValidaTexto {
	
 public boolean isEmailValido(String email) {
	 //Verificar se existe @ no email informado
	 
	 if (email.indexOf("@")==-1) {
		 return false;
	 }
	 //Verificar se existe pelo menos 1 ponto "." no email.
	 if(email.indexOf(".")==-1) {
		 return false;
	 }
	 return true;
 }
}

import javax.swing.JOptionPane;

public class TestaString {
	
	public static void main(String[] args) {	
		String texto = JOptionPane.showInputDialog("Digite seu texto");
		System.out.println("O tamanho do texto �: " + texto.length());
		System.out.println("O tamanho do texto sem considerar espa�os em branco �: " + texto.trim().length());
		System.out.println("Subistituindo os espa�os por string vazia: " + texto.replace(" ", ""));
		System.out.println("Passando o texto para o MAI�SUCULO:" + texto.toUpperCase());
		System.out.println("Passando o texto para min�sculas:" + texto.toLowerCase());
		String email = JOptionPane.showInputDialog("Digite um email");
		ValidaTexto vt = new ValidaTexto();
		
		if (vt.isEmailValido(email)==true) {
			
			System.out.println("Email v�lido");
			
		} else {
			System.out.println("Email inv�lido");
			
		}
}

}
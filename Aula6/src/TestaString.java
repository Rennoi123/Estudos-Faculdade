import javax.swing.JOptionPane;

public class TestaString {
	
	public static void main(String[] args) {	
		String texto = JOptionPane.showInputDialog("Digite seu texto");
		System.out.println("O tamanho do texto é: " + texto.length());
		System.out.println("O tamanho do texto sem considerar espaços em branco é: " + texto.trim().length());
		System.out.println("Subistituindo os espaços por string vazia: " + texto.replace(" ", ""));
		System.out.println("Passando o texto para o MAIÚSUCULO:" + texto.toUpperCase());
		System.out.println("Passando o texto para minúsculas:" + texto.toLowerCase());
		String email = JOptionPane.showInputDialog("Digite um email");
		ValidaTexto vt = new ValidaTexto();
		
		if (vt.isEmailValido(email)==true) {
			
			System.out.println("Email válido");
			
		} else {
			System.out.println("Email inválido");
			
		}
}

}
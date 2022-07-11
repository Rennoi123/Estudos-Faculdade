public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		c1.setNome("José");
		c1.setSexo("Masculino");
		c1.setIdade(24);
		c1.setCpf("022.455.555-65");
		
		System.out.println(c1.toString());
	}
}
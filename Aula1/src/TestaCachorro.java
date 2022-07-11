public class TestaCachorro {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		
		//c1.raca = "Pinscher";
		c1.setRaca("Doguinho");
		c1.setCor("Caramelo");
		c1.setTamanho("P");
		c1.setIdade(3);

		System.out.println(c1.toString());
		
		System.out.println("Meu cachorro é um " + c1.getRaca() + " " + c1.getCor());
		
		Cachorro c2 = new Cachorro();
		c2.setRaca("Poodle");
		c2.setCor("Branco");
		c2.setTamanho("P");
		c2.setIdade(8);
		
		System.out.println(c2.toString());
		System.out.println("Meu cachorro é um " + c2.getRaca() + " " + c2.getCor());
		
	}

}

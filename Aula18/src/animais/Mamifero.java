package animais;

public class Mamifero extends Animal{

	public Mamifero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mamifero(String nome) {
		super(nome);
		
	}

	@Override
	public void falar() {
		System.out.println("Falando ....");
	}
	
	
	
}

package animais;

public class Passaro extends Animal {

	public Passaro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passaro(String nome) {
		super(nome);
	}

	@Override
	public void falar() {
		System.out.println("Cantando...");
	}
	
}

package animais;

public class BemTeVi extends Passaro{

	public BemTeVi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BemTeVi(String nome) {
		super(nome);
		
	}
	@Override
	public void falar() {
		System.out.println("Cantando...");
	}
	
}

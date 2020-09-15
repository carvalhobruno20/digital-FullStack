package lanchonete;
import java.util.List;
public class Sanduiche extends Lanche{
	private List<String> ingredientes;
	public Sanduiche() {
		super();	
	}
	public Sanduiche(Double preco, List<String> ingredientes) {
		super(preco);
		this.ingredientes = ingredientes;
	}
	
	public List<String> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	@Override
	public Double tempo(double distancia) {
		return 15 + super.tempo(distancia);		
	}
}
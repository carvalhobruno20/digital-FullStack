package lanchonete;
public abstract class Lanche {
	private Double preco;
	
	public Lanche() {
		
	}
	
	public Lanche(Double preco) {
		this.preco = preco;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	//-	cada lanche leva aproximadamente 10 min por km de distância para ser entregue
	public Double tempo(double distancia) {
		return distancia*10;
	}
}
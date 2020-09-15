package lanchonete;
public class Bolo extends Lanche{
	//massa, recheio e cobertura
	private String massa;
	private String recheio;
	private String cobertura;
		
	public Bolo() {
	
	}
	public Bolo(Double preco, String massa, String recheio, String cobertura) {
		super(preco);
		this.massa = massa;
		this.recheio = recheio;
		this.cobertura = cobertura;
	}
	
	public String getMassa() {
		return massa;
	}
	public void setMassa(String massa) {
		this.massa = massa;
	}
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	public String getCobertura() {
		return cobertura;
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	@Override
	public Double tempo(double distancia) {
		return 10 + super.tempo(distancia);		
	}
}

package contas;

public class Poupanca extends Conta {

	private Double taxaJuros;
	
	public Poupanca() {
		
	}

	public Poupanca(Double saldo, Double taxaJuros) {
		super(saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	@Override
	public void sacar(double valor) {
		double limite = getSaldo() - valor;
		
		if(limite < 0) {
			System.out.println("Você passou seu limite de saque!");
		}else {
			super.sacar(valor);
		}
	}
	
	public void recolherJuros() {
		depositar( getSaldo() * taxaJuros );
	}

	@Override
	public String toString() {
		return "Poupanca [taxaJuros= " + taxaJuros + ", Saldo= " + getSaldo() +"]";
	}
	
	
}

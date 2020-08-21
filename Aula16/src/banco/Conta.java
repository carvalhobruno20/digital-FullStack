package banco;

public class Conta {
private final static Double TAXA = 5.00;
	
	private String nomeTitular;
	private Double saldo;
	private int numero;
	
		
	public Conta(String nomeTitular, int numero, Double saldo) {
		this.nomeTitular = nomeTitular;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Conta(String nomeTitular, int numero) {
		this.nomeTitular = nomeTitular;
		this.numero = numero;
		this.saldo = 0.00;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public Double getSaldo() {
		return saldo;
	}	
	public int getNumero() {
		return numero;
	}
	
	public void depositar(Double valor) {
		this.saldo += valor;
	}
	
	public void sacar(Double valor) {
		this.saldo -= (valor + this.TAXA);
	}
	
	@Override
	public String toString(){
		return ("Dados da Conta \n" + 
				"Nome Titular: " + this.nomeTitular + "\n" +
				"Numero Conta: " + this.numero + "\n" +
				"Saldo: R$ " + this.saldo + "\n"); 
				
		
	}
}

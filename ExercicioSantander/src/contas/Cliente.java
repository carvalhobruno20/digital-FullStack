package contas;

public class Cliente {
	private Integer numeroCliente;
	private String sobrenome;
	private String rg;
	private String cpf;
	private Conta conta;
	
	public Cliente() {

	}

	public Cliente(Integer numeroCliente, String sobrenome, String rg, String cpf, Conta conta) {
		this.numeroCliente = numeroCliente;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
		this.conta = conta;
	}

	public Integer getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(Integer numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	@Override
	public String toString() {
		return "Cliente [numeroCliente=" + numeroCliente + ", sobrenome=" + sobrenome + ", rg=" + rg + ", cpf=" + cpf
				+ ", conta=" + conta + "]";
	}

	
	
	
}
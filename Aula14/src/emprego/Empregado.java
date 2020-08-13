package emprego;

public class Empregado {
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}	
	public void aumentaSalario(double porcentagem) {
		salarioBruto = (salarioBruto * (porcentagem/100))+(salarioBruto - taxa);
	}
}


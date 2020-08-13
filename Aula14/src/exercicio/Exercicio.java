package exercicio;

import java.util.Scanner;

import emprego.Empregado;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Empregado salario = new Empregado();
		
		System.out.print("Nome: ");
		salario.nome = sc.nextLine();
		System.out.print("Salário Bruto R$: ");
		salario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto R$: ");
		salario.taxa = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: "+salario.nome+" Salário Líquido R$: "+salario.salarioLiquido());
		
		System.out.print("Qual a porcentagem do aumento salarial: ");
		double porcentagem = sc.nextDouble();
		
		salario.aumentaSalario(porcentagem);
		System.out.println("Empregado: "+salario.nome+" Salário Líquido R$: "+salario.salarioBruto);
	}

}

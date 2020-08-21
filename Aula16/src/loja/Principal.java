package loja;

import java.util.Scanner;

import banco.Conta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Conta c;
		System.out.println("Qual o n�mero da Conta? ");		
		int numero = sc.nextInt();
		
		System.out.println("Qual o nome do Titular? ");		
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		
		System.out.println("Possui dep�sito inicial? (\"S\" para Sim e \"N\" para N�o)");		
		char temDepositoInicial = sc.next().toUpperCase().charAt(0);
		
		if (temDepositoInicial == 'S') {			
			System.out.println("Informe o dep�sito inicial? ");		
			Double depositoInicial = sc.nextDouble();
			
			c = new Conta(nomeTitular, numero, depositoInicial);
		} else {
			c = new Conta(nomeTitular, numero);
		}
		
		System.out.println(c.toString());
		
		System.out.println("Entre com o valor do dep�sito: ");
		Double valor = sc.nextDouble();
		c.depositar(valor);		
		
		System.out.println(c.toString());
		
		System.out.println("Entre com o valor do saque: ");
		valor = sc.nextDouble();
		c.sacar(valor);	
		
		System.out.println(c.toString());
		
		sc.close();		
	}

}

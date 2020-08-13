package main;

import java.util.Scanner;

import estoque.Produto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Produto prod = new Produto();
		
		System.out.println("Entre com os dados do produto");
		System.out.print("Nome: ");
		prod.nome = sc.nextLine();
		System.out.print("preço: ");
		prod.preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		prod.quantidade = sc.nextInt();
		
		System.out.println("Dados do Produto: "+prod.nome+", R$ "+prod.preco+", "+prod.quantidade+" unidade(s)"+" Total:"+prod.valorTotalNoEstoque());
		System.out.println();
		
		System.out.print("Digite a quantidade a ser adicionada: ");
		int quantidade = sc.nextInt();
		
		prod.adicionarProdutos(quantidade);
		System.out.println();
		System.out.println("Dados do Produto: "+prod.nome+", R$ "+prod.preco+", "+prod.quantidade+" unidade(s), "+"Total: R$ "+prod.valorTotalNoEstoque());
		
		System.out.println();
		System.out.print("Digite o número de produtos para serem removidos do estoque: ");
		quantidade = sc.nextInt();
		
		prod.removerProdutos(quantidade);
		System.out.println();
		System.out.println("Dados do Produto: "+prod.nome+", R$ "+prod.preco+", "+prod.quantidade+" unidade(s), Total: R$ "+prod.valorTotalNoEstoque());
		
		sc.close();
	}

}

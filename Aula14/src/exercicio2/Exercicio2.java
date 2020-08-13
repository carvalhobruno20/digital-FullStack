package exercicio2;

import java.util.Scanner;

import retangulo.Retangulo;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Retangulo tamanho = new Retangulo();
		
		System.out.println("Entre com os valores da altura e largura");
		tamanho.largura = sc.nextDouble();
		tamanho.altura = sc.nextDouble();
		
		System.out.println("Area: "+tamanho.area());
		System.out.println("Perimetro: "+tamanho.perimetro());
		System.out.println("Diagonal: "+tamanho.diagonal());
		sc.close();
	}

}

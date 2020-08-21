package principal;

import java.util.Scanner;

import geometria.Circuferencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Circuferencia circ = new Circuferencia();
		System.out.println("Digite o Valor do raio");
		double raio = sc.nextDouble();
		
		System.out.printf("Circuferência: %.2f \nVolume: %.2f \nPI: %.2f",Circuferencia.circuferencia(raio), Circuferencia.volume(raio), Circuferencia.PI);
		
		sc.close();
	}
	
}

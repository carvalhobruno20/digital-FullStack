package principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lanchonete.Bolo;
import lanchonete.Massa;
import lanchonete.Sanduiche;
import lanchonete.TiposMassa;
public class Principal {
//	No programa principal o usuário deve receber um menu podendo
//	escolher entre as opções [1] sanduíches, [2] massas, [3] bolos.
//	Após fazer a seleção cada opção deve levar para um submenu para
//	escolher os ingredientes do lanche selecionado.
//	e ao final o menu deve perguntar qual a sua distância do
//	restaurante, calcular o preço e o tempo de chegada do lanche até a sua casa.
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("Escolha uma opção:");
			System.out.println("[1] Sanduíches\n[2] Massas\n[3] Bolos\n[4] Sair");
			op = sc.nextInt();
			switch(op) {
				case 1: menuSanduiche();
					break;
				case 2: menuMassa();
					break;
				case 3: menuBolo();
					break;
				case 4: System.out.println("Obrigado! Volte Sempre!");
					break;
				default: System.out.println("Opção Inválida!");
			}
		}while(op != 4);
		
	}
	private static void menuBolo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escolha a massa: ");
		String massa = sc.nextLine();
		System.out.print("Escolha o recheio: ");
		String recheio = sc.nextLine();
		System.out.print("Escolha a cobertura: ");
		String cobertura = sc.nextLine();
		
		Bolo bolo = new Bolo(15.00, massa, recheio, cobertura);
		System.out.println("Quantos km de distância da sua casa até a lanchonete?");
		double distancia = sc.nextDouble();
		
		System.out.println("Preço: "+bolo.getPreco()+" Tempo para entrega: "+bolo.tempo(distancia)+" minutos");
		sc.nextLine();
			
	}
	private static void menuMassa() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escolha o molho: ");
		String molho = sc.nextLine();
		System.out.print("Escolha o tipo de Massa (M) Macarrão, (P) Pizza, (L) Lasanha: ");
		String t = sc.next().toUpperCase();
		TiposMassa tipo;
		if(t.charAt(0) == 'M') {
			tipo = TiposMassa.MACARRAO;
		}else {
			if(t.charAt(0) == 'P') {
				tipo = TiposMassa.PIZZA;
			}else {
				tipo = TiposMassa.LASANHA;
			}
		}
		
		Massa massa = new Massa(15.00, molho, tipo);
		System.out.println("Quantos km de distância da sua casa até a lanchonete?");
		double distancia = sc.nextDouble();
		
		System.out.println("Preço: "+massa.getPreco()+" Tempo para entrega: "+massa.tempo(distancia)+" minutos");
		sc.nextLine();
		
	}
	private static void menuSanduiche() {
		Scanner sc = new Scanner(System.in);
		List<String> ingredientes = new ArrayList<>();
		
		while(ingredientes.size() <= 10) {
			System.out.print("Digite um ingrediente: ");
			ingredientes.add( sc.nextLine() );
			System.out.println("Deseja adicionar outro ingrediente? (s/n)");
			char c = sc.next().charAt(0);
			sc.nextLine();
			if(c == 'n') {
				break;
			}				
		}
		
		Sanduiche sanduiche = new Sanduiche(12.00, ingredientes);
		
		System.out.println("Quantos km de distância da sua casa até a lanchonete?");
		double distancia = sc.nextDouble();
		
		System.out.println("Preço: "+sanduiche.getPreco()+" Tempo para entrega: "+sanduiche.tempo(distancia)+" minutos");
		sc.nextLine();
		
	}		
}
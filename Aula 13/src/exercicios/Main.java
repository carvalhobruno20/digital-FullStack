package exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
		
		//Variaveis no Java
//		int idade = 16;
//		String nome = "Bruno";
//		double nota = 10.5;
//		char letra = 'a';
		
		
		//System.out.println(nome+" tem "+idade+" anos de idade ");
		
		//if else
		//>, <, >=, <=,!=
		// &&, ||, !
////		if(idade >= 18) {
////			System.out.println(nome+ " � maior de idade");
////		}else {
////			System.out.println(nome+ " � menor de idade");
////		}
////	}
//
//}
		
//		Scanner sc = new Scanner(System.in);
//		int[][] matriz = new int [2][2];		
//		
//		for(int i = 0; i < 2; i++) {
//			for(int j = 0; j < 2; j++) {
//				matriz[i][j] = sc.nextInt();
//			}
//		}
//		/* 00 = 1
//		 * 01 = 2
//		 * 10 = 3
//		 * 11 = 4
//		 */
//		for(int i = 0; i < 2; i++) {
//			for(int j = 0; j < 2; j++) {
//				System.out.print(matriz[i][j]);
//			}
//			System.out.println();
//		}
		
		Scanner sc = new Scanner(System.in);
		int op;
		double num1 = 0, num2 = 0;
		
		do {			
			menu();
			op = sc.nextInt();
			if((op > 0) && (op < 5)) {
			System.out.println("DIGITE UM N�MERO: ");
	        num1 = sc.nextInt();
	        System.out.println("DIGITE UM N�MERO: ");
	        num2 = sc.nextInt();
			}
			switch(op) {
				case 1: somar(num1, num2);
						break;
				case 2: subtrair(num1, num2);
						break;
				case 3: multiplicar(num1, num2);
						break;
				case 4: dividir(num1,num2);
						break;
				case 5: System.out.println("OBRIGADO! VOLTE SEMPRE!");
						break;
				default: System.out.println("OP��O INV�LIDA");
			}
			
		}while(op != 5);		        
	}
	private static void menu() {
		System.out.println("ESCOLHA UMA OP��O:");
		System.out.println("1 - SOMAR");
		System.out.println("2 - SUBTRAIR");
		System.out.println("3 - MULTIPLICAR");
		System.out.println("4 - DIVIDIR");
		System.out.println("5 - SAIR");
	}
	public static void somar(double num1, double num2) {	
        System.out.println("O RESULTADO DA OPERA��O �: "+(num1+num2));
	}
	public static void subtrair(double num1, double num2) {
        System.out.println("O RESULTADO DA OPERA��O �: "+(num1-num2));
	}
	public static void multiplicar(double num1, double num2) {
        System.out.println("O RESULTADO DA OPERA��O �: "+(num1*num2));
	}
	public static void dividir(double num1, double num2) {
        System.out.println("O RESULTADO DA OPERA��O �: "+(num1/num2));
	}

}	

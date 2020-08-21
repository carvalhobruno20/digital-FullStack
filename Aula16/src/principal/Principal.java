package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import produtos.Produtos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<Produtos> lista = new ArrayList<>();
		
		Produtos prod = new Produtos("Tv", 900.00, 10);
		lista.add(prod);
		
		lista.add( new Produtos("Microondas", 200.00, 10) );
		lista.add( new Produtos("Geladeira", 500.00, 100) );
		lista.add( new Produtos("Lapis", 10.00, 10) );
		
		for(int i=0; i<lista.size();i++) {			
			System.out.println(lista.get(i).getName());
		}
		
		lista.add(1, new Produtos("Garfo", 1.00, 1000));
	   
		for(Produtos p : lista) {
			System.out.println(p.getName());
		}
		
		lista.stream().forEach(x -> System.out.println(x.getName()));
	}

}



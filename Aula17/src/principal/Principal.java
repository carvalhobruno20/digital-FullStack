package principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import contatos.Contato;
public class Principal {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    List<Contato> contatos = new ArrayList<Contato>( );
    int op, n = 0;
    do {
      menu();
      op = scn.nextInt();
      switch ( op ) {
        case 1: Contato.adicionar(contatos);
	            n++;
	            break;
        case 2: Contato.remover(n, contatos);        		
          		break;
        case 3: Contato.listar(n, contatos);
          		break;
        case 4: Contato.buscar(n, contatos);
        		break;
        case 0:
          System.out.println( "\n~PROGRMA ENCERRADO!!!" );
          break;
        default:
          System.out.println( "\n~COMANDO INVÁLIDO!!!\n" );
          break;
      }
    }
    while ( op != 0 );
    scn.close();
  }
	public static void menu() {
	    System.out.println( ".:: MENU PRINCIPAL ::." );
	    System.out.println( "[ 1 ] INCLUIR CONTATO" );
	    System.out.println( "[ 2 ] EXCLUIR CONTATO" );
	    System.out.println( "[ 3 ] LISTAR CONTATO" );
	    System.out.println( "[ 4 ] PESQUISAR CONTATO" );
	    System.out.println( "[ 0 ] ENCERRAR PROGRAMA" );
	    System.out.print( "\nOPÇÃO DESEJADA: " );
	  }
}
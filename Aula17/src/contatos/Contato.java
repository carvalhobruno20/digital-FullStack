package contatos;
import java.util.List;
import java.util.Scanner;
public class Contato {
	// id, nome, idade, telefone
	private Integer id;
	private String nome;
	private Integer idade;
	private String telefone;
	private Endereco endereco;
	public Contato() {
	}
	public Contato(Integer id, String nome, Integer idade, String telefone, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public static void adicionar(List<Contato> contatos) {
		Scanner scn = new Scanner(System.in);
		String nome, telefone, rua, bairro, cidade, estado;
		int id, idade, numero;
		System.out.println("\n.:: INCLUIR CONTATO ::.");
		System.out.print("DIGITE O ID: ");
		id = scn.nextInt();
		scn.nextLine();
		System.out.print("DIGITE O NOME: ");
		nome = scn.nextLine();
		System.out.print("DIGITE A IDADE: ");
		idade = scn.nextInt();
		scn.nextLine();
		System.out.print("DIGITE O TELEFONE: ");
		telefone = scn.nextLine();
		System.out.println(".:: ENDEREÇO ::.");
		System.out.print("DIGITE UMA RUA: ");
		rua = scn.nextLine();
		System.out.print("DIGITE UM NÚMERO: ");
		numero = scn.nextInt();
		scn.nextLine();
		System.out.print("DIGITE UM BAIRRO: ");
		bairro = scn.nextLine();
		System.out.print("DIGITE UMA CIDADE: ");
		cidade = scn.nextLine();
		System.out.print("DIGITE UM ESTADO: ");
		estado = scn.nextLine();
		contatos.add(new Contato(id, nome, idade, telefone, new Endereco(rua, numero, bairro, cidade, estado)));
		System.out.println("\n~CONTATO ADICIONADO COM SUCESSO!!!\n");
		
	}
	public static void remover(int n, List<Contato> contatos) {
		Scanner scn = new Scanner(System.in);
		if (n != 0) {
			System.out.print("DIGITE O ID: ");
			int id = scn.nextInt();
			for (Contato contato : contatos) {
				if (id == contato.getId()) {
					contatos.remove(contato);
					n--;
					System.out.println("\n~CONTATO REMOVIDO COM SUCESSO!!!\n");
					break;
				} else {
					System.out.println("\n~CONTATO NÃO ENCONTADO!!!\n");
				}
			}
		} else {
			System.out.println("\n~CADASTRE UM CONTATO PRIMEIRO!!!\n");
		}
		
	}
	public static void listar(int n, List<Contato> contatos) {
		Scanner scn = new Scanner(System.in);
		if (n != 0) {
			System.out.println("\n.:: LISTA DE CONTATOS ::.\n");
			for (Contato contato : contatos) {
				System.out.println(contato);
			}
			System.out.println("");
		} else {
			System.out.println("\n~CADASTRE UM CONTATO PRIMEIRO!!!\n");
		}
		
	}
	public static void buscar(int n, List<Contato> contatos) {
		Scanner scn = new Scanner(System.in);
		if (n != 0) {
			System.out.println("\n.:: PESQUISAR CONTATO ::.\n");
			System.out.print("DIGITE O ID: ");
			int id = scn.nextInt();
			for (Contato contato : contatos) {
				if (id == contato.getId()) {
					System.out.println(contato);
				} else {
					System.out.println("\n~CONTATO NÃO ENCONTADO!!!\n");
				}
			}
		} else {
			System.out.println("\n~CADASTRE UM CONTATO PRIMEIRO!!!\n");
		}
		
	}
	@Override
	public String toString() {
		return "---------------------------------------------------------\n" + "id: " + id + ", nome: " + nome
				+ ", idade: " + idade + ", telefone: " + telefone + ", endereço: " + endereco;
	}
}
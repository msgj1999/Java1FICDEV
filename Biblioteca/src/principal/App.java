package principal;

import java.util.List;
import java.util.Scanner;
import model.Livro;
import model.Usuario;
import service.BibliotecaService;


public class App {
	
	private static BibliotecaService bibliotecaService = new BibliotecaService();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String [] args) {
		
		int opcao = -1;
		
		while (opcao != 0) {
			System.out.println("\n\nBiblioteca\n");
			System.out.println("1 - Cadastrar livro");
			System.out.println("2 - Cadastrar usuario");
			System.out.println("3 - Realizar emprestimo");
			System.out.println("4 - Realizar devolucao");
			System.out.println("5 - Listar Livros");
			System.out.println("6 - Listar usuarios");
			System.out.println("7 - Buscar livro");
			System.out.println("8 - Buscar usuario");
			System.out.println("0 - Sair");
			
			System.out.println("\nDigite a opcao desejada: ");
			opcao = scanner.nextInt();
			
			switch (opcao) {
			case 1:
				cadastrarLivro();
				break;
			case 2:
				cadastrarUsuario();
				break;
			case 3:
				realizarEmprestimo();
				break;
			case 4:
				realizarDevolucao();
				break;
			case 5:
				listarLivros();
				break;
			case 6:
				listarUsuarios();
				break;
			case 7:
				buscarLivro();
				break;
			case 8: 
				buscarUsuario();
				break;
			}
		}
	}
	
	private static void cadastrarLivro() {
		System.out.println("\nCadastro de livro\n");
		scanner.nextLine();
		System.out.print("Titulo: ");
		String titulo = scanner.nextLine();
		System.out.print("Autor: ");
		String autor = scanner.nextLine();
		Livro livro = new Livro(titulo, autor);
		bibliotecaService.cadastrarLivro(livro);
		System.out.println("Livro cadastrado com sucesso.");
	}
	
	private static void cadastrarUsuario() {
		System.out.println("\nCadastro de usuario\n");
		scanner.nextLine();
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Email: ");
		String email = scanner.nextLine();
		System.out.print("Telefone: ");
		int telefone = scanner.nextInt();
		Usuario usuario = new Usuario(nome, email, telefone);
		bibliotecaService.cadastrarUsuario(usuario);
		System.out.println("Usuario cadastrado com sucesso.");
	}
	
	private static void realizarEmprestimo() {
		System.out.println("\nEmprestimo de livro\n");
		System.out.print("ID do livro: ");
		int idLivro = scanner.nextInt();
		System.out.print("ID do usuario: ");
		int idUsuario = scanner.nextInt();
		try {
			bibliotecaService.realizarEmprestimo(idLivro, idUsuario);
			System.out.println("Emprestimo realizado com sucesso.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void realizarDevolucao() {
		System.out.println("\nDevolucao de livro\n");
		System.out.print("ID do livro: ");
		int idLivro = scanner.nextInt();
		System.out.print("ID do usuario: ");
		int idUsuario = scanner.nextInt();
		try {
			bibliotecaService.realizarDevolucao(idLivro, idUsuario);
			System.out.println("Devolucao realizada com sucesso.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void listarLivros() {
		System.out.println("\nLista de livros\n");
		List<Livro> livros = bibliotecaService.listarLivros();
		for (Livro livro : livros) {
			System.out.println(livro);
		}
	}
	
	private static void listarUsuarios() {
		System.out.println("\nLista de usuarios\n");
		List<Usuario> usuarios = bibliotecaService.listarUsuarios();
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
	}
	
	private static void buscarLivro() {
		System.out.println("\nBusca de livro\n");
		System.out.print("ID do livro: ");
		int id = scanner.nextInt();
		Livro livro = bibliotecaService.buscarLivro(id);
		if (livro != null) {
			System.out.println(livro);
		} else {
			System.out.println("Livro nao encontrado.");
		}
	}
	
	private static void buscarUsuario() {
		System.out.println("\nBusca de usuario\n");
		System.out.print("ID do usuario: ");
		int id = scanner.nextInt();
		Usuario usuario = bibliotecaService.buscarUsuario(id);
		if (usuario != null) {
			System.out.println(usuario);
		} else {
			System.out.println("Usuario nao encontrado.");
		}
	}
}
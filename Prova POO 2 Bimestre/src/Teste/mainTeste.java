package Teste;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import Model.Livro;
import Dao.Dao;
import Dao.LivroDao;

public class mainTeste {

	public static Dao<Livro> livroDao;

	public static void main(String[] args) {

		livroDao = new LivroDao();
		while (true) {
			System.out.println("Bem Vindo ao Sistema de Gerenciamento da Biblioteca! ");
			System.out.println(" ___________________________________");
			System.out.println("|___________MENU DE LIVROS__________|");
			System.out.println("|___OPÇÃO___|____ACERVO__|___MÉTODO_|");
			System.out.println("|     1     |    LIVRO   | CADASTRAR|");
			System.out.println("|     2     |    LIVRO   | ALTERAR  |");
			System.out.println("|     3     |    LIVRO   | EXCLUIR  |");
			System.out.println("|     4     |    LIVRO   | LISTAR   |");
			System.out.println("|     5     |    SAIR    |          |");
			System.out.println("|___________|____________|__________|");
			System.out.println("*     ESCOLHA UMA OPÇÃO DO MENU    *");
			
			int op = 0;
			Scanner in = new Scanner(System.in);
			
			try{
				op = in.nextInt();
				
			}catch(Exception e){
				System.out.println("O valor digitado no menu não corresponde a um inteiro ");
				System.exit(0);
			}
			
			switch(op){
				case 1:
					System.out.println("Digite o Título do Livro: ");
					String titulo = in.next();
					
					System.out.println("Digite o Autor do Livro: ");
					String autor = in.next();
					
					System.out.println("Digite a Editora do Livro: ");
					String editora = in.next();
			
					System.out.println("Digite o Gênero do Livro: ");
					String genero = in.next();
					
					Livro livro = new Livro(titulo, autor, editora, genero);
					livroDao.inserir(livro);
					
					System.out.println("O livro foi cadastrado com Sucesso");
					
					break; 
				case 2: 
					System.out.println("Qual o livro que você deseja alterar?");
					long id = in.nextLong();
					Optional<Livro> livro2 = livroDao.buscar(id);
					
					System.out.println("Digite o Título do Livro ao qual deseja alterar: ");
					String tituloAl = in.next();
					
					System.out.println("Digite o Autor do Livro ao qual deseja alterar: ");
					String autorAl = in.next();
					
					System.out.println("Digite a Editora do Livro ao qual deseja alterar: ");
					String editoraAl = in.next();
					
					System.out.println("Digite o Gênero do Livro ao qual deseja alterar: ");
					String generoAl = in.next();
					
					livroDao.atualizar(livro2.get(), new String[] {tituloAl, autorAl, editoraAl, generoAl});
					
					System.out.println("O livro foi alterado com Sucesso");
					
					break;					
				case 3: 
					System.out.println("Qual o livro que você deseja excluir?");
					long idEx = in.nextLong();					
					Optional<Livro> livro3 = livroDao.buscar(idEx);
					livroDao.excluir(livro3.get());
					
					break;					
				case 4: 
					livroDao.buscarTodos().forEach(book -> System.out.println(book.getTitulo()+" / "+ book.getAutor()+" / "+ book.getEditora()+" / "+ book.getGenero()+" / "));
					break;
				case 5: 
					System.out.println("Sistema Encerrado");
					System.exit(0);
					
					break;
				default: 
					System.out.println("Esta Opção Não Existe!");
			}
			System.out.println("\n Deseja Continuar? [S] / [N]");
			
			String op2 = in.next();
			
			if(op2.equals("N") || op2.equals("n")){
				System.out.println("Sistema Encerrado");
				System.exit(0);
			}
			else{
				
			}
		}
	}
}

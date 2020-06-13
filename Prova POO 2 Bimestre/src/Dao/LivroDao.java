package Dao;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Optional;
import Model.Livro;

public class LivroDao implements Dao<Livro> {

	public List<Livro> listaLivro = new ArrayList<>();

	public LivroDao(){
		
	}
	
	public LivroDao(int id, String titulo, String autor, String editora, String genero){
		listaLivro.add(new Livro(id, titulo, autor, editora, genero));
	}
	
	public LivroDao(String titulo, String autor, String editora, String genero){
		listaLivro.add(new Livro(titulo, autor, editora, genero));
	}
	
	public Optional<Livro> buscar(long id) {		
		return	Optional.ofNullable(listaLivro.get((int) id));	
	}
	
	public ArrayList<Livro> buscarTodos() {
		return (ArrayList<Livro>) listaLivro;
	}

	
	public void inserir(Livro livro) {
		listaLivro.add(livro);		
	}
	
	public void atualizar(Livro livro, String[] params) {
		livro.setTitulo(Objects.requireNonNull(params[0], "Item não encontrado"));
		livro.setAutor(Objects.requireNonNull(params[1], "Item não Encontrado"));
		livro.setEditora(Objects.requireNonNull(params[2], "Item não Encontrado"));
		livro.setGenero(Objects.requireNonNull(params[3], "Item não Encontrado"));
	}

	public void excluir(Livro livro) {
		listaLivro.remove(livro);
	}

	
	
	
	
	
}

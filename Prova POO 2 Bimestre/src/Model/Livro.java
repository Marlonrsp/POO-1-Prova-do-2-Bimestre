package Model;

public class Livro {
	
	private int id;
	private String titulo;
	private String autor;
	private String editora;
	private String genero;
	
	public Livro(){
		
	}
		
	public Livro(int idLivro, String tituloLivro, String autorLivro, String editoraLivro, String generoLivro) {
		setId(idLivro);
		setTitulo(tituloLivro);
		setAutor(autorLivro);
		setEditora(editoraLivro);
		setGenero(generoLivro);
	}

	public Livro(String tituloLivro, String autorLivro, String editoraLivro, String generoLivro){
		setTitulo(tituloLivro);
		setAutor(autorLivro);
		setEditora(editoraLivro);
		setGenero(generoLivro);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	
	
	
}

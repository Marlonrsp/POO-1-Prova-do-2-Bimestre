package Dao;

import java.util.ArrayList;
import java.util.Optional;

public interface Dao<T> {

	Optional<T> buscar(long id);

	ArrayList<T> buscarTodos();

	void inserir(T t);

	void atualizar(T t, String[] params);

	void excluir(T t);
	
	
	
}

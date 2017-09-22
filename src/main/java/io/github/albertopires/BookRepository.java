package io.github.albertopires;

public interface BookRepository {
	
	Book getByIsbn(String isbn);

}

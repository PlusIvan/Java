import java.util.Arrays;

public class Livraria {
	
	private String name;
	private int nLivros = 0;
	private Book[] livro;
	
	public Livraria(String name, int capacidade) {
		this.name = name;
		livro = new Book[capacidade];
	}
	
	
	public void insereLivro(String ISBN, String name, String author, int pages, int stock, Categoria categoria) {
		livro[nLivros++] = new Book(ISBN, name, author, pages, stock, categoria);
	}
	
	
	public String getCategoria(String name) {
		return Categoria.valueOf(name.toUpperCase()).url();
	}
	
	public void rentBook(String ISBN, int Quantity) {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void editaLivro(String ISBN, String texto) {
		
		for(int x = 0; x < livro.length; x++) {
			if(livro[x] != null)
			if(livro[x].getISBN().equals(ISBN))
				livro[x].setTexto(texto);
		}
		
		
	}


	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder("Livros + \n");
		
		for(Book b : livro)
			if(b != null)
				sb.append(b);
		
		return sb.toString();
	}
	
	public String getConteudo(String ISBN) {
		for(int x = 0; x < livro.length; x++) {
			if(livro[x] != null)
				if(livro[x].getISBN().equals(ISBN)) {
					return livro[x].getTexto();
				}
				
		}
		return null;
		
	}
	
	/*public void setLivros(String[] livros, String tipo) {
		this.livros = livros;
		this.name = tipo;
	}

	*/
	
	
	
}

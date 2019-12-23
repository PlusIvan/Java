
public class Book {

	private String ISBN;
	private String name;
	private String author;
	private int pages;
	private int stock;
	private Categoria categoria;
	private String texto;
	
	public Book(String ISBN, String name, String author, int pages, int stock, Categoria categoria) {
		this.ISBN = ISBN;
		this.name = name;
		this.author = author;
		this.pages = pages;
		this.stock = stock;
		this.categoria = categoria;
		texto = null;
	}
	

	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		pages = pages;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		stock = stock;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}
	
	
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", Name=" + name + ", Author=" + author + ", Pages=" + pages + ", Stock=" + stock
				+ "]"+texto;
	} 
	
	
	
}

package library;

public class Book {
	
	private String id;
	private String title;
	private String author;
	private String genre;
	private String status;
	
	Book(String id, String title, String author, String genre, String status) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.status = status;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "\n" + id + "   " + title + "   " + author + "   " + genre + "   " + status+"\n";
		
	}
	

}

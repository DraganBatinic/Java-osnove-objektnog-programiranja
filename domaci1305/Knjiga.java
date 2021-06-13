package domaci1305;

import java.util.ArrayList;

public class Knjiga {
	private long isbn;
	private String naziv;
	private int godinaIzdanja;
	private Autor autor;
	
	public Knjiga(long isbn, String naziv, int godinaIzdanja, Autor autor) {		
		this.isbn = isbn;
		this.naziv = naziv;
		this.godinaIzdanja = godinaIzdanja;
		this.autor = autor;
	}	

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public long getIsbn() {
		return isbn;
	}

	public String getNaziv() {
		return naziv;
	}

	public Autor getAutor() {
		return autor;
	}
	
		
	public void stampaOKnjizi() {
		System.out.print(this.isbn + "\n" + this.naziv + " - " + this.godinaIzdanja + "\n" + "Autor: ");
		autor.stampaAutora();
		
	}
	
	

}

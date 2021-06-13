package autor;
/*-ISBN
-naziv
-godina izdanja
-autor
-konstuktore koje mislite da su vam potrebni
-gettere i settere za atribute
-metodu print koja stampa u formatu (izbegavati dupliranje koda):
(ISBN)
(naziv) - (godina izdanja)
autor: (ime autora) (prezime autora)*/

public class Knjiga {
	private String isbn;
	private String naziv;
	private int godinaIzdanja;
	private Autor autor;	
	
	public Knjiga(String isbn, String naziv, int godinaIzdanja, Autor autor) {		
		this.isbn = isbn;
		this.naziv = naziv;
		this.godinaIzdanja = godinaIzdanja;
		this.autor = autor;
	}

	public Knjiga(String isbn) {		
		this.isbn = isbn;
	}
		
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void stampanjeOKnjizi() {
		System.out.println(this.isbn + "\n" + this.naziv + " - " + this.godinaIzdanja + 
				"\n" + "Autor: " + autor.getImeIPrezime());
	}

}

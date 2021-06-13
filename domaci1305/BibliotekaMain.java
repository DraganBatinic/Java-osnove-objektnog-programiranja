package domaci1305;

public class BibliotekaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Autor tolkin = new Autor("J.R.R. Tolkin");
		Autor maj = new Autor("Karl Maj");		
		Autor nusic = new Autor("Branislav Nusic");
		
		Knjiga gospodarPrstenova = new Knjiga(1122334455667l, "Gospodar prstenova", 1988, tolkin);
		Knjiga decaHurinova = new Knjiga(6655443322110l, "Deca Hurinova", 1999, tolkin);
		Knjiga silmarilion = new Knjiga(1011447788552l, "Silmarilion", 1982, tolkin);
		Knjiga vinetu = new Knjiga(1598745632154l, "Vinetu", 1975, maj);
		Knjiga oldSeterhend = new Knjiga(2541369852145l, "Old Shatterhand", 1985, maj);
		Knjiga dolinaSmrti = new Knjiga(5498732164587l, "Dolina smrti", 1974, maj);
		Knjiga gospodjaMinistarka = new Knjiga(5421698742365l, "Gospodja ministarka", 1972, nusic);
		Knjiga sumnjivoLice = new Knjiga(1021475036501l, "Sumnjivo lice", 1973, nusic);
		Knjiga autobiografija = new Knjiga(1120366698752l, "Autobiografija", 1976, nusic);
		
		vinetu.stampaOKnjizi();	
		
		
	}

}

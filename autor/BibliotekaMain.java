package autor;

public class BibliotekaMain {
	 //U glavnom programu napraviti vise autora sa vise knjiga.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Autor tolkin = new Autor("J.R.R. Tolkin");
		Autor nusic = new Autor("Branislav Nusic");
		Autor maj = new Autor("Karl Maj");
		
		Knjiga gospodarPrstenova = new Knjiga("123456789", "Gospodar prstenova", 1995, tolkin);
		Knjiga gospodjaMinistarka = new Knjiga("987654321", "Gospodja ministarka", 1987, nusic);
		Knjiga vinetu = new Knjiga("147258369", "Vinetu", 1980, maj);
		
		vinetu.stampanjeOKnjizi();
		gospodjaMinistarka.stampanjeOKnjizi();
		gospodarPrstenova.stampanjeOKnjizi();

	}

}

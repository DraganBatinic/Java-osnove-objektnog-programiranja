package automobili;

public class Automobil {
	//napraviti klasu automobil koja od atributa ima marku, model, 
	//pogonsko gorivo, broj vrata, godinu proizvodnje. 
	//Takodje ima 2 konstruktora: prvi prima sve atribute za argumente, a drugi je prazan	
	//takodje ima funkciju koja stampa podatke o objektima
	
	//Dodati private atribut potrosnja na 100km, napraviti getter i setter 
	//i napraviti metodu koja odredjuje potrosnju na 100km, 
	//ako auto ima 3 vrata potrosnja je 5 litara, a ako auto ima 5 vrata potrosnja je 6 litara,

	public String marka;
	public String model;
	public String pogonskoGorivo;
	public int brojVrata;
	public int godinaProizvodnje;
	private int potrosnja;
	
	public Automobil(String marka, String model, String pogonskoGorivo, int brojVrata, int godinaProizvodnje) {
		this.marka = marka;
		this.model = model;
		this.pogonskoGorivo = pogonskoGorivo;
		this.brojVrata = brojVrata;
		this.godinaProizvodnje = godinaProizvodnje;
		
	}
	
	public  Automobil() {
		
	}
	
	public void setPotrosnja() {
		odredjivanjePotrosnje();
	}
	
	public int getPotrosnja() {
		return this.potrosnja;
	}
	
	private void odredjivanjePotrosnje() {
		if (brojVrata == 3) {
			this.potrosnja = 5;
		} else if (brojVrata == 5) {
			this.potrosnja = 6;
		}
	}
	
	public void stampaPodatakaOAutomobilu() {
		System.out.println("Automobil marke " + marka + ", model " + model + " trosi " +	
	          pogonskoGorivo + " i ima " + brojVrata + " vrata, a proizveden je " + godinaProizvodnje + ". godine.");
	}
}

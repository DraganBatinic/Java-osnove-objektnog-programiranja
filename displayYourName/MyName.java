package displayYourName;

public class MyName {
	
	private String ime;
	private String prezime;
	
	public MyName(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}
	
	public String toString() {
		return "Moje ime je " + this.ime + " " + this.prezime;
	}

}

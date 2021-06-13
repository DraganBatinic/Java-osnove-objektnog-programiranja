package facebook;

import java.util.ArrayList;

//●	ime i prezime korisnika koji je stavio oglas
//●	tekst objave
//●	Listu reakcija
//●	metodu reaguj, koja dodaje reakciju u niz
//●	privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//●	metodu stampaj koja stampa info o postu u formatu:
//ime i prezime
//tekst objave
//Smajli 10 | Like 15 | Srce 2


public class FacebookPost {
	private String imeIPrezimePostera;
	private String tekctObjave;
	private ArrayList<Reakcija> reakcije;
	
	public FacebookPost(String imeIPrezimePostera, String tekctObjave, ArrayList<Reakcija> reakcije) {		
		this.imeIPrezimePostera = imeIPrezimePostera;
		this.tekctObjave = tekctObjave;
		this.reakcije = new ArrayList<Reakcija>();
	}

	public String getImeIPrezimePostera() {
		return imeIPrezimePostera;
	}

	public void setImeIPrezimePostera(String imeIPrezimePostera) {
		this.imeIPrezimePostera = imeIPrezimePostera;
	}

	public String getTekctObjave() {
		return tekctObjave;
	}

	public void setTekctObjave(String tekctObjave) {
		this.tekctObjave = tekctObjave;
	}

	public ArrayList<Reakcija> getReakcije() {
		return reakcije;
	}

	public void setReakcije(ArrayList<Reakcija> reakcije) {
		this.reakcije = reakcije;
	}
	
	public void reaguj (Reakcija reakcije) {
		this.reakcije.add(reakcije);
	}
	
	public void brojReakcija() {
		int smajli = 0;
		int lajk = 0;
		int srce = 0;
		
		for (int i = 0; i < reakcije.size(); i++) {
			if (this.reakcije.get(i).getTipReakcije().equals("smajli")) {
				smajli++;
			} else if (this.reakcije.get(i).getTipReakcije().equals("lajk")) {
				lajk++;
			} else if (this.reakcije.get(i).getTipReakcije().equals("srce")) {
				srce++;
			}			
		}
		
		System.out.println("Smajli " + smajli + " | Lajk " + lajk + " | Srce " + srce);
	}
	
	
	public void stampaOPostu() {
		System.out.println(this.imeIPrezimePostera + "\n" + this.tekctObjave);
		brojReakcija();
	}
	
	

}

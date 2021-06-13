package facebook;
//●	tip reakcije (smajli, like, srce)
//●	ime i prezime korisnika koji je reagovao 
//●	gettere, settere i konstruktore


public class Reakcija {
	private String tipReakcije;
	private String imeIPrezimeReaktora;
	
	public Reakcija(String tipReakcije, String imeIPrezimeReaktora) {		
		this.tipReakcije = tipReakcije;
		this.imeIPrezimeReaktora = imeIPrezimeReaktora;
	}

	public String getTipReakcije() {
		return tipReakcije;
	}

	public void setTipReakcije(String tipReakcije) {
		this.tipReakcije = tipReakcije;
	}

	public String getImeIPrezimeReaktora() {
		return imeIPrezimeReaktora;
	}

	public void setImeIPrezimeReaktora(String imeIPrezimeReaktora) {
		this.imeIPrezimeReaktora = imeIPrezimeReaktora;
	}
	
	
	
	

}

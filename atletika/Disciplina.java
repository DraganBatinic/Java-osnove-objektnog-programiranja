package atletika;

import java.util.ArrayList;

public class Disciplina {
	private String imeDiscipline;
	private String tipDiscipline;
	private ArrayList<Atleticar> listaAtleticara;
	
	public Disciplina(String imeDiscipline, String tipDiscipline) {
		super();
		this.imeDiscipline = imeDiscipline;
		this.tipDiscipline = tipDiscipline;
		this.listaAtleticara = new ArrayList<Atleticar>();
	}

	public String getImeDiscipline() {
		return imeDiscipline;
	}

	public void setImeDiscipline(String imeDiscipline) {
		this.imeDiscipline = imeDiscipline;
	}

	public String getTipDiscipline() {
		return tipDiscipline;
	}

	public void setTipDiscipline(String tipDiscipline) {
		this.tipDiscipline = tipDiscipline;
	}

	public ArrayList<Atleticar> getListaAtleticara() {
		return listaAtleticara;
	}

	public void setListaAtleticara(ArrayList<Atleticar> listaAtleticara) {
		this.listaAtleticara = listaAtleticara;
	}
	
	public void dodajAtleticara(Atleticar atleticar) {
		this.listaAtleticara.add(atleticar);
	}
	
	public void diskvalifikujAtleticara(Atleticar atleticar) {
		this.listaAtleticara.remove(atleticar);		
	}
	
	private Atleticar atleticarSaNajboljimRezultatom() {
		Atleticar najboljiAtleticar = this.listaAtleticara.get(0);
		for (int i = 0; i < this.listaAtleticara.size(); i++) {
			if(this.listaAtleticara.get(i).uporedjivanjeAtleticara(najboljiAtleticar)) {
				najboljiAtleticar = listaAtleticara.get(i);
			}
		}
		
		return najboljiAtleticar;
	}
	
	public void stampaOPobednikuDiscipline() {
		System.out.print("Pobednik u disciplini " + this.imeDiscipline + " je: ");
		atleticarSaNajboljimRezultatom().stampaOAtleticaru();
	}	

}

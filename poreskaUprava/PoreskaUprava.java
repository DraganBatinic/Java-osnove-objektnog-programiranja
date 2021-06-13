package poreskaUprava;

import java.util.ArrayList;

public class PoreskaUprava {
	private String imeGrada;
	private ArrayList<Objekat> listaObjekata;
	
	public PoreskaUprava(String imeGrada) {
		super();
		this.imeGrada = imeGrada;
		this.listaObjekata = new ArrayList<Objekat>();
	}

	public String getImeGrada() {
		return imeGrada;
	}

	public void setImeGrada(String imeGrada) {
		this.imeGrada = imeGrada;
	}

	public ArrayList<Objekat> getListaObjekata() {
		return listaObjekata;
	}

	public void setListaObjekata(ArrayList<Objekat> listaObjekata) {
		this.listaObjekata = listaObjekata;
	}
	
	public void dodajObjekat(Objekat objekat) {
		this.listaObjekata.add(objekat);
	}
	
	public Objekat objekatSaNajvecimPorezom() {
		Objekat najveciPorez = this.listaObjekata.get(0);
		for (int i = 0; i < this.listaObjekata.size(); i++) {
			if(this.listaObjekata.get(i).racunanjePoreza() > najveciPorez.racunanjePoreza()) {
				najveciPorez = listaObjekata.get(i);
			}
		}
		
		return najveciPorez;
		
	}
	
	public Objekat objekatSaNajmanjimPorezom() {
		Objekat najmanjiPorez = this.listaObjekata.get(0);
		for (int i = 0; i < this.listaObjekata.size(); i++) {
			if(this.listaObjekata.get(i).racunanjePoreza() < najmanjiPorez.racunanjePoreza()) {
				najmanjiPorez = listaObjekata.get(i);
			}
		}
		
		return najmanjiPorez;
		
	}
	
	public double porezZaCeoGrad() {
		double ukupanPorez = 0;
		for (int i = 0; i < listaObjekata.size(); i++) {
			ukupanPorez += listaObjekata.get(i).racunanjePoreza();
		}
		
		return ukupanPorez;
	}
	
	public void stampaSvihObjekata() {
		for (int i = 0; i < listaObjekata.size(); i++) {
			listaObjekata.get(i).stampaj();
			System.out.println("------------------------------------------------------");
		}
	}
	
	

}

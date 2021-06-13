package vezbaZaTest;
/*U glavnoj klasi napraviti listu pica koja ce sadrzati dve kafe I tri koktela 
 * (svako pice ima nekoliko sastojaka) i na kraju ispisati racun u formatu:
Pica koja ste porucili: 
1. pice: Mocha, procenat kofeina: 1%, cena: 150.0 din
Sastojci: 
Mleko, cena: 50.0 din
Slag, cena: 70.0 din
-----------------------------------
2. pice: NesKafa, procenat kofeina: 3%, cena: 235.0 din
Sastojci: 
Sladoled, cena: 25.0 din
Slag, cena: 70.0 din
Mleko, cena: 50.0 din
-----------------------------------
3. pice: Koktel: mojito, cena:114.0 din
Sastojci: 
limun, cena: 30.0 din
menta, cena: 20.0 din
votka, cena: 10.0 din
-----------------------------------
4. pice: Koktel: White Rusian, cena:114.0 din
Sastojci: 
votka, cena: 10.0 din
Mleko, cena: 50.0 din
-----------------------------------
5. pice: Koktel: Bambus, cena:95.0 din
Sastojci: 
crno vino, cena: 20.0 din
koka kola, cena: 30.0 din
-----------------------------------
Ukupan iznos racuna je: 708.0*/

import java.util.ArrayList;

public class GlavnaKafana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Pice> narudzba = new ArrayList<Pice>();
		
		Sastojak mleko = new Sastojak("Mleko", 10, 1);
		Sastojak slag = new Sastojak("Slag", 15, 2);
		Sastojak sladoled = new Sastojak("Sladoled", 12, 3);
		Sastojak limun = new Sastojak("Limun", 5, 2);
		Sastojak menta = new Sastojak("Menta", 7, 1);
		Sastojak votka = new Sastojak("Votka", 20, 10);
		Sastojak crnoVino = new Sastojak("Crno vino", 20, 11);
		Sastojak cocacola = new Sastojak("Coca Cola", 30, 4);
		
		Kafa mocha = new Kafa("Mocha", null, 1);
		mocha.dodajSastojak(mleko);
		mocha.dodajSastojak(slag);
		
		Kafa nesKafa = new Kafa("Nes kafa", null, 3);
		nesKafa.dodajSastojak(sladoled);
		nesKafa.dodajSastojak(slag);
		nesKafa.dodajSastojak(mleko);
		
		Koktel mojito = new Koktel("Mojito", null);
		mojito.dodajSastojak(limun);
		mojito.dodajSastojak(menta);
		mojito.dodajSastojak(votka);
		
		Koktel whiteRussian = new Koktel("White Russian", null);
		whiteRussian.dodajSastojak(votka);
		whiteRussian.dodajSastojak(mleko);
		
		Koktel bambus = new Koktel("Bambus", null);
		bambus.dodajSastojak(crnoVino);
		bambus.dodajSastojak(cocacola);
		
		
		narudzba.add(mocha);
		narudzba.add(nesKafa);
		narudzba.add(mojito);
		narudzba.add(whiteRussian);
		narudzba.add(bambus);
		
		System.out.println("Pica koja ste porucili: ");
		double ukupnaCenaNarudzbe = 0;
		for (int i = 0; i < narudzba.size(); i++) {
			ukupnaCenaNarudzbe += narudzba.get(i).cenaPica();
			System.out.print((i+1) + ". pice: ");
			narudzba.get(i).stampaj();
			System.out.println("---------------------------------------------");
		}
		System.out.print("Ukupan iznos racuna je: " + ukupnaCenaNarudzbe + " din");
		
	}

}

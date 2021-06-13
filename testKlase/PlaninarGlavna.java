package testKlase;

import java.util.ArrayList;

/*Kreirati glavnu klasu I u njoj: 
* instancirati jednu planinu
* napraviti listu koji ce sadrzati tri rekrativna planinara I tri alpiniste
* ispisati podatke o svim planinarima I za svakog od planinara 
* ispisati da li ce se popeti na instanciranu planinu
* ispisati kolika je zbir svih clanarina planinara iz niza */

public class PlaninarGlavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Planina miroc = new Planina("Miroc", "Srbija", 3200);
		
		ArrayList<Planinar> listaPlaninara = new ArrayList<Planinar>();
		
		RekreativniPlaninar rp1 = new RekreativniPlaninar(12345, "Petar Petrovic", 12, "Sumadijski okrug", 3900);
		RekreativniPlaninar rp2 = new RekreativniPlaninar(74125, "Marko Markovic", 4, "Podunavski okrug", 3400);
		RekreativniPlaninar rp3 = new RekreativniPlaninar(96324, "Janko Jankovic", 10, "Banatski okrug", 2500);
		
		Alpinista a1 = new Alpinista(789654, "Jovan Jovanovic", 12);
		Alpinista a2 = new Alpinista(512674, "Stevica Stevic", 8);
		Alpinista a3 = new Alpinista(112365, "Stanoje Stanojevic", 32);
		
		listaPlaninara.add(rp1);
		listaPlaninara.add(rp2);
		listaPlaninara.add(rp3);
		listaPlaninara.add(a1);
		listaPlaninara.add(a2);
		listaPlaninara.add(a3);
		
		int zbirClanarina = 0;
		for (int i = 0; i < listaPlaninara.size(); i++) {			
			listaPlaninara.get(i).stampaj();
			if(listaPlaninara.get(i).uspesanUspon(miroc)) {
				System.out.println("Planinar ce se uspesno popeti na planinu.");
			} else {
				System.out.println("Planinar se nece uspesno popeti na planinu.");
			}
			System.out.println("----------------------------------------------------------");
			zbirClanarina += listaPlaninara.get(i).clanarinaPlaninara();
		}
		System.out.println("Zbir clanarina svih planinara je: " + zbirClanarina + " dinara.");
	}

}

package takmicar;

import java.util.ArrayList;

public class TakmicariMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Takmicar t1 = new Takmicar("Pera Peric", 12, 13);
		Takmicar t2 = new Takmicar("Mara Maric", 12, 9);
		Takmicar t3 = new Takmicar("Jovan Jovanovic", 12, 7);
		Takmicar t4 = new Takmicar("Simka Simic", 12, 17);
		Takmicar t5 = new Takmicar("Zika Zikic", 12, 12);
		
		ArrayList<Takmicar> listaTakmicara = new ArrayList<Takmicar>();
		listaTakmicara.add(t1);
		listaTakmicara.add(t2);
		listaTakmicara.add(t3);
		listaTakmicara.add(t4);
		listaTakmicara.add(t5);
		
		System.out.println("Lista takmicara: ");
		for (int i = 0; i < listaTakmicara.size(); i++) {
			System.out.println(listaTakmicara.get(i).toString());
		}
		System.out.println("-------------------------------");
		System.out.println("Lista takmicara koji su ispunili normu: ");
		for (int i = 0; i < listaTakmicara.size(); i++) {
			if(listaTakmicara.get(i).ispunioNormu()) {
				System.out.println(listaTakmicara.get(i).toString());
			}
		}
		

	}

}

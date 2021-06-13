package average;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);		
		DecimalFormat ocene = new DecimalFormat();
		
		for (int i = 0; i < 20; i++) {
			System.out.print("Unesite ocenu: ");
			ocene.dodavanjeOcene(s.nextInt());
			
		}		
		System.out.println();
		System.out.println("Prosek ocena je: " + ocene.average() + ","+ ocene.twoDecimalPlaces());
		

	}

}

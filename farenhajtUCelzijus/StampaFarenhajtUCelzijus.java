package farenhajtUCelzijus;

import java.util.Scanner;

public class StampaFarenhajtUCelzijus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		FarenhajtUCelzijus kalkulator = new FarenhajtUCelzijus(0);
		System.out.print("Molim Vas unesite temperaturu u Farenhajtima: ");
		kalkulator.setFarenhajt(s.nextInt());		
	
		System.out.println(kalkulator.getFarenhajt());
		System.out.println("Temperatura u stepenima Celzijusovih je: " + kalkulator.getCelzijus());		

	}

}

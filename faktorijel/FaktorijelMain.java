package faktorijel;

import java.util.Scanner;

public class FaktorijelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite broj: ");
		Faktorijel broj = new Faktorijel(s.nextInt());
		
		System.out.println(broj.getBroj()+"! = " + broj.racunanjeFaktorijela());
		
		int num = 5;
		long faktorijel = 1;
		for (int i = num; i > 0; i--) {
			faktorijel = faktorijel * num;
		}
		
		System.out.println(faktorijel);

	}

}

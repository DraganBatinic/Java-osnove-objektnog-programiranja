package aritmetickaSredina;

import java.util.Scanner;

public class AritmetickaSredina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Broj clanova niza: ");
		int brojClanova = s.nextInt();
		
		int[] nizPrirodnihBrojeva = new int[brojClanova];
		
		for (int i = 0; i < nizPrirodnihBrojeva.length; i++) {
			System.out.println("Upisite broj: ");
			nizPrirodnihBrojeva[i] = s.nextInt();
		}
		
		int suma = 0;		
		for (int i = 0; i < nizPrirodnihBrojeva.length; i++) {
			suma += nizPrirodnihBrojeva[i];
		}
		double aritmetickaSredina = (double)suma / nizPrirodnihBrojeva.length;
		
		System.out.println(suma);
		System.out.println(aritmetickaSredina);

	}

}

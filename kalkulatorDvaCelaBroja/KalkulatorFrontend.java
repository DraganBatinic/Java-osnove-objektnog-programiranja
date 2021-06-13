package kalkulatorDvaCelaBroja;

import java.util.Scanner;

public class KalkulatorFrontend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite prvi broj: ");		
		KalkulatorBackend prviBroj = new KalkulatorBackend(s.nextInt());
		System.out.print("Unesite drugi broj: ");
		int drugiBroj = s.nextInt();
		
		System.out.println("");
		System.out.println("Njihov zbir je " + prviBroj.sabiranje(drugiBroj));
		System.out.println("Njihova razlika je " + prviBroj.oduzimanje(drugiBroj));
		System.out.println("Njihov proizvod je " + prviBroj.mnozenje(drugiBroj));
		System.out.println("Njihov kolicnik je " + prviBroj.deljenje(drugiBroj));

	}

}

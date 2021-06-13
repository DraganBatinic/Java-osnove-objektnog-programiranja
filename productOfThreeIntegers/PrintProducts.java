package productOfThreeIntegers;

import java.util.Scanner;

public class PrintProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		
		ProductOfThreeIntegers proizvod = new ProductOfThreeIntegers(0, 0, 0);
		
		System.out.print("Unesite prvi broj: ");
		proizvod.setNumber1(s.nextInt());
		System.out.print("Unesite drugi broj: ");
		proizvod.setNumber2(s.nextInt());
		System.out.print("Unesite treci broj: ");
		proizvod.setNumber3(s.nextInt());
		
		proizvod.stapmaProizvoda();
		

	}

}

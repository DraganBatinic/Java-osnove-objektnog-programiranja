package average;

import java.util.ArrayList;

public class DecimalFormat {
	private ArrayList<Integer> grades;

	public DecimalFormat() {
		super();		
		grades = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getGrades() {
		return grades;
	}

	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}
	
	public void dodavanjeOcene(int ocena) {
		this.grades.add(ocena);
	}
	
	
	
	public double average() {
		int suma = 0;
		for (int i = 0; i < this.grades.size(); i++) {
			suma += this.grades.get(i);
		}
		double prosek = (double)suma / this.grades.size();
		return prosek;
		//return suma;
		
	}
	
	public double twoDecimalPlaces() {
		double avg = average() * 100;
		int pomocna = (int)avg;
		double twoDecimalsAvg = pomocna / 100;
		return twoDecimalsAvg;
	}
	

}

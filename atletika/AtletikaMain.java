package atletika;

public class AtletikaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Disciplina skokUDalj = new Disciplina("Skok u dalj", "skakacka");
		Disciplina prepone = new Disciplina("110m sa preponama", "trkacka");
		
		Trkac t1 = new Trkac("Petar", "Petrovic", 13.75);
		Trkac t2 = new Trkac("Marko", "Markovic", 11.85);
		Trkac t3 = new Trkac("Zivko", "Zivkovic", 15.32);
		Trkac t4 = new Trkac("Stojan", "Stojanovic", 12.11);
		
		prepone.dodajAtleticara(t1);
		prepone.dodajAtleticara(t2);
		prepone.dodajAtleticara(t3);
		prepone.dodajAtleticara(t4);
		
		Skakac s1 = new Skakac("Janko", "Jankovic", 8.72);
		Skakac s2 = new Skakac("Peca", "Pecic", 7.99);
		Skakac s3 = new Skakac("Ranko", "Rankovic", 8.63);
		Skakac s4 = new Skakac("Bojan", "Bojanovic", 7.52);
		
		skokUDalj.dodajAtleticara(s1);
		skokUDalj.dodajAtleticara(s2);
		skokUDalj.dodajAtleticara(s3);
		skokUDalj.dodajAtleticara(s4);
		
		prepone.stampaOPobednikuDiscipline();
		skokUDalj.stampaOPobednikuDiscipline();
		
		System.out.println("-----------------------------------------------------");
		prepone.diskvalifikujAtleticara(t2);
		prepone.stampaOPobednikuDiscipline();
		skokUDalj.stampaOPobednikuDiscipline();
		
		
		
		
		
		

	}

}

package zadatak7;

import zadatak5.StudentMasterStudija;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Marko Markovic", 123456, 3);
		Student s2 = new Student("Patar Petrovic", 789654, 1);
		Student s3 = new Student("Zika Zikic", 258369, 6);
		
		s1.stampaOStudentu();
		s2.stampaOStudentu();
		s3.stampaOStudentu();
		
		System.out.println("--------------------");
		
		StudentOsnovnihStudija sos1 = new StudentOsnovnihStudija(s1.getImeIPrezime(), s1.getBrojIndeksa(), s1.getGodinaStudija());
		StudentMaster sm1 = new StudentMaster(s3.getImeIPrezime(), s3.getBrojIndeksa(), s3.getGodinaStudija());
		StudentMaster sm2 = new StudentMaster(s2.getImeIPrezime(), s2.getBrojIndeksa(), s2.getGodinaStudija());
		
		sos1.stampaOStudentu();
		sm1.stampaOStudentu();
		sm2.stampaOStudentu();

	}

}

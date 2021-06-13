package zadatak5;

public class FakultetGlavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Petar Petrovic", "123456789", 1234);
		Student s2 = new Student("Mika Mikic", "147258369", 9632);
		
		Profesor p1 = new Profesor("Profesor Baltazar", "159874235", "Hemija");
		Profesor p2 = new Profesor("Profesor X", "000000000", "Mutantske vestine");
		
		s1.stampaOStudentu();
		s2.stampaOStudentu();
		p1.stampajOProfesoru();
		p2.stampajOProfesoru();
		
		StudentOsnovnihStudija so1 = new StudentOsnovnihStudija("Stole Stolic", "15424564823", 2541, "ekonomija");
		StudentMasterStudija sm1 = new StudentMasterStudija(so1.getImeIPrezime(), so1.getJmbg(), so1.getBrojIndeksa(), so1.getSmer(), 8, "marketing");
		
		so1.stampaOStudentu();
		sm1.stampaOStudentuMasterStudija();
		

	}

}

package fakultet;

public class FakultetGlavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student k1 = new Student("Petar Petrovic", "11223366554477", 147852);
		Student k2 = new Student("Marko Markovic", "1212987123456", 22334);
		
		Profesor p1 = new Profesor("Mita Mitic", "2302956233654", "Hidraulika");
		Profesor p2 = new Profesor("Zika Zikic", "1410966321456", "Matematika I");
		
		k1.stampaOStudentu();
		k2.stampaOStudentu();
		System.out.println("----------------------");
		p1.stampaOProfesoru();
		p2.stampaOProfesoru();
		
		

	}

}

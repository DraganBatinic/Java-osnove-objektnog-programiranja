package studenti;

public class StudentiGlavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentOsnovnihStudija  so1 = new StudentOsnovnihStudija("Petar Petrovic", "123/05", 3);
		StudentOsnovnihStudija  so2 = new StudentOsnovnihStudija("MarkoMarkovic", "2587/12", 6);
		StudentMaster sm1 = new StudentMaster("Janko Jankovic", "365/02", 1);
		StudentMaster sm2 = new StudentMaster("Ana Anic", "3698/63", 3);
		
		so1.stampaOStudentu();
		so2.stampaOStudentu();
		sm1.stampaOStudentu();
		sm2.stampaOStudentu();

	}

}

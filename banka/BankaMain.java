package banka;

public class BankaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VisaKartica vk = new VisaKartica(4250, "4012-1239-1221-3381", 2025, 11, "Pera Peric");
		MasterKartica mk = new MasterKartica(1230, "123-654-789-654-321", 2022, 7);
		
		vk.stampaOKartici();
		mk.stampaOKartici();
		System.out.println("---------------------------------------------------------");
		
		vk.dodajSredstva(100);
		mk.dodajSredstva(100);
		vk.stampaOKartici();
		mk.stampaOKartici();
		System.out.println("---------------------------------------------------------");
		vk.izvrsiVisaTransakciju(100);
		mk.izvrsiMasterTransakciju(100);
		vk.stampaOKartici();
		mk.stampaOKartici();
		System.out.println("---------------------------------------------------------");
		mk.naplatiOdrzavanje();
		vk.stampaOKartici();
		mk.stampaOKartici();
		System.out.println("---------------------------------------------------------");
		

	}

}

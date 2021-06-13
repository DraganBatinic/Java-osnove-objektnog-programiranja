package automobili;

public class AutomobiliGlavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automobili seat = new Automobili("Seat", "Ibiza", "benzin/gas", 5, 2001, 0);
		Automobili yugo =  new Automobili("Yugo", "Koral 55", "bezin/gas", 3, 2000, 0);
		Automobili ford	= new Automobili("Ford", "Fiesta", "benzin/gas", 3, 1990, 0);
		
		seat.stampaOAutomobilima();
		yugo.stampaOAutomobilima();
		ford.stampaOAutomobilima();
		seat.racunanjePotrosnje();
		yugo.racunanjePotrosnje();
		ford.racunanjePotrosnje();
		
		System.out.println(seat.getMarka() + " " + seat.getModel() + " trosi " + seat.getPotrosnjaNaStoKilometara() + " litara na sto kilometara.");

	}

}

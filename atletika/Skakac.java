package atletika;

public class Skakac extends Atleticar{

	

	public Skakac(String ime, String prezime, double rezultat) {
		super(ime, prezime, rezultat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean uporedjivanjeAtleticara(Atleticar atleticar) {
		// TODO Auto-generated method stub
		if(super.getRezultat() > atleticar.getRezultat()) {
			return true;
		} else {
			return false;
		}
	}
	
	

}

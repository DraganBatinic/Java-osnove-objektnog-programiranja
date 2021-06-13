package racunari;

public class Racunar {
	private String marka;
	private String model;
	private int ram;
	private String procesor;
	
	public Racunar(String marka, String model, int ram, String procesor) {		
		this.marka = marka;
		this.model = model;
		this.ram = ram;
		this.procesor = procesor;
	}

	public String getMarka() {
		return marka;
	}

	public String getModel() {
		return model;
	}

	public int getRam() {
		return ram;
	}

	public String getProcesor() {
		return procesor;
	}
	
	public void stampaRacunara() {
		System.out.println(this.marka + ", " + this.model + ", " + this.ram + "Gb RAM-a, procesor " + this.procesor);
	}
	

}

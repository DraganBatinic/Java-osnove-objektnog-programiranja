package productOfThreeIntegers;

public class ProductOfThreeIntegers {
	private int num1;
	private int num2;
	private int num3;
	
	public ProductOfThreeIntegers(int number1, int number2, int number3) {
		this.num1 = number1;
		this.num2 = number2;
		this.num3 = number3;
	}
	
	public void setNumber1(int broj) {
		this.num1 = broj;		
	}
	public void setNumber2(int broj) {
		this.num2 = broj;		
	}
	public void setNumber3(int broj) {
		this.num3 = broj;		
	}
	
	public int getProduct() {
		return this.num1 * this.num2 * this.num3;
	}
	
	public void stapmaProizvoda() {
		System.out.println("Proizvod brojeva " + this.num1 + ", " + this.num2 + " i " + this.num3 + " iznosi " + getProduct());
	}

}

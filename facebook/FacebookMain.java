package facebook;
//Iz glavne klase instancirati par reakcija i postova i ispisati info o postovima*/

public class FacebookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FacebookPost draganovPost = new FacebookPost("Dragan Batinic", "Dragan je debela svinja", null);
		
		Reakcija r1 = new Reakcija("smajli", "Petar Petrovic");
		Reakcija r2 = new Reakcija("smajli", "Marko Markovic");
		Reakcija r3 = new Reakcija("srce", "Mileva Milevic");
		
		draganovPost.reaguj(r1);
		draganovPost.reaguj(r2);
		draganovPost.reaguj(r3);
		
		draganovPost.stampaOPostu();
		
		

	}

}

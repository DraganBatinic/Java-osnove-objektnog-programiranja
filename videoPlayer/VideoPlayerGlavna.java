package videoPlayer;

public class VideoPlayerGlavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VideoPlayer vp1 = new VideoPlayer(2000, 10, 0, 144);
		
		vp1.stampaOVideu();
		System.out.println("--------------------------------------------");
		TimeControl tc1 = new TimeControl(false);
		TimeControl tc2 = new TimeControl(true);
		AudioControl ac1 = new AudioControl(false);
		AudioControl ac2 = new AudioControl(true);		
		QualityOptimizerControl qoc1 = new QualityOptimizerControl(56);
		
		tc1.izvrsiAkciju(vp1);
		ac1.izvrsiAkciju(vp1);
		vp1.stampaOVideu();
		
		

	}

}

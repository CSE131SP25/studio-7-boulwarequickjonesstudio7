package studio7;

public class HockeyPlayer {
	private String name;
	private int n;
	private int points;
	private int assists;
	private boolean rightHanded;
	private boolean leftHanded;
	
	public HockeyPlayer(String name, int number, int p, int a, boolean right, boolean left) {
		this.name = name;
		n = number;
		points = p;
		assists = a;
		rightHanded = right;
		leftHanded = left;
	}
	
	public void afterGame(int p, int a) {
		points += p;
		assists += a;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

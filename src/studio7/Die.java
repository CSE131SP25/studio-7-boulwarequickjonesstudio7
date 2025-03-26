package studio7;

public class Die {
	private int sides;
	
public Die(int sides) {
	this.sides = sides;
}

public int rollDie(){
	return (int) (Math.random()* sides + 1);
	
}
	
	
	public int getSides() {
	return sides;
}

public void setSides(int sides) {
	this.sides = sides;
}

	public static void main(String[] args) {
		Die d = new Die(6);
		System.out.print(d.rollDie());// TODO Auto-generated method stub

	}

}

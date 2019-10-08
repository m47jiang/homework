public class Warrior extends MilitaryUnit {
	public Warrior(Tile position, double hp, String faction) {
		super(position, hp, 1, faction, 20.0, 1, 25);
	}

	public boolean equals(Object verifier) {
		if (verifier instanceof Warrior ) {
			return super.equals(verifier);
			}	
		return false;
	}	
}
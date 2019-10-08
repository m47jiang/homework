public class Archer extends MilitaryUnit{
	private int arrowAvble;

	public Archer(Tile position, double hp, String faction) {
		super(position, hp, 2, faction, 15.0, 2, 0);
	}

	public void takeAction(Tile targetTile) {
		if (arrowAvble == 0) {
			arrowAvble = 5;
		}
	}

	public boolean equals(Object verifier) {
		if (verifier instanceof Archer ) {
			Archer newVerify = (Archer) verifier;
			return super.equals(newVerify) && newVerify.arrowAvble == this.arrowAvble;
		}
		else
		return false;
	}	

}
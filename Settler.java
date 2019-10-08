public class Settler extends Unit {
	public Settler(Tile position, double hp, String faction) {
		super(position, hp, 2, faction);
	}

	public void takeAction(Tile stationedTile) {
		if (stationedTile.isCity() == false) {
			stationedTile.foundCity();
			stationedTile.removeUnit(this);
		}
	}

	public boolean equals(Object verifier) {
		if (verifier instanceof Settler) {
			return super.equals(verifier);
		}
		return false;
	}		
}
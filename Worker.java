public class Worker extends Unit {
	private int jobNumber;

	public Worker(Tile position, double hp, String faction) {
		super(position, hp, 2, faction);
		this.jobNumber = 0;
	}

	public void takeAction(Tile stationedTile) {
		if (stationedTile.isImproved() == false) {
			stationedTile.buildImprovement();
			stationedTile.removeUnit(this);
		}
	}

	public boolean equals(Object verifier) {
		if (verifier instanceof Worker ) {
			
			if (super.equals(this.getPosition()) && super.equals(this.getHP()) && super.equals(this.getFaction()) && super.equals(this.jobNumber))
				return true;
			return false;
		}
		else
		return false;
	}	
}
public abstract class MilitaryUnit extends Unit {
	private double atkDMG;
	private int atkRange;
	private int armor;

	public MilitaryUnit(Tile position, double hp, int movingRange, String faction, double atkDMG, int atkRange, int armor) {
		super(position, hp, movingRange, faction);
		this.atkDMG = atkDMG;
		this.atkRange = atkRange;
		this.armor = armor;
	}

	public void takeAction(Tile targetTile) {
		double dmgPower = this.atkDMG;
		if (targetTile.getDistance(super.getPosition(), targetTile) >= (this.atkRange+1)) {}
		else {
			if (targetTile.isImproved() == true) {
				dmgPower = dmgPower * 1.05;
			}

			if (targetTile.selectWeakEnemy(super.getFaction()) != null) {
				targetTile.selectWeakEnemy(super.getFaction()).receiveDamage(dmgPower);
			}				
		}
	}

	public void receiveDamage(double dmgTaken) {
		dmgTaken = dmgTaken * 100/(100 + armor);
		super.receiveDamage(dmgTaken);
	}	
}
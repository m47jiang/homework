public abstract class Unit {
	private Tile position;
	private double hp;
	private int movingRange;
	private String faction;

	public Unit(Tile position, double hp, int movingRange, String faction) {
		this.position = position;
		this.hp = hp;
		this.movingRange = movingRange;
		this.faction = faction;
	}

	public final Tile getPosition() {
		return this.position;
	}

	public final double getHP() {
		return this.hp;
	}

	//public final void getFaction() {
	public final String getFaction() {
		//System.out.println(this.faction);
		return this.faction;
	}

	public boolean moveTo(Tile movement) {
		if (movement.getDistance(position, movement) > movingRange || movement.addUnit(this) == false) {
			return false;
		}
		this.position = movement;
		return true;
	}

	public void receiveDamage(double dmgTaken) {
		if (position.isCity() == true) {
			dmgTaken = dmgTaken * 0.9;
		}
		this.hp = this.hp - dmgTaken;
		if (this.hp <= 0) {
			position.removeUnit(this);
		}
	}

	public abstract void takeAction(Tile targetTile);

	public boolean equals(Object verifier) {
		if (verifier instanceof Unit) {
			Unit newVerify = (Unit) verifier;
			if (newVerify.getPosition().getX() == this.position.getX() && newVerify.getPosition().getY() == this.position.getY() && newVerify.getFaction().equals(this.faction) && newVerify.getHP() == this.hp ) {
				return true;
			}
			return false;
		}
		return false;
	}
}
class Archer extends MilitaryUnit{
	private int arrowAvble;

	public Archer(Tile position, double hp, String faction) {
		this.position = position;
		this.hp = hp;
		this.faction = faction;
		movingRange = 2;
		atkDMG = 15.0;
		atkRange = 2;
		arrowAvble = 5;
	}
}
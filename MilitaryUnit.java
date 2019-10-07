class MilitaryUnit extends Unit {
	private double atkDMG;
	private int atkRange;
	private int armor;

	public MilitaryUnit(Tile position, double hp, int movingRange, String faction) {
		this.position = position;
		this.hp = hp;
		this.movingRange = movingRange;
		this.faction = faction;
		atkDMG;
		atkRange;
		armor;
	}
}
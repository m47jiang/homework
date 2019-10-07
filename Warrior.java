class Warrior extends MilitaryUnit {
	public Warrior(Tile position, double hp, String faction) {
		this.position = position;
		this.hp = hp;
		this.faction = faction;
		movingRange = 1;
		atkDMG = 20.0;
		atkRange = 1;
		armor = 25;
	}
}
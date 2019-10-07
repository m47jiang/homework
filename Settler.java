class Settler extends Unit {
	public Settler(Tile position, double hp, String faction) {
		this.position = position;
		this.hp = hp;
		this.faction = faction;
		movingRange = 2;
	}
}
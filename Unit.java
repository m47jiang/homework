class Unit {
	private Tile position = new Tile();
	private double hp;
	private int movingRange;
	private String faction;

	public Unit(Tile position, double hp, int movingRange, String faction) {
		this.position = position;
		this.hp = hp;
		this.movingRange = movingRange;
		this.faction = faction;
	}

	public final getPosition() {
		return position;
	}

	public final getHP() {
		return hp;
	}

	public final getFaction() {
		return faction;
	}
}
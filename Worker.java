class Worker extends Unit {
	private int jobNumber;

	public Worker(Tile position, double hp, String faction) {
		this.position = position;
		this.hp = hp;
		this.faction = faction;
		movingRange = 2;
		jobNumber = 0;
	}
}
public class Tile {
	private int xPosition;
	private int yPosition;
	private boolean city;
	private boolean improvement;
	private ListOfUnits unitOnTile;

	public Tile(int xAxis, int yAxis) {
		this.xPosition = xAxis;
		this.yPosition = yAxis;
		this.city = false;
		this.improvement = false;
		this.unitOnTile = new ListOfUnits();
	}

	public int getX() {
		return xPosition;
	}

	public int getY() {
		return yPosition;
	}

	public boolean isCity() {
		return city;
	}

	public boolean isImproved() {
		return improvement;
	}

	public void foundCity() {
		city = true;
	}

	public void buildImprovement() {
		improvement = true;
	}

	public boolean addUnit(Unit tbAdded) {
		if (tbAdded instanceof MilitaryUnit) {
			Unit enemyUnit = (unitOnTile.getArmy())[0];
			if (enemyUnit.getFaction() != tbAdded.getFaction()) {
				return false;
			}
			unitOnTile.add(tbAdded);
			return true;
		}
		unitOnTile.add(tbAdded);
		return true;
	}



	public boolean removeUnit(Unit tbRemovedTile) {
		if (unitOnTile.remove(tbRemovedTile) != true) {
			return false;
		}
		unitOnTile.remove(tbRemovedTile);
		return true;
	}

	public Unit selectWeakEnemy(String factionName) {
		int firstEnemy = 0;
		int j = 0;
		for (int i = 0; i < unitOnTile.size(); i++) {
			if (unitOnTile.getUnits()[i].getFaction() != factionName) {
				if (firstEnemy == 0) {
					j = i;
					firstEnemy = 1;
				}

				if (unitOnTile.getUnits()[i].getHP() < unitOnTile.getUnits()[j].getHP()) {
					j = i;
				}
			}
			return unitOnTile.getUnits()[j];
		}
		return null;
	}

	public static double getDistance(Tile tileNumber1, Tile tileNumber2) {
		double xDistance = tileNumber1.getX() - tileNumber2.getX();
		double yDistance = tileNumber1.getY() - tileNumber2.getY();
		double distance = Math.sqrt(xDistance * xDistance + yDistance * yDistance);

		return distance;
	}
}
public class ListOfUnits2 {
	private Unit[] unitList;
	private int realSize;

	public ListOfUnits2() {
		this.unitList = new Unit[10];
		this.realSize = 0;
	}

	public int size() {
		int counterNULL = 0;
		for (int i = 0; i < this.unitList.length; i++) {
			if (this.unitList[i] == null) {
				counterNULL++;
			}
		}
		this.realSize = this.unitList.length - counterNULL;
		return this.realSize;
	}

	public Unit[] getUnits() {
		int onlyUnitSize = this.unitList.size();
		Unit[] onlyUnitArray = new Unit[onlyUnitSize];

		int j = 0;
		for (int i = 0; i < this.unitList.length; i++) {
			if (this.unitList[i] != null) {
				onlyUnitArray[j] = this.unitList[i];
				j++;
			}
		}

		this.unitList = onlyUnitArray;
		return this.unitList;
	}

	public Unit get(int specifiedPosition) {
		if (specifiedPosition >= 0 && specifiedPosition < this.unitList.getUnits().size()) {
			return this.unitList.getUnits()[specifiedPosition];
		}
		else {
			throw new IndexOutOfBoundsException();
		}
	}

	public void add(Unit tbAdded) {
		if (this.unitList.size() == this.unitList.length) {
			int resized = this.unitList.length + this.unitList.length/2 + 1;
			Unit[] resizedArray = new Unit[resized];
			int j = 0;
			for (int i = 0; i < this.unitList.length; i++) {
				resizedArray[j] = this.unitList[i];
				j++
			}
			resizedArray[this.unitList.length] = tbAdded;
			this.unitList = resizedArray;
		}
		else {
			this.unitList[this.unitList.size()] = tbAdded;
		}
	}

	public int indexOf(Unit tbFound) {
		for (int i = 0; i < this.unitList.length; i++) {
			if (tbFound.equals(this.unitList[i])) {
				return i;
			} 
		}
		return -1;
	}

	public boolean remove(Unit tbRemoved) {
		if (indexOf(tbRemoved) == -1) {
			return false;
		}
		else {
			for (int temp = indexOf(tbRemoved); temp < this.unitList.length - 1; temp++) {
				this.unitList[temp] = this.unitList[temp+1]
			}
			return true;
		}
	}

	public MilitaryUnit[] getArmy() {
		int armySize = 0;
		for (int i = 0; i < this.unitList.size(); i++) {
			if (this.unitList.getUnits() instanceof MilitaryUnit) {
				armySize++:
			}
		}
		MilitaryUnit[] army = new MilitaryUnit[armySize];
		int j = 0;
		for (int i = 0; i < this.unitList.size(); i++) {
			if (this.unitList.getUnits() instanceof MilitaryUnit) {
				army[j] = (MilitaryUnit) this.unitList.getUnits()[i];
				j++
			}
		}
		return army;
	}


}

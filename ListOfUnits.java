class ListOfUnits {
	private Unit[] arrayUnits;
	private int arraySize;

	public ListOfUnits() {
		arraySize = 10;
		arrayUnits = new Unit[arraySize];
	}

	public int size() {
		int counter = 0;
		int i; //?
		for (i = 0; i < arraySize; i++) {
			if (arrayUnits[i] == null) {
				counter++;
			}
		}
		return arraySize - counter;
	}

	public Unit[] getUnits() {
		//int newSize = arrayUnits.size();
		int newSize = this.size();
		Unit[] newArrayUnit = new Unit[newSize];
		int j = 0;
		int i; //?

		for (i = 0; i < arraySize; i++) {
			if (arrayUnits[i] != null) {
				newArrayUnit[j] = arrayUnits[i];
				j++;
			}
		}
		return newArrayUnit;
	}

	public Unit get(int positionList) {
		if (positionList >= 0 && positionList < arraySize) { //shall >= 0
			return arrayUnits[positionList];
		}
		else {
			throw new IndexOutOfBoundsException();
		}
	}

	public void add(Unit addedUnit) { //add void
		int newArraySize;
		int i; //?
		//if (arraySize == arrayUnits.size()) {
		if (arraySize == this.size()) {
			newArraySize = arraySize + arraySize/2 + 1;
			Unit[] resizedArray = new Unit[newArraySize];
			for ( i = 0; i < arraySize; i++) {
				resizedArray[i] = arrayUnits[i];
			}
			arrayUnits = resizedArray;
		}
		//arrayUnits[arrayUnits.size()] = addedUnit; //arrayUnits.size?
		arrayUnits[this.size()] = addedUnit; //arrayUnits.size?
	}

	public int indexOf(Unit repeated) {
		int i; //?
		int unitsize = this.size();
		//for (int i = 0; i < arrayUnits.size(); i++) { //arrayUnits.size?
		for ( i = 0; i < unitsize; i++) { 
			if (arrayUnits[i] == repeated) {
				return i;
			}
		}
		return -1;
	}

	public boolean remove(Unit tbRemoved) {
		int temp;
		int counter = 0;
		int i;
		int unitsize = this.size();
		//for (int i = 0; i < arrayUnits.size(); i++) { //arrayUnits.size?
		for ( i = 0; i < unitsize; i++) { 
			if (arrayUnits[i] == tbRemoved) {
					//temp = i;
					counter = 1;
					break;
				}
			}
		//for (int temp = 0; temp < arrayUnits.size() - 1; temp++) {//arrayUnits.size?
		if (counter == 1) {
			for ( temp = i; temp < unitsize - 1; temp++) {
				arrayUnits[temp] = arrayUnits[temp+1];
			}
			arrayUnits[unitsize] = null;

			return true;
		}
		else {
			return false;
		}
	}

	public MilitaryUnit[] getArmy() {
		int counterArmy = 0;
		int i;
		int j;
		MilitaryUnit[] armyUnit;
		int unitsize=this.size();
		//for (int i = 0; i < arrayUnits.size(); i++) {//arrayUnits.size?
		for (i = 0; i < unitsize; i++) {
			if (arrayUnits[i] instanceof MilitaryUnit) { 
				counterArmy++;
			}
		}
		armyUnit = new MilitaryUnit[counterArmy];
		//for (i = 0; i < arrayUnits.size(); i++) {//arrayUnits.size?
		j = 0;
		for (i = 0; i < unitsize; i++) {
			if (arrayUnits[i] instanceof MilitaryUnit) { 
				armyUnit[j] = (MilitaryUnit) arrayUnits[i];
				j++;
			}
		}
		return  armyUnit;
	}
	
}
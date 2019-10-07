class ListOfUnits {
	private Unit[] arrayUnits;
	private int arraySize;

	public ListOfUnits() {
		arrayUnits = new Unit[10];
		arraySize = 10;
	}

	public size() {
		int counter = 0;
		for (i = 0; i < arraySize; i++) {
			if (arrayUnits[i] == NULL) {
				counter++;
			}
		}
		return arraySize - counter;
	}

	public getUnits() {
		int newSize = arrayUnits.size();
		Unit[] newArrayUnit = new Unit[newSize];
		int j = 0;

		for (i = 0; i < arraySize; i++) {
			if (arrayUnits[i] != NULL) {
				newArrayUnit[j] = arrayUnits[i];
				j++;
			}
		}
		return newArrayUnit;
	}

	public get(int positionList) {
		if (positionList < 0 && positionList <= arraySize) {
		return arrayUnits[positionList];
		}
	}

	public add(Unit addedUnit) {
		int newArraySize;
		if (arraySize == arrayUnits.size()) {
			newArraySize = arraySize + arraySize/2 + 1;
			Unit[] resizedArray = new Unit[newArraySize];
			for (i = 0; i < newArraySize; i++) {
				resizedArray[i] = arrayUnits[i];
			}
			arrayUnits[] = resizedArray[];
		}
		arrayUnits[arraySize] = addedUnit;
	}

	public indexOf(Unit repeated) {
		for (int i = 0; 0 < arrayUnits.size(); i++) {
			if (arrayUnits[i] == repeated) {
				return i;
			}
		}
		return -1;
	}

	public remove(Unit tbRemoved) {
		int temp;
		int counter = 0;
		for (int i = 0; i < arrayUnits.size(); i++) {
			if (arrayUnits[i] == tbRemoved) {
					temp = i;
					counter = 1;
					break;
				}
			}
		for (int temp = 0; temp < arrayUnits.size() - 1; temp++) {
			arrayUnits[temp + 1] = arrayUnits[temp];
		}
		if (counter == 1) {
			return 0;
		}
		else {
			return false;
		}
	}

	public getArmy() {
		int counterArmy = 0;
		Unit[] armyUnit;
		for (int i = 0; i < arrayUnits.size(); i++) {
			if (arrayUnits[i] == MilitaryUnit) {
				counterArmy++;
			}
		}
		armyUnit = new Unit(counterArmy);
		for (int i = 0; i < arrayUnits.size(); i++) {
			if (arrayUnits[i] == MilitaryUnit){
				int j = 0;
				armyUnit[j] = arrayUnits[i];
				j++;
			}
		}
	}
	
}
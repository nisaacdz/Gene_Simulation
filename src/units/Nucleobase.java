package units;

import pieces.NucleicAcid;

public abstract class Nucleobase {

	public abstract String getbaseID();

	public abstract int getConnectionCode();

	public static Nucleobase getComplementaryBase(NucleicAcid acid, int baseCode) {
		Nucleobase returnValue = null;
		switch (baseCode) {
		case 1:
			if (acid.getType() == 1) {
				returnValue = new Thymine();
			} else if (acid.getType() == 2) {
				returnValue = new Uracil();
			}
			break;
		case 2:
			returnValue = new Cytosine();
			break;
		case 3:
			returnValue = new Adenine();
			break;
		case 4:
			returnValue = new Guanine();
			break;
		}
		return returnValue;
	}

	public static Nucleobase getComplementaryBase(NucleicAcid acid, Nucleobase nbase) {
		Nucleobase returnValue = null;
		int baseCode = nbase.getConnectionCode();
		switch (baseCode) {
		case 1:
			if (acid.getType() == 1) {
				returnValue = new Thymine();
			} else if (acid.getType() == 2) {
				returnValue = new Uracil();
			}
			break;
		case 2:
			returnValue = new Cytosine();
			break;
		case 3:
			returnValue = new Adenine();
			break;
		case 4:
			returnValue = new Guanine();
			break;
		}
		return returnValue;
	}

}

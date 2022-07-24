package pieces;

import units.Nucleobase;

public class Nucleotide {
	
	private Nucleobase base;

	public Nucleotide(Nucleobase base) {
		this.base = base;
	}
	
	public Nucleobase getBase() {
		return base;
	}
}

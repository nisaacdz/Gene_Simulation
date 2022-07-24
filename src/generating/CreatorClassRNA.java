package generating;

import java.util.ArrayList;
import java.util.Random;

import pieces.DSRNA;
import pieces.Nucleotide;
import pieces.SSRNA;
import units.Adenine;
import units.Cytosine;
import units.Guanine;
import units.Nucleobase;
import units.Uracil;

public class CreatorClassRNA {

	public static void main(String[] args) {
		SSRNA srna = generateRandomSingleStrandRNA(100);
		DSRNA drna = generateRandomDoubleStrandRNA(50);

		System.out.println(srna.toString());
		System.out.println(drna.toString());
	}

	public static SSRNA generateRandomSingleStrandRNA(int length) {
		ArrayList<Nucleotide> ntides = new ArrayList<Nucleotide>();
		ArrayList<Nucleobase> fourBases = new ArrayList<>();

		fourBases.add(new Adenine());
		fourBases.add(new Guanine());
		fourBases.add(new Uracil());
		fourBases.add(new Cytosine());

		Random random = new Random();

		for (int x = 0; x < length; x++) {
			int index = random.nextInt(4);
			Nucleobase base = fourBases.get(index);
			Nucleotide ntide = new Nucleotide(base);
			ntides.add(x, ntide);
		}

		SSRNA rna = new SSRNA(ntides);
		return rna;
	}

	public static DSRNA generateRandomDoubleStrandRNA(int length) {
		SSRNA ssrna = generateRandomSingleStrandRNA(length);
		DSRNA dsrna = new DSRNA(ssrna);
		return dsrna;
	}
}

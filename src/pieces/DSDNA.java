package pieces;

import java.util.ArrayList;
import java.util.HashMap;

import units.Nucleobase;

public class DSDNA extends DNA {

	private ArrayList<Nucleotide> strand1;
	private ArrayList<Nucleotide> strand2;
	
	private StringBuilder toString = new StringBuilder("");

	public HashMap<Nucleotide, Nucleotide> doubleStrand = new HashMap<>();

	public DSDNA(SSDNA single) {
		strand1 = single.getNucleotideList();
		strand2 = generateSecondStrand(this);
		doubleStrand = generateDoubleHelix();
	}

	public DSDNA(ArrayList<Nucleotide> nucleotides) {
		SSDNA single = new SSDNA(nucleotides);
		strand1 = single.getNucleotideList();
		strand2 = generateSecondStrand(this);
		doubleStrand = generateDoubleHelix();
	}

	private ArrayList<Nucleotide> generateSecondStrand(DNA dna) {
		ArrayList<Nucleotide> strand = new ArrayList<>();
		for (Nucleotide n : strand1) {
			Nucleotide tempN = new Nucleotide(Nucleobase.getComplementaryBase(dna, n.getBase().getConnectionCode()));
			strand.add(tempN);
		}
		return strand;
	}
	
	private HashMap<Nucleotide, Nucleotide> generateDoubleHelix() {
		HashMap<Nucleotide, Nucleotide> temp = new HashMap<>();
		int size = strand1.size();
		for(int i = 0; i < size; i++) {
			temp.put(strand1.get(i), strand2.get(i));
			toString.append(strand1.get(i).getBase().getbaseID() + strand2.get(i).getBase().getbaseID());
			toString.append("-");
		}
		return temp;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("DNA_SEQUENCE : ");
		sb.append(toString);
		return sb.toString();
	}
	
}

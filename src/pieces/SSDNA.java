package pieces;

import java.util.ArrayList;

public class SSDNA extends DNA {

	private ArrayList<Nucleotide> ntides;
	private String baseSequence;

	public SSDNA(ArrayList<Nucleotide> nucleotides) {
		ntides = nucleotides;
		baseSequence = getSequence();
	}
	
	protected ArrayList<Nucleotide> getNucleotideList(){
		return ntides;
	}

	private String getSequence() {
		StringBuilder sb = new StringBuilder("");
		for (Nucleotide ntide : ntides) {
			String id = ntide.getBase().getbaseID();
			sb.append(id);
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb = sb.append("DNA_SEQUENCE : ").append(baseSequence);
		return sb.toString();
	}
}

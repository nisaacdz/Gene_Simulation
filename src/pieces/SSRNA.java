package pieces;

import java.util.ArrayList;

public class SSRNA extends RNA {

	private ArrayList<Nucleotide> ntides;
	private String baseSequence;

	public SSRNA(ArrayList<Nucleotide> nucleotides) {
		ntides = nucleotides;
		baseSequence = getSequence();
	}

	protected ArrayList<Nucleotide> getNucleotideList() {
		return ntides;
	}

	public String getSequence() {
		StringBuilder sb = new StringBuilder("");
		for (Nucleotide ntide : ntides) {
			String id = ntide.getBase().getbaseID();
			sb.append(id);
		}
		return sb.toString();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb = sb.append("RNA_SEQUENCE : ").append(baseSequence);
		return sb.toString();
	}
}

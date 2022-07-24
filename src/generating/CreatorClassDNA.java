package generating;

import java.util.ArrayList;
import java.util.Random;

import pieces.DSDNA;
import pieces.Nucleotide;
import pieces.SSDNA;
import units.Adenine;
import units.Cytosine;
import units.Guanine;
import units.Nucleobase;
import units.Thymine;

public class CreatorClassDNA {

	public static void main(String[] args) {
		SSDNA sdna = generateRandomSingleStrandDNA(1000);
		DSDNA ddna = generateRandomDoubleStrandDNA(50);

		System.out.println(sdna.toString());
		System.out.println(ddna.toString());
	}

	public static SSDNA generateDNAWithCode() {/*
												 * AAAAACAGACCGGCGTGTCACGCACTACCAGTCCAACAAATCGTCGAAG
												 * CTGGCTACATCCATTTCGCAGTCAAGAATGATTCAGGGACTGGCGTTAAATTATCATCGCGGCTGAC
												 * ACGAAATTAGTGAACGCGATGTATCGGAATTGTCTTTGCCAACGAACCCCCTACTGTGCGATTCCAC
												 * TATTTCACTAGAGATTGGCGACTCTCAAGATCGTGGTAATATGAGTCTCCGCGGGAGTCCTT
												 * GCCCGAAATGTTCCCCGTTGGAGTCAAGAAATGTACGTTAATAACCTGATAAACGGATATGC
												 * GACTTCTCATTTAGACAGCCATAGACTCTACATATCCTTGAACTGTGAGTTCCTCCCTTATT
												 * TGTTTCCGACACAATTGAACGCCTACACCTGCTCTGTATGTTAATGGATCTACCCAGAGTACGATGGC
												 * AATTGCTCATATTGACCTTCCGGCCCGATTTCTTCGCTAAACCTACAGCGCCGGGAAGTAGAGAACCC
												 * TCATAGTGTCGGGGTCTTGCGGGCATCCAAAGGTGTCACTCCCATTAGGCAATACGAAATTGCACGAC
												 * TAGCAAAATCGTGCGGCTAGCAGACAGATCTGCTGTGCAATGCCTGCTCGCTCTGTGGGAGAGGTCGG
												 * CACTTTCCGTGGAAAAACAAACTAGTGTCTACTTCATGTGCAAGGCACGTGCTAGGACAGCACTACGA
												 * TAGGACCTATCTCGCCTCCGTCCACCAGTTAGTCACTTAGAAAGATATCATTGCCTGCAAGGGAACGCC
												 * TAAATGTCGCCACGGGTAACTCCCAGAACCAAGTCATATAAAGTTGATCATATACGCGTTTTTTGGTG
												 * TGCCTATTAATGTGCAGCATGGCCTAGGCTCTACACTGCAGTGAGCTACGGGTAGGTGATCTCGAACC
												 * ACCATGCCGGCCACACAATGAGCGACCCACTGCAAGAATTGGACTTACGTG
												 * CCCCGTGATCACTCCCAACACGAGAATCAACATCC
												 */

		return null;
	}

	public static SSDNA generateRandomSingleStrandDNA(int length) {
		ArrayList<Nucleotide> ntides = new ArrayList<Nucleotide>();
		ArrayList<Nucleobase> fourBases = new ArrayList<>();

		fourBases.add(new Adenine());
		fourBases.add(new Guanine());
		fourBases.add(new Thymine());
		fourBases.add(new Cytosine());

		Random random = new Random();

		for (int x = 0; x < length; x++) {
			int index = random.nextInt(4);
			Nucleobase base = fourBases.get(index);
			Nucleotide ntide = new Nucleotide(base);
			ntides.add(x, ntide);
		}

		SSDNA dna = new SSDNA(ntides);
		return dna;
	}

	public static DSDNA generateRandomDoubleStrandDNA(int length) {
		SSDNA ssdna = generateRandomSingleStrandDNA(length);
		DSDNA dsdna = new DSDNA(ssdna);
		return dsdna;
	}
}
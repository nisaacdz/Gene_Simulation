package units;

public class Cytosine extends Nucleobase {
	private final String baseID = "C";

	private final int connectionCode = 4;

	@Override
	public String getbaseID() {
		return baseID;
	}

	@Override
	public int getConnectionCode() {
		return connectionCode;
	}

}

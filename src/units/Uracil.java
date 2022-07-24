package units;

public class Uracil extends Nucleobase {
	private final String baseID = "U";

	private final int connectionCode = 3;

	@Override
	public String getbaseID() {
		return baseID;
	}

	@Override
	public int getConnectionCode() {
		return connectionCode;
	}

}

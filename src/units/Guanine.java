package units;

public class Guanine extends Nucleobase {
	private final String baseID = "G";

	private final int connectionCode = 2;

	@Override
	public String getbaseID() {
		return baseID;
	}

	@Override
	public int getConnectionCode() {
		return connectionCode;
	}

}

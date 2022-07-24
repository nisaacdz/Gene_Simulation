package units;

public class Thymine extends Nucleobase {

	private final String baseID = "T";

	public final int connectionCode = 3;

	@Override
	public String getbaseID() {
		return baseID;
	}

	@Override
	public int getConnectionCode() {
		return connectionCode;
	}

}

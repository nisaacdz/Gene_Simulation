package units;

public class Adenine extends Nucleobase {

	private final String baseID = "A";

	public final int connectionCode = 1;

	@Override
	public String getbaseID() {
		return baseID;
	}
	
	@Override
	public int getConnectionCode() {
		return connectionCode;
	}

}

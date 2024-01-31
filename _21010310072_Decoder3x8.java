package mimari;

public class _21010310072_Decoder3x8 {

	String[] decoder3x8 = { "10000000", "01000000", "00100000", "00010000", "00001000", "00000100", "00000010",
			"00000001" };

	String[] decoder3x8XYZ = { "000", "001", "010", "011", "100", "101", "110", "111" };

	private String giris;
	private String cikis;
	private String cikisDegeri;

	public _21010310072_Decoder3x8() {

	}

	public _21010310072_Decoder3x8(String giris, String cikis, String cikisDegeri) {
		super();
		this.giris = giris;
		this.cikis = cikis;
		this.cikisDegeri = cikisDegeri;
	}

	public String getCikis() {
		return cikis;
	}

	public void setCikis(String cikis) {
		this.cikis = cikis;
	}

	public String getCikisDegeri() {
		return cikisDegeri;
	}

	public void setCikisDegeri(String cikisDegeri) {
		this.cikisDegeri = cikisDegeri;
	}

	public String getGiris() {
		return giris;
	}

	public void setGiris(String giris) {
		this.giris = giris;
	}

	@Override
	public String toString() {
		return "Decoder3x8 [giris=" + giris + ", cikis=" + cikis + ", cikisDegeri=" + cikisDegeri + "]";
	}

}

package mimari;

public class _21010310072_Decoder4x16 {

	String[] decoder4x16 = { "0000000000000001", "0000000000000010", "0000000000000100", "0000000000001000",
			"0000000000010000", "0000000000100000", "0000000001000000", "0000000010000000", "0000000010000000",
			"0000000100000000", "0000001000000000", "0000010000000000", "0000100000000000", "0001000000000000",
			"0010000000000000", "0100000000000000" };

	String[] decoder4x16XYZW = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
			"1011", "1100", "1101", "1110", "1111" };

	private String giris;
	private String cikis;
	private String cikisDegeri;

	public _21010310072_Decoder4x16() {

	}

	public _21010310072_Decoder4x16(String giris, String cikis, String cikisDegeri) {

		this.giris = giris;
		this.cikis = cikis;
		this.cikisDegeri = cikisDegeri;
	}

	public String getGiris() {
		return giris;
	}

	public void setGiris(String giris) {
		this.giris = giris;
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

	@Override
	public String toString() {
		return "Decoder4x16 [giris=" + giris + ", cikis=" + cikis + ", cikisDegeri=" + cikisDegeri + "]";
	}

}

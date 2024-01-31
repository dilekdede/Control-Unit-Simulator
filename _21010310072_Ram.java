package mimari;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class _21010310072_Ram {

	static String[] decoder3x8;
	static String[] decoder3x8XYZ;
	static List<_21010310072_Decoder3x8> decoder3x8List = new ArrayList<>();
	static Integer counter = 0;

	public static void main(String[] args) throws IOException, InterruptedException {

		decoder3x8();

	}

	public static void decoder3x8() throws FileNotFoundException, InterruptedException {

		File myObj = new File("dosya.txt");
		Scanner myReader = new Scanner(myObj);
		String xyz = null;

		decoder3x8 = new _21010310072_Decoder3x8().decoder3x8;
		decoder3x8XYZ = new _21010310072_Decoder3x8().decoder3x8XYZ;

		for (int i = 0; i < decoder3x8.length; i++) {

			String giris = decoder3x8XYZ[i];
			String cikis = "D" + i;
			String cikisDegeri = decoder3x8[i];

			_21010310072_Decoder3x8 decoder = new _21010310072_Decoder3x8(giris, cikis, cikisDegeri);
			decoder3x8List.add(decoder);
		}

		while (myReader.hasNextLine() && counter <= 15) {
			String data = myReader.nextLine();
			xyz = data.substring(1, 4);

			char x = xyz.charAt(0);
			char y = xyz.charAt(1);
			char z = xyz.charAt(2);
			String giris = String.valueOf(x) + String.valueOf(y) + String.valueOf(z);
			String IR = data.substring(4, data.length());
			String I = String.valueOf(data.charAt(0));
			String buyrukTipi = getBuyruk(data);

			String decoder4x16 = decoder4x16(counter);
			decoderOutput(decoder4x16, giris, decoder3x8List, IR, I, buyrukTipi);
			counter++;

			Thread.sleep(2000);

		}

		myReader.close();
	}

	public static String decoder4x16(Integer counter) throws FileNotFoundException {

		String[] decoder4x16;
		String[] decoder4x16XYZW;
		decoder4x16 = new _21010310072_Decoder4x16().decoder4x16;
		decoder4x16XYZW = new _21010310072_Decoder4x16().decoder4x16XYZW;

		for (int i = 0; i < decoder4x16XYZW.length; i++) {
			String giris = decoder4x16XYZW[i];
			String cikis = "T" + i;
			String cikisDegeri = decoder4x16[i];
			_21010310072_Decoder4x16 decoder = new _21010310072_Decoder4x16(giris, cikis, cikisDegeri);

			String counterDeger = getHexaDecimalToCounter(counter);

			if (decoder.getGiris().equals(counterDeger)) {
				return cikis;
			}
		}
		return null;
	}

	public static void decoderOutput(String counter, String giris, List<_21010310072_Decoder3x8> liste, String IR,
			String I, String buyrukTipi) {

		for (_21010310072_Decoder3x8 decoder : liste) {

			if (decoder.getGiris().equals(giris)) {
				_21010310072_Decoder3x8 d = decoder;
				System.out.println(counter + " zamanında I=" + I + " " + d.getCikis() + " Aktif IR(11-0)= " + IR
						+ " buyruk= " + buyrukTipi);

			}
		}
	}

	public static String getHexaDecimalToCounter(Integer counter) {

		HashMap<String, String> hashMap = new HashMap<String, String>();

		String key = counter.toString();
		if (counter == 10) {
			key = "A";
		} else if (counter == 11) {
			key = "B";
		} else if (counter == 12) {
			key = "C";
		} else if (counter == 13) {
			key = "D";
		} else if (counter == 14) {
			key = "E";
		} else if (counter == 15) {
			key = "F";
		}

		hashMap.put("0", "0000");
		hashMap.put("1", "0001");
		hashMap.put("2", "0010");
		hashMap.put("3", "0011");
		hashMap.put("4", "0100");
		hashMap.put("5", "0101");
		hashMap.put("6", "0110");
		hashMap.put("7", "0111");
		hashMap.put("8", "1000");
		hashMap.put("9", "1001");
		hashMap.put("A", "1010");
		hashMap.put("B", "1011");
		hashMap.put("C", "1100");
		hashMap.put("D", "1101");
		hashMap.put("E", "1110");
		hashMap.put("F", "1111");

		return hashMap.get(key);
	}

	public static String getBuyruk(String data) {

		HashMap<String, String> hashMap = new HashMap<String, String>();

		hashMap.put("0000", "AND");
		hashMap.put("1000", "AND");
		hashMap.put("0001", "ADD");
		hashMap.put("1001", "ADD");
		hashMap.put("0010", "LDA");
		hashMap.put("1010", "LDA");
		hashMap.put("0011", "STA");
		hashMap.put("1011", "STA");
		hashMap.put("0100", "BUN");
		hashMap.put("1100", "BUN");
		hashMap.put("0101", "BSA");
		hashMap.put("1101", "BSA");
		hashMap.put("0110", "ISZ");
		hashMap.put("1100", "ISZ");

		hashMap.put("0111100000000000", "CLA");
		hashMap.put("0111010000000000", "CLE");
		hashMap.put("0111001000000000", "CMA");
		hashMap.put("0111000100000000", "CME");
		hashMap.put("0111000010000000", "CIR");
		hashMap.put("0111000001000000", "CIL");
		hashMap.put("0111000000100000", "INC");
		hashMap.put("0111000000010000", "SPA");
		hashMap.put("0111000000001000", "SNA");
		hashMap.put("0111000000000100", "SZA");
		hashMap.put("0111000000000010", "SZE");
		hashMap.put("0111000000000001", "HLT");
		hashMap.put("1111100000000000", "INP");
		hashMap.put("1111010000000000", "OUT");
		hashMap.put("1111001000000000", "SKI");
		hashMap.put("1111000100000000", "SKO");
		hashMap.put("1111000010000000", "ION");
		hashMap.put("1111000001000000", "IOF");

		String xyzw = data.substring(0, 4);
		String keyBellek = hashMap.get(xyzw);
		String keyYazac = hashMap.get(data);

		if (keyBellek != null && keyYazac == null) {
			return keyBellek;
		} else if (keyYazac != null && keyBellek == null)
			return keyYazac;

		return null;
	}

}

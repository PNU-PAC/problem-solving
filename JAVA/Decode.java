package ex;

import java.util.HashMap;
import java.util.Map;

public class Decode {
	//로컬 테스트용 map
	public static Map<String, String> MorseCode = new HashMap<String, String>() {
		{
			put("-.-.-.", ";");
			put("-...-", "=");
			put("---", "O");
			put("----.", "9");
			put("-..-.", "/");
			put(".-...", "&");
			put("...--", "3");
			put(".--", "W");
			put("--", "M");
			put("--..", "Z");
			put(".----.", "'");
			put("-.-.--", "!");
			put("-...", "B");
			put("..-", "U");
			put(".----", "1");
			put("-.--.-", ")");
			put(".-", "A");
			put("-....-", "-");
			put("...-", "V");
			put("...---...", "SOS");
			put("-.--", "Y");
			put("..", "I");
			put("--.-", "Q");
			put("-.", "N");
			put("..---", "2");
			put("-....", "6");
			put("---...", ";");
			put(".-.-.", "+");
			put(".--.-.", "@");
			put("....-", "4");
			put("-----", "0");
			put(".-.-.-", ".");
			put("-.-.", "C");
			put(".", "E");
			put("..-.", "F");
			put(".---", "J");
			put("-.-", "K");
			put(".-..", "L");
			put(".-.", "R");
			put("...", "S");
			put("--.", "G");
			put("---..", "8");
			put("..--..", "?");
			put("-.--.", "(");
			put(".--.", "P");
			put(".....", "5");
			put("..--.-", "_");
			put("-..", "D");
			put(".-..-.", "\"");
			put("-", "T");
			put("....", "H");
			put("--..--", ",");
			put("...-..-", "$");
			put("--...", "7");
			put("-..-", "X");
		}
	};

	public static String decode(String morseCode) {
		// your brilliant code here, remember that you can access the 
		// preloaded Morse code table through MorseCode.get(code)
		morseCode = morseCode.trim();
		String returnString = "";
		String[] splitArray = morseCode.split(" ");
		// 맨 마지막에 들어오는 공백도 인식하고 싶을 때는 split(" ",-1)
		int spaceCheck = 0;

		for (int i = 0; i < splitArray.length; i++) {

			if ( splitArray[i].isEmpty() && spaceCheck == 0) {
				returnString += " ";
				spaceCheck = 1;
			} else if( splitArray[i].isEmpty() ) {
				spaceCheck = 0;
			} else {
				returnString += MorseCode.get(splitArray[i]);
				spaceCheck = 0;
			}

			System.out.println(i + " : " + splitArray[i]);

		}

		return returnString;
	}

	public static void main(String[] args) {
		String morseCode = " .... . -.--   .--- ..- -.. .   .... . -.--   .--- ..- -.. .  ";
		System.out.println(decode(morseCode));
	}

}

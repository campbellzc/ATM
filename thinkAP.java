public class thinkAP {
	public static void main(String[] args) {
		//isAbecedarian("yolo");
		//isDupledrome("yyeett");
		captainCrunch("ab");
	}
	public static boolean isAbecedarian(String a) {
		for (int i = 0; i<a.length(); i++) {
			if (a.charAt(i) > a.charAt(i+1)) {
				System.out.println("False");
				return false;
			}
			
		}
		System.out.println("True");
		return true;
	}
	public static boolean isDupledrome(String a) {
		for (int i =0; i<a.length()-1; i++) {
			if ((a.charAt(i) == a.charAt(i+1)) && (a.charAt(i+1) != a.charAt(i+2))) {
				System.out.println("True");
				return true;
			}
		}
		System.out.println("False");
		return false;
	}
	public static String captainCrunch(String x) {
		String crunchy = new String();
		char z = 'z';
		char a = 'a';
		for (int i = 0; i<x.length(); i++) {
			
			if (x.charAt(i) + 13 > z) {
				crunchy = crunchy + String.valueOf((char)(a + (12 - (z - x.charAt(i)))));
			} else {
				crunchy = crunchy + String.valueOf((char)(x.charAt(i) + 13));
			}
		}
		System.out.println(crunchy);
		return crunchy;
	}
}
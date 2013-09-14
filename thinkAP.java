public class thinkAP {
	public static void main(String[] args) {
		//isAbecedarian("yolo");
		isDupledrome("yyeett");
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
}
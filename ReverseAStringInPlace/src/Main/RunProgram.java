package Main;

public class RunProgram {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(reverseString("CoreyYouWillReverseThisString"));
	}
	
	public static String reverseString(String string) {
		if (string.length() > 1) {
			return reverseString(string.substring(1, string.length())) + string.charAt(0);
		} else {
			return string;
		}
	}	
}

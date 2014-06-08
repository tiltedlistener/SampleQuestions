package runner;

public class Runner {
	
	public static String sample = "Hello there friend. Welcome to Argentina a land of tacolandpsychopath wonder!";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] parts = sample.split(" ");
		
		int len = parts.length;
		int i = 0;	
		int last = len - 1;
		while (i < len) {
			String a = parts[i];
			String b = parts[last];
			
			if (a.length() > b.length()) {
				parts[last] = a;
				parts[i] = b;
			}
			i++;
		}
		
		System.out.println(parts[last].length());
		System.out.println(parts[last]);
	}

}

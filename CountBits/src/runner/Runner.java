package runner;

public class Runner {

	/**
	 * @param 
	 */
	public static void main(String[] args) {
		String startingNum = Integer.toBinaryString(2147483647);

		if (startingNum.length() % 2 > 0)
			startingNum = "0" + startingNum;
		
		int result = countBits(startingNum);
		System.out.println(result);
	}
	
	public static int countBits(String statement) {
		int result = 0;
	    int mid = statement.length() / 2;
		
		String first = statement.substring(0, mid);
		String second = statement.substring(mid,statement.length());
		
		if (statement.length() > 2) {
			result = countBits(first) + countBits(second);
		} else {
			if (first.length() > 0)
				result = Integer.parseInt(first);
			
			if (second.length() > 0)
				result += Integer.parseInt(second);
		}
		return result;
	}

}

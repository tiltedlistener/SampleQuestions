package runner;

public class Runner {

	public static int[] sequence = {0, 5, 13, 19, 22, 41, 55, 68, 72, 81, 98};
	public static int target = 99;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result = analyzeArray(sequence);
		System.out.println(result);
	}
	
	public static int analyzeArray(int[] sequenceGroup) {
		
		int low = 0;
		int high = sequenceGroup.length - 1;
		
		while (low <= high) {
			int mid = low + (high - low)/2;
			if (sequenceGroup[mid] == target) {
				return mid;
			} else if (sequenceGroup[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

}

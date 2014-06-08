package runner;

import Composite.*;

public class runner {

	private static Leaf firstLeaf;
	private static Leaf secondLeaf;	
	private static Leaf thirdLeaf;	
	private static Leaf fourthLeaf;

	public static void main(String[] args) {
		Leaf thehead = buildList();
		// displayList(thehead);
		Leaf newHead = reverseList(thehead);
		displayListByParent(fourthLeaf);
		// displayList(fourthLeaf);
	}
	
	public static Leaf buildList() {
		firstLeaf = new Leaf("First");
		secondLeaf = new Leaf("Second");
		thirdLeaf = new Leaf("Third");
		fourthLeaf = new Leaf("Fourth");
		
		fourthLeaf.setParent(thirdLeaf);
		thirdLeaf.setChild(fourthLeaf);
		
		thirdLeaf.setParent(secondLeaf);
		secondLeaf.setChild(thirdLeaf);
		
		secondLeaf.setParent(firstLeaf);
		firstLeaf.setChild(secondLeaf);
		
		return firstLeaf;
	};
	
	public static void displayList(Leaf head) {
		System.out.println(head.soundOffName());
		if (head.hasChild()) {
			Leaf childLeaf = head.getChild();
			displayList(childLeaf);
		} else {
			System.out.println("END");
		}
	}
	
	public static void displayListByParent(Leaf currentChild) {
		if (currentChild.hasParent()) {
			displayListByParent(currentChild.getParent());
		} else {
			displayList(currentChild);
		}
	}
	
	
	public static Leaf reverseList(Leaf head) {	
		if (head.hasChild()) {
			Leaf childLeaf = head.getChild();
			Leaf lastInList = reverseList(childLeaf);	
			
			// Clear out previous settings
			head.setChild(null);
			head.setParent(null);			
			lastInList.setChild(null);
			
			// Reset "pointers"
			head.setParent(lastInList);
			lastInList.setChild(head);			
			
			// And finally, re-present the object
			return head;
		} else {
			head.setParent(null);
			return head;
		}
	}

}

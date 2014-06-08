package Composite;

public class Leaf {
	
	private String name;
	private Leaf child;
	private Leaf parent;
	
	public Leaf(String setName) {
		name = setName;
	}
	
	public String soundOffName() {
		return name;
	}
	
	public void setParent(Leaf newParent) {
		parent = newParent;
	}
	
	public Leaf getParent() {
		return parent;
	}
	
	public void setChild(Leaf newChild) {
		child = newChild;
	}
	
	public Leaf getChild() {
		return child;
	}

	public boolean hasChild() {
		return child != null;
	}
	
	public boolean hasParent() {
		return parent != null;
	}
	
}

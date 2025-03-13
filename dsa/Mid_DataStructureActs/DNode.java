
public class DNode {

	protected String element;         //string element stored by a node
	protected DNode next, prev;      //pointers to next and previous nodes
	
	//constructor that creates a node with given fields
	
	public DNode (String e, DNode p , DNode n) {
		
		element = e;
		prev = p;
		next = n;

	}
	
	//returns the element of this node
	public String getElement() {return element;}
	
	//returns the previous node of this node
	public DNode getPrev() {return prev;}
	
	//return the next node of this node
	public DNode getNext() {return next;}
	
	//sets the element of this node
	public void setElement(String newElem) { element = newElem;}
	
	//Set previous node of this node
	public void setPrev(DNode newPrev) {prev = newPrev; }
	
	//Sets the next node of this node
	public void setNext(DNode newNext) {next = newNext; }
}

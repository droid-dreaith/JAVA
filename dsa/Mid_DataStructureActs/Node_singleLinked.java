
public class Node_singleLinked {

	
	private String element;  //assume elements are character strings
	
	private Node_singleLinked next;    //creates a node with the given element and next node
	
	public Node_singleLinked(String s,Node_singleLinked n) {
		element = s;
		next = n;
	}
   //returns the element of this node
	public String getElement() {return element; }
	
	//return the next node of this node 
	public Node_singleLinked getNext() {return next; }
	
	//Modifier methods:
	
	//set's the element of this node
	public void setElement(String newElem) {element = newElem;}
	
	//Set the next node of this node
	public void setNext(Node_singleLinked newNext) {next = newNext;}
		
		
	
	}



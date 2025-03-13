
public class CircleList {

	protected Node cursor;    //current cursor
	protected int size;       //number of the nodes in the list
	
	//constructor that creates and empty list
	public CircleList() {
		cursor = null;
		size = 0;
		
	}
	
	//returns the current size
	public int size() 
	{return size;}
	
	public Node getCursor()
	{return cursor;}
	//moves cursor forward
	
	public void advance() {
		if (cursor != null )
		{cursor = cursor.getNext();}
	}
	//adds a node after the cursor
	
	public void add(Node newNode) {
		if (cursor == null ) { //list is empty
			newNode.setNext(newNode);
			cursor = newNode;
		}
		else {
			newNode.setNext(cursor.getNext());
			cursor.setNext(newNode);
			}
		size++;
		}
	//REMOVES THE NODE AFTER THE CURSOR
	public Node remove() {
		if (cursor == null) {
			return null; 
		}
		Node oldNode = cursor.getNext();
		if (oldNode == cursor) {
			cursor = null;
		} else {
			cursor.setNext(oldNode.getNext());
			oldNode.setNext(null);
		}
		size--;
		return oldNode;
	}
	
	//returns a string representation of the list,starting from the cursor
	 public String toString() {
	        if (cursor == null) return "[]";
	        StringBuilder s = new StringBuilder("[. . ." + cursor.getElement());
	        Node oldCursor = cursor;
	        advance();
	        while (oldCursor != cursor) {
	            s.append(", ").append(cursor.getElement());
	            advance();
	        }
	        return s + ". . .]";
	    }

	    // Node class
	    public static class Node {
	        private String element;
	        private Node next;

	        public Node(String element) {
	            this.element = element;
	            this.next = null;
	        }

	        public String getElement() {
	            return element;
	        }

	        public Node getNext() {
	            return next;
	        }

	        public void setNext(Node next) {
	            this.next = next;
	        }
	    }
	}
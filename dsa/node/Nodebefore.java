package node;

class Node {
	int data;
	Node next;
	
	Node(int x) {
		data = x;
		next = null;
	}
}

public class Nodebefore {

	
	
	static Node insertBeforeKey(Node head ,int key,int newData) {
		
		if (head == null) {
			return null;
		}
		if (head.data == key) {
			Node newNode = new Node(newData);
			newNode.next = head;
			return newNode;
		}
		
		Node curr = head;
		Node prev = null;
		
		while (curr != null && curr.data != key) {
			prev = curr;
			curr = curr.next;
		}
		
		if(curr !=null) {
			Node newNode = new Node(newData);
			prev.next=newNode;
			newNode.next = curr;
		}
		
		return head;
		
	}
	
	static void printList(Node node) {
		Node curr = node;
		while (curr != null) {
			System.out.print(curr.data +" ");
			curr = curr.next;
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		
		int newData = 6;
		int key = 2;
		
		head = insertBeforeKey(head,key,newData);
		
		printList(head);
	}

}

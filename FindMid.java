import java.util.*;

class Node 
{ 
    int data; 
    Node next; 
    Node(int d) 
    { 
        data = d; 
	    next = null; 
    } 
} 

class FindMid{

	public static Node head;

    public static void insert(int data) 
    { 
        Node new_node = new Node(data); 
        new_node.next = head; 
        head = new_node; 
    } 

  	public static void findMiddle(Node head){
  		Node slow = head; 
        Node fast = head; 
        if(head == null) 
        { 
            return;
        }
        while (fast != null && fast.next != null) 
        { 
        	// System.out.println(slow.data+" "+fast.data);
            fast = fast.next.next; 
            slow = slow.next; 
        } 
        System.out.println(slow.data);
  	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=n;i>0;i--){
			// int temp = sc.nextInt();
			insert(i);
		}
		findMiddle(head);
	}
}



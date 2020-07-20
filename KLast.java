/*
Given a Linked List and a number n, write a function that returns the value at the n’th node from the end of the Linked List.
*/

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

class KLast{

	public static Node head;

    public static void push(int data) 
    { 
        Node new_node = new Node(data); 
        new_node.next = head; 
        head = new_node; 
    } 

  	public static void findElement(Node head,int n){
  	   int cnt = 0;
       Node ptr = head;
       while(ptr!=null){
           if((cnt)==n){
               break;
           }
           cnt++;
           ptr = ptr.next;
       }
       if(ptr==null){
           System.out.println(-1);
       }
       // System.out.println(ptr.data);
       Node prev = head;
       ptr = ptr.next;
       while(ptr!=null){
           prev = prev.next;
           ptr = ptr.next;
       }
       System.out.println(prev.data);
  	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		for(int i=0;i<n;i++){
			// int temp = sc.nextInt();
			push(n-i);
		}
		findElement(head,k);
	}
}

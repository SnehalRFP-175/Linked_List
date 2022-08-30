package com.LinkedList.BridgeLabz;

public class LinkedList {  
	
	   public Node head = null;    
	   public Node tail = null;  
	   
    //Represention of the node  
    class Node
    {    
        int data;    
        Node next;    
            
        public Node(int data) 
        {    
            this.data = data;    
            this.next = null;    
        }    
    }    
                
    public void addNode(int data) 
    {    
        //Create a new node    
        Node newNode = new Node(data);    
              
        if(head == null) 
        {    
        	/*
        	 * If list is empty then both head & tail->new node
        	 */
            head = newNode;     
            tail = newNode;    
        }    
        else 
        {    
            //tail->next will point to newNode    
            tail.next = newNode;    
            //newNode-> tail of the list    
            tail = newNode;    
        }    
    }    
         
    public void displayList() 
    {    
        /*
         * Current node will point to head    
         */
        Node current = head;    
            
        if(head == null) 
        {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Linked List "); 
        
        while(current != null) 
        {       
            System.out.print(current.data ); 
            System.out.print("-->");
            current = current.next;    
        }    
        System.out.println("Null");    
    }    
           
}    

package com.LinkedList.BridgeLabz;

import com.LinkedList.BridgeLabz.LinkedList.Node;

/*
 * UC-2 Create Linked List By Adding 
 */
public class LinkedList_Main 
{
	private static final Node head = null;

	public static void main(String a[])
	{
		LinkedList List = new LinkedList();
		   
	        //Add nodes to the list    
	        List.addNode(56);       
	           
	        //Displays the nodes present in the list    
	        List.displayList(); 
	        
	        //append the list 
	        List.append(30);
	        List.append(70);
	        //Displays the List after appending the data 
	        List.displayList(); 
	}

}

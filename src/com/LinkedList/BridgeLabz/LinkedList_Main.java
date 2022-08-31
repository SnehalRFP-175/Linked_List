package com.LinkedList.BridgeLabz;

import java.util.Scanner;
/*
 * UC-5 Deleting the First Node of the Linked List
 */
public class LinkedList_Main  extends LinkedList
{
	
	public static void main(String a[])
	{
		LinkedList List = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int ch;
		
		while(true)
		{
			System.out.println("=========================================");
			System.out.println("1.Insert \n2.Append \n3.Insert In Between \n4.Display \n5.Delete First Node \n6.Exit" );
			System.out.println("Enter your choice:");
			
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter the Data :");
				int num=sc.nextInt();
				List.addNode(num);
				break;
			case 2:
				System.out.println("Enter the Data :");
				int appenddata = sc.nextInt();
				List.append(appenddata);
				break;
				
			case 3:
				System.out.println("Enter the Data :");
				int insert = sc.nextInt();
				List.insertBetween(head, insert);
				break;
				
			case 4:
				List.displayList();
				break;
				
			case  5:
				List.deleteFirstNode(head);
				break;
				
			case 6:
				System.out.println("Exited....!");
				return;
				
			default:
				System.out.println("Enter Valid Choice...!");
				break;
					
				
			}
		}
	          
	      
	}

}

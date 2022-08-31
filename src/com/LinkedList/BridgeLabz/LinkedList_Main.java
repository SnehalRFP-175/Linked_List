package com.LinkedList.BridgeLabz;

import java.util.Scanner;
/*
 * UC-4 Insert the node in Between
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
			System.out.println("1.Insert \n2.Append \n3.Insert In Between \n4.Display \n5.Exit" );
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
				
			case 5:
				System.out.println("Exited....!");
				return;
				
			default:
				System.out.println("Enter Valid Choice...!");
				break;
					
				
			}
		}
	          
	      
	}

}

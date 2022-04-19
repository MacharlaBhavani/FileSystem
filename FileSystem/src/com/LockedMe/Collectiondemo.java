package com.LockedMe;
import java.io.IOException;
import java.util.Scanner;
public class Collectiondemo{
	public static void main(String[] args) throws IOException{
	Scanner input=new Scanner(System.in);
	Demof fil = new Demof();
	int op;
	//op=input.nextInt();
	do {
	   System.out.println("LokedMe.com,Bhavani");
	   System.out.println("enter 1:file creation");
	   System.out.println("enter 2:file search");
	   System.out.println("enter 3:file deletion");
	   System.out.println("enter 4:print the all files of folder");
	   
	op=input.nextInt();
	switch(op) {
		case 1:
	         fil.filecreation();
		      break;
		case 2:
			fil.Search();
			break;
		case 3:
			fil.delete();
			break;
		case 4:
			fil.reading();
		    break;
       default:
		System.out.println("enter a valid no");
		
	   
	}
	 System.out.println("enter a value other than zero to continue");
     op=input.nextInt();
	
	}while(op!=0);
	
 }
}
	




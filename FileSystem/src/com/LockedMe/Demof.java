package com.LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Demof{
	   		  Scanner input=new Scanner(System.in);
		 public void filecreation() throws IOException{
			 File folder=new File("c:\\UserOfFiles");
			 folder.mkdirs();
		     String filename;
		     System.out.println("enter the desired file name");
			 filename =input.nextLine();
			 File file=new File(folder,filename);
    	    if(file.createNewFile()){
    	    	
    	    	System.out.println("file is created");
			 
			  }
    	 else{
    		 System.out.println("already file name exist try with another name");
				 }
  			 }
			public void Search() {
				 File folder=new File("c:\\UserOfFiles");
				 System.out.println("enter a file name");
				 String filename=input.nextLine();
				 File f=new File(folder,filename);
				 if(f.exists()) {
					 System.out.println(" file found");
				 }else {
					 System.out.println("file not found");
				 }
				 
			}
			public void delete() {
				File folder=new File("c:\\UserOfFiles");
				System.out.println("enter a file name");
				String filename=input.nextLine();
				File fn=new File(folder,filename);  
				if(fn.delete()) {
					
					System.out.println("file is deleted");
				}else {
					System.out.println("file is not deleted");
				}	
			}
	public void reading() {
		
		File folder=new File("C:\\UserOfFiles");
		File[] listOfFiles = folder.listFiles();
		 if (listOfFiles.length == 0) {
	            System.out.println("The directory is empty");
	        } else {
	            for (File file : listOfFiles) {
	            	if(file.isFile())
	                System.out.println(file.getName());
	            }

		
		    }
		}
	
}
	  
			
	

package project3;

import java.io.File;
import java.util.Scanner;
import static project3.FileCreationUtility.*;

public class FileCreation {
	
	
	public static void main(String[] args) {
		File file=null;
		
		FileCreationUtility utility = new FileCreationUtility();
		
		Scanner scan =new Scanner (System.in);
		
		
		Boolean input=true;
		
		do {
			
			System.out.println("PLEASE CHOOSE THE OPERATION YOU WANT TO PERFORM");
			
			System.out.println(" 1.CREATE A NEW FILE \n 2.WRITE INTO FILE \n 3.MODIFY THE CONTENTS \n 4.DELETE THE FILE \n5.EXIT");
			switch (scan.nextInt()) {
			case 1:{
				scan.nextLine();
				System.out.println("ENTER THE FILE NAME");
				
				
				file = utility.createFile(file,scan.nextLine());
				
				if (file!=null) {
					System.out.println("FILE SUCCESSFULLLY CREATED");
				} else {
					System.out.println("FILE  CREATION FAILED");	
				}
				
				break;}
			
			case 2:{
				scan.nextLine();
				System.out.println("PLEASE WRITE THE CONTENTS INTO THE FILE");
				utility.writeIntoFile(file,scan.nextLine());
				break;}

			case 3:{
				scan.nextLine();
				System.out.println("ADD THE CONTENTS");
				Boolean modify = utility.modify(file,scan.nextLine());
				
				if (modify) {
					System.out.println("MODIFICATION DONE SUCCESSFULLY");
				} else {
					System.out.println("MODIFICATION FAILED");

				}
				
				
				break;}
			
			case 4:{
				
				Boolean deleteTheFile = utility.deleteTheFile(file);
				
				if (deleteTheFile) {
					System.out.println("FILE DELETED SUCCESSFULLY");
				}
			break;}
			
			case 5:{
				
				input=false;
				break;}
			
			}
			
		} while (input);
		
	}

}

package project3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import project3.exception.FileNotExistsException;

public class FileCreationUtility {
	
	
	FileWriter writer;
	
	public  File createFile (File file,String path) {
		
		File file1=null;
		
		if (file==null) {
		 file1=new File(path+".txt");
			return file1;
		} else {
        
			System.out.println("FILE CREATED ALREADY");
		}
		return file1;
	}
	
	public void writeIntoFile(File file,String contents) {
		
	
		
		try {
			if (file!=null) {
				writer =new FileWriter(file);
				writer.write(contents);
				writer.close();
			} else {
				
				try {
					
					throw new FileNotExistsException ("CREATE THE FILE FIRST");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
		} catch (IOException e) {
			
			
		}
		
	}
	
	
	public Boolean modify(File file,String contents) {
		
		Writer  append=null;
		
		try {
			if (file!=null) {
				writer =new FileWriter(file,true);
				 append = writer.append(contents);
				 writer.close();
				return true;
	
			} else {
				
				try {
					
					throw new FileNotExistsException ("CREATE THE FILE FIRST");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
		} catch (IOException e) {
			
		}
		return false;
		
		
		
	}
	
	public Boolean deleteTheFile(File file) {
		

		if (file!=null) {
			file.delete();

			return true;
		} else {
			try {
				
				throw new FileNotExistsException ("CREATE THE FILE FIRST");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		return false;
		
		
		
	}
	
	
	

}

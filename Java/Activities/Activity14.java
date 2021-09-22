package activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args)throws IOException {
		
		try {
			/*File file = new File("src/session4/newfile.txt");
            boolean fStatus = file.createNewFile();
            if(fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }*/
 
            
            File fileUtil = FileUtils.getFile("src\\activities\\newfile.txt");
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));
 
            
            File destDir = new File("resources");
            
            FileUtils.copyFileToDirectory(fileUtil, destDir);
 
            //Get file from new directory
            File File1 = FileUtils.getFile(destDir, "newfile.txt");
            //Read data from file
            String File1Data = FileUtils.readFileToString(File1, "UTF8");
            //Print it
            System.out.println("Data in new file: " + File1Data);
        }
		catch(IOException errMessage) {
            System.out.println(errMessage);
		}

	}

}

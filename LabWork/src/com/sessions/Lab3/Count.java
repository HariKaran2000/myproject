package com.sessions.Lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class FileReader{
	
	public void displayFileData(String path) throws IOException {
		File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader br = new BufferedReader(inputStreamReader);
  
        String line;
        int wordCount = 0;
        int characterCount = 0;
        int LineCount = 0;
  
        while ((line = br.readLine()) != null) {
            if (line.equals("")) {
            }
            else {
                characterCount += line.length();
                String words[] = line.split("\\s+");
                wordCount += words.length;
                String sentence[] = line.split("[!?.:]+");
                LineCount += sentence.length;
            }
        }
        if (LineCount >= 1) {
        }
        System.out.println("Total word count = "+ wordCount);
        System.out.println("Total number of Lines = "+ LineCount);
        System.out.println("Total number of characters = "+ characterCount);
	}
}

public class Count {
public static void main(String[] args) throws IOException {
        
    	Scanner sc = new Scanner(System.in); 
    	System.out.print("Enter the file path : ");
    	String path = sc.nextLine();
    	FileReader fr = new FileReader();
    	fr.displayFileData(path);
    }

}

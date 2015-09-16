package com.iiitd.ap.project_1;
//@author Varun Bansal 2013168
//test file for file reading

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class test {
	private static ObjectInputStream ois;

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Student s = null;
		FileInputStream fin;
		try {
			fin = new FileInputStream("./src/db/data.txt");
			ois = new ObjectInputStream(fin);
			
			while((s= (Student) ois.readObject())!=null){
				if(s instanceof Student){
					System.out.println(s.getName());
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException ex) {  //This exception will be caught when EOF is reached
            System.out.println("End of file reached.");
		}catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
		
	}
}

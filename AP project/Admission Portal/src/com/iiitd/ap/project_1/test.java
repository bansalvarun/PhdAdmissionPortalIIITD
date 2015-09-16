package com.iiitd.ap.project_1;
//@author Varun Bansal 2013168
//test file for file reading

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
			s= (Student) ois.readObject();
			System.out.println(s.getName());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

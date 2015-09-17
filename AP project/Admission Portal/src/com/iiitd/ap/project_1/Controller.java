package com.iiitd.ap.project_1;

import java.time.LocalDate;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Controller {
	MainAdmin object;
	
	Student student = new Student();
	Student applicant = new Student();
	
	private static ObjectInputStream ois;
	@FXML
	private Button Submit;
	@FXML
	private ComboBox<String> combo1;
	@FXML
	private ComboBox<String> combo2;
	@FXML
	private ComboBox<String> combo3;
	@FXML
	private ComboBox<String> combo4;
	@FXML
	private ComboBox<String> combo5;
	@FXML
	private ComboBox<String> combo6;
	@FXML
	private ComboBox<String> combo7;
	@FXML
	private ComboBox<String> combo8;
	@FXML
	private ComboBox<String> combo9;
	@FXML
	private ComboBox<String> combo10;
	@FXML
	private TextField email;
	@FXML
	private TextField name;
	@FXML
	private TextField enrollment;
	@FXML
	private TextField univGrad;
	@FXML
	private TextField univPostGrad;
	@FXML
	private RadioButton male;
	@FXML
	private RadioButton female;
	@FXML
	private RadioButton yes;
	@FXML
	private RadioButton no;
	@FXML
	private RadioButton before;
	@FXML
	private RadioButton on;
	@FXML
	private RadioButton after;
	@FXML
	private ToggleGroup group1;
	@FXML
	private ToggleGroup group2;
	@FXML
	private ToggleGroup group3;
	@FXML
	private DatePicker DOB;
	@FXML
	private DatePicker ADF;
	@FXML
	private DatePicker ADU;
	
	public void control(MainAdmin a){
		this.object=a;
	}
	

	@FXML
	void  initialize(){
		
		combo1.getItems().clear();
		combo1.getItems().addAll("General","SC","ST","OBC","All");
		
		combo2.getItems().clear();
		combo2.getItems().addAll("Computer Science","Electronic and Communication","Computational Biology","All");
		
		combo3.getItems().clear();
		combo3.getItems().addAll("B.tech CSE","B.tech ECE","All");   //Help
		
		combo4.getItems().clear();
		combo4.getItems().addAll("Mtech","All");   // Help
		
		combo5.getItems().clear();
		combo5.getItems().addAll("CBSE","ICSE","State Board","All");
		
		combo6.getItems().clear();
		combo6.getItems().addAll("CBSE","ICSE","State Board","All");
		
		combo7.getItems().clear();
		combo7.getItems().addAll("1","2","3","4","All");
		
		combo8.getItems().clear();
		combo7.getItems().addAll("1","2","3","4","All");
		
		combo9.getItems().clear();
		combo9.getItems().addAll("1","2","3","4","All");
		
		combo10.getItems().clear();
		combo10.getItems().addAll("1","2","3","4","All");
		
	}
	
	@FXML
	void submitMethod(){
		submit();
		object.result();
	}
	
	
	@FXML
	void submit(){
		String line;
		String list[];
		student.setEmail(email.getText());
		
		student.setName(name.getText());
		//student.setRollnum(enrollment.getText());
		
		if(group1.getSelectedToggle()!=null){
			line=group1.getSelectedToggle().toString();
			list=line.split("'");
			student.setGender(list[1]);
		}
		
		student.setCategory(combo1.getValue());
		
		if(group2.getSelectedToggle()!=null){
			line=group2.getSelectedToggle().toString();
			list=line.split("'");
			student.setIsPhysicallyDisabled(list[1]);
			
		}
		
		/*if(group3.getSelectedToggle()!=null){
			line=group3.getSelectedToggle().toString();
			list=line.split("'");
			LocalDate date = DOB.getValue();
			student.setDob(date.toString());
			
		}
		*/
		
		
		student.setPhdStream(combo2.getValue());
		student.setGraduateDegree(combo3.getValue());
		student.setPostGraduateDegree(combo4.getValue());
		student.setxBoard(combo5.getValue());
		student.setXiiBoard(combo6.getValue());
		
		//no variable for Department
		//no variable for Department
		
		student.setGraduateUniversity(univGrad.getText());
		student.setPostGraduateCollege(univPostGrad.getText());
		student.setGraduateState(combo9.getValue());
		student.setPostGraduateState(combo10.getValue());
		
		
		LocalDate d1 = ADF.getValue();
		if(d1!=null){
			String D1 =d1.toString();
			
		}
		LocalDate d2 = ADU.getValue();
		if(d2!=null){
			String D2=d2.toString();
			
		}
		
		/////////
		
		try {
			applicant=read();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		///////// filters
		
		if(student.getEmail().equals("")){
			
		}
		else if(student.getEmail().equals(applicant.getEmail())){
			System.out.println("email match");
		}
		
		if(student.getName().equals("")){
			
		}
		else if(student.getName().equals(applicant.getName())){
			System.out.println("name match");
		}
		
		// Roll NO
		
		if(student.getCategory()==null){
			
		}
		else if(student.getCategory().equals(applicant.getCategory())){
			System.out.println("category match");
		}
		
		if(student.getGender()==null){
			
		}
		else if(student.getGender().equals(applicant.getGender())){
			System.out.println("gender match");
		}
		
		if(student.getIsPhysicallyDisabled()==null){
			
		}
		else if(student.getIsPhysicallyDisabled().equals(applicant.getIsPhysicallyDisabled())){
			System.out.println("PD match");
		}
		
		//// Date of Birth
		
		
		
		
		
		
		
		
		
		
	
	}
		
	Student read()throws IOException, ClassNotFoundException{
		
		Student temp;
		FileInputStream fin = new FileInputStream("./src/db/data.txt");
		ObjectInputStream ois = new ObjectInputStream(fin);
		temp= (Student) ois.readObject();
		ois.close();
		  
		return temp;
	}
	}
		
	
	


	
	


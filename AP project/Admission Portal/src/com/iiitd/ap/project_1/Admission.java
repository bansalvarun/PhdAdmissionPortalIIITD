package com.iiitd.ap.project_1;
//@author Varun Bansal 2013168
//Controller for Applicant view
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Admission {
	
	 @FXML
	    private TextField achievements;

	    @FXML
	    private AnchorPane anchorEI;

	    @FXML
	    private ComboBox<String> ecePref12;

	    @FXML
	    private ComboBox<String> getphd1;

	    @FXML
	    private TextField discipline;

	    @FXML
	    private ComboBox<String> getphd2;

	    @FXML
	    private TabPane tabpane;

	    @FXML
	    private ComboBox<String> getphd3;

	    @FXML
	    private GridPane educationGrid;

	    @FXML
	    private ToggleGroup Phydisabled;

	    @FXML
	    private AnchorPane myanchor;

	    @FXML
	    private GridPane personalInfoGrid;

	    @FXML
	    private ComboBox<String> state;

	    @FXML
	    private TextField xiiBoardMarks;

	    @FXML
	    private TextField pgYear;

	    @FXML
	    private TextField pincode;

	    @FXML
	    private Label errorsFeed;

	    @FXML
	    private ToggleGroup pgCGPA;

	    @FXML
	    private TextField gateYear;

	    @FXML
	    private Button saveEI;

	    @FXML
	    private TextField oadYear;

	    @FXML
	    private TextField xBoardMarks;

	    @FXML
	    private ComboBox<String> nationality;

	    @FXML
	    private DatePicker dob;

	    @FXML
	    private TextField uniName;

	    @FXML
	    private ToggleGroup gender;

	    @FXML
	    private TextField city;

	    @FXML
	    private TextField marksVal;

	    @FXML
	    private TextField pgDis;

	    @FXML
	    private TextField pgDegree;

	    @FXML
	    private TextField pgMarksVal;

	    @FXML
	    private TextArea errorsEi;

	    @FXML
	    private Tab educationTab;

	    @FXML
	    private TextField email;

	    @FXML
	    private Tab payTab;

	    @FXML
	    private ComboBox<Integer> xiiBoardYear;

	    @FXML
	    private TextField oadSubject;

	    @FXML
	    private ToggleGroup phd;

	    @FXML
	    private TextField pgCgpaVal;

	    @FXML
	    private Button cv;

	    @FXML
	    private GridPane feedbackGrid;

	    @FXML
	    private VBox compPG;

	    @FXML
	    private ToggleGroup cgpa;

	    @FXML
	    private CheckBox interest10;

	    @FXML
	    private CheckBox completedPG;

	    @FXML
	    private TextField oadName;

	    @FXML
	    private Tab piTab;

	    @FXML
	    private TextArea addressP;

	    @FXML
	    private TextField gateArea;

	    @FXML
	    private ComboBox<Integer> xBoardYear;

	    @FXML
	    private TextArea errorsPI;

	    @FXML
	    private Button sop;

	    @FXML
	    private ComboBox<Integer> graduateYear;

	    @FXML
	    private Tab submitTab;

	    @FXML
	    private CheckBox otherAD;

	    @FXML
	    private VBox ecePhd;

	    @FXML
	    private ChoiceBox<String> pgCgpaBasis;

	    @FXML
	    private TextField pgState;

	    @FXML
	    private TextField oadScore;

	    @FXML
	    private TextField degree;

	    @FXML
	    private TextField cgpaVal;

	    @FXML
	    private TextField collegeName;

	    @FXML
	    private CheckBox interest1;

	    @FXML
	    private TextField name;

	    @FXML
	    private CheckBox interest7;

	    @FXML
	    private CheckBox interest6;

	    @FXML
	    private CheckBox interest9;

	    @FXML
	    private CheckBox interest8;

	    @FXML
	    private CheckBox interest3;

	    @FXML
	    private CheckBox interest2;

	    @FXML
	    private CheckBox applyForPhd;

	    @FXML
	    private CheckBox interest5;

	    @FXML
	    private CheckBox interest4;

	    @FXML
	    private TextField gateScore;

	    @FXML
	    private Tab feedTab;

	    @FXML
	    private Button submit;

	    @FXML
	    private TextField pgThesis;

	    @FXML
	    private TextField father;

	    @FXML
	    private TextField gateMarks;

	    @FXML
	    private TextField pgName;

	    @FXML
	    private TextField xiiBoard;

	    @FXML
	    private VBox oad;

	    @FXML
	    private TextField xBoard;

	    @FXML
	    private ToggleGroup hear;

	    @FXML
	    private TextField pgCity;

	    @FXML
	    private ToggleGroup war;

	    @FXML
	    private TextField gateRank;

	    @FXML
	    private ComboBox<Integer> cgpabasis;

	    @FXML
	    private Button saveF;

	    @FXML
	    private TextArea addC;

	    @FXML
	    private CheckBox gateExam;

	    @FXML
	    private ComboBox<String> ecePref1;

	    @FXML
	    private TextField getMobile;

	    @FXML
	    private VBox gate;

	    @FXML
	    private ToggleGroup category;

	    @FXML
	    private ComboBox<String> ecePref3;

	    @FXML
	    private TextField rollnum;

	    @FXML
	    private Button savePI;

	    @FXML
	    private ComboBox<String> ecePref4;

	    @FXML
	    private TextField oadRank;
   

    int rolln = 2015000;
    Student register = new Student();
    
    @FXML void initialize() throws FileNotFoundException, IOException {
//    	System.out.println(selectionModel);
//    	selectionModel.select(1);
        //append format in the forFilter.txt

    	ecePhd.setVisible(false);
    	compPG.setVisible(false);
    	oad.setVisible(false);
    	gate.setVisible(false);
    	
    	educationGrid.getRowConstraints().get(17).setMaxHeight(0);
    	educationGrid.getRowConstraints().get(19).setMaxHeight(0);
    	educationGrid.getRowConstraints().get(21).setMaxHeight(0);
    	educationGrid.getRowConstraints().get(23).setMaxHeight(0);
    	
    	xBoardYear.getItems().clear();
        graduateYear.getItems().clear();
        xiiBoardYear.getItems().clear();        
        nationality.getItems().clear();
        cgpabasis.getItems().clear();
        state.getItems().clear();
        getphd1.getItems().clear();
        getphd2.getItems().clear();
        getphd3.getItems().clear();
        
        cgpabasis.getItems().clear();
        ecePref1.getItems().clear();
        ecePref12.getItems().clear();
        ecePref3.getItems().clear();
        ecePref4.getItems().clear();
        
        pgCgpaBasis.getItems().clear();
        
        String[] locales = Locale.getISOCountries();
        for (String countryCode : locales) {
            Locale obj = new Locale("", countryCode);
            nationality.getItems().add(obj.getDisplayCountry());
        }
        for(int i =0; i<36; i++){
        	xBoardYear.getItems().add(i+1980);
        	xiiBoardYear.getItems().add(i+1980);
        	graduateYear.getItems().add(i+1980);
        }
        state.getItems().addAll("Delhi", "Mumbai");
        getphd1.getItems().addAll("PhDoption1", "PhDoption2", "PhDoption3");
        getphd2.getItems().addAll("PhDoption1", "PhDoption2", "PhDoption3");
        getphd3.getItems().addAll("PhDoption1", "PhDoption2", "PhDoption3");
        
        cgpabasis.getItems().addAll(4,10);
        ecePref1.getItems().addAll("PhDoption1", "PhDoption2", "PhDoption3", "PhDoption4");
        ecePref12.getItems().addAll("PhDoption1", "PhDoption2", "PhDoption3", "PhDoption4");
        ecePref3.getItems().addAll("PhDoption1", "PhDoption2", "PhDoption3", "PhDoption4");
        ecePref4.getItems().addAll("PhDoption1", "PhDoption2", "PhDoption3", "PhDoption4");
        
        pgCgpaBasis.getItems().addAll("4","10");
        
        //getting the last rollnumber from rollno.txt
        File file = new File("./src/db/rollno.txt");        	
        String roll = "2015000";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
            	roll = line;
            }
        }catch (IOException e2) {
        	System.out.println("could not get roll number from rollno.txt");
        }
        rolln = Integer.parseInt(roll);
        rolln++;
        rollnum.setText(Integer.toString(rolln));
        
        
    }
    
	public void submitPI(){
        
        //getting the submitted details and checking
    	String myEmail = null;
    	myEmail = email.getText();	
    	String myName = name.getText();
    	String myAddC = addC.getText();
    	String myMobile = getMobile.getText();
    	RadioButton phdSt = (RadioButton)phd.getSelectedToggle();
    	String myPhdSt = null;
		if(phdSt!=null)
			myPhdSt = phdSt.getText();
		String phdAP1=null;
    	if(getphd1.getValue() != null)
    		phdAP1 = getphd1.getValue();
    	String phdAP2 = null;
    	if(getphd2.getValue() != null)
    		phdAP2 = getphd1.getValue();
    	String phdAP3 = null;
	    	if(getphd3.getValue() != null)
	    		phdAP3 = getphd1.getValue();
		RadioButton sgender = (RadioButton)gender.getSelectedToggle();    	
    	String myGender = null;
		if(sgender!=null)
			myGender = sgender.getText();
		RadioButton cate = (RadioButton)category.getSelectedToggle();    	
    	String myCategory = null;
		if(cate!=null)
			myCategory = cate.getText();    		
		RadioButton phyDisabled = (RadioButton)Phydisabled.getSelectedToggle();    	
    	String isPhyDisabled = null;
		if(phyDisabled!=null)
			isPhyDisabled = phyDisabled.getText();
    	LocalDate myDOB = null;
		if(dob.getValue()!=null)
			myDOB = dob.getValue();
		RadioButton cwdpAction = (RadioButton)war.getSelectedToggle();    	
    	String myWar = null;
		if(cwdpAction!=null)
			myWar = cwdpAction.getText();
    	String myFather = null;
    		myFather = father.getText();
    	String myNation = null;
    		myNation = nationality.getValue();
    	String myPerAdd = null;
    		myPerAdd = addressP.getText();
    	String myPin = null;
    		myPin = pincode.getText();
    	
    	ArrayList<String> errors = new ArrayList<String>();
    	
    	if(myEmail.isEmpty()){
    		errors.add("Add a valid email ID");
    	}
    	if(myName.isEmpty()){
    		errors.add("Add your name");    		
    	}
    	if(myAddC.isEmpty()){
    		errors.add("Add your Address of Correspondence");    		
    	}
    	if(myMobile.isEmpty()){
    		errors.add("Add your mobile number");    		
    	}
    	if(myPhdSt == null){
    		errors.add("Please select PhD Stream");
    		}
    	if(phdAP1==null){
    		errors.add("Select your 1st preference for PhD");    		
    	}
    	if(myGender==null){
    		errors.add("Select your Gender");    		
    	}
    	if(myCategory==null){
    		errors.add("Select your Category");    		
    	}
    	if(isPhyDisabled==null){
    		errors.add("Select Physically Disabled option");    		
    	}
//    	dob is not mandatory
//    	if(myDOB.){
//    		errors.add("Add your date of birth");    		
//    	}
    	if(myWar==null){
    		errors.add("'Children/War Widows of Defence Personnel killed/Disabled in Action' is mandatory");    		
    	}
    	if(myFather.isEmpty()){
    		errors.add("Add your Father's name");    		
    	}
    	if(myNation==null){
    		errors.add("Add your Nationality");    		
    	}
    	if(myPerAdd.isEmpty()){
    		errors.add("Add your Permenant Address");    		
    	}
    	if(myPin.isEmpty()){
    		errors.add("Add your Pin Code");    		
    	}
    	if(!myPin.isEmpty()){
    		@SuppressWarnings("unused")
			Integer op1;
			try {
			    op1 = Integer.parseInt(myPin);
			} catch (NumberFormatException e2) {
	    		errors.add("Enter a valid Pin Code");    						
			    op1 = 0;
			}
    	}
    	if(!errors.isEmpty()){
    		errorsPI.setText("Please fix the following errors first:");
    		for(int i=0; i<errors.size(); i++){
    			errorsPI.setText(errorsPI.getText()+"\n    >"+errors.get(i)+"!" );
    		}
    	}
    	else{
    		errorsPI.setStyle("-fx-text-fill: green;");
    		errorsPI.setText("Your Personal Information has been saved, please verify the details and contact admin in case of any probelm.");
    		register.setName(myName);
    		register.setEmail(myEmail);
    		register.setAddressOfCorrespondence(myAddC);
    		register.setMobile(myMobile);
    		register.setPhdStream(myPhdSt);
    		ArrayList<String>phdAP = new ArrayList<>();
    		phdAP.add(phdAP1);
    		phdAP.add(phdAP2);
    		phdAP.add(phdAP3);
    		register.setPhdAP(phdAP);
    		register.setGender(myGender);
    		register.setCategory(myCategory);
    		register.setIsPhysicallyDisabled(phyDisabled.getText());
    		register.setDob(myDOB);
    		register.setIsDP(myWar);
    		register.setFather(myFather);
    		register.setNation(myNation);
    		register.setPermanentAddress(myPerAdd);
    		register.setPinCode(Integer.parseInt(myPin));   	
    	}
    }

    public void submitEI(){
    	
    	ArrayList<String> errors = new ArrayList<String>();
    	
    	String myXBoard = null;
    	if(xBoard.getText()!=null)
    		myXBoard = xBoard.getText();
    	String myXMarks = null;
    	if(xBoardMarks.getText()!=null)
    		myXMarks = xBoardMarks.getText();
    	int myXPassYear = 0;
    	if(xBoardYear.getValue()!=null)
    		myXPassYear = xBoardYear.getValue();    	
    	String myXiiBoard = null;
    	if(xiiBoard.getText()!=null)
    		myXiiBoard = xiiBoard.getText();
    	String myXiiMarks = null;
    	if(xiiBoardMarks.getText()!=null)
    		myXiiMarks= xiiBoardMarks.getText();
    	int myXiiPassYear = 0;
    	if(xiiBoardYear.getValue()!=null)
    		myXiiPassYear = xiiBoardYear.getValue();    	
    	String myDegree = null;
    	if(degree.getText()!=null)
    		myDegree = degree.getText();
    	String myDescipline = null;
    	if(discipline.getText()!=null)
    		myDescipline = discipline.getText();
    	String myCollege = null;
    	if(collegeName.getText()!=null)
    		myCollege = collegeName.getText();
    	String myUni = null;
    	if(uniName.getText()!=null)
    		myUni = uniName.getText();
    	String myCity = null;
    	if(city.getText()!=null)
    		myCity = city.getText();
    	String myState = null;
    	if(state.getValue()!=null)
    		myState = state.getValue();
    	int myGraduateYear = 0;
    	if(graduateYear.getValue()!=null)
    		myGraduateYear  = graduateYear.getValue();
    	RadioButton cgpa_marks = (RadioButton)cgpa.getSelectedToggle();
		String myCgpaOrMarks = null;
    	if(cgpa_marks!=null)
    		myCgpaOrMarks = cgpa_marks.getText();

		int myCgpa = 0;
		if(myCgpaOrMarks=="CGPA"){
	    	if(cgpaVal.getText()!=null){
	    		try{
	    			String blah = cgpaVal.getText();
	    			myCgpa = Integer.parseInt(blah);
	    		}catch(NumberFormatException e){
	    			errors.add("Add cgpa value in graduation");
	    		}
	    	}
		}
    		

		int myCgpaBasis = 0;
		if(cgpabasis.getValue()!=null)
			myCgpaBasis = cgpabasis.getValue();
		int myMarks = 0;
		if(myCgpaOrMarks=="Marks"){
	    	if(marksVal.getText()!=null){
	    		try{
	    			String blah = marksVal.getText();
	    			myMarks= Integer.parseInt(blah);
	    			if(myMarks>100){
	    				errors.add("invalid marks in graduation");
	    			}
	    		}catch(NumberFormatException e){
	    			System.out.println("Invalid marks value");
	    			errors.add("Add marks in graduation");
	    			
	    		}	
	    	}
		}
    	boolean isEcePhd = applyForPhd.isSelected();
    	ArrayList<String> ecePhdPrefs = new ArrayList<>();
    	String ecePhdPref1 = null;
    	if(ecePref1.getValue()!=null){
    		ecePhdPref1 = ecePref1.getValue();
    		ecePhdPrefs.add(ecePhdPref1);
    	}
    	String ecePhdPref12 = null;
    	if(ecePref12.getValue()!=null){
    		ecePhdPref12 = ecePref12.getValue();
    		ecePhdPrefs.add(ecePhdPref12);
    	}
    	String ecePhdPref3 = null;
    	if(ecePref3.getValue()!=null){
    		ecePhdPref3 = ecePref3.getValue();
    		ecePhdPrefs.add(ecePhdPref3);
    	}
    	String ecePhdPref4 = null;
    	if(ecePref4.getValue()!=null){
    		ecePhdPref4 = ecePref4.getValue();
    		ecePhdPrefs.add(ecePhdPref4);
    	}
    	boolean isPG = completedPG.isSelected();
    	String myPgCollege = null;
    	if(pgName.getText()!=null)
    		myPgCollege = pgName.getText();
    	String myPgCity = null;
    	if(pgCity.getText()!=null)
    		myPgCity = pgCity.getText();
    	String myPgState = null;
    	if(pgState.getText()!=null)
    		myPgState = pgState.getText();
    	String myPgDis = null;
		if(pgDis.getText()!=null)
			myPgDis = pgDis.getText();
		String myPgDegree = null;
		if(pgDegree.getText()!=null)
			myPgDegree = pgDegree.getText();
		String myPgThesis = null;
		if(pgThesis.getText()!=null)
			myPgThesis = pgThesis.getText();
		String myPgYear = null;
		if(pgYear.getText()!=null)
			myPgYear = pgYear.getText();
		String myPgCgpaOrMarks = null;
		RadioButton blahblah = null;
		blahblah = (RadioButton)pgCGPA.getSelectedToggle();
		if(blahblah!=null){
			if(blahblah.getText()!=null)
				myPgCgpaOrMarks = ((RadioButton)pgCGPA.getSelectedToggle()).getText();
		}
		String myPgCgpa =null;
		if(pgCgpaVal.getText()!=null)
			myPgCgpa = pgCgpaVal.getText();
		String myPgCgpaBasis = null;
		if(pgCgpaBasis!=null)
			myPgCgpaBasis = pgCgpaBasis.getValue(); 
		String myPgMarks = null;
		if(pgMarksVal.getText()!=null)
			myPgMarks = pgMarksVal.getText();

//		other academic degree	
		boolean isOad = otherAD.isSelected();
		ArrayList<String> oad = new ArrayList<>();
		String myOadName = null;
		if(oadName.getText()!=null){
			myOadName = oadName.getText();
			oad.add(myOadName);
		}
		String myOadSubject = null;
		if(oadSubject.getText()!=null){
			myOadSubject = oadSubject.getText();
			oad.add(myOadSubject);
		}
		String myOadYear = null;
		if(oadYear.getText()!=null){
			myOadYear = oadYear.getText();
			oad.add(myOadYear);
		}
		
//    	Gate
		boolean myGate = gateExam.isSelected();
		if(myGate){
		String myGateArea = null;
		int myGateMarks = 0;
		int myGateYear = 0;
		int myGateScore = 0;
		int myGateRank = 0;
		if(gateArea.getText()!=null)
			myGateArea = gateArea.getText();
		if(gateMarks.getText()!=null){
			try{
				myGateMarks = Integer.parseInt(gateMarks.getText());
			}catch (NumberFormatException e){
				errors.add("Invalid Gate Marks");
			}
			
		}
		if(gateYear.getText()!=null){
			try{
				myGateYear = Integer.parseInt(gateYear.getText());
			}catch (NumberFormatException e){
				errors.add("Invalid Gate Year");
			}
		}
		if(gateScore.getText()!=null){
			try{
				myGateScore = Integer.parseInt(gateScore.getText());
			}catch (NumberFormatException e){
				errors.add("Invalid Gate Score");
			}
		}

		if(gateRank.getText()!=null){
			try{
				myGateRank = Integer.parseInt(gateRank.getText());
			}catch (NumberFormatException e){
				errors.add("Invalid Gate Rank");
			}
		}
		register.setGate(true);
		register.setGateArea(myGateArea);
		register.setGateMarks(myGateMarks);
		register.setGateScore(myGateScore);
		register.setGateRank(myGateRank);
		register.setGateYear(myGateYear);

		}
		String myAchievements = null;
		if(achievements.getText()!=null){
			myAchievements = achievements.getText();
			register.setAchievments(myAchievements);
		}
		if(myXBoard.isEmpty()){
			errors.add("Add Xth Board");
		}
		if(myXMarks.isEmpty()){
			errors.add("Add Xth Board Marks(%)");			
		}
		if(!myXMarks.isEmpty()){
			Float op1=(float) 92;
			try{
				op1 = (float)Float.parseFloat(myXMarks);
			}
			catch(NumberFormatException e){
				errors.add("Add Xth Board Marks in %age");				
			}
			if(op1 > 100.0)
				errors.add("Add Xth Board Marks in %age");
			op1 = (float)0;
		}
		if(myXPassYear==0){
			errors.add("Add Xth Pass Year");						
		}
		if(myXiiBoard.isEmpty()){
			errors.add("Add XIIth Board");
		}
		if(myXiiMarks.isEmpty()){
			errors.add("Add XIIth Board Marks(%)");			
		}
		if(!myXiiMarks.isEmpty()){
			Float op1=(float) 92;
			try{
				op1 = (float)Float.parseFloat(myXiiMarks);
			}
			catch(NumberFormatException e){
				errors.add("Add Xth Board Marks in %age");				
			}
			if(op1 > 100.0)
				errors.add("Add Xth Board Marks in %age");
			op1 = (float)0;
		}
		if(myXiiPassYear==0){
			errors.add("Add XIIth Pass Year");						
		}
		if(myDegree.isEmpty()){
			errors.add("Add your graduation Degree");
		}
		if(myDescipline.isEmpty()){
			errors.add("Add your graduation Department/Discipline");
		}
		if(myCollege.isEmpty()){
			errors.add("Add your graduation College");
		}
		if(myUni.isEmpty()){
			errors.add("Add your graduation University");
		}
		if(myCity.isEmpty()){
			errors.add("Add your graduation college city");
		}
		if(myState==null){
			errors.add("Add your graduation college state");
		}
		if(myGraduateYear==0){
			errors.add("Add your year of gradution");						
		}
		if(!errors.isEmpty()){
    		errorsEi.setText("Please fix the following errors first:");
    		for(int i=0; i<errors.size(); i++){
    			errorsEi.setText(errorsEi.getText()+"\n    >"+errors.get(i)+"!" );
//    			System.out.println(errors.get(i)+"!" );
    		}
		}
		else{
    		errorsEi.setStyle("-fx-text-fill: green;");
    		errorsEi.setText("Educational Information Submitted. Please Submit now.");
			register.setxBoard(myXBoard);
			register.setxMarks(Integer.parseInt(myXMarks));
			register.setxPassYear(myXPassYear);
			register.setXiiBoard(myXiiBoard);
			register.setXiiMarks(Integer.parseInt(myXiiMarks));
			register.setXiiPassYear(myXiiPassYear);
			register.setGraduateDegree(myDegree);
			register.setGraduateDis(myDescipline);
			register.setGraduateCollege(myCollege);
			register.setGraduateUniversity(myUni);
			register.setGraduateCity(myCity);
			register.setGraduateState(myState);
			register.setGraduateYear(myGraduateYear);
			if(myCgpaOrMarks=="CGPA"){
				register.setGraduateCGPA(true);
				register.setGraduateMarks(false);
				register.setGraduateCGPAVal(myCgpa);
				register.setGraduateCGPA_Basis(myCgpaBasis);
			}
			else{
				register.setGraduateMarks(true);
				register.setGraduateCGPA(false);
				register.setGraduateMarksVal(myMarks);
			}
			if(isEcePhd){
				register.setApplyECEPhD("true");
				register.setEcePhdPref(ecePhdPrefs);
			}
			else
				register.setApplyECEPhD("false");
			if(isPG){
				register.setIsPostGraduateCGPA(true);
				register.setPostGraduateDegree(myPgDegree);
				register.setPostGraduateCollege(myPgCollege);
				register.setPostGraduateCity(myPgCity);
				register.setPostGraduateState(myPgState);
				register.setPostGraduateDis(myPgDis);
				register.setPgThesis(myPgThesis);
				register.setPostGraduateYear(myPgYear);
//				pg cgpa marks are left
//				register.setIsPostGraduateCGPA();
//				register
				
			}
			else
				register.setIsPostGraduateCGPA(false);
			if(isOad){
				register.setOad(true);
				register.setOtherDegrees(oad);
			}
			else{
				register.setOad(false);
			}
			if(myGate){
			}
			else
				register.setGate(false);		
		}
		
    }
    
    public void submitFeedback(){    		
    }
    
    public void register() throws IOException, ClassNotFoundException{
		//read file to get the latest rollnumber
    	java.util.Date date= new java.util.Date();
    	register.setDate(new Timestamp(date.getTime()));
        File file = new File("./src/db/rollno.txt");        	
        String roll = "2015000";
        
    	//getting the last roll number from rollno.txt
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
            	roll = line;
            }
        }catch (IOException e2) {
        	System.out.println("could not read rollno.txt");
        }
        rolln = Integer.parseInt(roll);
        rolln++;
        
    	//append roll number in the rollno.txt
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("./src/db/rollno.txt", true)))) {
            out.println(rolln);
        }catch (IOException e) {
        	System.out.println("could not add roll number to rollno.txt");
        }
        
        ArrayList<Student> prevStudents = new ArrayList<>();
		ObjectInputStream ois = null;
		Student s = null;
		FileInputStream fin;
		try {
			fin = new FileInputStream("./src/db/data.txt");
			ois = new ObjectInputStream(fin);
			
			while((s= (Student) ois.readObject())!=null){
				if(s instanceof Student){
					System.out.println(s.getName());
					prevStudents.add(s);
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
		
	
	
        try{
    		FileOutputStream fout = new FileOutputStream("./src/db/data.txt");
    		ObjectOutputStream oos = new ObjectOutputStream(fout);
    		for(int i=0; i<prevStudents.size(); i++){
    			oos.writeObject(s);
    		}
    		oos.writeObject(register);
    		oos.close();
    		System.out.println("Done");
    		System.out.println(register.getName());
    		submit.setDisable(true);
    		   
    	   }catch(Exception ex){
    		   System.out.println("Could not write in data file");
    	   }
        
    }
 
    
    
    public void expandEcePhD(){
    	if(applyForPhd.isSelected()){
    		anchorEI.setPrefHeight(2500);
        	educationGrid.getRowConstraints().get(17).setMinHeight(200);
    		ecePhd.setVisible(true);
    	}
    	else{
        	educationGrid.getRowConstraints().get(17).setMinHeight(0);
    		ecePhd.setVisible(false);
    	}
    }
    public void expandPG(){
    	if(completedPG.isSelected()){
    		anchorEI.setPrefHeight(2500);
        	educationGrid.getRowConstraints().get(19).setMinHeight(400);
    		compPG.setVisible(true);
    	}
    	else{
        	educationGrid.getRowConstraints().get(19).setMinHeight(0);
    		compPG.setVisible(false);
    	}
    }
    public void otherAcademic(){
    	if(otherAD.isSelected()){
    		anchorEI.setPrefHeight(2500);
        	educationGrid.getRowConstraints().get(21).setMinHeight(200);
    		oad.setVisible(true);
    	}
    	else{
        	educationGrid.getRowConstraints().get(21).setMinHeight(0);
    		oad.setVisible(false);
    	}
    }
    public void gateExamFunc(){
    	if(gateExam.isSelected()){
    		anchorEI.setPrefHeight(2500);
        	educationGrid.getRowConstraints().get(23).setMinHeight(200);
    		gate.setVisible(true);
    		
    	}
    	else{
        	educationGrid.getRowConstraints().get(23).setMinHeight(0);
    		gate.setVisible(false);
    	}
    }

    

}

package com.iiitd.ap.project_1;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainAdmin extends Application {

	
	private Stage primaryStage;
	private BorderPane rootlayout;
	static final ObservableList<Student> data = FXCollections.observableArrayList();
	
	@Override
	
	
	public void start(Stage primaryStage) {
		this.primaryStage=primaryStage;
		this.primaryStage.setTitle("PhD Admissions Admin");
		try{
			FXMLLoader loader1 = new FXMLLoader();
			loader1.setLocation(MainAdmin.class.getResource("RootLayout.fxml"));
			rootlayout = (BorderPane)loader1.load();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
		Scene scene= new Scene(rootlayout);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		filter();
		
	}
	
	public void result(){
		
		
		try{
			FXMLLoader loader3 = new FXMLLoader();
			loader3.setLocation(MainAdmin.class.getResource("FilterResult.fxml"));
			AnchorPane filterresult = (AnchorPane)loader3.load();
			ControllerResult controller = loader3.getController();
			controller.control(this);
			rootlayout.setCenter(filterresult);
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void filter(){
		
		
		try{
			FXMLLoader loader2 = new FXMLLoader();
			
			loader2.setLocation(MainAdmin.class.getResource("FilterLayout.fxml"));
			AnchorPane filterlayout = (AnchorPane)loader2.load();
			Controller controller = loader2.getController();
			controller.control(this);
			rootlayout.setCenter(filterlayout);
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	



	public static void main(String[] args) {
		launch(args);
	}
}

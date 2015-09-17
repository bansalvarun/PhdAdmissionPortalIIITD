package com.iiitd.ap.project_1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
public class ControllerResult {
	@FXML
	private Button back;
	MainAdmin object;
	
	void control (MainAdmin a){
		this.object=a;
	}
	
	@FXML
	void backMethod(){
		object.filter();
	}
	
}

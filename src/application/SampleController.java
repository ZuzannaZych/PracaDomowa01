package application;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.scene.control.MenuBar;

public class SampleController {

	@FXML MenuItem exit;
	@FXML TextArea textArea;
	@FXML MenuItem help;
	@FXML Button loginbutt;
	@FXML TitledPane gry;
	@FXML TitledPane tajemnice;
	@FXML HBox dol;
	@FXML MenuBar menuu;
	@FXML TextField username;
	

	@FXML public void exitProgram(ActionEvent event) {
		menuu.setStyle("-fx-background-color : darksalmon");
		dol.setStyle("-fx-background-color : darksalmon");
			
		}

	@FXML public void helpProgram(ActionEvent event) {
		textArea.textProperty().set("You will not get help");

	}

	@FXML public void logIn(ActionEvent event) {
		loginbutt.setText("Log Out");
	}

	@FXML public void getUsername(ActionEvent event) {
		gry.setTextFill(Color.BLUEVIOLET);
		tajemnice.setTextFill(Color.DARKOLIVEGREEN);
	}
	
	
	
}

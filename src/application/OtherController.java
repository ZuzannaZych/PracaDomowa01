package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
/*import javafx.stage.Stage;*/

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class OtherController {

	/* private Stage mainStage; */
	protected Scene otherScene;
	@FXML TextArea textarea;
	@FXML BorderPane bp2;
	
	@FXML
	public void wroc(ActionEvent event) throws IOException {

		BorderPane pane = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
		bp2.getChildren().setAll(pane);
	}
	
 /*	public void setMainStage(Stage mainStage) {
		this.mainStage = mainStage;
		
	}

	public Scene getOtherScene() {
		return otherScene;
	}
	
	
	public void setOtherScene(Scene otherScene) {
		this.otherScene = otherScene;
		
	}

	@FXML public void zmien(ActionEvent event) {
		getMainStage().setScene(otherScene);
	}

	public Stage getMainStage() {
		return mainStage;
	}
	*/
}

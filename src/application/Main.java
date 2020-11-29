package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader firstSceneLoader = new FXMLLoader(getClass().getResource("Sample.fxml"));
			BorderPane firstSceneRoot = (BorderPane) firstSceneLoader.load() ;
			/*SampleController firstSceneController = firstSceneLoader.getController();*/
			Scene firstScene = new Scene(firstSceneRoot,640,480);
			
		/*	FXMLLoader secondSceneLoader = new FXMLLoader(getClass().getResource("Other.fxml"));
			BorderPane secondSceneRoot = (BorderPane) secondSceneLoader.load() ;
			OtherController secondSceneController = secondSceneLoader.getController();
			Scene secondScene = new Scene(secondSceneRoot,640,480);  
			
			firstSceneController.setMainStage(primaryStage); */
			firstScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	/*		firstSceneController.setOtherScene(secondScene); */
			
		/*	secondSceneController.setMainStage(primaryStage);
			secondScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			secondSceneController.setOtherScene(firstScene);
			*/
			
			primaryStage.setScene(firstScene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

package application;

import javafx.scene.control.Button;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class javaFX extends Application {
	private Button exitButton;
	private Label testLabel1;
	private Label testLabel2;
	private Scene scene = null;							// Scene contains all content
	private GridPane gridPane = null;					// Positions components within scene
	private TextField textField1 = null;
	private TextField textField2 = null;
	
	@Override
	public void start(Stage applicationStage) {		
		gridPane = new GridPane();						// Create an empty pane     
		scene = new Scene(gridPane);					// Create a scene containing the pane
		
		testLabel1 = new Label ("This is a test Label 1");
		testLabel2 = new Label("This is a test Label 2");
		
		textField1 = new TextField("This is a text Field 1");
		textField2 = new TextField("This is a text Field 2");
		textField1.setEditable(false);
		textField2.setEditable(false);
		
		textField1.setPrefColumnCount(22);  
      
		exitButton = new Button ("Exit");
		
		exitButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Platform.exit();
			}
		});
		
		gridPane.add(testLabel1, 0, 0);
		gridPane.add(textField1, 1, 0);
		gridPane.add(testLabel2, 0, 1);
		gridPane.add(textField2, 1, 1);
		gridPane.add(exitButton, 0, 2);
		
		applicationStage.setScene(scene);    			// Set window's scene  
		applicationStage.setTitle("JavaFX Practice");	// Set window's title
		applicationStage.show();						// Display window
	}
   
	public static void main(String [] args) {
		launch(args);									// Launch application
	}
}
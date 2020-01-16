package events;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MetersToFeetAndInches extends Application {
	private TextField tfCentimeters = new TextField();
	private TextField tfFeet = new TextField();
	private TextField tfInches = new TextField();

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create UI
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("Length in centimeters:"), 0, 0);
		gridPane.add(tfCentimeters, 1, 0);
		gridPane.add(new Label("Conversion to feet:"), 0, 1);
		gridPane.add(tfFeet, 1, 1);
		gridPane.add(new Label("Rest of inches:"), 0, 2);
		gridPane.add(tfInches, 1, 2);

		// Set properties for UI
		gridPane.setAlignment(Pos.CENTER);
		tfCentimeters.setAlignment(Pos.BOTTOM_RIGHT);
		tfFeet.setAlignment(Pos.BOTTOM_RIGHT);
		tfInches.setAlignment(Pos.BOTTOM_RIGHT);
		tfFeet.setEditable(false);
		tfInches.setEditable(false);

		// Create a scene and place it in the stage
		Scene scene = new Scene(gridPane, 400, 250);
		primaryStage.setTitle("Convertor"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		tfCentimeters.textProperty().addListener(ov -> {
			try {
				Double centimeters = Double.parseDouble(tfCentimeters.getText());
				int feet = (int) (centimeters.floatValue() / 30.48);
				double inches = (centimeters.floatValue() % 30.48) / 2.54;
				tfFeet.setText(((Integer) feet).toString());
				tfInches.setText(String.format("%.2f", inches));
			} catch (NumberFormatException e) {
				tfFeet.setText("0");
				tfInches.setText("0");
			}
		});

	}

}

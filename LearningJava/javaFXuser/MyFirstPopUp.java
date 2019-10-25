package javaFXuser;

import java.io.InputStream;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MyFirstPopUp extends Application {

	@Override
	public void start(Stage primaryStage) throws InterruptedException  {
		Button btOK = new Button("OK");
		Pane pane = new Pane();
		StackPane pane2 = new StackPane();
//		pane.setMinHeight(300);
//		pane.setMinWidth(300);
		pane.setStyle("-fx-rotate: 50;-fx-border-color:BLUE;-fx-background-color:RED");
		Circle circle = new Circle();
		circle.setRadius(50);
//		circle.setFill(Color.RED);
//		circle.setStroke(Color.BLACK);
		//CSS ish styling instead of java method call for each
		circle.setStyle("-fx-stroke: BLACK;-fx-fill:GREEN");
		circle.setCenterX(150);
		circle.setCenterY(150);
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(4));
		btOK.setRotate(-60);
		btOK.setLayoutX(50);
		btOK.setLayoutY(100);
		btOK.setStyle("-fx-color:BLUE");
		//This can be done also by changing the project source folder to something else and using
		//InputStream input = ClassLoader.getSystemResourceAsStream("Voles");
		//Image image = new Image(input);
		//Or just reference the path directly
		Image image = new Image("Voles");			
		ImageView imageView = new ImageView(image);
		pane.getChildren().add(imageView);
		pane.getChildren().add(btOK);	
		pane.getChildren().add(circle);
		
		
		
		//pane.getChildren().add(pane2);
		Scene scene = new Scene(pane,400,600);
		primaryStage.setTitle("This is soooooo outdated");
		primaryStage.setScene(scene);
		primaryStage.show();
		//Now this is some advanced shit right here for just waiting 10 seconds and then closing the app
		//The runnable thing can be replaced with a Lambda - I just don't know how :D
		final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
		executor.scheduleWithFixedDelay(new Runnable() {
	        @Override
	        public void run() {
	            randomTask();
	        }
	    } ,10,1,TimeUnit.SECONDS);
		
	}
	//Main not actually needed if your IDE or application has javafx support
	public static void main(String[] args) {
		Application.launch(args);
	}
	private static void randomTask(){
		System.exit(0);
	}
} 

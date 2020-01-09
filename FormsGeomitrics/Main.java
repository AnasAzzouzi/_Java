package FormsGeomitrice;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = new Pane();
			root.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));;
			//*************
			Button btn=new Button("Send");
			 btn.setLayoutX(190);
			    btn.setLayoutY(300);
			   btn.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent arg0) {
					System.out.println("helllllooo");
					
				}}); 
			//*****************
			   Line ln=new Line(40,230,360,130);
			   ln.setStroke(Color.BLACK);
			   ln.setStrokeWidth(10);
			    root.getChildren().add(ln);
			   
			//**********************
			  Line ln1=new Line(150,330,200,180);
			  ln1.setStroke(Color.BLACK);
			   ln1.setStrokeWidth(5);
			    root.getChildren().add(ln1);
			//***********************
			   Line ln2=new Line(200,180,250,330);
				  ln2.setStroke(Color.BLACK);
				   ln2.setStrokeWidth(5);
				    root.getChildren().add(ln2);
		    //************************
			   Circle c=new Circle(-10,-10,50);
			   c.setFill(Color.YELLOW);
			    root.getChildren().add(c);
		    //************************
			    Circle c2=new Circle(50,50,25);
				   c2.setFill(Color.ORANGE);
				   c2.setStrokeWidth(5);
				   c2.setStroke(Color.CORAL);
				   c2.setCenterY(195);
				    root.getChildren().add(c2);
				    
		    //**************************
				 Rectangle r=new Rectangle(50,50);  
				    root.getChildren().add(r);
				    r.setFill(Color.LIMEGREEN);
				    r.setStrokeWidth(5);
					r.setStroke(Color.GREEN);
					r.setLayoutX(300);
					r.setLayoutY(80);



			   
			 Scene scene = new Scene(root,400,400);
			primaryStage.setTitle("myapp");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}

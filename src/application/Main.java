package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
			primaryStage.setTitle("Play game");
			Button okBtn = new Button("Ok");
			Button cnclBtn = new Button("Cancel");
			Button srprsBtn = new Button("Surprise");
			
			GridPane grid=new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25,25,25,25));
			
			grid.setGridLinesVisible(true);
			
			HBox hbBtn=new HBox(20);
			hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
			hbBtn.getChildren().add(okBtn);
			hbBtn.getChildren().add(cnclBtn);
			hbBtn.getChildren().add(srprsBtn);
			grid.add(hbBtn,0,1);
			
			Scene scene = new Scene(grid,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {

		SidePanel sidePanel = new SidePanel();
		PaintSurface canvas = new PaintSurface(600, 550);
		BottomPanel bottomPanel = new BottomPanel();
		Group root = new Group();
		
		root.getChildren().add(canvas);
		root.getChildren().add(sidePanel);
		root.getChildren().add(bottomPanel);

		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Välkommen till Ritprogrammet!");
		primaryStage.show();
	}
}

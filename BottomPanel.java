import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class BottomPanel extends HBox {

    private Button clearButton;

    public BottomPanel() {
        setAlignment(Pos.CENTER);
        setSpacing(10);

        // Skapa knappen för att rensa ytan
        clearButton = new Button("Rensa");
        clearButton.setOnAction(event -> {
            // Rensa ytan på PaintSurface
            PaintSurface.getPaintSurface().clearCanvas();
        });

        getChildren().addAll(clearButton);
    }

}

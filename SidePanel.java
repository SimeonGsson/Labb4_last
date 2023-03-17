import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class SidePanel extends BorderPane {

    private static ColorPicker colorPicker;
    private Button[] colorButtons;

    public SidePanel() {
        // Skapa färgväljarkomponenten
        colorPicker = new ColorPicker();
        colorPicker.setPrefWidth(50);
        colorPicker.getStyleClass().add("button");

        // Skapa färgknapparna
        colorButtons = new Button[8];
        colorButtons[0] = createColorButton(Color.RED);
        colorButtons[1] = createColorButton(Color.ORANGE);
        colorButtons[2] = createColorButton(Color.YELLOW);
        colorButtons[3] = createColorButton(Color.GREEN);
        colorButtons[4] = createColorButton(Color.BLUE);
        colorButtons[5] = createColorButton(Color.PURPLE);
        colorButtons[6] = createColorButton(Color.WHITE);
        colorButtons[7] = createColorButton(Color.BLACK);

        // Lägg till färgväljarkomponenten och färgknapparna till panelen
//        VBox colorBox = new VBox(colorPicker);
//        colorBox.setAlignment(Pos.CENTER_RIGHT);
//        colorBox.setPadding(new Insets(10, 0, 10, 0));
//        VBox.setMargin(colorPicker, new Insets(0, 0, 10, 0));

        VBox buttonBox = new VBox(5, colorButtons);
        buttonBox.setAlignment(Pos.CENTER_RIGHT);
        buttonBox.setPadding(new Insets(10, 0, 10, 0));
        Text text = new Text("   Färg");

//      setTop(colorBox);
        setRight(buttonBox);
        setTop(text);
        setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, null, null)));

        // Lyssna på när användaren väljer en färg från färgväljarkomponenten
        colorPicker.setOnAction(event -> {
            Color selectedColor = colorPicker.getValue();
            // Uppdatera färgen för alla färgknappar
            for (Button button : colorButtons) {
                button.setBackground(new Background(new BackgroundFill(selectedColor, null, null)));
            }
        });
    }

    private Button createColorButton(Color color) {
        Button button = new Button();
        button.setPrefSize(50, 50);
        button.setBackground(new Background(new BackgroundFill(color, null, null)));
        button.setOnAction(event -> {
            // Uppdatera färgen i färgväljarkomponenten
            colorPicker.setValue(color);
        });
        return button;
    }

    public static Color getSelectedColor() {
    	return colorPicker.getValue();
}
}

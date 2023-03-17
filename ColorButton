import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ColorButton extends Canvas {

    private Color selectedColor;
    private Group colorButtonGroup;

    public ColorButton(double width, double height) {
        super(width, height);

        // Initialize the selected color to black
        selectedColor = Color.BLACK;

        // Create a group for the color buttons
        colorButtonGroup = new Group();

        // Draw the color buttons
        drawColorButtons();
    }

    public Color getSelectedColor() {
        return selectedColor;
    }

    private void setSelectedColor(Color color) {
        selectedColor = color;
        drawColorButtons(); // Repaint the color chooser to update the selected color indicator
    }

    private void drawColorButtons() {
        // Create an array of colors to be used for the color buttons
        Color[] colors = {
            Color.BLACK, Color.WHITE, Color.RED, Color.GREEN,
            Color.BLUE, Color.YELLOW, Color.ORANGE, Color.PINK
        };

        // Calculate the size of each color button
        double buttonWidth = getWidth() / colors.length;
        double buttonHeight = getHeight();

        // Draw each color button
        for (int i = 0; i < colors.length; i++) {
            Colorbutton button = new Colorbutton(colors[i], buttonWidth, buttonHeight);
            colorButtonGroup.getChildren().add(button);

            // Position the button based on its index in the array
            button.setLayoutX(i * buttonWidth);
        }
    }

    private class Colorbutton extends Canvas {

        private Color color;

        public Colorbutton(Color color, double width, double height) {
            super(width, height);
            this.color = color;

            setOnMouseClicked(event -> {
                setSelectedColor(color);
            });

            redraw();
        }

        private void redraw() {
            GraphicsContext gc = getGraphicsContext2D();
            gc.setFill(color);
            gc.fillRect(0, 0, getWidth(), getHeight());
            if (color.equals(selectedColor)) {
                gc.setStroke(Color.BLACK);
                gc.setLineWidth(2);
                gc.strokeRect(0, 0, getWidth(), getHeight());
            }
        }

        @Override
        public boolean isResizable() {
            return true;
        }

        @Override
        public double prefWidth(double height) {
            return getWidth();
        }

        @Override
        public double prefHeight(double width) {
            return getHeight();
        }

        @Override
        public double minWidth(double height) {
            return 10;
        }

        @Override
        public double minHeight(double width) {
            return 10;
        }

        @Override
        public void resize(double width, double height) {
            super.setWidth(width);
            super.setHeight(height);
            redraw();
        }
    }
}

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class PaintSurface extends Canvas {

    private static PaintSurface paintSurface;
    private GraphicsContext gc = getGraphicsContext2D();

    public PaintSurface(int width, int height) {
        super(width, height);
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, width, height);

        setOnMouseClicked(event -> {
            double x = event.getX();
            double y = event.getY();
            double radius = 20;
            Color color = SidePanel.getSelectedColor();
            paintCircle(x, y, radius, color);
        });
    }

    public static PaintSurface getPaintSurface() {
        return paintSurface;
    }

    public void clearCanvas() {
        gc.clearRect(0, 0, getWidth(), getHeight());
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, getWidth(), getHeight());
    }

    public void paintCircle(double x, double y, double radius, Color color) {
        gc.setFill(color);
        gc.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

}

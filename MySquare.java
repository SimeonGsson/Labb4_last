import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MySquare extends Shape {
    private double sideLength;

    public MySquare(double x, double y, double sideLength) {
        super();
        this.sideLength = sideLength;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillRect(x, y, sideLength, sideLength);
    }

    @Override
    public boolean contains(double x, double y) {
        return x >= this.x && x <= this.x + sideLength && y >= this.y && y <= this.y + sideLength;
    }
}

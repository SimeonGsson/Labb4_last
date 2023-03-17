import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    protected double x;
    protected double y;
    protected Color color;

    public Shape(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void draw(GraphicsContext gc);

    public abstract boolean contains(double x, double y);

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyTriangle extends Shape {

    private double x1, y1, x2, y2, x3, y3;

    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillPolygon(new double[]{x1, x2, x3}, new double[]{y1, y2, y3}, 3);
    }

    @Override
    public boolean contains(double x, double y) {
        // Här behöver du implementera koden för att testa om punkten (x, y) är inuti triangeln
        // Det finns flera sätt att göra detta, exempelvis genom att använda "point in triangle" algoritmen.
        return false;
    }
}

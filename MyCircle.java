import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;


public class MyCircle extends Shape {
	private double x;
	private double y;
	private double radie;
	
	public MyCircle(double x, double y, double radie) {
		this.x = x;
		this.y = y;
		this.radie = radie;
	}
	
	public void draw(GraphicsContext gc) {
		gc.setFill(Color.BLACK);
		gc.fillOval(x, y, 25, 25);
	}

	@Override
	public boolean contains(double x, double y) {
		// TODO Auto-generated method stub
		return false;
	}
}

import java.util.ArrayList;
import java.util.List;

public class Model {
	private List<MyCircle> MyCircle;
	
	public Model() {
		MyCircle = new ArrayList<>();
	}

	public void addCirkel(MyCircle cirkel) {
		MyCircle.add(cirkel);
	}
	
	public void clearCirklar() {
		MyCircle.clear();
	}
	
	public List<MyCircle> getCirklar() {
		return MyCircle;
	}
}

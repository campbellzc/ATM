import java.awt.Color;
import java.awt.Graphics;

public class AmericanFlag {
	private Rectangle redRec;
	public AmericanFlag(int width, int height, double scale) {
		//Rectangle redRec = new Rectangle(width, height, Color.red);
		this.width = width * scale;
		this.height = height * scale;
		this.redRec = new Rectangle(this.width, this.height, Color.red);
		

	}
}
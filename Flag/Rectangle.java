import java.awt.Color;
import java.awt.Graphics;

public class Rectangle {
	private int height;
	private int width;
	private Color color;
	public Rectangle(int width, int height, Color color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	public void draw(Graphics g, int x) {
		g.setColor(color);
		g.fillRect(0, x, width, height);
	}
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
}
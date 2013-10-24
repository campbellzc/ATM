import java.awt.Color;
import java.awt.Graphics;

public class Rectangle {
	private int height;
	private int width;
	private Color color;
	public rectangle(int width, int height, Color color) {
		this.width = width;
		this.length = length;
		this.color = color;
	}
	public draw(Graphics g, int x) {
		g.setColor(color);
		g.fillRect(0, x, width, height);
	}
	public getWidth() {
		return this.width;
	}
	public getLength() {
		return this.length;
	}
}
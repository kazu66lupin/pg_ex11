package ex1109;

public class Rectangle {
	final int INITIAL_WIDTH = 4;
	final int INITIAL_HEIGHT = 6;
	int width;
	int height;
	int x;
	int y;

	Rectangle() {
		this.width = INITIAL_WIDTH;
		this.height = INITIAL_HEIGHT;
		this.x = 0;
		this.y = 0;
	}

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		this.x = 0;
		this.y = 0;
	}

	Rectangle(int width, int height, int x, int y) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}

	void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}

	void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return "[" + x + "," + y + "," + width + "," + height + "]";
	}

	Rectangle intersect(Rectangle r) {
		int ax = Math.max(this.x, r.x);
		int ay = Math.max(this.y, r.y);
		int bx = Math.min(this.x + this.width, r.x + r.width);
		int by = Math.min(this.y + this.height, r.y + r.height);
		int w = bx - ax;
		int h = by - ay;
		if (w > 0 && h > 0) {
			return new Rectangle(ax, ay, w, h);
		} else {
			return null;
		}
	}
}

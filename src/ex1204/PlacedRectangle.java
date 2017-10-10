package ex1204;

public class PlacedRectangle extends Rectangle {
	int x;
	int y;

	PlacedRectangle() {
		setLocation(0, 0);
	}

	PlacedRectangle(int x, int y) {
		setLocation(x, y);
	}

	PlacedRectangle(int x, int y, int width, int height) {
		setLocation(x, y);
		this.width = width;
		this.height = height;
	}

	void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString(){
		return "[ (" + x + "," + y + ") [" + width + "," + height + "]]";
	}
}

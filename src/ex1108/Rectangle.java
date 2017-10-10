package ex1108;

public class Rectangle {
	int width;
	int height;

	void setSize(int w, int h) {
		if (w < 0) {
			w = 0;
		}
		if (h < 0) {
			h = 0;
		}
		width = w;
		height = h;
	}

	int getArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return "Rectangle(" + width + "," + height + ")";
	}
}

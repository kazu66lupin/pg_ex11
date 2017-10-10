package ex1107;

class Rectangle {
    int width;
    int height;
    void setSize(int w, int h) {
        width = w;
        height = h;
    }
    int getArea() {
        return width * height;
    }
    @Override
    public String toString(){
    	return "Rectangle(" + width + "," + height + ")";
    }
}

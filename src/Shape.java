public class Shape {

    protected double height;
    protected double width;
    protected double area;
    protected double perimeter;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
        this.area = calculateArea();
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter() {
        this.perimeter = calculatePerimeter();
    }

    public double calculateArea() {
        return area = getHeight() * getWidth();
    }

    public double calculatePerimeter() {
        return perimeter = 2 * (getHeight() + getWidth());
    }
}

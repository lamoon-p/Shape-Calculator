public class Circle extends Shape {

    private double radius = getHeight() / 2;

    public double getRadius() {
        return radius;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
        this.width = height;
        this.radius = height / 2;
    }

    @Override
    public void setWidth(double width) {
        this.height = width;
        this.width = width;
        this.radius = width / 2;
    }

    @Override
    public double calculateArea() {

        return area = Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double calculatePerimeter() {

        return perimeter =  2 * Math.PI * getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", height=" + height +
                ", width=" + width +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}

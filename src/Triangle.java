public class Triangle extends Shape {

    private double cSide;

    public double getCSide() {
        return cSide;
    }

    public void setCSide() {
        this.cSide = (Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getWidth(), 2)));
    }

    @Override
    public double calculateArea() {
        return getHeight() * getWidth() / 2;
    }

    @Override
    public double calculatePerimeter() {
        setCSide();
        return getHeight() + getWidth() + getCSide();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", cSide=" + cSide +
                '}';
    }
}

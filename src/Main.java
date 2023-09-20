public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape rectangle1 = new Rectangle();
        rectangle1.setWidth(5);
        rectangle1.setHeight(8);
        rectangle1.setArea();
        rectangle1.setPerimeter();

        System.out.println(rectangle1);

        Shape circle1 = new Circle();
        circle1.setHeight(9);
        circle1.setArea();
        circle1.setPerimeter();

        System.out.println(circle1);

        Shape triangle1 = new Triangle();
        triangle1.setWidth(6);
        triangle1.setHeight(9);
        triangle1.setArea();
        triangle1.setPerimeter();

        System.out.println(triangle1);
    }
}

public class Circle {

    private double radius;

    public Circle(double rad) {

        radius = rad;
    }

    public Circle() {
        radius = 0.0;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle with radius: " + radius;
    }
}

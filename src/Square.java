public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return this.side * this.side;
    }

    public String toString() {
        return "Square with side " + this.side;
    }
}

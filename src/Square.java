public class Square {
    private double side;
    public Square(double num){
        side = num;
    }
    public double calculateArea() {
        return side * side;
    }
    public String toString(){
        return "Square with side " + side;
    }
}
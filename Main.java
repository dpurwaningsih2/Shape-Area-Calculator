public class Main {
public static void main(String[] args) {
Circle circle = new Circle(7);
Square square = new Square(5);
Triangle triangle = new Triangle(10, 6);

System.out.println("Circle Area : " + circle.calculateArea());
System.out.println("Square Area : " + square.calculateArea());
System.out.println("Triangle Area : " + triangle.calculateArea());
}
}

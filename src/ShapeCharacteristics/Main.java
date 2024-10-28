package ShapeCharacteristics;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(6, "Blue", "White");
        Shape rectangle = new Rectangle(7, 5, "Blue", "Red");
        Shape triangle = new Triangle(9, 6, 4, "Yellow", "Brown");

        System.out.println("Круг:");
        circle.printCharacteristics();

        System.out.println("Прямоугольник:");
        rectangle.printCharacteristics();

        System.out.println("Треугольник:");
        triangle.printCharacteristics();
    }

}

package day10_abstraction;

public class AbstractionLogic {

    public static void main(String[] args) {

        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.display();
        shape1.draw();

        shape2.display();
        shape2.draw();
    }
}

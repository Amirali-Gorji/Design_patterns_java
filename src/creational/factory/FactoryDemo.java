package creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory factory=new ShapeFactory();

        // get an object of each shape (rectangle,circle,square)
        Shape shape1=factory.getShape(Shape.Type.CIRCLE);
        Shape shape2=factory.getShape(Shape.Type.RECTANGLE);
        Shape shape3=factory.getShape(Shape.Type.SQUARE);

        // call draw method of each shape

        // call draw method of circle
        shape1.draw();
        // call draw method of rectangle
        shape2.draw();
        // call draw method of square
        shape3.draw();
    }
}

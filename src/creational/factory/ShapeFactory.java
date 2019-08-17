package creational.factory;

import java.util.Objects;

public class ShapeFactory {
    // use getShape method to get object of type shape
    public Shape getShape(Shape.Type shapeType) {
        // check if the shapeType is null throw an Exception
        Objects.requireNonNull(shapeType);

        // the result shape
        Shape shape=null;

        // get object of the shape
        switch (shapeType){
            case RECTANGLE:{
                shape=new Rectangle();
                break;
            }
            case SQUARE:{
                shape=new Square();
                break;
            }
            case CIRCLE:{
                shape=new Circle();
                break;
            }
            default:{
                throw new IllegalArgumentException("The value of the shape type is not correct.");
            }
        }
        return shape;
    }
}

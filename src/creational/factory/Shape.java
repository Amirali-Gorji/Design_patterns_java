package creational.factory;

public interface Shape {
    void draw();
    enum Type{
        RECTANGLE,
        SQUARE,
        CIRCLE
    }
}

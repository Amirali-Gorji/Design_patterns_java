package creational.factory;

public class Circle implements Shape{
    int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public Circle(){
        this(1);
    }

    @Override
    public void draw() {
        System.out.println("This is a Circle( radius = "+radius+")");
    }
}

package creational.factory;

public class Square implements Shape{
    int width;
    public Square(int width){
        this.width=width;
    }
    public Square(){
        this(1);
    }
    @Override
    public void draw() {
        System.out.println("This is a Square ( width = "+width+")");
    }
}

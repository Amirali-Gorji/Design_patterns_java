package creational.factory;

public class Rectangle implements Shape{
    int width;
    int height;
    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
    public Rectangle(){
        this(1,1);
    }
    @Override
    public void draw() {
        System.out.println("This is a Rectangle (" +width+","+height+")");
    }
}

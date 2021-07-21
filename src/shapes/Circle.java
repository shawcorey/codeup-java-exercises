package shapes;

public class Circle  extends GraphicObject{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    void draw() {
        //this is where the implementation goes
        //this is where the actual action will be defined
        System.out.println("draw a circle by making a round line without" +
                                   "any corners");
    }

    @Override
    void resize() {
        System.out.println("Lets make the circle smaller");
    }

    @Override
    void fillColor() {
        System.out.println("Lets make the circle red");
    }
}
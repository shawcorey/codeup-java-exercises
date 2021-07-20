package shapes;

abstract class GraphicObject {
    //define member variables - variables that will/can be used by all
    // subclasses
    //define a shapes starting position x and y
    // step 4a
    int x, y;

    //non-abstract (regular) method can be implemented the same no
    // matter what the subclass is
    // step 4b

    void moveTo(int newX, int newY){
        System.out.printf("this shapes new coordinates  are: %s, %s",
                newX, newY);
    }



    //abstract methods, that can be used by every subclass of
    //GraphicObject, but will be implemented differently
    //step 4c:
    // draw, resize, fillColor

    abstract void draw();
    abstract void resize();
    abstract void fillColor();
}

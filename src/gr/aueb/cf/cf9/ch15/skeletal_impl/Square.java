package gr.aueb.cf.cf9.ch15.skeletal_impl;

public class Square extends AbstractRectangle {

    // Now accepts both width and height independently
    public Square(double width, double height) {
        setWidth(width);
        setHeight(height);
    }
}
package re.abstraction;

import java.io.Serializable;

public class Square extends Shape implements Draw, Serializable, Cloneable {
    int a;

    @Override
    public void calPerimeter() {
        System.out.println("Perimeter Square : " +4*a);
    }

    @Override
    public void calArea() {
        System.out.println("Area Square : " +a*a);
    }

    @Override
    public void drawTriangle() {
        System.out.println("Draw Square");
    }
}

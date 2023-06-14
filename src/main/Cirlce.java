package main;

public class Cirlce extends GraphicObject{
    @Override
    void draw() {
        System.out.println("Circle is Drawn");
    }

    @Override
    void resize() {
        System.out.println("Circle Size is changed");
    }
}

package main;

public abstract class GraphicObject {
    int x;
    int y;
    public int add(int x,int y){
        return x+y;
    }
    abstract void draw();
    abstract void resize();
}

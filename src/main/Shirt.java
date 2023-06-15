package main;

public class Shirt {
    private String color;
    private char size;

    public Shirt( String color, char size){
        this.color = color;
        this.size = size;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
}

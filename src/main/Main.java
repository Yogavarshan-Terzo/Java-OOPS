package main;

import users.Student;

public class Main {
    public static void main(String[] args) {
        Student yoga = new Student("Yogavarshan", (byte) 20,"Varusanadu,Theni");
        //yoga.display();
        System.out.println(yoga.secret);
        System.out.println(yoga.getAddress());
    }
}
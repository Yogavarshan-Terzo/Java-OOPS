package main;

public class Student {
    private String name;
    private int age;
    private String email;
    public Student(String name,int age,String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return "Name :"+this.name+"\nage :"+age+"\nemail :"+email;

    }
}

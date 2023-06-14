package users;

public class Student {
    String name;
    byte age;
    String address;

    public Student( String name, byte age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName( String name){
        this.name = name;
    }
    public void setAge(byte age){
        this.age = age;
    }
    public void setAddress(String Address){
        this.address = address;
    }
    protected String getName(){
        return name;
    }
    public byte getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    private void display(){
        System.out.println("Name :"+this.name+"\nAge :"+this.age+"\nAddress :"+this.address);
    }
    public String secret = "hahaha";

    public static void main(String[] args) {
        Student yoga = new Student("Yogavarshan", (byte) 20,"Varusanadu,Theni");
        yoga.display();
    }

}

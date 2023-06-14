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
    public String getName(){
        return name;
    }
    public byte getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public static void main(String []args){
        Student yoga = new Student("Yogavarshan", (byte)20, "Varusanadu,Theni.");
        System.out.println(yoga.getAddress());
    }

}

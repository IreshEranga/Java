public class Student {

    private String name;
    private int age;
    private String address;

    public Student()
    {
    }

    public Student(String name,int age, String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void showDetails()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Address : "+address);
    }
}

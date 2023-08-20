public class Student extends Person {

    private int nic;


    public Student(String name, int age, int nic)
    {
        super(name,age);
        this.nic = nic;

    }

    public void showDetails(){
        super.showDetails();
        System.out.println("NIC : "+nic);
    }

}

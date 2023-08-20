public class PartTimeStudent extends Student{
    private int workingHours;

    public PartTimeStudent(String name,int age, String address,int workingHours)
    {
        super(name,age,address);
        this.workingHours = workingHours;
    }

    public void showDetails()
    {
        super.showDetails();
        System.out.println("Working Hours : "+workingHours);
    }
}

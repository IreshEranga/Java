package lab03;

public class Test {
    public static void main(String[] args)
    {
        //create new objects
        Student std1 = new Student();
        Student std2 = new Student();

        std1.name = "Iresh";
        std1.ditNo = 123;
        std1.address = "asdfgh";

        std2.name = "Kamal";
        std2.ditNo=456;
        std2.address = "qwert";

        System.out.println("Name : "+std1.name+"\nDIT No : "+std1.ditNo+"\nAddress : "+std1.address);
        System.out.println("\nName : "+std2.name+"\nDIT No : "+std2.ditNo+"\nAddress : "+std2.address);
    }
}

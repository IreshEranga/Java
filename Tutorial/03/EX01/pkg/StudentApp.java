package pkg;
/*f) Create a separate class called StudentApp with the main method.
*/
public class StudentApp {
    public static void main(String[] args)
    {
        /*g) Create an array of Student objects. Instantiate 5 Student objects using the constructors
and the setters you have developed.*/
        Student[] students = new Student[5];

        students[0] = new Student("Iresh","SE","123");
        students[1] = new Student("Eranga","ISE","1245683");
        students[2] = new Student("Saman","SEop","14563");
        students[3] = new Student("Kosala","SITE","124597773");
        students[4] = new Student("Kusum","It","1113");

        /*h) Display the details of all the 5 students making use of the for loop.*/
        for(int i=0;i<5;i++)
        {
            students[i].print();
        }
    }
}

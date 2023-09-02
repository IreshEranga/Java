package pkg;

import java.sql.SQLOutput;

public class StudentApp {
    public static void main(String[] args)
    {
       /* int[] students;
        //int students[];
        students = new int[5];*/

        Student[] students = new Student[5];

        students[0] = new Student("Alice", "Computer Science", "123-456-7890");
        students[1] = new Student("Bob", "Mathematics", "987-654-3210");
        students[2] = new Student("Charlie", "Physics", "555-123-4567");
        students[3] = new Student("David", "Chemistry", "111-222-3333");
        students[4] = new Student("Eve", "Biology", "999-888-7777");

        for(int i = 0; i< students.length;i++)
        {
            System.out.println("Student "+(i+1)+" Details \n");
            students[i].print();
        }
    }
}

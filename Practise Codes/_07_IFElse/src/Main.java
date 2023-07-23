public class Main{

    public static void main(String[] args){

        int age=20;

        if(age > 18){
            System.out.println("You are adult");
        }
        else{
            System.out.println("You are not adult");
        }

        int time = 16;

        if(time < 12)
        {
            System.out.println("Good Morning!!");
        }
        else{
            System.out.println("Good Evening!!");
        }

        int marks=55;

        if(marks >= 75)
        {
            System.out.println("Grade : A");
        }
        else if(marks >=65)
        {
            System.out.println("Grade : B");
        }
        else if(marks >=55)
        {
            System.out.println("Grade : C");
        }
        else{
            System.out.println("Grade : F");
        }
    }
}
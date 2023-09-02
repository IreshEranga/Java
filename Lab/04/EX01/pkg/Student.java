package pkg;

public class Student {

    private static int max = 100;
    private int StudentId;
    private String name;
    private String degree;
    private String mobile;

    public Student(String name,String degree, String mobile)
    {
        StudentId = max++;
        this.name = name;
        this.degree = degree;
        this.mobile = mobile;
    }


    public void print() {
        System.out.println("Student ID: " + StudentId);
        System.out.println("Name: " + name);
        System.out.println("Degree: " + degree);
        System.out.println("Mobile: " + mobile);
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    public String getName()
    {
        return name;
    }

    public String getDegree()
    {
        return degree;
    }

    public String getMobile()
    {
        return mobile;
    }

    

}



public class Student {
    String name;
    int ditNo;
    String address;


    //constructor
    public Student()
    {

    }
    public Student(String name, int nditNo, String address)
    {
        this.name = name;
        ditNo = nditNo;
        this.address = address;

        //If we use same variable that we declared in class to the constructor then we show it with this keyword
        //otherwise we dont need this keyword



    }


    //mutator methods
    public void setName(String newName)
    {
        name = newName;
    }
    public void setDitNo(int newDit)
    {
        ditNo = newDit;
    }
    public void setAddress(String adrs)
    {
        address = adrs;
    }

    public String getName()
    {
        return name;
    }
    public int getDitNo()
    {
        return ditNo;
    }
    public String getAddress()
    {
        return address;
    }

    public String getDetails()
    {

       return  "I am a Student\nMy name is "+getName()+"\nI an from "+getAddress()+"\nMy DIT number is "+getDitNo();

    }
}

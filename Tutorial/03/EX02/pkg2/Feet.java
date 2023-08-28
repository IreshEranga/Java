package pkg2;

public class Feet {

    private int feet;
    private int inches;

    public Feet()
    {

    }
    public Feet(int feet, int inches)
    {
        this.feet = feet;
        this.inches = inches;
    }

    public void add(Feet f1, Feet f2)
    {
       int totalInches = f1.feet*12 + f1.inches + f2.feet*12 + f2.inches;
       this.feet = totalInches/12;
       this.inches = totalInches%12;
    }

    public void print()
    {
        System.out.println(feet+"'"+inches+"'");
    }

    public void print(String msg)
    {
        System.out.println(msg+feet+"'"+inches+"'");
    }

    public Feet(Feet len)
    {
        this.feet = len.feet;
        this.inches = len.inches;
    }

    public void add(Feet f1)
    {
        int totalInches = this.feet*12 + this.inches + f1.feet*12 + f1.inches;
        this.feet = totalInches/12;
        this.inches = totalInches%12;
    }

    public static void print(Feet f)
    {
        System.out.println(f.feet+"'"+f.inches+"'");
    }

    public static Feet add(Feet f1, Feet f2, Feet f3)
    {
        int totalInches = f1.feet * 12 + f1.inches + f2.feet * 12 + f2.inches + f3.feet * 12 + f3.inches;
        int feet = totalInches / 12;
        int inches = totalInches % 12;
        return new Feet(feet, inches);
    }
}

package pkg2;

public class Main {
    public static void main(String[] args)
    {
        Feet myLength = new Feet(5,6);
        myLength.print();

        myLength.print("Length : ");

        Feet newLength = new Feet(6,7);
        myLength.add(newLength);
        myLength.print();

        Feet.print(myLength);


        Feet f1 = new Feet(1,0);
        Feet f2 = new Feet(2,6);
        Feet f3 = new Feet(3,9);
        Feet f5 = Feet.add(f1, f2, f3);
        f5.print();

    }
}

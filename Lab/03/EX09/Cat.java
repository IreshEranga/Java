public class Cat extends Pet{
    private int livesLeft;

    public Cat(String n, String o, int l)
    {
        super(n,o);
        this.livesLeft = 7;
    }
    public Cat(String n, String o, int a, int l)
    {
        super(n,o,a);
        this.livesLeft = l;
    }

    //@Override
    public void showDetails() {
        super.showDetails();
        System.out.println("lifes left "+this.livesLeft);
    }
}

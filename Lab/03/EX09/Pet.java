public class Pet {
    private String name;
    private String owner;
    private int age;

    public Pet(String n, String o)
    {
        this.name = n;
        this.owner = o;
        this.age = 0;
    }
    public Pet(String n, String o, int a)
    {
        this.name = n;
        this.owner = o;
        this.age = a;
    }

    public void showDetails(){
        System.out.println("I am pet. My name is "+this.name+". My owner is "+this.owner+" Age "+this.age);

    }
}

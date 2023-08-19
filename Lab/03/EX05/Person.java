public class Person {
    String name;
    String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void showDetails(){
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
    }
}

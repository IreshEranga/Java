public class BankApp {
    public static void main(String[] args){

        BankAccount b1 = new BankAccount(123456,"Iresh",4500);
        BankAccount b2 = new BankAccount(456789, "Kamal", 1200);

        b1.displayDetail();
        b1.withdraw(200);
        b2.displayDetail();

    }
}

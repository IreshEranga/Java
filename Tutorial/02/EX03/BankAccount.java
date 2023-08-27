public class BankAccount {

    private int accountNum;
    private String holderName;
    private float balance;

    BankAccount(){};

    BankAccount(int accnum, String hname, float bal){
        accountNum = accnum;
        holderName = hname;
        balance = bal;
    }

    public float getbalance(){
        return balance;
    }

    public void setbalance(float balance)
    {
        this.balance = balance;
    }

    public void deposit(float amount)
    {
       // int balance = 0;
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit Successfull!. New balance : "+balance);
        }else{
            System.out.println("Invalid amount for deposit");
        }

        //return balance;
    }

    public void withdraw(float amount)
    {
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw Successfull!. New balance : "+balance);
        }else{
            System.out.println("Invalid amount for withdraw");
        }



    }

    public void displayDetail(){
        System.out.println("Account Number : "+accountNum+"\nAccount holders name : "+holderName+"\nBalance : "+balance);
    }
}

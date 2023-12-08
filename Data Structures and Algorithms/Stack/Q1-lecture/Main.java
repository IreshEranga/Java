public class Main {
    public static void main(String[] args) {

        stackX myStack = new stackX(10);

        myStack.push(30);
        myStack.push(80);
        myStack.push(100);
        myStack.push(25);



        while(!myStack.isEmpty()){

            double val = myStack.pop();
            System.out.println(val);
            System.out.println();
        }
    }
}

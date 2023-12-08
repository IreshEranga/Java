

//stack implementation
public class stackX {

    private double[] stackArray;
    private int maxSize;
    private int top;


    public stackX(int maxSize) {

        this.maxSize = maxSize;
        stackArray = new double[maxSize];
        top = -1;

    }

    public void push(double j){

        if(top == maxSize-1)
        {
            System.out.println("Stack is full");
        }
        else {
            top++;
            stackArray[top] = j;
        }
    }

    public double pop(){

        if(top == -1){
            return -99;
        }
        else
            return stackArray[top--];
    }

    public double peek(){

        if(top == -1)
            return -99;
        else
            return stackArray[top];
    }

    public boolean isEmpty(){

        return (top == -1);
    }

    public boolean isFull(){

        return (top == maxSize - 1);
    }
}

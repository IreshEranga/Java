package pkg;

public class stackX {

    private int top;
    private int maxSize;
    private char[] stackArr;

    //constructor
    public stackX(int s){

        maxSize = s;
        top = -1;
        stackArr = new char[maxSize];
    }

    //push method
    public void push(char j){

        if(top == maxSize-1)
            System.out.println("Stack is full");
        else{
            top++;
            stackArr[top] = j;
        }

    }

    //pop method
    public char pop(){

        if(top == -1){
            System.out.println("Stack is empty");
            return (char) -99;
        }
        else{
            return stackArr[top--];

        }
    }

    //peek method
    public char peek(){

        if(top == -1){
            System.out.println("Stack is empty");
            return (char) -99;
        }
        else{
            return stackArr[top];
        }
    }

    //isEmpty method
    public boolean isEmpty(){

        return top == -1;
    }


    //isFull method
    public boolean isFull(){

        return top == maxSize - 1;
    }


    //display method
    public void display(){

        int i = top;

        while(i != -1){

            System.out.println(stackArr[i]+" "+i--);
        }
    }
}

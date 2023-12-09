package pkg;
import  java.util.Stack;
public class Main {
    public static void main(String[] args){

        stackX st1 = new stackX(10);
        stackX st2 = new stackX(10);

        char[] st = new char[]{'3', '+', '(', '6', '*', '2', ')', '-', '3', ')'};
        //1
        st1.push('I');
        st1.push('R');
        st1.push('E');
        st1.push('S');
        st1.push('H');

st1.display();
        System.out.println();
        //display stack
        while(!st1.isEmpty()){

            char val = st1.pop();
            System.out.println(val);
        }

        int j = 0;
        boolean check = false;

        while(j != st.length){

            if('(' == st[j]){
                st2.push('(');
            }
            else if(')' == st[j]){
                st2.pop();
                check = true;
            }

            j++;

        }

    }
}

public class Main{

    public static void main(String[] args){

        int num1=5;
        int num2 = 3;
        int tot = num1+num2;

        System.out.println("Addition of numbers : "+tot);
        System.out.println("Subtraction of numbers  : "+(num1-num2));
        System.out.println("Multiplication of numbers  : "+(num1*num2));
        System.out.println("Division of numbers  : "+(num1/num2));
        System.out.println("Remainder of numbers  : "+(num1%num2));
        System.out.println("num1++ = "+(num1++));
        System.out.println("num1 = "+(num1));

        //logical operators
        System.out.println(num1 > 4 && num2 < 2);
        System.out.println(num1 > 4 || num2 < 2);


        //bitwise operator
        System.out.println(num1&num2);
        //for XOR we use ^
    }
}
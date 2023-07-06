public class Main{

    public static void main(String[] args){

        //type casting
        /*Type casting is when you assign a value of one premitive data type to another
        type
         */

        //widening (Automatic)
        /*byte -> short -> char -> int -> long -> float -> double*/

        //narrowing casting
        /* vise versa of widening */
        /*double -> float -> long -> int -> char -> short -> byte*/

        int num = 3;
        double num2 = num;

        System.out.println("Integer data type : "+num);
        System.out.println("Double data type : "+num2);

        //narrowing casting
        double number = 45.28;
        int numm = (int)number;

        System.out.println("Double value : "+number);
        System.out.println("Narrow cast value in int : "+numm);

        int x=10;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x);
    }
}
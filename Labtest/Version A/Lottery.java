import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Lottery {

    int[] lotteryNumbers = new int[5];
    int[] userNumbers = new int[5];
    ArrayList<Integer> al = new ArrayList<Integer>();
    Random rd = new Random();

    //constructor
    public Lottery(){

        for(int i = 0; i < 5; i++){
            lotteryNumbers[i] = rd.nextInt(9);
        }
    }

    public void userChoice(){

        Scanner choice = new Scanner(System.in);

        for(int i = 0; i< 5; i++){
            System.out.println("Enter "+(i+1)+" Number : ");
            userNumbers[i] = choice.nextInt();
        }
    }

    public void Match(){

        int j = 0;

        for(int i = 0; i < 5; i++){
            if(lotteryNumbers[i] == userNumbers[i]){
                j++;
                al.add(lotteryNumbers[i]);
            }
        }

        System.out.println("User's Numbers : ");

        for(int i = 0; i < 5; i++){
            System.out.println(userNumbers[i]+" \t");
        }


        System.out.println("Lottery Numbers : ");

        for(int i = 0; i < 5; i++){
            System.out.println(lotteryNumbers[i]+" \t");
        }

        System.out.println("Number of matching digits : "+j);

        System.out.println("MAtching digits : ");

        for(Integer x: al){
            System.out.println(x);
        }
    }

}

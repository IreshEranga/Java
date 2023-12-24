import java.sql.Array;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        QueueX mainQueue = new QueueX(5);
        //QueueX printerQueue = new QueueX(5);
        QueueX evenQueue = new QueueX(5);
        QueueX oddQueue = new QueueX(5);
        int[] printerQueue = new int[5];
        //int[] evenQueue = new int[5];
        //int[] oddQueue = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5;i++){

            System.out.println("Enter transaction ID "+(i+1)+" : ");
            int id = sc.nextInt();

            mainQueue.insert(id);
            printerQueue[i] = id;

        }

        System.out.println("Transaction IDs : ");

        for(int i=0; i< 5;i++){
            System.out.println(printerQueue[i]);
        }

        System.out.println();

        for(int i=0; i< 5;i++){
            if(printerQueue[i]%2 == 0){

                evenQueue.insert(printerQueue[i]);
                System.out.println("ID "+evenQueue+" is sent to PC1");
            }
            else{
                oddQueue.insert(printerQueue[i]);
                System.out.println("ID "+oddQueue+" is sent to PC2");
            }
        }


        System.out.println();
        System.out.println("PC1");

        while(!evenQueue.isEmpty()){
            int val = evenQueue.remove();
            System.out.println("Transaction "+val);
        }

        System.out.println();
        System.out.println("PC2");
        while(!oddQueue.isEmpty()){
            int val = oddQueue.remove();
            System.out.println("Transaction "+val);
        }

    }
}
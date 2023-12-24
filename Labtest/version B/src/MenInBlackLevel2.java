import java.util.Random;

public class MenInBlackLevel2 extends MenInBlack{
    public MenInBlackLevel2(AlienPack a){
        super(a);
        score = 0;
    }

    public void kill(){
        Alien[] array = ap.getAliens();

        for(int i = 0; i < array.length; i++){
            Random rand = new Random();

            this.score = this.score + array[i].getScore();

            if(rand.nextInt()%2 == 1)
            {
                this.score = this.score - 2;
            }
        }
    }
}

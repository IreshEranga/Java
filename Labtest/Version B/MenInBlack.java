public class MenInBlack {

    int score;

    AlienPack ap;

    public MenInBlack(AlienPack a){
        ap = a;
        score = 0;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void kill(){
        Alien[] array = ap.getAliens();

        for(int i = 0; i < array.length; i++){
            this.score = this.score + array[i].getScore();
        }
    }
}

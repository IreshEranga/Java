public class AlienPack {

    Alien[] array;

    public AlienPack(int noOfAliens){

        array = new Alien[noOfAliens];
    }

    public void AddAlien(Alien a, int index){

        array[index] = a;
    }

    public Alien[] getAliens()
    {
        return array;
    }
}

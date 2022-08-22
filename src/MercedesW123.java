public class MercedesW123 extends Cars{

    private int levelOfSwag;

    public MercedesW123(String name, int weight, int noOfWheels, int noOfDoors, int noOfGears, int currentGear, int speed, int levelOfSwag) {
        super(name, weight, noOfWheels, noOfDoors, noOfGears, currentGear, speed);
        this.levelOfSwag = levelOfSwag;
    }

    public int getLevelOfSwag() {
        return this.levelOfSwag;
    }


    public void swagOO() {
        if (this.levelOfSwag > 1000){
        System.out.println("This Merc 123 has " + this.levelOfSwag + " points of swag. It's quite awesome.");
        }
        else {
            System.out.println("This W123 Merc has only " + " points of swag. Get a cab instead");
        }

    }

}

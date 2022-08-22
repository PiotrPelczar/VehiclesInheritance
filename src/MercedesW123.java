public class MercedesW123 extends Cars{

    private int levelOfSwag;
    private int maxSpeed;

    public MercedesW123(String name, int weight, int noOfWheels, int noOfDoors, int noOfGears, int currentGear, int speed, int levelOfSwag, int maxSpeed) {
        super(name, weight, noOfWheels, noOfDoors, noOfGears, currentGear, speed);
        this.levelOfSwag = levelOfSwag;
        this.maxSpeed = maxSpeed;
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

    @Override
    public void increaseSpeed() {
        if (getCurrentSpeed() <= this.maxSpeed - 10) {
            super.increaseSpeed();
        }
        else if (getCurrentSpeed() >= this.getCurrentSpeed())

            System.out.println("Y");
    }
}

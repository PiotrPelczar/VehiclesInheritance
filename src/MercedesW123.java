public class MercedesW123 extends Cars{

    private int levelOfSwag;

    public MercedesW123(int noOfDoors, int noOfGears, int currentGear, int levelOfSwag) {
        super("Mercedes W123",1500,4,4,4,1);
        this.levelOfSwag = levelOfSwag;
    }

    public int getLevelOfSwag() {
        return this.levelOfSwag;
    }

    @Override
    public void setCurrentGear(int currentGear) {
        super.setCurrentGear(currentGear);
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

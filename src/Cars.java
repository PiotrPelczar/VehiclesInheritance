public class Cars extends Vehicles {

    private int noOfWheels;
    private int noOfDoors;
    private int noOfGears;
    private int currentGear;

    public Cars(String name, int weight, int noOfWheels, int noOfDoors, int noOfGears, int currentGear) {
        super(name, weight);
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.noOfGears = noOfGears;

        this.currentGear = currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Cars current gear is " + this.currentGear);
    }


}

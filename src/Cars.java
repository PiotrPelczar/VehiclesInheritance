public class Cars extends Vehicles {

    private int noOfWheels;
    private int noOfDoors;
    private int noOfGears;
    private int currentGear;
    private int speed;


    public Cars(String name, int weight, int noOfWheels, int noOfDoors, int noOfGears, int currentGear, int speed) {
        super(name, weight);
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.noOfGears = noOfGears;
        this.speed = speed;



        this.currentGear = currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Cars current gear is " + this.currentGear);
    }

       public void addGear (){
               if (this.noOfGears > this.currentGear){
                   this.currentGear += 1;
                   System.out.println("The car is now in " + this.currentGear + " gear");
               }
                else if (this.noOfGears == this.currentGear){
                   System.out.println("You are already in top gear");
               }

               }

    public void reduceGear (){
        if (this.currentGear <= -1){
            System.out.println("Can't reduce anymore");
        }
        else {
            this.currentGear -= 1;
            System.out.println("The car is now in " + this.currentGear + " gear");
        }
        }

    public void increaseSpeed(){
        this.speed += 10;
        System.out.println("The cars speed is now " + this.speed);
    }

    public void decreaseSpeed(){
        if (this.speed <= 0){
            System.out.println("The car is not moving");
        }
        else if (this.speed <= 10){
            this.speed = 0;
            System.out.println("The cars speed is 0");
        }
        else {
            this.speed -= 10;
            System.out.println("The cars speed has been decreased by 10 and now is " + this.speed);
        }
    }


    public int getCurrentGear() {
        return currentGear;
    }
}



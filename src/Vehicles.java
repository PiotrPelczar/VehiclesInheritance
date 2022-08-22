public class Vehicles {

    private String name;
    private int weight;

    private int currentSpeed;
    private int currentDirection;

    public Vehicles(String name, int weight) {
        this.name = name;
        this.weight = weight;

        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steering (int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle current direction is" + currentDirection + " degrees");
    }

    public void move(int direction, int speed){
        this.currentDirection += direction;
        this.currentSpeed += speed;
        System.out.println("Vehicle moves at " + currentSpeed + " in direction " + currentDirection);
    }

    public void stop (){
        this.currentSpeed = 0;
        System.out.println("Vehicle has stopped and its speed is " + this.currentSpeed);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}

package bike;

public class MountainBike extends Bike{
    protected int seatHeight;
    protected int maxGear;
    public MountainBike(int gear,int speed,int seatHeight,int maxGear){
        super(gear,speed);
        this.seatHeight = seatHeight;
        this.maxGear = maxGear;
    }
    public int increaseGear(){
        if(gear < maxGear) {
            this.gear++;
            this.speed += 10;
        }
        else
            System.out.println("In top gear");
        return gear;
    }
    public int reduceGear(){
        this.gear--;
        this.speed -= 10;
        return gear;
    }
}

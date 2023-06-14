package main;

public class MountainBike implements Bike{
    int gear;
    int speed;
    int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        this.gear = gear;
        this.speed = speed;
        this.seatHeight = seatHeight;
    }
    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }
}

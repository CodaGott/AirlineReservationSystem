package polymorphicBehaviour;

public class Car implements Moveable
{
    private int everythingCarHas;

    public void setEverythingCarDose() {
        System.out.println("Like a car");
    }

    @Override
    public void move() {
        System.out.println("Suck fuel first");
    }
}

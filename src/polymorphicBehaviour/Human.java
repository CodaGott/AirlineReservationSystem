package polymorphicBehaviour;

public class Human implements Moveable{
    private int everythingHumanHas;

    public void setEverythingHumanDoes() {
        System.out.println("Like a human");
    }

    @Override
    public void move() {
        System.out.println("Human walk");
    }
}

package polymorphicBehaviour;

public class Dog extends Animal{

    @Override
    public void move() {
        System.out.println("Dog-walk");
    }

    @Override
    public void noise() {
        System.out.println("Dog woof");
    }
}

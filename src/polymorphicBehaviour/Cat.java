package polymorphicBehaviour;

public class Cat extends Animal{

    @Override
    public void move() {
        System.out.println("Cat-walk");
    }

    @Override
    public void noise() {
        System.out.println("Cat mew");
    }
}

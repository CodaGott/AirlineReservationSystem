package polymorphicBehaviour;

public abstract class Animal {
    private int numberOfEyes;
    private int numberOfLegs;



    public abstract void move();

//    public void move(){
//        System.out.println("Animal-Movement");
//    }

    public void eat(){
        System.out.println("Eat and smile");
}
    public void noise(){
        System.out.println("Animal makes noise");
    }
}

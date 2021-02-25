package polymorphicBehaviour;

public class Main {
    public static void main(String[] args) {
//        Animal animal  = new Animal();
        Animal animalAnimal = new Animal() {
            @Override
            public void move() {

            }
        };

        Animal animalCat = new Cat();
        Animal animalDog = new Dog();

//        animal.move();
//        animalDog.move();
//        animalCat.move();

        makeAnimalNoise(animalAnimal);
        makeAnimalNoise(animalCat);
        makeAnimalNoise(animalDog);

        System.out.println();

        makeAnimalMove(animalAnimal);
        makeAnimalMove(animalCat);
        makeAnimalMove(animalDog);

        System.out.println();

        Car car = new Car();
        playwrightMovables(car);
        Human human = new Human();
        playwrightMovables(human);
    }

    public static void playwrightMovables(Moveable moveable){
        moveable.move();

    }

    public static void makeAnimalMove(Animal animal){
        animal.move();
    }

    public static void makeAnimalNoise(Animal animal){
        animal.noise();
    }
}

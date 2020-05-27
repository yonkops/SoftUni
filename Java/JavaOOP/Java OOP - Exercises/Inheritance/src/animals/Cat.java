package animals;

public class Cat extends Animal {
    private final static String ANIMAL_SOUND = "Meow Meow";

    public Cat(String name, int age, String gender) {
        super(name, age, gender);
        super.setAnimalSound(ANIMAL_SOUND);
    }
}

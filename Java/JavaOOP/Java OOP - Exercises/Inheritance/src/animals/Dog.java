package animals;

public class Dog extends Animal {
    private final static String ANIMAL_SOUND = "Woof!";

    public Dog(String name, int age, String gender) {
        super(name, age, gender);
        super.setAnimalSound(ANIMAL_SOUND);
    }
}

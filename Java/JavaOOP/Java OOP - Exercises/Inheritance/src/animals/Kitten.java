package animals;

public class Kitten extends Cat{
    private static final String  GENDER="Female";
    private final static String ANIMAL_SOUND = "Meow";

    public Kitten(String name, int age) {
        super(name, age, GENDER);
        super.setAnimalSound(ANIMAL_SOUND);
    }
    public Kitten(String name, int age, String gender) {
        super(name, age, GENDER);
        super.setAnimalSound(ANIMAL_SOUND);
    }
}

package animals;

public class Frog extends Animal {
    private final static String ANIMAL_SOUND = "Ribbit";

    public Frog(String name, int age, String gender) {
        super(name, age, gender);
        super.setAnimalSound(ANIMAL_SOUND);
    }
}

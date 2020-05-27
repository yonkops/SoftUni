package animals;

public class Tomcat extends Cat{
    private static final String  GENDER="Male";
    private final static String ANIMAL_SOUND = "MEOW";

    public Tomcat(String name, int age) {
        super(name, age, GENDER);
        super.setAnimalSound(ANIMAL_SOUND);
    }
    public Tomcat(String name, int age, String gender) {
        super(name, age, GENDER);
        super.setAnimalSound(ANIMAL_SOUND);
    }
}

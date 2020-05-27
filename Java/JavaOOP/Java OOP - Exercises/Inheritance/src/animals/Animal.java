package animals;

public class Animal {
    private final static String ANIMAL_SOUND = "No Sound";
    private String name;
    private int age;
    private String gender;
    private String animalSound;

    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setAnimalSound(ANIMAL_SOUND);
    }


    public void setName(String name) {
        if (!name.trim().isEmpty()){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid input!");
        }

    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public void setGender(String gender) {
        if (!gender.trim().isEmpty()){
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }
    public void setAnimalSound(String animalSound){
        this.animalSound = animalSound;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String produceSound(){
        return animalSound;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s %d %s%n%s",this.getClass().getSimpleName(),this.getName(),this.getAge()
                ,this.getGender(),this.produceSound());
    }
}

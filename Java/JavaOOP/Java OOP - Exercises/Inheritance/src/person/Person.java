package person;

public class Person {
    private String name;
    private int age;

    public Person (String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.length() >= 3){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }

    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be positive!");
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d",
                this.getName(),
                this.getAge());
    }
}

package person;


public class Child extends Person {

    public Child(String name, int age) {
        super(name, age);

    }

    @Override
    protected void setAge(int age) {
        if (age<=15) {
            super.setAge(age);
        } else {
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        }
    }




}

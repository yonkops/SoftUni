import java.text.DecimalFormat;

public class Chicken {
    private static final String INVALID_NAME_EXCEPTION_MESSAGE = "Name cannot be empty.";
    private static final String INVALID_AGE_EXCEPTION_MESSAGE = "Age should be between 0 and 15.";

    private String name;
    private int age;

    public Chicken(String name,int age){

        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }
//
    private void setName(String name) {
        if(name == null || name.trim().length() < 1){
            throw new IllegalArgumentException(INVALID_NAME_EXCEPTION_MESSAGE);
        }
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 0 || age > 16){
            throw new IllegalArgumentException(INVALID_AGE_EXCEPTION_MESSAGE);
        }
        this.age = age;

    }

    private double calculateProductionPerDay(){
        if (getAge() < 6 ){
            return 2;
        } else if (getAge() < 12){
            return 1;
        } else {
            return  0.75;
        }
    }

    public double productPerDay(){
        return this.calculateProductionPerDay();
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",
                getName(), getAge(), this.productPerDay());
    }
}

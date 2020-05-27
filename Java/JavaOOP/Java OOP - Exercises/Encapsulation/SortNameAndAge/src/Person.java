public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private final int ageBonus = 30;
    private final int minNameLength = 3;
    private final int minAge = 1;
    private final double minSalary = 460.00;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length() < minNameLength){
            throw new IllegalArgumentException("First name cannot be less then 3 symbols");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length() < minNameLength){
            throw new IllegalArgumentException("Last name cannot be less then 3 symbols");
        } else {
            this.lastName = lastName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < minAge){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        } else {
            this.age = age;
        }
    }

    public void setSalary(double salary) {
        if (salary < minSalary){
            throw new IllegalArgumentException("Salary cannot be less then 460 leva");
        }else {
            this.salary = salary;
        }
    }

    public double getSalary(){
        return salary;
    }

    public void increaseSalary(double percentage){
        if(this.getAge() < ageBonus){
            this.setSalary(this.getSalary() + (this.getSalary() * percentage / 200));
        } else {
            this.setSalary(this.getSalary() + (this.getSalary() * percentage / 100));
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva",
                this.getFirstName(),
                this.getLastName(),
                this.getSalary());
    }
}

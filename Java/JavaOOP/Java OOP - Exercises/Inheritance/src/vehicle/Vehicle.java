package vehicle;

public class Vehicle {
    private final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle (double fuel, int horsePower){
        this.setFuel(fuel);
        this.setHorsePower(horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public double getFuel() {
        return this.fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void drive(double kilometers){
        double neededFuel = kilometers * this.fuelConsumption;
        if (this.fuel >= neededFuel){
            this.fuel = this.fuel - neededFuel;
        }
    }
}

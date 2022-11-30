package model.entities;

public class ElectricVehicle extends Vehicle{

    private String batteryCapacity;
    private Integer numberOfBatteries;

    public ElectricVehicle(Integer id, String model, String brand, Integer manufacturingYear,
                           String engineHorsePower, Category category, String batteryCapacity,
                           Integer numberOfBatteries) {

        super(id, model, brand, manufacturingYear, engineHorsePower, category);
        this.batteryCapacity = batteryCapacity;
        this.numberOfBatteries = numberOfBatteries;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public Integer getNumberOfBatteries() {
        return numberOfBatteries;
    }

    public void setNumberOfBatteries(Integer numberOfBatteries) {
        this.numberOfBatteries = numberOfBatteries;
    }

    @Override
    public String toString() {
        return super.toString() + "batteryCapacity = " + batteryCapacity +
                "numberOfBatteries = " + numberOfBatteries;
    }
}

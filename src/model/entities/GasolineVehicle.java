package model.entities;

public class GasolineVehicle extends Vehicle{

    private String fuelTankCapacity;
    private Integer numberOfEngineCylinders;

    public GasolineVehicle(Integer id, String model, String brand, Integer manufacturingYear,
                           String engineHorsePower, Category category, String fuelTankCapacity,
                           Integer numberOfEngineCylinders) {

        super(id, model, brand, manufacturingYear, engineHorsePower, category);
        this.fuelTankCapacity = fuelTankCapacity;
        this.numberOfEngineCylinders = numberOfEngineCylinders;
    }

    public String getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(String fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public Integer getNumberOfEngineCylinders() {
        return numberOfEngineCylinders;
    }

    public void setNumberOfEngineCylinders(Integer numberOfEngineCylinders) {
        this.numberOfEngineCylinders = numberOfEngineCylinders;
    }

    @Override
    public String toString() {
        return super.toString() + " fuelTankCapacity = " + fuelTankCapacity + " numberOfEngineCylinders = " + numberOfEngineCylinders;
    }
}

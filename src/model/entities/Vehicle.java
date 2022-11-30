package model.entities;

import java.util.Objects;

public abstract class Vehicle {

    private Integer id;
    private String model;
    private String brand;
    private Integer manufacturingYear;
    private String engineHorsePower;
    private Category category;

    public Vehicle() {
    }

    public Vehicle(Integer id, String model, String brand, Integer manufacturingYear,
                   String engineHorsePower, Category category) {
        this.model = model;
        this.brand = brand;
        this.manufacturingYear = manufacturingYear;
        this.engineHorsePower = engineHorsePower;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(Integer manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public String getEngineHorsePower() {
        return engineHorsePower;
    }

    public void setEngineHorsePower(String engineHorsePower) {
        this.engineHorsePower = engineHorsePower;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id.equals(vehicle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                ", engineHorsePower='" + engineHorsePower + '\'' +
                ", category=" + category +
                '}';
    }
}

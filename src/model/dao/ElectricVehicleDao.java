package model.dao;

import model.entities.Category;
import model.entities.Vehicle;

import java.util.List;

public interface ElectricVehicleDao {

    void insert(Vehicle obj);
    void update(Vehicle obj);
    void deleteById(Integer id);
    Vehicle findById(Integer id);
    List<Vehicle> findAll();
    List<Vehicle> findByCategory(Category category);
}

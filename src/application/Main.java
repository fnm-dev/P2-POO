package application;

import model.dao.DaoFactory;
import model.dao.ElectricVehicleDao;
import model.entities.Category;
import model.entities.ElectricVehicle;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ElectricVehicleDao electricVehicleDao = DaoFactory.createElectricVehicleDao();

        System.out.println("=== TEST 1: ElectricVehicle findById ===");
        ElectricVehicle ev = electricVehicleDao.findById(3);
        System.out.println(ev);

        System.out.println("\n=== TEST 2: ElectricVehicle findByCategory ===");
        List<ElectricVehicle> list = electricVehicleDao.findByCategory(new Category(3, null));
        for (ElectricVehicle ev2 : list) {
            System.out.println(ev2);
        }

        System.out.println("\n=== TEST 3: ElectricVehicle findAll ===");
        list = electricVehicleDao.findAll();
        for (ElectricVehicle ev2 : list) {
            System.out.println(ev2);
        }

        System.out.println("\n=== TEST 4: ElectricVehicle insert ===");
        ElectricVehicle ev3 = new ElectricVehicle(null, 1, "Model S", "Tesla", "2021", "670hp", new Category(3, null), "103kWh", 1);
        electricVehicleDao.insert(ev3);
        System.out.println("Inserted! New id = " + ev3.getId());

        System.out.println("\n=== TEST 5: ElectricVehicle update ===");
        ev3 = electricVehicleDao.findById(6);
        ev3.setModel("auauaua");
        electricVehicleDao.update(ev3);
        System.out.println("Update completed!");

        System.out.println("\n=== TEST 6: ElectricVehicle delete ===");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        electricVehicleDao.deleteById(id);
        System.out.println("Delete completed!");

        sc.close();

    }
}

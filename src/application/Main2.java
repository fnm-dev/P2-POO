package application;

import model.dao.DaoFactory;
import model.dao.GasolineVehicleDao;
import model.entities.Category;
import model.entities.ElectricVehicle;
import model.entities.GasolineVehicle;

import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GasolineVehicleDao gasolineVehicleDao = DaoFactory.createGasolineVehicleDao();

        System.out.println("=== TEST 1: GasolineVehicle findById ===");
        GasolineVehicle gv = gasolineVehicleDao.findById(2);
        System.out.println(gv);

        System.out.println("\n=== TEST 2: GasolineVehicle findByCategory ===");
        List<GasolineVehicle> list = gasolineVehicleDao.findByCategory(new Category(2, null));
        for (GasolineVehicle gv2 : list) {
            System.out.println(gv2);
        }

        System.out.println("\n=== TEST 3: GasolineVehicle findAll ===");
        list = gasolineVehicleDao.findAll();
        for (GasolineVehicle gv2 : list) {
            System.out.println(gv2);
        }

        System.out.println("\n=== TEST 4: GasolineVehicle insert ===");
        GasolineVehicle gv3 = new GasolineVehicle(null, 2, "Ecosport", "Ford", "2017", "115hp", new Category(2, null), "52L", 4);
        gasolineVehicleDao.insert(gv3);
        System.out.println("Inserted! New id = " + gv3.getId());

        System.out.println("\n=== TEST 5: GasolineVehicle update ===");
        gv3 = gasolineVehicleDao.findById(11);
        gv3.setModel("auauaua");
        gasolineVehicleDao.update(gv3);
        System.out.println("Update completed!");

        System.out.println("\n=== TEST 6: ElectricVehicle delete ===");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        gasolineVehicleDao.deleteById(id);
        System.out.println("Delete completed!");

        sc.close();
    }
}

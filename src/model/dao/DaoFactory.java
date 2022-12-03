package model.dao;

import db.DB;
import model.dao.impl.ElectricVehicleDaoJDBC;

public class DaoFactory {

    public static ElectricVehicleDao createElectricVehicleDao(){
        return new ElectricVehicleDaoJDBC(DB.getConnection());
    }
}

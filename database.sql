CREATE DATABASE dealership;
USE dealership;

CREATE TABLE Category (
	Id INT NOT NULL AUTO_INCREMENT,
	Name VARCHAR(50) NOT NULL,
	PRIMARY KEY (Id)
);

CREATE TABLE TypesVehicle(
	Id INT PRIMARY KEY,
    TypeVehicle VARCHAR(10)
);

INSERT INTO TypesVehicle
SELECT 1,'Electric' UNION ALL
SELECT 2,'Gasoline';

CREATE TABLE Vehicle (
	Id INT NOT NULL AUTO_INCREMENT,
    Type_Id INT NOT NULL REFERENCES TypesVehicle(Id),
    Model VARCHAR(50) NOT NULL,
    Brand VARCHAR(50) NOT NULL,
    Manufacturing_Year VARCHAR(4) NOT NULL,
    Engine_Horsepower VARCHAR(5) NOT NULL,
    Category_Id INT NOT NULL,
    PRIMARY KEY(Id),
    FOREIGN KEY(Category_Id) REFERENCES Category(Id),
    CONSTRAINT Vehicle_AltPK unique (Id, Type_Id)
);


CREATE TABLE ElectricVehicle (
	Id INT NOT NULL PRIMARY KEY REFERENCES Vehicle(Id),
    Type_Id INT NOT NULL DEFAULT 1 CHECK(Type_Id = 1),
    Battery_Capacity VARCHAR(10),
    Number_of_Batteries INT,
    FOREIGN KEY (Id, Type_Id) REFERENCES Vehicle(Id, Type_Id)
);

CREATE TABLE GasolineVehicle (
	Id INT NOT NULL PRIMARY KEY REFERENCES Vehicle(Id),
    Type_Id INT NOT NULL DEFAULT 2 CHECK(Type_Id = 2),
    Fuel_Tank_Capacity VARCHAR(10),
    Number_of_Cylinders INT,
    FOREIGN KEY (Id, Type_Id) REFERENCES Vehicle(Id, Type_Id)
);


INSERT INTO Category (Name) VALUES
('Compacto'),
('SUV'),
('Esportivo'),
('Super-esportivo');

SET autocommit = 0;

START TRANSACTION;
	INSERT INTO Vehicle (Type_Id, Model, Brand, Manufacturing_Year, Engine_Horsepower, Category_Id) VALUE
    (1, 'Model S', 'Tesla', '2021', '670hp', 3);
	INSERT INTO ElectricVehicle (Id, Battery_Capacity, Number_of_Batteries) VALUE
    (LAST_INSERT_ID(), '103kWh', 1);
COMMIT;

START TRANSACTION;
	INSERT INTO Vehicle (Type_Id, Model, Brand, Manufacturing_Year, Engine_Horsepower, Category_Id) VALUE
    (2, 'Ecosport', 'Ford', '2017', '115hp', 2);
	INSERT INTO GasolineVehicle (Id, Fuel_Tank_Capacity, Number_of_Cylinders) VALUE
    (LAST_INSERT_ID(), '52L', 4);
COMMIT;

SELECT * FROM Vehicle INNER JOIN ElectricVehicle ON Vehicle.Id = ElectricVehicle.Id;
SELECT * FROM Vehicle INNER JOIN GasolineVehicle ON Vehicle.Id = GasolineVehicle.Id;




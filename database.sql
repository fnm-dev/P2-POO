CREATE DATABASE dealership;
USE dealership;

CREATE TABLE Category (
	Id INT NOT NULL AUTO_INCREMENT,
	Name VARCHAR(50) NOT NULL,
	PRIMARY KEY (Id)
);

CREATE TABLE Vehicle (
	Id INT NOT NULL AUTO_INCREMENT,
    Model VARCHAR(50) NOT NULL,
    Brand VARCHAR(50) NOT NULL,
    Manufacturing_Year VARCHAR(4) NOT NULL,
    Engine_Horsepower VARCHAR(5) NOT NULL,
    Category_Id INT NOT NULL,
    Battery_Capacity VARCHAR(10),
    Number_of_Batteries INT,
    Fuel_Tank_Capacity VARCHAR(10),
    Number_of_Cylinders INT,
    PRIMARY KEY(Id),
    FOREIGN KEY(Category_Id) REFERENCES Category(Id)
);

INSERT INTO Category (Name) VALUES
('Compacto'),
('SUV'),
('Esportivo'),
('Super-esportivo');

INSERT INTO Vehicle (Model, Brand, Manufacturing_Year, Engine_Horsepower, Category_Id, Battery_Capacity, Number_of_Batteries) VALUE
('Model S', 'Tesla', '2021', '670hp', 3, '103kWh', 1);

INSERT INTO Vehicle (Model, Brand, Manufacturing_Year, Engine_Horsepower, Category_Id, Fuel_Tank_Capacity, Number_of_Cylinders) VALUE
('Ecosport', 'Ford', '2017', '115hp', 2, '52L', 4);

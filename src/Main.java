import driver.*;
import transport.Bus;
import transport.Car;
import transport.FreightCars;
import transport.Transport;


import java.util.ArrayList;
import java.util.List;

import static transport.Bus.Spaciousness.*;
import static transport.Car.CarBodyType.*;
import static transport.FreightCars.FreightCarsBodyType.*;



public class Main {



    public static void main(String[] args) throws RightsException {


        Car car1 = new Car("LADA", "Granta", 1.7f, HETCHBACK);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0f, SEDAN);
        Car car3 = new Car("BMW", "Z8", 3.0f, COUPE);
        Car car4 = new Car("KIA", "Sportage 4-го поколения", 2.4f, VAN);

        Bus bus1 = new Bus("Мерседес", "Спринтер",  2.5f, SMALL);
        Bus bus2 = new Bus("Фольксваген", "Крафтер", 3.0f, MEDIUM);
        Bus bus3 = new Bus("Форд", "Транзит", 2.0f, LARGE);
        Bus bus4 = new Bus("Икарус", "147", 3.3f, null);

        FreightCars freightCars1 = new FreightCars("Маз","Зубрр",3.2f, N1);
        FreightCars freightCars2 = new FreightCars("Камаз","Болотник",4.0f, N2);
        FreightCars freightCars3 = new FreightCars("Volvo","FMX 8*4",4.8f, N3);
        FreightCars freightCars4 = new FreightCars("Man","TGS",3.5f, N2);

        List<Transport> transports = new ArrayList<>();
        transports.add(car1);
        transports.add(car2);
        transports.add(car3);
        transports.add(car4);
        transports.add(bus1);
        transports.add(bus2);
        transports.add(bus3);
        transports.add(bus4);
        transports.add(freightCars1);
        transports.add(freightCars2);
        transports.add(freightCars3);
        transports.add(freightCars4);


        DriverB driver1 = new DriverB("Aaa",true,2, "B");
        DriverC driver2 = new DriverC("Bbb", true,5, null);
        DriverD driver3 = new DriverD("Ccc",true,10, "D");

        List<Driver> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);


        Mechanic mechanic1 = new Mechanic("Вася", "QWE", "B,C");
        Mechanic mechanic2 = new Mechanic("Петя", "ASD", "D");
        Mechanic mechanic3 = new Mechanic("Коля", "ZXC", "B,C,D");


        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(mechanic1);
        mechanics.add(mechanic2);
        mechanics.add(mechanic3);


    }


}
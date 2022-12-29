import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.Bus;
import transport.Car;
import transport.FreightCars;


import static transport.Bus.Spaciousness.*;
import static transport.Car.CarBodyType.*;
import static transport.FreightCars.FreightCarsBodyType.*;



public class Main {


    public static void main(String[] args){

        Car cars1 = new Car("LADA", "Granta", 1.7f, HETCHBACK);
        Car cars2 = new Car("Audi", "A8 50 L TDI quattro", 3.0f, SEDAN);
        Car cars3 = new Car("BMW", "Z8", 3.0f, COUPE);
        Car cars4 = new Car("KIA", "Sportage 4-го поколения", 2.4f, VAN);


        Bus bus1 = new Bus("Мерседес", "Спринтер",  2.5f, SMALL);
        Bus bus2 = new Bus("Фольксваген", "Крафтер", 3.0f, MEDIUM);
        Bus bus3 = new Bus("Форд", "Транзит", 2.0f, LARGE);
        Bus bus4 = new Bus("Икарус", "147", 3.3f, null);


        FreightCars freightCars1 = new FreightCars("Маз","Зубрр",3.2f, N1);
        FreightCars freightCars2 = new FreightCars("Камаз","Болотник",4.0f, N2);
        FreightCars freightCars3 = new FreightCars("Volvo","FMX 8*4",4.8f, N3);
        FreightCars freightCars4 = new FreightCars("Man","TGS",3.5f, N2);

        DriverB driver1 = new DriverB("Aaa",true,2);
        DriverC driver2 = new DriverC("Bbb", true,5);
        DriverD driver3 = new DriverD("Ccc",true,10);

        cars2.printType();
        bus1.printType();
        freightCars1.printType();
        System.out.println(bus4);



    }


}
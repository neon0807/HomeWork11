import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.Bus;
import transport.Car;
import transport.FreightCars;

public class Main {


    public static void main(String[] args){

        Car cars1 = new Car("LADA", "Granta", 1.7f);
        Car cars2 = new Car("Audi", "A8 50 L TDI quattro", 3.0f);
        Car cars3 = new Car("BMW", "Z8", 3.0f);
        Car cars4 = new Car("KIA", "Sportage 4-го поколения", 2.4f);


        Bus bus1 = new Bus("Мерседес", "Спринтер",  2.5f);
        Bus bus2 = new Bus("Фольксваген", "Крафтер", 3.0f);
        Bus bus3 = new Bus("Форд", "Транзит", 2.0f);
        Bus bus4 = new Bus("Икарус", "147", 3.3f);


        FreightCars freightCars1 = new FreightCars("Маз","Зубрр",3.2f);
        FreightCars freightCars2 = new FreightCars("Камаз","Болотник",4.0f);
        FreightCars freightCars3 = new FreightCars("Volvo","FMX 8*4",4.8f);
        FreightCars freightCars4 = new FreightCars("Man","TGS",3.5f);

        DriverB driver1 = new DriverB("Aaa",true,2);
        DriverC driver2 = new DriverC("Bbb", true,5);
        DriverD driver3 = new DriverD("Ccc",true,10);

        cars1.race();

    }


}
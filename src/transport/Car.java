package transport;
import driver.DriverB;

public class Car extends Transport<DriverB> implements  Competing{

    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void race() {
        super.race();
    }

    @Override
    public void pitStop() {
        System.out.println("На Пит-Стоп заехал " + getBrand() + " " + getModel());
    }

    @Override
    public void bastLapTime() {
        System.out.println("Лучшее время круга показывает " + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальную скорость показывает " + getBrand() + " " + getModel());
    }
}





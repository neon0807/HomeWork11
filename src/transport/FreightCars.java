package transport;
import driver.DriverC;

public class FreightCars extends Transport<DriverC> implements Competing{

    public FreightCars(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
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

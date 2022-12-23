package transport;
import driver.DriverD;

public class Bus extends Transport<DriverD> implements Competing{

    public Bus(String brand, String model, float engineVolume) {
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

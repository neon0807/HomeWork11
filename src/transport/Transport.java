package transport;

import java.util.Objects;

public abstract class Transport<T> {

    protected final String brand;
    public  String getBrand() {
        return brand;
    }


    protected final String model;
    public String getModel() {
        return model;
    }

    protected float engineVolume;
    public float getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public T driverName;
    public T getDriverName() {
        return driverName;
    }
    public void setDriverName() {
        this.driverName = driverName;
    }

    public Transport(String brand, String model, float engineVolume) {
        if (brand == null || brand.isEmpty() || brand.isBlank()){
            this.brand = "default";
        } else this.brand = brand;

        if (model == null ||model.isEmpty() || model.isBlank()){
            this.model = "default";
        } else this.model = model;

        if (engineVolume <= 0 ){
            this.engineVolume = 1.5f;
        } else this.engineVolume = engineVolume;

    }


    public void start(){
        System.out.println("Начал движение");
    }

    public void stop(){
        System.out.println("Закончил движение");
    }

    public void race(){
        System.out.println(getDriverName() + " управляет автомобилем " + brand + " " + model + " и будет участвовать в гонках");
    }

    public abstract void printType();

    public void diagnostics(){
        System.out.println("Прохожу диагностику");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model) && driverName.equals(transport.driverName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driverName);
    }
}

package transport;

import driver.DriverB;

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

}

package transport;
import driver.DriverB;

public class Car extends Transport<DriverB> implements  Competing{

    public enum CarBodyType {
        SEDAN("Седан"), HETCHBACK("Хетчбек"), COUPE("Купе"), WAGON("Универсал"), SUV("Внедорожник"),
        CROSSOVER("кроссовер"), PICKUP("Пикап"), VAN("Фургон"), MINIVAN("Минивен");

        private String bodyType;
        CarBodyType(String bodyType) {
            this.bodyType = bodyType;
        }
        public String getBodyType() {
            return bodyType;
        }
        public void setBodyType(String bodyType) {
            this.bodyType = bodyType;
        }
        @Override
        public String toString() {
            return "Тип кузова - " + bodyType ;

        }
    }

    CarBodyType bodyType;

    public Car(String brand, String model, float engineVolume, CarBodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;

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

    public void printType(){
        System.out.println("У легкового автомобиля - " + bodyType);
    }

    public void diagnostics(){
        System.out.println("Автомобиль проходит диагностику");
    }



    @Override
    public String toString() {
        if (bodyType == null){
            return "Car{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", engineVolume=" + engineVolume +
                    " Данных по транспортному средству недостаточно";
        }
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", bodyType=" + bodyType +
                '}';
    }
}





package transport;
import driver.DriverC;

public class FreightCars extends Transport<DriverC> implements Competing{
    public enum FreightCarsBodyType {
        N1(0f, 3.5f),N2(3.5f, 12f),N3(12f, 0f);

        private float lowerBound;
        private float upperBound;
        FreightCarsBodyType(Float lowerBound, Float upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }
        public float getLowerBound() {
            return lowerBound;
        }
        public void setLowerBound(float lowerBound) {
            this.lowerBound = lowerBound;
        }
        public float getUpperBound() {
            return upperBound;
        }
        public void setUpperBound(float upperBound) {
            this.upperBound = upperBound;
        }
        @Override
        public String toString() {
            if(lowerBound == 0f){
                return " Грузоподъемность до " + upperBound + " тонн";
            }
            if (upperBound == 0f){
                return " Грузоподъемность свыше " + lowerBound + " тонн";
            }
            return " Грузоподъемность: от " + lowerBound + " тонн до "+ upperBound + " тонн";
        }
    }

    private FreightCarsBodyType freightCarsBodyType;

    public FreightCars(String brand, String model, float engineVolume, FreightCarsBodyType freightCarsBodyType) {
        super(brand, model, engineVolume);
        this.freightCarsBodyType = freightCarsBodyType;
    }

    public FreightCarsBodyType getFreightCarsBodyType() {
        return freightCarsBodyType;
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
        System.out.println("У грузового автомобиля - " + getFreightCarsBodyType());
    }

    public void diagnostics(){
        System.out.println("Грузовик проходит диагностику");
    }

    @Override
    public String toString() {
        if (freightCarsBodyType == null){
            return "FreightCars{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", engineVolume=" + engineVolume + '\'' +
                    " Данных по транспортному средству недостаточно";
        }
        return "FreightCars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume + '\'' +
                ", freightCarsBodyType=" + freightCarsBodyType +
                '}';
    }
}

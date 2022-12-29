package transport;
import driver.DriverD;

public class Bus extends Transport<DriverD> implements Competing{

    public enum Spaciousness {
        ESPECIALLYSMALL(null, 10), SMALL(null, 25),
        MEDIUM(40, 50), LARGE(60, 80), ESEMCIALLYLARGE(100, 120);

        private Integer lowerBound;
        private Integer upperBound;

        Spaciousness(Integer lowerBound, Integer upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }
        public Integer getLowerBound() {
            return lowerBound;
        }
        public void setLowerBound(Integer lowerBound) {
            this.lowerBound = lowerBound;
        }
        public Integer getUpperBound() {
            return upperBound;
        }
        public void setUpperBound(Integer upperBound) {
            this.upperBound = upperBound;
        }
        @Override
        public String toString() {
            if (lowerBound == null){
                return " Вместительность до " + upperBound + " мест";
            }
            return " Вместительность " + lowerBound + " - " + upperBound + " мест";
        }
    }
    Spaciousness spaciousness;

    public Bus(String brand, String model, float engineVolume, Spaciousness spaciousness) {
        super(brand, model, engineVolume);
        this.spaciousness = spaciousness;
    }

    public Spaciousness getSpaciousness() {
        return spaciousness;
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
        System.out.println("У автобуса - " + getSpaciousness());
    }

    @Override
    public String toString() {
        if (spaciousness == null){
            return "Bus{" +
                    ", brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", engineVolume=" + engineVolume + '\'' +
                    " Данных по транспортному средству недостаточно";
        }
        return "Bus{" +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume + '\'' +
                "spaciousness=" + spaciousness +
                '}';
    }
}

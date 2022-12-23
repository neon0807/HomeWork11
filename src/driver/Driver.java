package driver;

public class Driver {
    protected final String driverName;
    public String getDriverName() {
        return driverName;
    }

    protected final boolean rights;
    public boolean isRights() {
        return rights;
    }

    protected Integer experience;
    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Driver(String driverName, boolean rights, Integer experience) {
        this.driverName = driverName;
        this.rights = rights;
        this.experience = experience;
    }

    public void start(){
        System.out.println("Начал движение");
    }

    public void stop(){
        System.out.println("Закончил движение");
    }

    public void refuelCar(){
        System.out.println("Заправить авто");
    }
}

package driver;

public class DriverB extends Driver{

    public DriverB(String driverName, boolean rights, Integer experience){
        super(driverName, rights, experience);
    }

    @Override
    public String toString() {
        return "DriverB{" +
                "driverName='" + driverName + '\'' +
                '}';
    }
}

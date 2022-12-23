package driver;

public class DriverD extends Driver{

    public DriverD(String driverName, boolean rights, Integer experience){
        super(driverName, rights, experience);
    }

    @Override
    public String toString() {
        return "DriverD{" +
                "driverName='" + driverName + '\'' +
                '}';
    }
}

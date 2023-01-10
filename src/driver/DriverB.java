package driver;

public class DriverB extends Driver{

    public DriverB(String driverName, boolean rights, Integer experience, String typeRights){
        super(driverName, rights, experience, typeRights);

    if (typeRights == null){
        try {
            throw new RightsException("Необхадимо указать тип прав");
        } catch (RightsException e) {
            throw new RuntimeException(e);
        }
    }
        if (typeRights != "B"){
            try {
                throw new RightsException("Не подходящая категория прав");
            } catch (RightsException e) {
                throw new RuntimeException(e);
            }
        }

    }


    @Override
    public String toString() {
        return "DriverB{" +
                "driverName='" + driverName + '\'' +
                '}';
    }
}

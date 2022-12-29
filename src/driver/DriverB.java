package driver;

public class DriverB extends Driver{

    public DriverB(String driverName, boolean rights, Integer experience, String typeRights){
        super(driverName, rights, experience, typeRights);

    if (typeRights == null){
        try {
            throw new rightsException("Необхадимо указать тип прав");
        } catch (rightsException e) {
            throw new RuntimeException(e);
        }
    }
        if (typeRights != "B"){
            try {
                throw new rightsException("Не подходящая категория прав");
            } catch (rightsException e) {
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

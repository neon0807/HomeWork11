package driver;

public class DriverD extends Driver{

    public DriverD(String driverName, boolean rights, Integer experience, String typeRights){
        super(driverName, rights, experience, typeRights);

        if (typeRights == null){
            try {
                throw new rightsException("Необхадимо указать тип прав");
            } catch (rightsException e) {
                throw new RuntimeException(e);
            }
        }
        if (typeRights != "D"){
            try {
                throw new rightsException("Не подходящая категория прав");
            } catch (rightsException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String toString() {
        return "DriverD{" +
                "driverName='" + driverName + '\'' +
                '}';
    }
}

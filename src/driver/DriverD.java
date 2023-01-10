package driver;

public class DriverD extends Driver{

    public DriverD(String driverName, boolean rights, Integer experience, String typeRights){
        super(driverName, rights, experience, typeRights);

        if (typeRights == null){
            try {
                throw new RightsException("Необхадимо указать тип прав");
            } catch (RightsException e) {
                throw new RuntimeException(e);
            }
        }
        if (typeRights != "D"){
            try {
                throw new RightsException("Не подходящая категория прав");
            } catch (RightsException e) {
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

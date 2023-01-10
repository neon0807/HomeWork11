package driver;

public class DriverC extends Driver{

    public DriverC(String driverName, boolean rights, Integer experience, String typeRights){
        super(driverName, rights, experience, typeRights);

        if (typeRights == null){
            try {
                throw new RightsException("Необхадимо указать тип прав");
            } catch (RightsException e) {
                throw new RuntimeException(e);
            }
        }
        if (typeRights != "C"){
            try {
                throw new RightsException("Не подходящая категория прав");
            } catch (RightsException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

package driver;

public class DriverC extends Driver{

    public DriverC(String driverName, boolean rights, Integer experience, String typeRights){
        super(driverName, rights, experience, typeRights);

        if (typeRights == null){
            try {
                throw new rightsException("Необхадимо указать тип прав");
            } catch (rightsException e) {
                throw new RuntimeException(e);
            }
        }
        if (typeRights != "C"){
            try {
                throw new rightsException("Не подходящая категория прав");
            } catch (rightsException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

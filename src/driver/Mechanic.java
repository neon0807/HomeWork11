package driver;

public class Mechanic {

    private String name;
    private String company;
    private String typeOfCar;

    public Mechanic(String name, String company, String typeOfCar) {
        this.name = name;
        this.company = company;
        this.typeOfCar = typeOfCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }


    public void maintenance(){
        System.out.println("Провожу тех. обслуживание");
    }

    public void fixTheCar(){
        System.out.println("Провожу ремонт машины");
    }
}

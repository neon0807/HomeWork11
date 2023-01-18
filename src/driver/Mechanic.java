package driver;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return name.equals(mechanic.name) && company.equals(mechanic.company) && typeOfCar.equals(mechanic.typeOfCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, typeOfCar);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", typeOfCar='" + typeOfCar + '\'' +
                '}';
    }
}

package javaAbstractClass;

/**
 * Created by RENT on 2017-01-21.
 */
public abstract class Employee {
    private String name;
    private String surname;
    private double basicSalary;

    public Employee(String name, String surname, double basicSalary) {
        this.name = name;
        this.surname = surname;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "javaAbstractClass.Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", basicSalary=" + basicSalary +
                '}';
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getSalary(){
        return basicSalary*getMultiplicator();
    }

    protected abstract double getMultiplicator();
}

package javaAbstractClass;

/**
 * Created by RENT on 2017-01-21.
 */
public class Casual extends Employee {

    public Casual(String name, String surname, double basicSalary) {
        super(name, surname, basicSalary);
    }

    protected double getMultiplicator() {
        return 1;
    }


}

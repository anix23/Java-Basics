package javaAbstractClass;

/**
 * Created by RENT on 2017-01-21.
 */
public class Clerk extends Employee {

    public Clerk(String name, String surname, double basicSalary) {
        super(name, surname, basicSalary);
    }

    @Override
    protected double getMultiplicator() {
        return 1.2;
    }
}

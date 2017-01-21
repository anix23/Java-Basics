package javaAbstractClass;

import javaAbstractClass.Employee;

/**
 * Created by RENT on 2017-01-21.
 */
public class Secretary extends Employee {


    public Secretary(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    protected double getMultiplicator() {
        return getSalary() * 1.23;
    }
}
